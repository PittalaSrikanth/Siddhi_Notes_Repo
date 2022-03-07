package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2_example {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		Actions action = new Actions(chrome);
		
		chrome.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		WebElement doubleclickbtn = chrome.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doubleclickbtn).build().perform();
		Thread.sleep(5000);	
		
		WebElement rightclick = chrome.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclick).build().perform();
		Thread.sleep(5000);	
		
		WebElement click = chrome.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(click).build().perform();
		Thread.sleep(5000);	
		
		chrome.get("https://demoqa.com/droppable");
		Thread.sleep(5000);
		WebElement source = chrome.findElement(By.id("draggable"));
		WebElement target = chrome.findElement(By.id("droppable"));
		action.dragAndDrop(source,target).perform();
		action.dragAndDropBy(source,100,100).perform();
		Thread.sleep(5000);
		
		chrome.get("https://demoqa.com/slider");
		Thread.sleep(5000);
		WebElement source1 = chrome.findElement(By.xpath("//input[@type='range']"));
		action.dragAndDropBy(source1,100,0).perform();
		Thread.sleep(5000);
		
		
		
		chrome.close();
		chrome.quit();
		
	}

}
