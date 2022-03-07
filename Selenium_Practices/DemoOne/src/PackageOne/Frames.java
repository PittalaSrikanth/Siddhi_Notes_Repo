package PackageOne;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");

//		Launching chrome Browser
		WebDriver chrome = new ChromeDriver();
		
//		Navigating to w3schools url
		chrome.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_button_form");
		
//		switch to frame
//		chrome.switchTo().frame("iframeResult");
		chrome.switchTo().frame(0);
//		WebElement frametag = chrome.findElement(By.id("iframeResult"));
//		chrome.switchTo().frame(frametag);
		chrome.findElement(By.xpath("//button[@value='Submit']")).click();
		
		Thread.sleep(5000);
		chrome.switchTo().defaultContent();
		chrome.findElement(By.id("runbtn")).click();
		Thread.sleep(5000);
		
		System.out.println(chrome.findElements(By.tagName("iframe")).size());
		
//		Browser close
		chrome.close();
		
//		Browser quit
		chrome.quit();
	}
}
