package com.hoursplus.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.hoursplus.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public static Readconfig rconfig;
	public static WebDriver driver;
	public static Logger log;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String brow)
	{
		if (brow.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (brow.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} 
		else if (brow.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} 
		rconfig = new Readconfig();
		log = Logger.getLogger("Hours+");
		PropertyConfigurator.configure("log4j.properties");
		driver.get(rconfig.getUrl());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	public void get_screenshot(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/"+name+".png");
		FileUtils.copyFile(source, target);
	}
	
}
;