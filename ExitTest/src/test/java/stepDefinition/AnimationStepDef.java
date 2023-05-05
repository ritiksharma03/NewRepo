package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import apiDemoScreens.AnimationScreen;
import basePage.BaseFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnimationStepDef extends BaseFile {

	// Object of AnimationScreen class
	public AnimationScreen animate = new AnimationScreen(driver);
	
	// Object of WebDriverWait with a timeout of 10 second
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	// Logger for messages
	Logger log = (Logger) LogManager.getLogger("AnimationStepDef.class");
	
	@Given("App is launched")                                 // Given statement
	public void app_is_launched() {
		log.info("App launched succesfuly");                  // Log message
	}

	/////////////// Default Layout Animation Test ///////////////
	
	@When("User click on Animation Tab")                      // When statement
	public void user_click_on_animation_tab() {
		animate.animation();                                  // Animation Tab click method
		log.info("Click function performed on Animation Tab"); // Log message
	}

	@And("User click on Default Layout Animation")            // And statement
	public void user_click_on_default_layout_animation() {
		animate.defaultLayout();                              //Default Layout Animation Tab click method
		log.info("Default Layout Animation tab clicked");     // Log message
		wait.until(ExpectedConditions.elementToBeClickable(animate.add_btn));   // Wait until the Add new button is clickable
	}

	@Then("Click on add button")                              // Then statement
	public void click_on_add_button() {
		animate.addnew();                                     // Add new button click method
		log.info("Add button clicked");
	}

	@Then("User can see a button")                            // Then statement
	public void user_can_see_a_button() {
		log.info("Checking for Expected condition");               
		String text = animate.get_first_btn_text();           // Method for getting the text
		String actualValue = "1";                              
		Assert.assertEquals(text, actualValue);               // Asserting with expected and actual value
		if (text.equals(actualValue)) {
		    log.info("Button text is as expected " + text );  // Log message
		} else {
		    log.info("Button text is not as expected");       // Log message
		}
	}

	
    /////////////// Hide - Show Animation Test ///////////////
	
	@When("User click on Hide and Show Animation")            // When statement
	public void user_click_on_hide_and_show_animation() {
		animate.hideshowtab();                                // Hide - Show Animation Tab click method
		log.info("Hide and Show Animation clicked");          // Log message
	}

	@And("Click on Hide and Click on button")                // And statement
	public void click_on_hide_and_click_on_button() {
		animate.hidebtn();                                   // Hide Button click method
		animate.zerobtn();                                   // Zero Button click method
		log.info("Hide button clicked");                     // Log message
	}
 
	@Then("Click on Show button")                            // Then statement
	public void click_on_show_button() {
		animate.showbtn();                                   // Show Button click method
		log.info("Show button clicked");                     // Log message
	}
	
    /////////////// Cloning Test ///////////////

	@When("User click on Cloning")                           // When statement
	public void user_click_on_cloning() {
		animate.cloningtab();                                // Cloning Tab click method 
		log.info("Cloning option clicked");                  // Log message

	}

	@Then("Click on Run button")                             // Then statement
	public void click_on_run_button() {
		animate.runbtn();                                    // Run Button click method
		log.info("Run button clicked");                      // Log message

	}

}
