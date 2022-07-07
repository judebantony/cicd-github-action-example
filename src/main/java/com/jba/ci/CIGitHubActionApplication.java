package com.jba.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
