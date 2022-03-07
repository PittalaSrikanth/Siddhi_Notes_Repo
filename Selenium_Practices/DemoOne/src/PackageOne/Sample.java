package PackageOne;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException, IOException
	{
			System.setProperty("webdriver.chrome.driver","D:\\10112021\\chromedriver_win32 (8)\\chromedriver.exe");
			WebDriver chrome = new ChromeDriver();					
			try 
			{
				chrome.get("https://demoqa.com/automation-practice-form");
				String sessionid =	((RemoteWebDriver)chrome).getSessionId().toString();
				System.out.println(sessionid);
				String browsername =((RemoteWebDriver)chrome).getCapabilities().getBrowserName();
				System.out.println(browsername);
				String version =((RemoteWebDriver)chrome).getCapabilities().getVersion();
				System.out.println(version);
				String platform =((RemoteWebDriver)chrome).getCapabilities().getPlatform().toString();
				System.out.println(platform);
				Set<String> capNames =((RemoteWebDriver)chrome).getCapabilities().getCapabilityNames();
				for(String capsname:capNames)
				{
					System.out.println(capsname);
				}
				String js =((RemoteWebDriver)chrome).getCapabilities().getCapability("javascriptEnabled").toString();
				System.out.println(js);
				String to =((RemoteWebDriver)chrome).getCapabilities().getCapability("timeouts").toString();
				System.out.println(to);				
			} catch (Exception e) 
			{				
			System.out.println(e.getMessage());
			}
			finally
			{
				chrome.close();
				chrome.quit();
			}
			
			
			
			
		

	}

}
