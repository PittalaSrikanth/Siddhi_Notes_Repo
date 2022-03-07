package PackageOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadClass {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		
		chrome.get("https://demoqa.com/automation-practice-form");
		
		
		JavascriptExecutor js = (JavascriptExecutor) chrome;
		js.executeScript("window.scrollTo(0,300)");
		
		(new Actions(chrome)).moveToElement(chrome.findElement(By.id("uploadPicture"))).click().build().perform();
		
		
		
		Thread.sleep(5000);
		chrome.findElement(By.id("uploadbutton")).click();
		StringSelection path1 = new StringSelection("C:\\xxxxx\\google.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path1,null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Runtime.getRuntime().exec("D:\\seleniumScreenshots\\FileUpload_autoit.exe");
		
		
		Thread.sleep(5000);
		chrome.close();
		chrome.quit();

	}

}
