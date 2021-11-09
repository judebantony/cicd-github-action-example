/**
 * 
 */
package com.jba.ci.bdd.stepdefs;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author judebarnabasantony
 *
 */
@Slf4j
@CucumberContextConfiguration
public class CucumberStepDef  {

	private static final String CI_HEALTH = "/ci/health";

	private static final String BASE_URL = "http://20.81.93.165/api/v1";

	private static Response response;

	@Given("user wants to call health check api")
	public void want_call_health_check_api() {
	}

	@When("user call health check api")
	public void call_health_check_api() {
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		response = request.get(CI_HEALTH);
	}

	@Then("return result")
	public void return_result() {
		assertEquals(200, response.getStatusCode());
	}
}
