package dayOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPFObjects 
{
	@FindBy(id ="welcome") 
	private WebElement logouticon;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logoutlink;	
	
	
	public void userLogout() throws InterruptedException 
	{
		
		logouticon.click();
		Thread.sleep(1000);
		logoutlink.click();
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
