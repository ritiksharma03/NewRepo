package apiDemoScreens;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.BaseFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OSScreen extends BaseFile {

	public OSScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}

	////////////////////// SMS Messaging Test /////////////////////

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[8]")
	public MobileElement os_tab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	public MobileElement sms_tab;

	@AndroidFindBy(id = "com.hmh.api:id/sms_recipient")
	public MobileElement recipeint_box;

	@AndroidFindBy(id = "com.hmh.api:id/sms_content")
	public MobileElement message_box;

	@AndroidFindBy(id = "com.hmh.api:id/sms_send_message")
	public MobileElement send_btn;

	// Method to click on the OS tab
	public void Osfeat() {
		os_tab.click();
	}

	// Method to click on the SMS tab
	public void SmsMessage() {
		sms_tab.click();
	}

	// Method to enter recipient number
	public void enterNo(String Num) {
		recipeint_box.sendKeys(Num);
	}

	// Method to enter message
	public void enterMessage(String Message) {
		message_box.sendKeys(Message);
	}

	// Method to click on the send button
	public void sendMessage() {
		send_btn.click();
	}

}
