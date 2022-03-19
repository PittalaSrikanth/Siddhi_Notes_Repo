package dayOne;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.apache.xml.utils.URI;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunching {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new  ChromeDriver();			
		chrome.close();
		chrome.quit();
		
		
		System.setProperty("webdriver.gecko.driver","D:\\Siddhi_Repo\\Siddhi_Notes_Repo\\Selenium_Practices\\chromedriver\\geckodriver.exe");
		WebDriver ff = new  FirefoxDriver();			
		ff.close();
		ff.quit();
		
		System.setProperty("webdriver.edge.driver","D:\\Siddhi_Repo\\Siddhi_Notes_Repo\\Selenium_Practices\\chromedriver\\msedgedriver.exe");
		WebDriver edge = new  EdgeDriver();			
		edge.close();
		edge.quit();
		
		System.setProperty("webdriver.ie.driver","D:\\Siddhi_Repo\\Siddhi_Notes_Repo\\Selenium_Practices\\chromedriver\\IEDriverServer.exe");
		WebDriver ie = new  InternetExplorerDriver();			
		ie.close();
		ie.quit();
		
		
	}

}
