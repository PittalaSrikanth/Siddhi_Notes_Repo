package PackageOne;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class SauceLabsWebDriver {

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		MutableCapabilities mc = new MutableCapabilities();
		mc.setCapability("username", "oauth-srikanth.p4991-99079");
		mc.setCapability("accesskey", "0a82ca7d-d09e-48a9-bbdb-3506f5b5504d");
		
		
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("sauce:options", mc);
		ds.setCapability("platformName",Platform.WIN10);
		ds.setCapability("browserName", BrowserName.CHROME);
		ds.setCapability("browserVersion", "latest");
		
		
		
		WebDriver driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"),ds);
		
		
		driver.get("http://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		Select country = new Select(driver.findElement(By.name("country")));
		Thread.sleep(5000);
		
		//check whether dropdown is multi-Select or not?
		Boolean selection = country.isMultiple();
		System.out.println(selection);
		
		country.selectByIndex(3);
		Thread.sleep(5000);
		
				
		country.selectByValue("INDIA");
		Thread.sleep(5000);
		
		
		country.selectByVisibleText("GERMANY");
		Thread.sleep(5000);
		
		country.selectByValue("AUSTRIA");
		Thread.sleep(5000);
		System.out.println("First Selected Option : "+country.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		List<WebElement>selectedoptions = country.getAllSelectedOptions();
		for(WebElement selectedoption:selectedoptions)
		{
			System.out.println("All Selected Options : "+selectedoption.getText());
		}
		Thread.sleep(5000);
		
		
		List<WebElement>options = country.getOptions();
		for(WebElement option:options)
		{
			System.out.println("All Options : "+option.getText());
		}
		
//		country.deselectByIndex(3);
//		country.deselectByValue("INDIA");
//		country.deselectByVisibleText("GERMANY");
//		country.deselectAll();
		
//		Browser close
		driver.close();
		
//		Browser quit
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
