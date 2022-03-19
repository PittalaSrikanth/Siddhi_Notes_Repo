package dayOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPFObjects 
{
	@FindBy(id ="txtUsername") 
	private WebElement userName;
	
	@FindBy(id ="txtPassword")
	private WebElement password;	
	
	@FindBy(id ="btnLogin") 
	private WebElement loginbtn;
	
	
	
	public void loginFromPF(String User, String Pass) 
	{
		userName.sendKeys(User);
		password.sendKeys(Pass);
		loginbtn.click();
	}
	
	public void closeBrowsers(WebDriver driver) 
	{
		driver.close();
		driver.quit();
		
	}
	
//	public static void main(String[] args) 
//	{
//		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		
//		LoginPFObjects loginPF = new LoginPFObjects();
//		PageFactory.initElements(driver,loginPF);
//
//		loginPF.loginFromPF("Admin", "admin123");
//		loginPF.closeBrowsers(driver);
//		
//		
//	}
//	=
	
	
	
}
