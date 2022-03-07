package PackageOne;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2_example {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");

//		Launching chrome Browser
		WebDriver chrome = new ChromeDriver();
		
//		Navigating to w3schools url
		chrome.get("https://demoqa.com/nestedframes");
		
//		switch to frame
		chrome.switchTo().frame("frame1");
		System.out.println(chrome.findElement(By.xpath("//body[text()='Parent frame']")).getText());
		chrome.switchTo().frame(0);
		System.out.println(chrome.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
		
		
//		Browser close
		chrome.close();
		
//		Browser quit
		chrome.quit();
	}
}
