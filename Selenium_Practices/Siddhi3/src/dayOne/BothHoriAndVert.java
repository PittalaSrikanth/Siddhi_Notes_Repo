package dayOne;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BothHoriAndVert {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		WebDriver driver = null;
		
		try 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
			driver = new  ChromeDriver();	
			
//			driver.manage().window().maximize();
			
			
			
			JavascriptExecutor js  = ((JavascriptExecutor)driver);				
			
			js.executeScript("window.location='https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=13264686186473180842&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300288&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=Cj0KCQjw29CRBhCUARIsAOboZbJs18m7jVw0ZVt44gEDtenPoEl16mtn_J7p3pQGGqFhHD0_TR2jmTQaAhP2EALw_wcB'");
			
			
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(5000);
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
			
			
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			Thread.sleep(5000);
			js.executeScript("window.scrollTo(-document.body.scrollHeight,0)");
			
			
			Thread.sleep(5000);
		} 
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("We got exception");
		}
		finally 
		{
			driver.close();
			driver.quit();
		}
		
		
		
		
		
		
	
		
		
		
	}

}
