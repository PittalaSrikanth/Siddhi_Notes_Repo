package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAutomation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_button_form");
		
		chrome.switchTo().frame("iframeResult");
		
		chrome.findElement(By.id("fname")).sendKeys("Siddhi");
		chrome.findElement(By.id("lname")).sendKeys("Bhongir");
		chrome.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		chrome.switchTo().defaultContent();
		chrome.findElement(By.id("runbtn")).click();
		
		
		
		
		Thread.sleep(15000);
		
		
		
		
		
		chrome.close();
		chrome.quit();
	}

}
