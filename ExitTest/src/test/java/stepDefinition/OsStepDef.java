package stepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

import apiDemoScreens.OSScreen;
import basePage.BaseFile;
import excel.ExcelFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OsStepDef extends BaseFile {

	// Object of OSScreen class
	public OSScreen osscreen = new OSScreen(driver);

	// Object of ExcelFile class
	ExcelFile excelread = new ExcelFile();

	public XSSFSheet xsssheet;

	// Logger for messages
	Logger log = (Logger) LogManager.getLogger("OsStepDef.class");

    /////////////// SMS Messaging Test ///////////////
	
	@Given("User is On Home Page")                            // Given statement
	public void user_is_on_home_page() {
		log.info("App is launched and user is on Home Page"); // Log message
	}

	@When("User Clicks on OS Tab")                            // When statement
	public void user_clicks_on_os_tab() {
		osscreen.Osfeat();                                    // OS Tab click method
		log.info("Os button clicked");                        // Log message
	}

	@And("Clicks on SMS messaging")                           // And statement                 
	public void user_click_on_sms_messaging() {
		osscreen.SmsMessage();                                // SMS Messaging Tab click method
		log.info("SMS messaging button clicked");             // Log message
	}

	@Then("Fill the Recipient row {int} and Message row {int} details through excel {string}")     // Then statement
	public void fill_the_recipient_row_and_message_row_details_through_excel(Integer int1, Integer int2, String string)
			throws IOException {

		// Read data from Excel file
		xsssheet = excelread.ExcelData(string);
		// Get value from Excel cell and enter it in the recipient text box
		String textboxValue = excelread.CellData(xsssheet, int1);
		// Enter Recipient details method
		osscreen.enterNo(textboxValue);
		// Get value from Excel cell and enter it in the message text box
		String textboxValue2 = excelread.CellData(xsssheet, int2);
		// Enter Message method
		osscreen.enterMessage(textboxValue2);

	}

	@Then("User Clicks on Send button")                      // Then statement
	public void user_clicks_on_send_button() {
		osscreen.sendMessage();                              // Send button click method
		log.info("Send button clicked");                     // Log message
	}

}
