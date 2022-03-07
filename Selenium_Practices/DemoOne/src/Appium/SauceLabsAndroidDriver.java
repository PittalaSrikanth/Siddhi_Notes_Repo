package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class SauceLabsAndroidDriver {

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		MutableCapabilities mc = new MutableCapabilities();
		mc.setCapability("platformName", "Android");
		mc.setCapability("deviceName", "Google Pixel.*");
		mc.setCapability("deviceVersion", "7.1.1");
		mc.setCapability("noReset", "true");
		mc.setCapability("appiumVersion", "1.20.2");
		mc.setCapability("username", "oauth-srikanth.p4991-99079");
		mc.setCapability("accesskey", "0a82ca7d-d09e-48a9-bbdb-3506f5b5504d");
		mc.setCapability("app", "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		mc.setCapability("appPackage", "com.swaglabsmobileapp");
		mc.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
		
		
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("sauce:options", mc);

		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"),ds);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		
		Thread.sleep(5000);
		driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
