package testPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();

		cap.setBrowserName(BrowserType.FIREFOX);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), cap);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(15000);

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
