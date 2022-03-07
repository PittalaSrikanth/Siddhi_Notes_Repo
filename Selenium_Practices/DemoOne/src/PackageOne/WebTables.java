package PackageOne;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_01\\chromedriver_win32 (9)\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.nyse.com/ipo-center/filings");
		Thread.sleep(15000);
		List<WebElement> rows = chrome.findElements(By.xpath("//h2[.='Expected Deals']/..//table[1]//tbody//tr"));
		for(int i =1;i<=rows.size();i++)
		{
			String ind= chrome.findElement(By.xpath("//h2[.='Expected Deals']/..//table[1]//tbody//tr["+i+"]//td[4]")).getText();
			String brun= chrome.findElement(By.xpath("//h2[.='Expected Deals']/..//table[1]//tbody//tr["+i+"]//td[5]")).getText();
			String price= chrome.findElement(By.xpath("//h2[.='Expected Deals']/..//table[1]//tbody//tr["+i+"]//td[9]")).getText();
			System.out.println(ind +" -- "+brun+" -- "+price);				
		}
		
		
		
		chrome.close();
		chrome.quit();

		
		

		
	}

}
