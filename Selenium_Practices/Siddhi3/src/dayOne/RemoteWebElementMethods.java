package dayOne;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoteWebElementMethods 
{

	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();	
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		
//		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		
	
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		WebElement addmintabafterwait = wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Admin1234']")));
		
		addmintabafterwait.click();
		
		

		
		driver.findElement(By.xpath("//b[text()='Admin1234']")).click();
		
		driver.findElement(By.xpath("//a[text()='User Management']")).click();
		driver.findElement(By.xpath("//a[text()='Users']")).click();
//		Thread.sleep(5000);
		
		
		
		File xyz = driver.findElement(By.xpath("//table[@id='resultTable']")).getScreenshotAs(OutputType.FILE);
		File abc = new File("D:\\Batch2_SS\\table3.png");
		
//		FileUtils.copyFile(xyz, abc);
		
		
		
		Thread.sleep(5000);
		
	
	
		
		driver.close();
		driver.quit();
	}

}


