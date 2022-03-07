package Appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.PowerACState;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;


public class alerts {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
//		ds.setCapability(MobileCapabilityType.UDID,"192.168.0.2:5555");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		ds.setCapability(MobileCapabilityType.APP, "D:\\Selenium_SS\\ApiDemos.apk");
//		ds.setCapability(MobileCapabilityType.APP, "https://github.com/appium/appium/raw/master/sample-code/apps/ApiDemos-debug.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
	    ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//*[@text='App']").click();
		driver.findElementByXPath("//*[@text='Alert Dialogs']").click();
		driver.findElementByAccessibilityId("OK Cancel dialog with a message").click();	
		driver.findElementByXPath("//*[@text='CANCEL']").click();
		driver.findElementByAccessibilityId("OK Cancel dialog with a message").click();	
		driver.findElementByXPath("//*[@text='OK']").click();
		
		
		
		driver.findElementByXPath("//*[@text='OK CANCEL DIALOG WITH A LONG MESSAGE']").click();
		String text =	driver.findElementById("android:id/message").getText();
		System.out.println(text);
		
		driver.findElementByXPath("//*[@text='OK']").click();
		
		
		
		driver.findElementByXPath("//*[@text='OK CANCEL DIALOG WITH ULTRA LONG MESSAGE']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)");
		
		String text1 =	driver.findElementById("android:id/message").getText();
		System.out.println(text1);
		
		driver.findElementByXPath("//*[@text='OK']").click();
		
//		
//		driver.findElementByAccessibilityId("Progress dialog").click();
//		driver.findElementByXPath("//android.widget.Button[@text='HIDE']").click();
		
		
		driver.findElementByAccessibilityId("Single choice list").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().checkable(true).text(\"Street view\")").click();
		driver.findElementByXPath("//*[@text='OK']").click();
		
		
		driver.findElementByAccessibilityId("Repeat alarm").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().checkable(true).text(\"Every Monday\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().checkable(true).text(\"Every Wednesday\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().checkable(true).text(\"Every Friday\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().checkable(true).text(\"Every Saturday\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().checkable(true).text(\"Every Sunday\")").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@text='OK']").click();
		
		driver.findElementByAccessibilityId("Text Entry dialog").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").index(1)").sendKeys("Siddhi");
		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").index(3)").sendKeys("Siddhi");
		driver.findElementByXPath("//*[@text='OK']").click();
		
		
		driver.findElementByAccessibilityId("OK Cancel dialog with traditional theme").click();
		String text2 =	driver.findElementById("android:id/alertTitle").getText();
		System.out.println(text2);
		driver.findElementByXPath("//*[@text='OK']").click();
		
		driver.findElementByAccessibilityId("OK Cancel dialog with Holo Light theme").click();
		String text3 =	driver.findElementById("android:id/alertTitle").getText();
		System.out.println(text3);
		driver.findElementByXPath("//*[@text='OK']").click();
		
		Thread.sleep(10000);
		driver.closeApp();
		driver.quit();
	}

}
