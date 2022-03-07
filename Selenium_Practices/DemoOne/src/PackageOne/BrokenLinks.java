package PackageOne;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_01\\chromedriver_win32 (9)\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.zensar.com/");
		Thread.sleep(15000);
		List<WebElement> links = chrome.findElements(By.tagName("a"));
		for(WebElement link : links)
		{
			String	linkurl = link.getAttribute("href");
			URL url = new URL(linkurl);
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println("link broken  " + linkurl);
			}else {
				System.out.println("Valid link");
			}
				
		}
		
		
		
		chrome.close();
		chrome.quit();

		
		

		
	}

}
