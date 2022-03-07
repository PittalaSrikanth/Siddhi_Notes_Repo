package Appium;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.clipboard.ClipboardContentType;


public class ApkDemo2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("automationName", "Appium");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "7.0");
		ds.setCapability("deviceName", "Android Emulator");
		ds.setCapability("app", "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
	    ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		URL appiumserver = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(appiumserver,ds);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAccessibilityId("Buttons").click();	
		driver.findElementByClassName("android.widget.ToggleButton").click();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.closeApp();
		driver.quit();
	}

}
