package kubernetes.admission

deny[msg] {
  input.kind = "Deployment"
  not input.spec.template.spec.securityContext.runAsNonRoot = true
  msg = "Deployment Standards: Containers must not run as root"
}

deny[msg] {
  input.kind = "Deployment"
  not input.spec.selector.matchLabels.app
  msg = "Deployment Standards: Containers must provide app label for pod selectors"
}

deny[msg] {
  input.kind = "Deployment"
  container := input.spec.template.spec.containers[_]
  endswith(container.image,":latest")
  msg = "Deployment Standards: Containers must not use latest tags"
}