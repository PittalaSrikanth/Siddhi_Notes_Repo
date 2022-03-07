package Appium;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class HybrideApkInstallation {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("automationName", "uiautomator2");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "7.1");
		ds.setCapability("deviceName", "Android Emulator");
		ds.setCapability("noReset", "true");
//		ds.setCapability("fastReset", "true");
//		ds.setCapability("app", "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability("appPackage", "liteamazon.onlineshopping.cashback");
		ds.setCapability("appActivity", "liteamazon.onlineshopping.cashback.com.google.android.gms.ads.AdActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TouchAction action = new TouchAction(driver);
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
