package PackageOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass2_class {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement cars = driver.findElement(By.name("cars"));
		
		
		Select car = new Select(cars);
		car.selectByValue("volvo");
		
		Thread.sleep(5000);
		car.selectByVisibleText("Saab");
		
		Thread.sleep(5000);
		car.selectByIndex(3);

		
		Thread.sleep(5000);
		car.deselectByIndex(3);
		
		Thread.sleep(5000);
		car.deselectByValue("volvo");
		
		Thread.sleep(5000);
		car.deselectByVisibleText("Saab");
		
		
		car.selectByValue("volvo");
		car.selectByVisibleText("Saab");
		car.selectByIndex(3);
		
		System.out.println("First Selected Options : "+ car.getFirstSelectedOption().getText());
		
		
		List<WebElement>selectedoptions = car.getAllSelectedOptions();
		for(WebElement selectedoption:selectedoptions)
		{
			System.out.println("All Selected Options : "+selectedoption.getText());
		}
		
		List<WebElement>options = car.getOptions();
		for(WebElement option:options)
		{
			System.out.println("All Selected Options : "+option.getText());
		}
		
		
		Thread.sleep(5000);
		car.deselectAll();
		
		Thread.sleep(5000);
		
//		Browser close
		driver.close();
		
//		Browser quit
		driver.quit();
	}


}
