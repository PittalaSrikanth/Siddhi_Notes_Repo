package PackageOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://accounts.google.com/signup");
		
		Actions action = new Actions(chrome);
		
		WebElement firstname = chrome.findElement(By.name("firstName"));
		action.click(firstname).keyDown(firstname,Keys.SHIFT)
		.sendKeys(firstname, "siddhiInstitute")
		.keyUp(firstname,Keys.SHIFT).build().perform();
		
		WebElement lastname = chrome.findElement(By.name("lastName"));
		action.sendKeys(lastname,"Lastname4645645").build().perform();

		WebElement username = chrome.findElement(By.name("Username"));
		action.sendKeys(username,"FirstLast78987564").build().perform();

		WebElement password = chrome.findElement(By.name("Passwd"));
		action.sendKeys(password,"SiddhiB@123").build().perform();

		WebElement cpassword = chrome.findElement(By.name("ConfirmPasswd"));
		action.sendKeys(cpassword,"SiddhiB@123").build().perform();

		WebElement showpassword = chrome.findElement(By.id("i3"));
		action.click(showpassword).build().perform();
		
		WebElement nextbutton = chrome.findElement(By.xpath("//*[text()='Next']"));
		action.moveToElement(nextbutton).build().perform();
		action.click(nextbutton).build().perform();
		
		action.moveToElement(nextbutton).build().perform();
		action.doubleClick(nextbutton).build().perform();
		
		action.contextClick().build().perform();
		
		WebElement signininsted = chrome.findElement(By.xpath("//*[text()='Sign in instead']"));
		action.clickAndHold(signininsted).build().perform();
		
		action.click(firstname).pause(Duration.ofSeconds(2)).sendKeys(firstname,"siddhi").pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2)).sendKeys("bhongir").build().perform();
		
		chrome.get("https://www.testandquiz.com/selenium/testing.html");
		Thread.sleep(15000);
		WebElement source = chrome.findElement(By.id("sourceImage"));
		WebElement target = chrome.findElement(By.id("targetDiv"));
		action.dragAndDrop(source,target).perform();
		Thread.sleep(15000);
		chrome.get("https://accounts.google.com/signup");

		
		

		
	}

}
