package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage 
{
	public WebDriver pdriver;
	public LoginPage(WebDriver vdriver ) 
	{
		pdriver = vdriver;
		PageFactory.initElements(vdriver, this);
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Log in']")
	@CacheLookup
	WebElement loginbtn;
	
	By logoutbtn = By.xpath("//a[text()='Logout']");
	
	
	public void setEmail(String email) throws InterruptedException 
	{
		UserName.clear();
		UserName.sendKeys(email);
	}
	
	public void setPassword(String pass) 
	{
		Password.clear();
		Password.sendKeys(pass);
	}
	
	public void clickLoginBtn() 
	{
		loginbtn.click();
	}
	
	public void clickLogoutBtn() 
	{
		pdriver.findElement(logoutbtn).click();
	}
	
	
	
	
	
	
	
	
	
	
}
