/**
 * 
 */
package com.jba.ci.bdd;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import com.jba.ci.CIGitHubActionApplication;

import io.cucumber.spring.CucumberContextConfiguration;

/**
 * @author judebarnabasantony
 *
 */
@ContextConfiguration
@CucumberContextConfiguration
@SpringBootTest(classes = CIGitHubActionApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class CucumberSpringContextConfig {

}
