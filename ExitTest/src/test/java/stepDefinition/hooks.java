package stepDefinition;

import basePage.BaseFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import screenshot.Screenshot;

public class hooks extends BaseFile {

	@Before
	public void StartAppium() {                       // This method will run before the scenario
		startapp();                                   // Method for starting the appium service 
	}

	@After
	public void CloseAppium(Scenario scenario) {      // This method will run after the scenario
		if (scenario.isFailed()) {
			Screenshot.captureScreenshot(driver, scenario.getName());   // This will capture the screenshot of failed scenarios
		}
		closeapp();                                   // Method for closing the appium service

	}

}
