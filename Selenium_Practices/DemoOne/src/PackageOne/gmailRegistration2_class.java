package PackageOne;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailRegistration2_class {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://accounts.google.com/signup");
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		chrome.findElement(By.name("firstName")).sendKeys("SiddhiBhongiri");
		chrome.findElement(By.name("lastName")).sendKeys("BhongirBusstop");
		chrome.findElement(By.name("Username")).sendKeys("SiddhiBhongir587458");
		chrome.findElement(By.name("Passwd")).sendKeys("Bhongir@1254646");
		chrome.findElement(By.name("ConfirmPasswd")).sendKeys("Bhongir@1254646");
		chrome.findElement(By.id("i3")).click();
		
		WebElement checkbox = 	chrome.findElement(By.xpath("//input[@id='i3']/.."));
		String text = 	checkbox.getAttribute("class");
		
		if (text.contains("gk6SMd"))
		{
			System.out.println("Checked");
		}
		else {
				System.out.println("Not Checked");
		}
		
		chrome.findElement(By.xpath("//span[text()='Next']")).click();
		
		chrome.findElement(By.id("phoneNumberId")).sendKeys("xxxxxxx");
		
		Thread.sleep(5000);
		
		chrome.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(20000);
		
//		chrome.findElement(By.xpath("(//button[@jsname='LgbsSe'])[1]")).click();
		
		chrome.findElement(By.xpath("//span[text()='Verify']")).click();
		
		
		
		
		WebElement month =	chrome.findElement(By.id("month"));
		WebDriverWait wait = new WebDriverWait(chrome,20);
		wait.until(ExpectedConditions.visibilityOf(month));
		Select mnth = new Select(month);
		mnth.selectByValue("9");
		
		
		chrome.findElement(By.name("day")).sendKeys("25");
		
		chrome.findElement(By.name("year")).sendKeys("1997");
		
		WebElement gender =	chrome.findElement(By.id("gender"));
		wait.until(ExpectedConditions.visibilityOf(gender));
		Select genderselection = new Select(gender);
		genderselection.selectByValue("1");
		
		chrome.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebElement yiamin =	chrome.findElement(By.xpath("//span[text()='Yes, I’m in']"));
		wait.until(ExpectedConditions.visibilityOf(yiamin));
		chrome.findElement(By.xpath("//span[text()='Yes, I’m in']")).click();
		
		
		WebElement iagree =	chrome.findElement(By.xpath("//span[text()='I agree']"));
		wait.until(ExpectedConditions.visibilityOf(iagree));
		chrome.findElement(By.xpath("//span[text()='I agree']")).click();
		
		Thread.sleep(20000);
		
		chrome.close();
		chrome.quit();
		
		
	}

}
