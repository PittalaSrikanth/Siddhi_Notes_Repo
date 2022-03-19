package dayOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();	
		
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
	String text =	driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		
		String text1 =	driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
			
			System.out.println(text1);
		
		
		
		
		Thread.sleep(5000);		
		driver.close();
		driver.quit();

	}

}
