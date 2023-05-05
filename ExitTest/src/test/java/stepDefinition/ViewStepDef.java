package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import apiDemoScreens.ViewsOptScreen;
import basePage.BaseFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.utils;

public class ViewStepDef extends BaseFile {

	// Object of ViewsOptScreen class
	public ViewsOptScreen viewsScr = new ViewsOptScreen(driver);
	// Logger for messages
	Logger log = (Logger) LogManager.getLogger("ViewStepDef.class");
	// Object of utils class
	public utils util = new utils();
	
    /////////////// Scroll Down Test ///////////////
	
	@Given("User is on Home Page")                         // Given statement
	public void user_is_on_home_page() {
		log.info("User is on Home Page");                  // Log message
	}

	@When("User clicks on View Tab")                       // When statement
	public void user_clicks_on_view_tab() {
		viewsScr.view();                                   // View Tab click method
		log.info("View Tab clicked");                      // Log message
	}

	@And("Scroll down the page")                           // And statement
	public void scroll_down_the_page() {
		BaseFile.scrolldown();                             // Scrolldown method
		log.info("Scroll down the screen");                // Log message

	}

	@Then("User clicks on Popup Menu")                     // Then statement
	public void user_clicks_on_popup_menu() {
		viewsScr.popup_menu();                             // Popup Tab click method
		log.info("Popup Menu Tab clicked");                // Log message
	} 

	@And("Clicks on Make a Popup button")                  // And statement
	public void clicks_on_make_a_popup_button() {
		viewsScr.make_a_popup();                           // Make a popup button click method
		log.info("Make a Popup button clicked");
	}

	@Then("Clicks on Search")                              // Then statement
	public void clicks_on_search() {
		viewsScr.search();                                 // Search Button click method
		log.info("Search button clicked");                 // Log message
	}

}
