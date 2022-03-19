package dayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageFactroy 
{
	public  WebDriver driver;
	public  WebElement UserName;
	WebElement password ;
	WebElement lgbBtn ;
	WebElement forgotPasswordLink ;
	WebElement credentials ;
	WebElement loginTitle ;
	
	public LoginPageFactroy(WebDriver idriver,String url) 
	{
		
		 this.driver = idriver;		 
		 driver.get(url);		 
		 this.UserName = driver.findElement(By.id("txtUsername"));
		 this.password = driver.findElement(By.id("txtPassword"));
		 this.lgbBtn = driver.findElement(By.id("btnLogin"));
		 this.forgotPasswordLink = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		 this.credentials = driver.findElement(By.xpath("//span[contains(text(),'admin123')]"));
		this.loginTitle = driver.findElement(By.id("logInPanelHeading"));
	}
	

	
	public void closeBrowser() 
	{
		driver.close();
		driver.quit();
	}
	
	public void forgotPassword() 
	{
		Boolean forgetpasslink = this.forgotPasswordLink.isDisplayed();
		if(forgetpasslink)
		{
			System.out.println("Link Displayed");
		}
		else {
			System.out.println("Link not Displayed");
		}
		
	}
	public void login(String username, String password) 
	{
		UserName.sendKeys(username);
		this.password.sendKeys(password);
		this.lgbBtn.click();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
			
			LoginPageFactroy login = new LoginPageFactroy(new ChromeDriver(),"https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			Thread.sleep(5000);
			login.login("Admin", "admin123");
			login.closeBrowser();
		 
		
	}	
	
}
