package PackageOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotClassDemo {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://demoqa.com/automation-practice-form");
		
		StringSelection dest = new StringSelection("D:\\Selenium_SS\\google.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dest, null);
		
		JavascriptExecutor js = (JavascriptExecutor) chrome;
		js.executeScript("window.scrollTo(0,300)");		
		(new Actions(chrome)).moveToElement(chrome.findElement(By.id("uploadPicture"))).click().build().perform();
		Thread.sleep(8000);
		
		Runtime.getRuntime().exec("D:\\autoIT_Demo\\FileUpload_autoit.exe");
		
		
		
		
		
		
		Thread.sleep(8000);
		chrome.close();
		chrome.quit();

	}

}
