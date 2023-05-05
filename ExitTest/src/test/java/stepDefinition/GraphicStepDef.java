package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

//import org.junit.Assert;

import apiDemoScreens.GraphicOptScreen;
import basePage.BaseFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GraphicStepDef extends BaseFile {
	
	// Object of GraphicOptScreen class
	public GraphicOptScreen graphicscrn = new GraphicOptScreen(driver);
	
	// Logger for messages
	Logger log =(Logger) LogManager.getLogger("GraphicStepDef.class");
	
    /////////////// Animate Drawable Test ///////////////
	
	@Given("User is on App Home Page")                         // Given statement
	public void user_is_on_app_home_page() {
		log.info("App is launched");                           // Log message
		
	}
	
	@When("User click on Graphic Tab")                         // When statement
	public void user_click_on_graphic_tab() {
		graphicscrn.graphic();                                 // Graphic Tab click method
		log.info("User clicks on graphic Button");             // Log message
	   
	}

	@And("clicks on Animate Drawables Tab")                    // And statement
	public void user_click_on_animate_drawables_tab() {
		graphicscrn.drawable_btn();                            // Animate Drawable Tab click method
		log.info("Animate Drawable Button clicked");           // Log message
	}

	@Then("User is directed to Drawables Screen")              // Then statement
	public void user_is_directed_to_drawables_screen() {
		log.info("Checking for the assertion");
		String text = graphicscrn.drawable_title();            // Method for getting the text
		String actualText = "Graphics/AnimateDrawables";
		Assert.assertEquals(text,actualText);                  // Asserting with expected and actual value
		if (text.equals(actualText)) {
		    log.info("Title text of the page is " + text);     // Log message
		} else {
		    log.info("Title is not as expected");              // Log message
		}
	}

	
    /////////////// Graphic Arcs Test ///////////////
	
	@When("User click on Arcs Tab")                            // When statement
	public void user_click_on_arcs_tab() {
		graphicscrn.arcs();
		log.info("Arcs button clicked");                       // Log message
	}

	@Then("User is directed to Arcs")                          // Then statement
	public void user_is_directed_to_arcs() {
		log.info("Checking for the assertion");
		String text = graphicscrn.arcs_title();                // Method for getting the text
		String actualText = "Graphics/Arc";
		Assert.assertEquals(text,actualText);                  // Asserting with expected and actual value
		if (text.equals(actualText)) {
		    log.info("Title text of the page is " + text);     // Log message
		} else {
		    log.info("Title is not as expected");
		}
	}

}
