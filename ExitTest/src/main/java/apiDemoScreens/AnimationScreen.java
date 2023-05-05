package apiDemoScreens;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import basePage.BaseFile;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnimationScreen extends BaseFile {

	public String text = "";

	public AnimationScreen(AppiumDriver<MobileElement> driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	////////////////// Default Layout Animation Test //////////////////

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public MobileElement Animation_tab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	public MobileElement Default_Layout_tab;

	@AndroidFindBy(id = "com.hmh.api:id/addNewButton")
	public MobileElement add_btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button")
	public MobileElement visible_btn;

	// Method to click on Animation Tab
	public void animation() {
		Animation_tab.click();
	}

	// Method to click on default layout animation tab
	public void defaultLayout() {
		Default_Layout_tab.click();
	}

	// Method to click on Add new button
	public void addnew() {
		add_btn.click();
	}

	// Method for getting text
	public String get_first_btn_text() {
		text = visible_btn.getText();
		return text;
	}

	////////////////// Hide - Show Animation Test //////////////////

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	public MobileElement hideshow_tab;

	@AndroidFindBy(id = "com.hmh.api:id/hideGoneCB")
	public MobileElement hide_btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement zero_btn;

	@AndroidFindBy(id = "com.hmh.api:id/addNewButton")
	public MobileElement show_btn;

	// Method to click on Hide Show tab
	public void hideshowtab() {
		hideshow_tab.click();
	}

	// Method to click on Hide Button
	public void hidebtn() {
		hide_btn.click();
	}

	// Method to click on Zero Button
	public void zerobtn() {
		zero_btn.click();
	}

	// Method to click on show button
	public void showbtn() {
		show_btn.click();
	}

	////////////////// Cloning Test //////////////////

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public MobileElement cloning_tab;

	@AndroidFindBy(id = "com.hmh.api:id/startButton")
	public MobileElement run_btn;

	// Method to click on Cloning Tab
	public void cloningtab() {
		cloning_tab.click();
	}

	// Method to click on Run Button
	public void runbtn() {
		run_btn.click();

	}

}
