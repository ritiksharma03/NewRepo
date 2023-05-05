package basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import excel.ExcelFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utilities.utils;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BaseFile {
	public static Properties prop;
	public static AppiumDriver<MobileElement> driver;
	public static AppiumDriverLocalService service;
	public static DesiredCapabilities descap;

	public BaseFile() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./Resources/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	////////// This method is for initialzing the capabilties ////////////
	public void startapp() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();

		descap = new DesiredCapabilities();
		
		descap.setCapability("isHeadless", true);
        descap.setCapability("platformName", prop.getProperty("platformName"));
		descap.setCapability("platformVersion", prop.getProperty("platformVersion"));
		descap.setCapability("appPackage", prop.getProperty("appPackage"));
		descap.setCapability("appActivity", prop.getProperty("appActivity"));
		descap.setCapability("app", System.getProperty("user.dir" + "\\App\\API Demos_4.0_apkcombo.com.apk" ));
	    descap.setCapability("deviceName", prop.getProperty("deviceName"));

		try {
			driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("url")), descap);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 ///////// This method is for Scroll Down //////////
	 public static void scrolldown() {
		List<MobileElement> lists = driver.findElements(By.xpath("//android.widget.TextView"));
		for (MobileElement e : lists)
			System.out.println(e.getAttribute("text"));

		Dimension dime = driver.manage().window().getSize();

		int start_x = (int) (dime.getWidth() * 0.5);
        int start_y = (int) (dime.getHeight() * 0.9);
        int end_x = (int) (dime.getWidth() * 0.5);
        int end_y = (int) (dime.getHeight() * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}

	
    /////////// This method stops the appium service /////////
	public void closeapp() {
		driver.quit();
		service.stop();
	}

}
