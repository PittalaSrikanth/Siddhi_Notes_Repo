package dayOne;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		WebDriver driver = null;
		
		try 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
			driver = new  ChromeDriver();	
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
			driver.get("https://www.facebook.com/");
			
		List<WebElement> inputtags	= driver.findElements(By.tagName("input"));
		
		System.out.println(inputtags.size());
			
			
			driver.findElement(By.partialLinkText("password?")).click();
			
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
