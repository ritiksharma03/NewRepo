package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class utils  {
	public static AppiumDriver<MobileElement> driver;

	///////////////// This method is for scrolling down the Page/////////////
	public static void scrolldown() {
		List<MobileElement> lists = driver.findElements(By.xpath("//android.widget.TextView"));
		for (MobileElement e : lists)
			System.out.println(e.getAttribute("text"));

		Dimension dime = driver.manage().window().getSize();

		int start_x = (int) (dime.getWidth() * 0.5);
        int start_y = (int) (dime.getHeight() * 0.8);
        int end_x = (int) (dime.getWidth() * 0.5);
        int end_y = (int) (dime.getHeight() * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}
}

