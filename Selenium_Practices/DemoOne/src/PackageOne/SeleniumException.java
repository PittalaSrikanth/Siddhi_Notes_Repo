package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumException {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		
		chrome.get("https://demoqa.com/automation-practice-form");
		Actions action = new Actions(chrome);
		((JavascriptExecutor)chrome ).executeScript("window.scrollTo(0,500)");
//		JavascriptExecutor js = (JavascriptExecutor) chrome;
//		action.click(chrome.findElement(By.xpath("//button"))).build().perform();
//		action.clickAndHold(chrome.findElement(By.xpath("//*[@id='state']/div/div[2]"))).build().perform();
//		action.click(chrome.findElement(By.xpath("//*[text()='Rajasthan']"))).build().perform();
//		chrome.navigate().refresh();
		
//		chrome.findElement(By.id("currentAddress-label")).clear();
//		Thread.sleep(0)
		
//		chrome.manage().window().setSize(new Dimension(-500, 550));
		
//		WebElement ele =	chrome.findElement(By.xpath("//input[@id='subjectsInput']"));
//		chrome.navigate().refresh();
//		ele.click();
//		chrome.switchTo().alert();
//		js.executeScript("alert('Hello');");	
		
//		chrome.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
		
	String	wh = chrome.getWindowHandle();
		
		
//		Thread.sleep(5000);
		chrome.close();
		
		chrome.quit();
		try 
		{
			chrome.findElement(By.id("currentAddress-label"));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
