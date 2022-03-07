package PackageOne;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");

//		Launching chrome Browser
		WebDriver chrome = new ChromeDriver();
		
		chrome.findElement(By.xpath("xx")).sendKeys(Keys.CONTROL);
		
//		Navigating to google url
		chrome.get("https://www.google.co.in/");
	
//		opening all link in google page
		List<WebElement> links = chrome.findElements(By.xpath("//a"));
		for(WebElement link:links)
		{	
			Thread.sleep(1000);
			try 
			{
				link.sendKeys(Keys.CONTROL,Keys.ENTER);
			} catch (Exception e)
			{
			}
			chrome.findElement(By.name("q")).click();
		}
		Thread.sleep(15000);
		
//		Print parent window Handle
		String windowHandle = 	chrome.getWindowHandle();
		System.out.println("*************************************");
		System.out.println("Parent window Handle : "+windowHandle);
		System.out.println("*************************************");
		
//		Print all window Handles	
		System.out.println("************all windows*************************");
		Set<String> windowsHandles = chrome.getWindowHandles();
		for(String window:windowsHandles)
		{
			System.out.println(window);
		}
		System.out.println("*************************************");
		
//		closing all windows				
		System.out.println("**************closing windows***********************");
		for(String window:windowsHandles)
		{
			Thread.sleep(2000);
			System.out.println("Naviagated and closing window : "+window);
			chrome.switchTo().window(window).close();
		}
		System.out.println("*************************************");
		
//		Browser quit
		chrome.quit();

	}
}
