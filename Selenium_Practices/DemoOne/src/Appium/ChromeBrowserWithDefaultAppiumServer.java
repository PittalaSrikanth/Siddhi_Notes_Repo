package Appium;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ChromeBrowserWithDefaultAppiumServer {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();		
		
		try {
			ChromeOptions cop = new ChromeOptions();
			cop.addArguments("ignore-certificate-errors");
			cop.addArguments("disable-translate");
			cop.addArguments("--disable-popup-blocking");
			cop.addArguments("--disable-fre");
			
			DesiredCapabilities ds = new DesiredCapabilities().chrome();
			ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
			ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			ds.setCapability("chromedriverExecutable", "D:\\Selenium_01\\chromedriver_win32 (9)\\chromedriver.exe");
			ds.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//			ds.setCapability("autoWebview", "true");
			ds.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
			ds.setCapability(ChromeOptions.CAPABILITY, cop);
//			URL url = new URL("http://0.0.0.0:4723/wd/hub");
//			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);

			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(appiumService.getUrl(), ds);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://demoqa.com/automation-practice-form");
			String title =	driver.getTitle();
			System.out.println(title);
			
			String currenturl =	driver.getCurrentUrl();
			System.out.println(currenturl);
			
			String pagesource =	driver.getPageSource();
			System.out.println(pagesource);
//			driver.getKeyboard();
			driver.findElement(By.xpath("//input[@id='firstName']")).click();
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Siddhi");
			driver.hideKeyboard();
			driver.findElementByXPath("//input[@id='lastName']").click();
			driver.findElementByXPath("//input[@id='lastName']").sendKeys("Bhingir");
			driver.hideKeyboard();
			driver.findElementByXPath("//input[@id='userEmail']").click();
			driver.findElementByXPath("//input[@id='userEmail']").sendKeys("siddhiBhongiri@gmail.com");
			driver.hideKeyboard();
			driver.findElementByXPath("//label[text()='Male']").click();
			driver.hideKeyboard();
			driver.findElement(By.cssSelector("input#dateOfBirthInput")).click();
			Thread.sleep(5000);
			while(!driver.findElement(By.cssSelector("div[class$='month--hasMonthDropdown']")).getText().equals("September 2020"))
			{
				System.out.println(driver.findElement(By.cssSelector("div[class$='month--hasMonthDropdown']")).getText());
				driver.findElement(By.cssSelector("button[aria-label='Previous Month']")).click();
				Thread.sleep(500);
			}
			
			System.out.println(driver.getContext());
			
			Set<String> contextHandls = driver.getContextHandles();
			for(String ch:contextHandls) {
				System.out.println(ch);
			}
			
			driver.hideKeyboard();
			driver.findElementByXPath("//input[@id='subjectsInput']").click();
			driver.hideKeyboard();
			try 
			{
				driver.context("CHROMIUM");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,1500)");
//				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"android.widget.Buttn\"))").click(); 	
			} 
			catch (InvalidSelectorException e) { 
		}

			driver.findElementByXPath("//button[@id='submit']").click();
			Thread.sleep(15000);
			driver.quit();
		} finally 
		{
			appiumService.stop();
		}
		
		
	}

}
