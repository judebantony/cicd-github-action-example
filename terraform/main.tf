terraform {

  backend "remote" {
    organization = "jba"

    workspaces {
      name = "cigithubaction"
    }
  }
}

provider "aws" {
  region = "ap-south-1"
}

data "aws_availability_zones" "all" {}

variable "server_port" {
  description = "The port the server will use for HTTP requests"
  type        = number
  default     = 8080
}


resource "aws_security_group" "elb" {
  name = "githubaction-terraform-example-elb"

  # Allow all outbound
  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }

  # Inbound HTTP from anywhere
  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_elb" "githubactionelb" {
  name               = "githubaction-terraform-example"
  security_groups    = [aws_security_group.elb.id]
  availability_zones = data.aws_availability_zones.all.names

  health_check {
    target              = "HTTP:${var.server_port}/"
    interval            = 30
    timeout             = 3
    healthy_threshold   = 2
    unhealthy_threshold = 2
  }
  # This adds a listener for incoming HTTP requests.
  listener {
    lb_port           = 80
    lb_protocol       = "http"
    instance_port     = var.server_port
    instance_protocol = "http"
  }
}


resource "aws_autoscaling_group" "githubactionautoscaling" {
  launch_configuration = aws_launch_configuration.githubactionlaunch.id
  availability_zones   = data.aws_availability_zones.all.names

  min_size = 2
  max_size = 10

  load_balancers    = [aws_elb.githubactionelb.name]
  health_check_type = "ELB"

  tag {
    key                 = "Name"
    value               = "githubaction-terraform-asg-example"
    propagate_at_launch = true
  }
}


resource "aws_security_group" "githubactioninstance" {
  name = "githubaction-terraform-example-instance"
  ingress {
    from_port   = var.server_port
    to_port     = var.server_port
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_launch_configuration" "githubactionlaunch" {
  image_id        = "ami-0567e0d2b4b2169ae"
  instance_type   = "t2.micro"
  security_groups = [aws_security_group.githubactioninstance.id]
  user_data       = <<-EOF
              #!/bin/bash
              echo "Hello, World" > index.html
              nohup busybox httpd -f -p "${var.server_port}" &
              EOF
  lifecycle {
    create_before_destroy = true
  }
}


output "clb_dns_name" {
  value       = aws_elb.githubactionelb.dns_name
  description = "The domain name of the load balancer"
}