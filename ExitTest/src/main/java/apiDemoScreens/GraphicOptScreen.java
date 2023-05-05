package apiDemoScreens;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import basePage.BaseFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GraphicOptScreen extends BaseFile {
	public String text = "";

	public GraphicOptScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	////////////////// Animate Drawables Test //////////////////

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement Graphic_Tab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public MobileElement AnimDraw_tab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement title_tab;

	// Method to click the Graphic Tab
	public void graphic() {
		Graphic_Tab.click();
	}

	// Method to click the Animated Drawables Tab
	public void drawable_btn() {
		AnimDraw_tab.click();
	}

	// Method to get the title 
	public String drawable_title() {
		text = title_tab.getText();
		return text;
	}
	
    ////////////////// Graphic Arcs Test //////////////////
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public MobileElement Arcs_tab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Title_arcs;

     // Method to click the Graphic Arcs Tab
	public void arcs() {
		Arcs_tab.click();
	}
	
	// Method to get the title 
	public String arcs_title() {
		text = Title_arcs.getText();
		return text;
	}
	

}
