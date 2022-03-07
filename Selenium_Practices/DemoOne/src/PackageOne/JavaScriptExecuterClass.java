package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		Navigating url
		js.executeScript("window.location='https://demoqa.com/automation-practice-form'");
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		WebElement gender =	driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement email =	driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement submit =	driver.findElement(By.id("submit"));
		
//		Title of a WebPage
		String title =	js.executeScript("return document.title").toString();
		System.out.println(title);
		
//		Domain of a WebPage
		String domain =	js.executeScript("return document.domain").toString();
		System.out.println(domain);
		
//		URL of a WebPage
		String url =	js.executeScript("return document.URL").toString();
		System.out.println(url);
		
//		InnerText of a Webelement
		String text =	js.executeScript("return arguments[0].innerText",gender).toString();
		System.out.println(text);
//		 or 
		String text1 =	js.executeScript("return document.getElementById('userEmail-label').innerText").toString();
		System.out.println(text1);
		
//		Attribute of a Webelement
		String arg =	js.executeScript("return arguments[0].getAttribute('placeholder')",email).toString();
		System.out.println(arg);
//		 or 
		String arg1 =	js.executeScript("return document.getElementById('userEmail').getAttribute('placeholder')").toString();
		System.out.println(arg1);
		
//		click on webelement
		js.executeScript("arguments[0].click()",gender);
//		or
		js.executeScript("document.getElementById('submit').click();");
		
//		sendkeys on webelement
		js.executeScript("arguments[0].value='siddhibhongiri'",lastname);
//		or
		js.executeScript("document.getElementById('userEmail').value='siddhibhongiri'");
		
//		Vertical scroll
		js.executeScript("window.scrollTo(0,300)");
		
//		Horizontal scroll
		js.executeScript("window.scrollTo(300,0)");
		
//		scroll bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");			

//		scroll top of the page
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");	
		
//		Height of a WebPage
		String height =	js.executeScript("return window.innerHeight").toString();
		System.out.println(height);
		
//		Width of a WebPage
		String width =	js.executeScript("return window.innerWidth").toString();
		System.out.println(width);
		
//		changing the border color
		js.executeScript("arguments[0].style.borderColor='yellow'",firstname);
		
//		scrollIntoView		
		js.executeScript("document.getElementById('submit').scrollIntoView(true)");
//		or
		js.executeScript("arguments[0].scrollIntoView(true);",firstname);
		
//		multiple actions
		js.executeScript("arguments[0].click();arguments[1].click();",submit,gender);
		
//		Example for asyncscript
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1],5000);alert('Hello');");
		
// 		alert creation
		js.executeScript("alert('Hello');");	
		
//		Refresh webpage
		js.executeScript("history.go(0)");
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
