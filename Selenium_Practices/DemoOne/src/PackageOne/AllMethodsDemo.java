package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodsDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		String title =	driver.getTitle();
		System.out.println(title);
		
		String currenturl =	driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String pagesource =	driver.getPageSource();
		System.out.println(pagesource);
		
		
		driver.findElement(By.id("firstName")).sendKeys("Siddhi");
		driver.findElement(By.id("lastName")).sendKeys("Bhingir");
		driver.findElement(By.id("userEmail")).sendKeys("siddhiBhongiri@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("lastName")).clear();
		
		
		String attribute =	driver.findElement(By.id("firstName")).getAttribute("placeholder");
		System.out.println(attribute);
		
		
		String css =	driver.findElement(By.id("firstName")).getCssValue("height");
		System.out.println(css);
		
		String tagName =	driver.findElement(By.id("firstName")).getTagName();
		System.out.println(tagName);
		
		
		String text =	driver.findElement(By.xpath("//label[text()='Male']")).getText();
		System.out.println(text);
		
		Boolean display =	driver.findElement(By.xpath("//div[text()='Gender']")).isDisplayed();
		System.out.println(display);
		
		
		Boolean city =	driver.findElement(By.id("react-select-4-input")).isEnabled();
		System.out.println(city);
		
		
		Boolean selected =	driver.findElement(By.id("react-select-4-input")).isSelected();
		System.out.println(selected);
		
		Point p =	driver.findElement(By.id("firstName")).getLocation();
		int x =	p.getX();
		int y =	p.getY();
		System.out.println(x);
		System.out.println(y);
		
		
		Rectangle rec =	driver.findElement(By.id("firstName")).getRect();
		
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("asfasfsafafsd");
		driver.findElement(By.name("pass")).sendKeys("asfasfsafafsd");
		driver.findElement(By.name("pass")).submit();
		
		driver.manage().getCookies();
		
		
		
		
		
		
//		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
