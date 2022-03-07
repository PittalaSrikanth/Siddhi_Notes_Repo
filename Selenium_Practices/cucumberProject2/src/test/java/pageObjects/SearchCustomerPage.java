package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverWait;

public class SearchCustomerPage {
	public WebDriver pdriver;
	public DriverWait wait;
	public SearchCustomerPage(WebDriver vdriver) 
	{
		pdriver = vdriver;
		PageFactory.initElements(vdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")
	@CacheLookup
	WebElement Customers;
	
	@FindBy(xpath="//*[text()=' Customers']")
	@CacheLookup
	WebElement Customer;
	
}
