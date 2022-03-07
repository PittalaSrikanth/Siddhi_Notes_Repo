package testPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
@Test
public class SGDClassFive {
	public void ClassFiveMethod1() throws FileNotFoundException, IOException, InterruptedException
	{
		WebDriver driver = null;	
		XSSFWorkbook wb = null;
		
		
		try {
			Properties p = new Properties();
			p.load(new FileInputStream(System.getProperty("user.dir") + "\\config.properties"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
			p.setProperty("test", "siddhi");
			p.store(new FileOutputStream(System.getProperty("user.dir") + "\\config.properties"), "testing");  
			
			wb = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir") + "\\client.xlsx"));   
			XSSFSheet sheet = wb.getSheetAt(0); 
		
			System.out.println(sheet.getRow(1).getCell(0));
			System.out.println(sheet.getRow(1).getCell(1));
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://app.dew.expert/");
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@formcontrolname='userName']")).sendKeys(p.getProperty("user"));
			driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(p.getProperty("password"));
			driver.findElement(By.xpath("//span[text()='Sign In']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[text()='menu'])[2]")).click();
			driver.findElement(By.xpath("(//button//span//*[text()='photo_camera_front'])[1]/..")).click();
			Thread.sleep(5000);			
			for(int i=1;i<=sheet.getLastRowNum();i++)
			{
				FileOutputStream file = new FileOutputStream(
		            new File(System.getProperty("user.dir") + "\\client.xlsx"));
				driver.findElement(By.xpath("//span[text()=' Add ']")).click();
				Thread.sleep(5000);			
				driver.findElement(By.name("ClientName")).sendKeys(sheet.getRow(i).getCell(0).toString());
				if(sheet.getRow(i).getCell(1).toString().equals("InActive")) 
				{
					driver.findElement(By.xpath("//span[text()=' Active ']")).click();
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//span[text()=' Add Client ']")).click();
					Row row = sheet.createRow((short)i);
					Cell cell = row.createCell(2);
					cell.setCellValue("Inactive client added Successfully");
					Thread.sleep(5000);
					 wb.write(file);
					 file.close();
				}
				else {
					 
					driver.findElement(By.xpath("//span[text()=' Add Client ']")).click();
					Row row = sheet.createRow((short)i);
					Cell cell = row.createCell(2);
					cell.setCellValue("active client added Successfully");
					Thread.sleep(5000);
					 wb.write(file);
					 file.close();
				}
				
				
			}		
	
		} 
		finally 
		{	  
		       
		    
			driver.close();
			driver.quit();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void ClassFiveMethod2() throws MalformedURLException
//	{
//		DesiredCapabilities ds = new DesiredCapabilities();
//		ds.setBrowserName("chrome");
//		ds.setPlatform(Platform.WINDOWS);
//		
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
//		driver.get("https://www.google.co.in/");
//		System.out.println(driver.getTitle());
//		driver.quit();	
//	}
//	public void ClassFiveMethod3() throws MalformedURLException
//	{
//		DesiredCapabilities ds = new DesiredCapabilities();
//		ds.setBrowserName("chrome");
//		ds.setPlatform(Platform.WINDOWS);
//		
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
//		driver.get("https://www.google.co.in/");
//		System.out.println(driver.getTitle());
//		driver.quit();
//	}
//	public void ClassFiveMethod4() throws MalformedURLException
//	{
//		DesiredCapabilities ds = new DesiredCapabilities();
//		ds.setBrowserName("chrome");
//		ds.setPlatform(Platform.WINDOWS);
//		
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
//		driver.get("https://www.google.co.in/");
//		System.out.println(driver.getTitle());
//		driver.quit();
//	}
//	public void ClassFiveMethod5() throws MalformedURLException
//	{
//		DesiredCapabilities ds = new DesiredCapabilities();
//		ds.setBrowserName("chrome");
//		ds.setPlatform(Platform.WINDOWS);
//		
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
//		driver.get("https://www.google.co.in/");
//		System.out.println(driver.getTitle());
//		driver.quit();
//	}
}
