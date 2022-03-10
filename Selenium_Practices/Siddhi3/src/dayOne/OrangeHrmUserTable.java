package dayOne;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmUserTable {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		WebDriver driver = null;
		
		try 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
			driver = new  ChromeDriver();	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
			String title =	driver.getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println("Title matched");
				
			}
			else 
			{
				System.out.println("Title not matched");
			}
			
			driver.findElement(By.xpath("//b[text()='Admin']")).click();
			driver.findElement(By.xpath("//a[text()='User Management']")).click();
			driver.findElement(By.xpath("//a[text()='Users']")).click();
			Thread.sleep(15000);
			
			List<WebElement> noOfRows =	driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
			
			System.out.println(noOfRows.size());

			for(int i =1; i<=noOfRows.size(); i++) 
			{
				List<WebElement> columns = driver.findElements(By.xpath("(//table[@id='resultTable']//tr)["+i+"]//th | (//table[@id='resultTable']//tr)["+i+"]//td"));
				for(int n =2; n<=columns.size(); n++) 
				{
					String columnValue = driver.findElement(By.xpath("(//table[@id='resultTable']//tr)["+i+"]//th["+n+"] | (//table[@id='resultTable']//tr)["+i+"]//td["+n+"]")).getText();
					System.out.print(columnValue +"  ");
					
				}
				System.out.println();
			}
			
			
			
			
			
			
			
			
			
		
			
			
		} 
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("We got exception");
		}
		finally 
		{
			driver.close();
			driver.quit();
		}
		
		
		
		
		
		
	
		
		
		
	}

}
