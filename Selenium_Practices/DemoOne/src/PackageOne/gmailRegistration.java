package PackageOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gmailRegistration {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://accounts.google.com/signup");
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.findElement(By.id("firstName")).sendKeys("Test");
		chrome.findElement(By.id("lastName")).sendKeys("Siddhi");
		chrome.findElement(By.id("username")).sendKeys("Test1001Siddhi");
		chrome.findElement(By.name("Passwd")).sendKeys("SiddhiB@123");
		chrome.findElement(By.name("ConfirmPasswd")).sendKeys("SiddhiB@123");
		chrome.findElement(By.id("i3")).click();
		chrome.findElement(By.xpath("//*[text()='Next']")).click();
		chrome.findElement(By.id("phoneNumberId")).sendKeys("XXXXXXXX");
		Thread.sleep(5000);
		chrome.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(15000);
		Thread.sleep(5000);
		chrome.findElement(By.xpath("//*[text()='Verify']")).click();
		chrome.findElement(By.name("recoveryEmail")).click();
		chrome.findElement(By.name("day")).sendKeys("09");
		Select month = new Select(chrome.findElement(By.id("month")));
		month.selectByVisibleText("September");
		chrome.findElement(By.name("year")).sendKeys("1991");
		Select gender = new Select(chrome.findElement(By.id("gender")));
		gender.selectByVisibleText("Male");
		chrome.findElement(By.xpath("//*[text()='Next']")).click();
		chrome.findElement(By.xpath("//*[text()='Yes, I’m in']")).click();
		chrome.findElement(By.xpath("//*[text()='I agree']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
