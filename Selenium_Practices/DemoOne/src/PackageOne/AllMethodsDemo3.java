package PackageOne;


import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodsDemo3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		String title =	driver.getTitle();
		System.out.println(title);
		
		String currenturl =	driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
		
//		driver.findElement(By.id("firstName")).sendKeys("Siddhi");
//		driver.findElement(By.id("lastName")).sendKeys("Bhongir");
//		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("siddhibhongiri@gmail.com");
//		
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//		
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("lastName")).clear();
		
		Rectangle rec =	driver.findElement(By.id("firstName")).getRect();
		
		int x =	rec.getHeight();
			
		int y=	rec.getWidth();
			
		System.out.println(x);
			
		System.out.println(y);	
		
		
//		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}
