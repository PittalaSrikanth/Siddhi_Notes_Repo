package PackageOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();	
		
		chrome.get("https://demoqa.com/automation-practice-form");
		
		WebElement upload = chrome.findElement(By.xpath("//input[@*='uploadPicture']"));
		WebElement submit = chrome.findElement(By.xpath("//button[@*='submit']"));
		
		new Actions(chrome).moveToElement(submit).build().perform();
		new Actions(chrome).click(upload).build().perform();
		
		StringSelection path = new StringSelection("D:\\Selenium_Screenshots\\google.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Thread.sleep(8000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(8000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
				
		
		
		
		
		Thread.sleep(5000);
		chrome.close();
		chrome.quit();

	}

}
