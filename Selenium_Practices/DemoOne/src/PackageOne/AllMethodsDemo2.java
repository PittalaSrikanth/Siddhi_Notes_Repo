package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllMethodsDemo2 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		String title =	driver.getTitle();
		System.out.println(title);
		
		String currenturl =	driver.getCurrentUrl();
		System.out.println(currenturl);
		
		
		
		
		
		
		
//		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
