package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemoClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("window.location='https://demoqa.com/automation-practice-form'");
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		WebElement gender =	driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement email =	driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement submit =	driver.findElement(By.id("submit"));
		
//		
//		
//		
//		String title = 	js.executeScript("return document.title").toString();
//		System.out.println(title);
//		
//		
//		String domain = 	js.executeScript("return document.domain").toString();
//		System.out.println(domain);
//		
//		String URL = 	js.executeScript("return document.URL").toString();
//		System.out.println(URL);
//		
//		
//		String gender1 =	js.executeScript("return arguments[0].innerText",gender).toString();
//		
//		String submittext =	js.executeScript("return document.getElementById('submit').innerText").toString();
//			
//		System.out.println(gender1);
//		System.out.println(submittext);
//		
//		
////		js.executeScript("document.getElementById('submit').click()");
////		
////		
////		Thread.sleep(5000);
////		
////		js.executeScript("arguments[0].click()",lastname);
//		
//		
////		
////		js.executeScript("document.getElementById('firstName').value='siddhi'");
////		
////		Thread.sleep(5000);
//		
//		js.executeScript("arguments[0].value='siddhi';arguments[1].value='bhongiri'",firstname,lastname);
//		Thread.sleep(5000);
//		
//		
//		
//		js.executeScript("arguments[0].scrollIntoView(true)",submit);
//		
//		Thread.sleep(5000);
//		
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//		
//		
////		js.executeScript("history.go(0)");
//		
////		js.executeScript("alert('Hello');");
//		
//		js.executeScript("arguments[0].style.borderColor='yellow'",firstname);	
//		
		
		
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1],5000);document.getElementById('firstName').value='Busstop'");
		
		
//		js.executeScript("history.go(0)");
		
		
		js.executeAsyncScript("alert('bhongir');");
		
		
		
		
		
		

		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}

}
