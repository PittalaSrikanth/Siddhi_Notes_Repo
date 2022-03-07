package Appium;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class LiveDemo3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("automationName", "Appium");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "7.0");
		ds.setCapability("deviceName", "Android Emulator");
//		ds.setCapability("app", "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		try
		{
			driver.findElementByXPath("//*[@text='App']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Alert Dialogs']").click();
			
			driver.findElementByAccessibilityId("OK Cancel dialog with a message").click();
			
			System.out.println(driver.findElementById("android:id/alertTitle").getText());
			
			driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button2\")").click();
			driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").text(\"OK CANCEL DIALOG WITH A LONG MESSAGE\")").click();
			
			System.out.println(driver.findElementByXPath("//*[@text='Header title']").getText());
			driver.findElementByXPath("//*[@text='OK']").click();
			
			driver.findElementByAndroidUIAutomator("new UiSelector().checked(false).resourceId(\"io.appium.android.apis:id/two_buttons2ultra\")").click();
			
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)");
			driver.findElementByXPath("//*[@text='SOMETHING']").click();
			
			driver.findElementByAndroidUIAutomator("new UiSelector().focusable(true).packageName(\"io.appium.android.apis\").index(3)").click();
			driver.findElementByXPath("//*[@text='Command three']").click();
			System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().index(1)").getText());
			driver.navigate().back();
			driver.findElementByAndroidUIAutomator("new UiSelector().index(5)").click();
			
			Thread.sleep(2000);
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(164,1117)).perform();
			driver.findElementByXPath("//*[@text='OK']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//*[@bounds='[0,966][1080,1092]']").click();
			
			
			Thread.sleep(5000);
			List<WebElement>	days =	driver.findElementsByXPath("//*[@resource-id='android:id/text1' and @checked='false']");
			System.out.println(days.size());
			Thread.sleep(2000);
			for(int i =0;i<days.size();i++)
			{
//				if(days.get(i).getText().equals("Every Wednesday"))
//				{
//					days.get(i).click();
//				}
//				else 
//				{
					Thread.sleep(2000);
					System.out.println(days.get(i));
					action.tap(ElementOption.element(days.get(i))).perform();
//					day.click();
//				}
				
				
				
			}
			driver.findElementByXPath("//*[@index='1']").click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} 
		finally 
		{
			driver.quit();
		}
		
		
		
		
	}

}
