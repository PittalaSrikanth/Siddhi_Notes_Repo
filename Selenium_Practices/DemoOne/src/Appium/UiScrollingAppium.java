package Appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.PowerACState;
import io.appium.java_client.remote.MobileCapabilityType;


public class UiScrollingAppium {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
		ds.setCapability(MobileCapabilityType.UDID,"192.168.0.143:5544");
//		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		ds.setCapability(MobileCapabilityType.APP, "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability(MobileCapabilityType.APP, "D:\\Selenium_SS\\split_paytm_bank.config.xhdpi.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
	    ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//*[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Tabs\"))");
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Tabs\")").click();
		driver.findElementByAccessibilityId("3. Content By Intent").click();	
		
		System.out.println(driver.getContext());
		
//		
		Thread.sleep(10000);
		driver.closeApp();
		driver.quit();
	}

}
