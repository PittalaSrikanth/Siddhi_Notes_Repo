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
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class BuiltInApkInstallationDefaultAppiumServer {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		AppiumServiceBuilder asb = new AppiumServiceBuilder();
		asb.withIPAddress("0.0.0.0");
		asb.usingAnyFreePort();
//		asb.usingPort(4723);	
		AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildService(asb);
		appiumService.start();
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("automationName", "Appium");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "7.1");
		ds.setCapability("deviceName", "Android Emulator");
//		ds.setCapability("app", "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability("appPackage", "com.google.android.apps.messaging");
		ds.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
//		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(appiumService.getUrl(),ds);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TouchAction action = new TouchAction(driver);
		driver.findElementByXPath("//*[@text='Got it']").click();
		driver.findElementByXPath("//*[@text='Start chat']").click();
		Thread.sleep(5000);
		driver.hideKeyboard();
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Kru\"))");
		driver.quit();
		appiumService.stop();
		
		
	}

}
