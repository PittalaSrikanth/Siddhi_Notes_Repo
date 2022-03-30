package dayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {

	public static void main(String[] args) throws InterruptedException 
	{
		
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();	
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
		
		
		
		Thread.sleep(5000);	
		
//		driver.close();
		driver.quit();

	}

}
