package Appium;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;


public class NavtiveApkInstallation {

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
		TouchAction action = new TouchAction(driver);
//		lognpress, Drag and drop, release actions
		driver.findElementByXPath("//*[@text='Views']").click();
//		driver.lockDevice(Duration.ofSeconds(5));
		driver.findElementByXPath("//*[@text='Drag and Drop']").click();
//		driver.unlockDevice();
		WebElement source = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement dest = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(dest)).release().perform();
		
		
		driver.navigate().back();
//		driver.quit();
		
		
		
	}

}
