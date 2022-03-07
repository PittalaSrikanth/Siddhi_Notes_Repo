package PackageOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
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
