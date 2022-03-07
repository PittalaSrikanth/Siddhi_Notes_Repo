package PackageOne;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Practices\\chromedriver\\geckodriver.exe");

//		Launching chrome Browser
		WebDriver firefox = new FirefoxDriver();
		
//		Navigating to toolsqa url
		firefox.get("https://demoqa.com/alerts");
		
//		alert accept
		firefox.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alert = firefox.switchTo().alert();
		alert.accept();
		
//		alert accept
		firefox.findElement(By.id("timerAlertButton")).click();	
		Thread.sleep(6000);
		firefox.switchTo().alert().accept();

//		printing text and accept
		firefox.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		String alertText =	firefox.switchTo().alert().getText();
		System.out.println(alertText);
		firefox.switchTo().alert().accept();
		
//		alert dismiss
		firefox.findElement(By.id("promtButton")).click();
		firefox.switchTo().alert().sendKeys("Hellow Siddhi");
		Thread.sleep(10000);
		firefox.switchTo().alert().dismiss();
		
//		Browser close
		firefox.close();
		
//		Browser quit
		firefox.quit();

	}
}
