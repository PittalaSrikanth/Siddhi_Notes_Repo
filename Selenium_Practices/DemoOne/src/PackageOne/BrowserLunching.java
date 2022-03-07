package PackageOne;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLunching {

	public static void main(String[] args) throws InterruptedException
	{
			
//		Lanching chrome brower
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().version("94.0.4606.71").setup();
	 	WebDriver chrome = new ChromeDriver();
//		Navigating to google url
		chrome.get("https://www.google.co.in/");
		
//		Print WindowHandle
		String windowHandle = 	chrome.getWindowHandle();
		System.out.println(windowHandle);
		
//		Print WindowHandles		
		Set<String> windowsHandles = chrome.getWindowHandles();
		for(String window:windowsHandles)
		{
			System.out.println(window);
		}
		
		
		
//		Browser close
		chrome.close();
		
		
		
		
		
//		Browser quit
		chrome.quit();
				
		
		
	}

}
