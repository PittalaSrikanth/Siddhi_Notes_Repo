package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {
	public WebDriver pdriver;
	public DriverWait(WebDriver vdriver ) 
	{
		pdriver = vdriver;
		PageFactory.initElements(vdriver, this);
	}
	public void WaitForElement(WebElement element, long timeOutInSeconds) 
	{ 
		WebDriverWait wait = new WebDriverWait (pdriver, timeOutInSeconds); 
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
