package testPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
@Test
public class SGDClassFour {
	public void ClassFourMethod1() throws MalformedURLException
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	public void ClassFourMethod2() throws MalformedURLException
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.quit();	
	}
	public void ClassFourMethod3() throws MalformedURLException
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	public void ClassFourMethod4() throws MalformedURLException
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	public void ClassFourMethod5() throws MalformedURLException
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
