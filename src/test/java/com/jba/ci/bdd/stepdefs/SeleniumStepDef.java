/**
 * 
 */
package com.jba.ci.bdd.stepdefs;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

/**
 * @author judebarnabasantony
 *
 */
@Slf4j
public class SeleniumStepDef {

	private static final String HTTPS = "https://";

	private static final String LAMDA_TEST = "LamdaTest";

	private static final String HUB_CLOUD_BROWSERSTACK_COM_WD_HUB = "@hub-cloud.browserstack.com/wd/hub";
	private static final String HUB_CLOUD_LAMADATEST_COM_WD_HUB = "@hub.lambdatest.com/wd/hub";

	private static final String COLLUMN = ":";
	
	public static final String AUTOMATE_USERNAME = System.getenv("BROWSERSTACK_USERNAME");
	public static final String AUTOMATE_ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
	public static final String LOCAL_IDENTIFIER = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	public static final String BUILD_NAME = System.getenv("BROWSERSTACK_BUILD_NAME");
	public static final String PROJECT_NAME = System.getenv("BROWSERSTACK_PROJECT_NAME");

	public static final String LAMADATEST_AUTOMATE_USERNAME = System.getenv("LT_EMAIL");
	public static final String LAMADATEST_AUTOMATE_ACCESS_KEY = System.getenv("LT_ACCESS_KEY");

	public static final String URL = HTTPS + AUTOMATE_USERNAME + COLLUMN + AUTOMATE_ACCESS_KEY
			+ HUB_CLOUD_BROWSERSTACK_COM_WD_HUB;
	
	public static final String LAMADATEST_URL = HTTPS + LAMADATEST_AUTOMATE_USERNAME + COLLUMN + LAMADATEST_AUTOMATE_ACCESS_KEY
			+ HUB_CLOUD_LAMADATEST_COM_WD_HUB;


	private static final String SWAGGER_URL = "http://20.81.93.165/swagger-ui.html";

	@Given("user wants to check Swagger UI")
	public void wants_to_check_Swagger_UI() {
	}

	@When("^user wants to check ui for tool \"([^\\\"]*)\"$")
	public void call_swagger_ui(String tool) {

		DesiredCapabilities caps = new DesiredCapabilities();
		if (LAMDA_TEST.equalsIgnoreCase(tool)) {
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("version", "92.0"); 
			caps.setCapability("resolution", "1024x768");
			caps.setCapability("build", "First Test");
			caps.setCapability("name", "Sample Test");
			caps.setCapability("network", true); 
			caps.setCapability("visual", true); 
			caps.setCapability("video", true); 
			caps.setCapability("console", true); 

			try {
				WebDriver driver = new RemoteWebDriver(
						new URL(LAMADATEST_URL),
						caps);
				driver.get(SWAGGER_URL);
				log.info("Testing lamdatest = {}" , driver.getTitle());
				driver.quit();
			} catch (Exception e) {
				log.error("{}",e);
			}
		} else {
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
				log.info("Testing browserstack = {}" , driver.getTitle());
				driver.quit();
			} catch (Exception x) {
				log.error("{}",x);
			}
		}
	}

	@Then("return ui")
	public void return_ui() {
	}
}
