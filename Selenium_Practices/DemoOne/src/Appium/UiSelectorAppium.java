package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UiSelectorAppium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		ds.setCapability(MobileCapabilityType.FULL_RESET, false);
//		ds.setCapability(MobileCapabilityType.NO_RESET, true);
//		ds.setCapability(MobileCapabilityType.APP, "D:\\Selenium_SS\\base.apk");
		ds.setCapability("appPackage", "com.finance.emi.calculate");
	    ds.setCapability("appActivity", "com.finance.emi.calculate.ui.SplashActivity");
//	    ds.setCapability(MobileCapabilityType.NO_RESET, true);
//	    ds.setCapability(MobileCapabilityType.FULL_RESET,false);
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Thread.sleep(10000);
		driver.findElementById("com.finance.emi.calculate:id/btn_skip").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.finance.emi.calculate:id/rootView\").index(1)").click();
//		driver.findElementByXPath("//android.widget.EditText[@resource-id='com.finance.emi.calculate:id/principal']").sendKeys("1000000");
		
//		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").resourceId(\"com.finance.emi.calculate:id/principal\")").sendKeys("1000000");
		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").resourceId(\"com.finance.emi.calculate:id/principal\")").sendKeys("1000000");
		driver.findElementById("com.finance.emi.calculate:id/interest").sendKeys("10.25");
		driver.findElementById("com.finance.emi.calculate:id/loan_tenure").sendKeys("5");
//		driver.findElementByXPath("//android.widget.Button[@text='Calculate']").click();
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Calculate\")").click();
//		driver.findElementByAndroidUIAutomator("new UiSelector().classNameMatches(\".*android.widget.Button\").instance(2)").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.finance.emi.calculate:id/extraRepaymentCard\").clickable(true)").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.finance.emi.calculate:id/addNew\").clickable(true)").click();
		
		driver.findElementById("com.finance.emi.calculate:id/oneTimeValue").sendKeys("2");
		driver.findElementById("com.finance.emi.calculate:id/oneTimeMonth").sendKeys("30000");
		driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true).resourceId(\"com.finance.emi.calculate:id/save\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().classNameMatches(\".*android.widget.Button\").index(2))").click();
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Share Result\").instance(0))").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.finance.emi.calculate:id/emi_calculator_content_pro\")).getChildByText(new UiSelector().className(\"android.widget.Button\"),\"Share Result\")").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
		
		
	}

}
