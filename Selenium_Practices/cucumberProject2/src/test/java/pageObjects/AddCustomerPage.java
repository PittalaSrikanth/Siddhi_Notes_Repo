package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class AddCustomerPage 
{
	public WebDriver pdriver;
	public AddCustomerPage(WebDriver vdriver ) 
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
	
	
	
	public void clickOnCustomerMenu() {
		Customers.click();
	}
	
	public void clickOnCustomerMenuItem() {
		Customer.click();
	}
	
	
	
	
	
	
	
}
