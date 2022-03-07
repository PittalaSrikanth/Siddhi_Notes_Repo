package Appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ApkDemo {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
//		ds.setCapability(MobileCapabilityType.UDID,"192.168.0.2:5555");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		ds.setCapability(MobileCapabilityType.APP, "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability(MobileCapabilityType.APP, "https://github.com/appium/appium/raw/master/sample-code/apps/ApiDemos-debug.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
	    ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	    
	    
	 
	    
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(appiumService.getUrl(),ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TouchAction action = new TouchAction(driver);
		driver.runAppInBackground(Duration.ofSeconds(10));
		driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
		Thread.sleep(5000);
		driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
		
//		lognpress, Drag and drop, release actions
		driver.findElementByXPath("//*[@text='Views']").click();
//		driver.lockDevice(Duration.ofSeconds(5));
		driver.findElementByXPath("//*[@text='Drag and Drop']").click();
//		driver.unlockDevice();
		WebElement source = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement dest = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(dest)).release().perform();
		
		
		driver.navigate().back();
//		Tap action
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Tabs\"))");
		WebElement viewtap = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Tabs\")");
		Point point = viewtap.getLocation();
//		action.tap(ElementOption.element(viewtap)).perform();
		action.tap(PointOption.point(point.x+2,point.y+2)).perform();
		  
		action.tap(PointOption.point(115, 1083)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(0))).perform();
		
	
		
		WebElement contentByIntent = driver.findElementByAccessibilityId("3. Content By Intent");
		action.press(ElementOption.element(contentByIntent)).release().perform();
		action.press(PointOption.point(115, 1083)).moveTo(PointOption.point(115, 1083)).release().perform();
		
		File ssource = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssource, new File("D:\\Selenium_SS\\androidss.png"));
		
		System.out.println(driver.getCurrentPackage());
		System.out.println(driver.getDeviceTime());
		
		
		driver.closeApp();
		Thread.sleep(10000);
		driver.removeApp("io.appium.android.apis");
		Thread.sleep(10000);
		driver.installApp("D:\\Selenium_SS\\ApiDemos.apk");
		Thread.sleep(10000);
		driver.launchApp();
		driver.findElementByXPath("//*[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"TextFields\"))");
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"TextFields\")").click();
		driver.getKeyboard();
//		driver.openNotifications();
		boolean status = driver.isAppInstalled("io.appium.android.apis");
		System.out.println(status);
		
		
		Thread.sleep(10000);
		driver.hideKeyboard();
		Thread.sleep(10000);
		driver.quit();
		
		
	}

}
