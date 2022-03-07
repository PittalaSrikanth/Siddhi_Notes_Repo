package Appium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.apache.xalan.xsltc.util.IntegerArray;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.gargoylesoftware.htmlunit.javascript.host.event.KeyboardEvent;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;
import io.appium.java_client.android.PowerACState;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;
import io.appium.java_client.clipboard.ClipboardContentType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class LiveDemo2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("automationName", "Appium");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "7.1");
		ds.setCapability("deviceName", "Android Emulator");
		ds.setCapability("app", "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
//		ds.setCapability("networkConnectionEnabled", false);
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.installApp("D:\\Selenium_SS\\ApiDemos.apk");
//		driver.launchApp();
//		System.out.println(driver.isAppInstalled("io.appium.android.apis"));
		
//		driver.activateApp("liteamazon.onlineshopping.cashback");
		
		
		
		
//		driver.resetApp();
//		Thread.sleep(5000);
//		driver.removeApp("io.appium.android.apis");
//		driver.launchApp();
		
//		driver.closeApp();
//		
//		driver.terminateApp("liteamazon.onlineshopping.cashback");
		
//		
//		System.out.println(driver.getCurrentPackage());
//		System.out.println(driver.currentActivity());
//		System.out.println(driver.getDeviceTime());
//		
//		
//		File sshot =	driver.getScreenshotAs(OutputType.FILE);
//		File dfile = new File("D:\\Selenium_SS\\appiumTest.png");
//		FileUtils.copyFile(sshot, dfile);
//		
//		System.out.println(driver.isBrowser());
//		System.out.println(driver.isDeviceLocked());
//		System.out.println(driver.isKeyboardShown());
//		
//		
//		System.out.println(driver.getContext());
//		System.out.println(driver.getClipboardText());
//		System.out.println(driver.getSessionDetails());
//		
//		
//		System.out.println(driver.location().getAltitude());
//		System.out.println(driver.location().getLatitude());
//		
//		
//		
//		driver.rotate(ScreenOrientation.LANDSCAPE);
		
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Tabs\"))");
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"TextFields\")").click();
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"EditText\")").click();
		
//		driver.longPressKey(KeyEventFlag.KEEP_TOUCH_MODE);
		
//		driver.longPressKey(new KeyEvent(AndroidKey.HOME));
//		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
//		driver.setPowerAC(PowerACState.ON);
//		
//		driver.setPowerCapacity(100);
//		
//		
//		driver.toggleLocationServices();
//		try {
//			driver.toggleAirplaneMode();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			driver.toggleData();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			driver.toggleWifi();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		WebElement views =	driver.findElementByXPath("//*[@text='Views']");
		
		
		
	TouchAction action = new TouchAction(driver);
	 action.tap(ElementOption.element(views)).perform();
		
	WebElement gallery =	driver.findElementByXPath("//*[@text='Gallery']");
		
	WebElement buttons =	driver.findElementByXPath("//*[@text='Buttons']");
	
	
	
	action.press(ElementOption.element(gallery)).perform();
//	driver.navigate().back();
//	action.press(ElementOption.element(gallery)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(ElementOption.element(buttons)).release().perform();
//		
//		
//		
//	action.press(10,20).
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
