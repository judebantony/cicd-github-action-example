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

import java.net.URL;

import org.springframework.util.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author judebarnabasantony
 *
 */
@Slf4j
@CucumberContextConfiguration
public class CucumberStepDef {

	private static final String HUB_CLOUD_BROWSERSTACK_COM_WD_HUB = "@hub-cloud.browserstack.com/wd/hub";

	private static final String COLLUMN = ":";

	private static final String CI_HEALTH = "/ci/health";

	private static final String BASE_URL = "http://20.81.93.165/api/v1";
	private static final String SWAGGER_URL = "http://20.81.93.165/swagger-ui.html";
	
	public static final String AUTOMATE_USERNAME = System.getenv("BROWSERSTACK_USERNAME");
	public static final String AUTOMATE_ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
	public static final String LOCAL_IDENTIFIER = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	public static final String BUILD_NAME = System.getenv("BROWSERSTACK_BUILD_NAME");
	public static final String PROJECT_NAME = System.getenv("BROWSERSTACK_PROJECT_NAME");

	public static final String URL = "https://" + AUTOMATE_USERNAME + COLLUMN + AUTOMATE_ACCESS_KEY
			+ HUB_CLOUD_BROWSERSTACK_COM_WD_HUB;

	private static Response response;

	@Given("user wants to call health check api")
	public void want_call_health_check_api() {
	}

	@When("^user call health check api with the url \"([^\\\"]*)\"$")
	public void call_health_check_api(String url) {
		RestAssured.baseURI = StringUtils.hasLength(url) ? url : BASE_URL;
		RequestSpecification request = RestAssured.given();
		response = request.get(CI_HEALTH);
	}

	@Then("return result")
	public void return_result() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("browserstack.local", "true");
		caps.setCapability("browserstack.localIdentifier", LOCAL_IDENTIFIER);
		caps.setCapability("project", PROJECT_NAME);
		caps.setCapability("build", BUILD_NAME);
		DesiredCapabilities.chrome();
		try {
			WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
			driver.get(SWAGGER_URL); 
			System.out.println("Jude Testing browserstack = "+driver.getTitle());
			driver.quit();
		}catch(Exception x) {
			
		}
	
		
		
		assertEquals(200, response.getStatusCode());
	}
}
