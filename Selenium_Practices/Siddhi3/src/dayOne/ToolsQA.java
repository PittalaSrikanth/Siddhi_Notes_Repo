package dayOne;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		WebDriver driver = null;
		
		try 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
			driver = new  ChromeDriver();	
			
			driver.manage().window().maximize();
			
			
			
			JavascriptExecutor js  = ((JavascriptExecutor)driver);				
			
			js.executeScript("window.location='https://accounts.google.com/signup'");
			
			
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(5000);
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
			js.executeScript("document.querySelector('.MocG8c.B9IrJb.LMgvRb.KKjvXb').click()");
			Thread.sleep(5000);
			js.executeScript("document.querySelector('.OA0qNb.ncFHed').scrollBy(0,200)");
			
			
			
			
			Thread.sleep(5000);
		} 
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("We got exception");
		}
		finally 
		{
			driver.close();
			driver.quit();
		}
		
		
		
		
		
		
	
		
		
		
	}

}
