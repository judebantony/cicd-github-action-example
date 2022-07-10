package com.jba.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author judebarnabasantony
 *
 */

@SpringBootApplication
public class CIGitHubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CIGitHubActionApplication.class, args);
	}
	
	/**
	 * 
	 */
	void compareNumber() {
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("a is greater than b");
		} else if (a < b) {
			System.out.println("a is less than b");
		} else {
			System.out.println("a is equal to b");
		}
	}
	void compareNumber2() {
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("a is greater than b");
		} else if (a < b) {
			System.out.println("a is less than b");
		} else {
			System.out.println("a is equal to b");
		}
	}

	// restart the application
	void restartApplication() {
		SpringApplication.exit(SpringApplication.run(CIGitHubActionApplication.class));
	}  

	@PostMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@PostMapping("/hello")
	public String hello2() {
		return "Hello World!";
	}

	// spring boot application exception advice
}