package dayTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dayOne.DashBoardPFObjects;
import dayOne.LoginPFObjects;

public class LoginPageImpli {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				
				LoginPFObjects loginPF =	PageFactory.initElements(driver,LoginPFObjects.class);
				DashBoardPFObjects dashboardPF =	PageFactory.initElements(driver,DashBoardPFObjects.class);
				
	
				
				 
				loginPF.loginFromPF("Admin", "admin123");
				dashboardPF.userLogout();
				
				Thread.sleep(1000);
				loginPF.loginFromPF("Admin", "admin123");
				dashboardPF.userLogout();
				
				Thread.sleep(1000);
				loginPF.loginFromPF("Admin", "admin123");
				dashboardPF.userLogout();
				
				Thread.sleep(1000);
				loginPF.loginFromPF("Admin", "admin123");
				dashboardPF.userLogout();
				
				loginPF.closeBrowsers(driver);

	}

}
