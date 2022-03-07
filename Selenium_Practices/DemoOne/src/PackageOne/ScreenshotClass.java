package PackageOne;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScreenshotClass {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.co.in/");
		
		
		TakesScreenshot screenshot = (TakesScreenshot) chrome;
		File source =	screenshot.getScreenshotAs(OutputType.FILE);		
		File dest = new File("D:\\seleniumScreenshots\\google.png");		
		FileUtils.copyFile(source, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		chrome.close();
		chrome.quit();

	}

}
