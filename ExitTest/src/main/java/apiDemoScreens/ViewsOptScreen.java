package apiDemoScreens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePage.BaseFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsOptScreen extends BaseFile {
	
	// WebDriverWait object with a timeout of 30 second
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public ViewsOptScreen(AppiumDriver<MobileElement> driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]")
	public MobileElement View_tab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[normalize-space(@text)='Popup Menu']")
	public MobileElement popup_tab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button")
	public MobileElement make_popup_btn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
	public MobileElement search_btn;
	
	//Method to Click on the View tab
	public void view() {
		View_tab.click();
	}
	
	//Method to Click on Popup Menu tab
	public void popup_menu() {
		// Wait for the Popup Menu tab to be visible before clicking on it
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[normalize-space(@text)='Popup Menu']")));
		popup_tab.click();
	}
	
	public void make_a_popup() {
		// Wait for the Make a Popup button to be visible before clicking on it
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button")));
		make_popup_btn.click();
	}
	
	// Method to click on Search button
	public void search() {
		search_btn.click();
		
	}
	

}
