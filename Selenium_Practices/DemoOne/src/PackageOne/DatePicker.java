package PackageOne;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_01\\chromedriver_win32 (9)\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		chrome.findElement(By.cssSelector("input#dateOfBirthInput")).click();
		Thread.sleep(5000);
		while(!chrome.findElement(By.cssSelector("div[class$='month--hasMonthDropdown']")).getText().equals("September 2020"))
		{
			System.out.println(chrome.findElement(By.cssSelector("div[class$='month--hasMonthDropdown']")).getText());
			chrome.findElement(By.cssSelector("button[aria-label='Previous Month']")).click();
			Thread.sleep(500);
		}
		
		
		
		
		chrome.close();
		chrome.quit();

		
		

		
	}

}
