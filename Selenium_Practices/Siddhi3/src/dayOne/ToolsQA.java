package dayOne;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
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
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
			Actions action = new Actions(driver);
			WebElement user = driver.findElement(By.id("txtUsername"));
			WebElement pass = driver.findElement(By.id("txtPassword"));

			
			action.click(user).keyDown(Keys.SHIFT).
			sendKeys(user,"admin").keyUp(Keys.SHIFT).
			click(pass).sendKeys("admin123").sendKeys(Keys.ENTER);
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
		
			
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
