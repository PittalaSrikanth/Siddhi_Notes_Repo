package dayOne;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
		driver.get("https://www.instagram.com/");
		
		
		
//		Set<Cookie>	cookies = driver.manage().getCookies();
//		
//		System.out.println(cookies.size());
//		
//		for(Cookie cookie:cookies) 
//		{
//			System.out.println(cookie.getName());
//			System.out.println(cookie.getPath());
//			System.out.println(cookie.getDomain());
//			System.out.println(cookie.getValue());
//			System.out.println(cookie.getExpiry());
//			System.out.println("--------------");
//		}
//		
//		System.out.println("***********************************");
//		Cookie cookieByName =	driver.manage().getCookieNamed("ig_did");
//		System.out.println(cookieByName.getDomain());
//		System.out.println(cookieByName.getName());
//		System.out.println(cookieByName.getPath());
//		System.out.println(cookieByName.getValue());
//		System.out.println(cookieByName.getExpiry());
		
		
		
//		Cookie ck = new Cookie("mid", "YicAWwALAAHZ31aCY_pEagu7lVkY; expires=Thu, 07 Mar 2024 12:37:18 IST; path=/; domain=.instagram.com;secure;");
//		
//		driver.manage().deleteCookie(ck);
//		
//		System.out.println("Cookie after deletion");
//		
//
		Set<Cookie>	cookies1 = driver.manage().getCookies();
		
		System.out.println(cookies1.size());
		
		for(Cookie cookie:cookies1) 
		{
			System.out.println(cookie);
			System.out.println("--------------");
		}
		
		System.out.println("***********************************");
		Cookie cookieByName1 =	driver.manage().getCookieNamed("domain");
		System.out.println(cookieByName1);
		
		System.out.println("Cookie after addition");
		
		
		Cookie ck1 = new Cookie("Siddhi", "Bhongir");
		
		driver.manage().addCookie(ck1);
		
		Set<Cookie>	cookies2 = driver.manage().getCookies();
		
		System.out.println(cookies2.size());
		
		for(Cookie cookie:cookies2) 
		{
			System.out.println(cookie);
			System.out.println("--------------");
		}
		
		System.out.println("***********************************");
		Cookie cookieByName2 =	driver.manage().getCookieNamed("Siddhi");
		System.out.println(cookieByName2);
		
		driver.manage().deleteAllCookies();
Set<Cookie>	cookies3 = driver.manage().getCookies();
		
		System.out.println(cookies3.size());
		for(Cookie cookie:cookies3) 
		{
			System.out.println(cookie);
			System.out.println("--------------");
		}
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		
	}

}
