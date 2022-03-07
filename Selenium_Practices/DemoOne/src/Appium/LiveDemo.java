package Appium;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;


public class LiveDemo {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("automationName", "Appium");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "7.1");
		ds.setCapability("deviceName", "Android Emulator");
//		ds.setCapability("app", "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
		
//		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").index(8)").click(); 
		driver.findElementByXPath("//*[@text='Views']").click();
		driver.navigate().back();
		
//		UiObject btView = new UiObject(new UiSelector()).text("Bluetooth"));

//		(new UiObject(new UiSelector()).text("Views")).click();
		
		driver.findElementByAndroidUIAutomator("new UiObject(new UiSelector().text(\"Views\")).click()");
		
		
		
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Tabs\"))");
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollDescriptionIntoView(\"Tabs\")").click();
//		
//		
//		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/list\").fromParent(new UiSelector().text(\"3. Content By Intent\"))").click();
//		
//		
////		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Tabs\")").click();
////		driver.findElementByAccessibilityId("3. Content By Intent").click();
//		
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().setMaxSearchSwipes(15)"); 
////		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollForward()"); 
////		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollBackward(5)");
//		
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).getChildByText(new UiSelector().className(\"android.widget.TextView\"),\"Adelost\")").click();
//		
		
//		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
