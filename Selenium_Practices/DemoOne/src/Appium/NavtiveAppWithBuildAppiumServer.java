package Appium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.ElementOption;

public class NavtiveAppWithBuildAppiumServer {

	public static void main(String[] args) throws InterruptedException 
	{
		AppiumServiceBuilder asb = new AppiumServiceBuilder();
		asb.withIPAddress("0.0.0.0");
		asb.usingAnyFreePort();
//		asb.usingPort(4723);	
		AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildService(asb);
		appiumService.start();
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
//		ds.setCapability(MobileCapabilityType.UDID,"192.168.0.2:5555");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		ds.setCapability(MobileCapabilityType.APP, "D:\\Selenium_SS\\ApiDemos.apk");
		ds.setCapability(MobileCapabilityType.APP, "https://github.com/appium/appium/raw/master/sample-code/apps/ApiDemos-debug.apk");
		ds.setCapability("appPackage", "io.appium.android.apis");
	    ds.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	    
	    AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(appiumService.getUrl(),ds);
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
		
		driver.quit();
		appiumService.stop();
		
	}

}
