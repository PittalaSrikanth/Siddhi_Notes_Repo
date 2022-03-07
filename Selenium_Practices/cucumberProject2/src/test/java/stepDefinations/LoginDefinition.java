package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class LoginDefinition {
	 
    WebDriver driver;
 
    @Given("User is on Home page")
    public void userOnHomePage() {
 
        System.setProperty("webdriver.gecko.driver",
                "D:\\Selenium_Practices\\chromedriver\\geckodriver.exe");
 
        driver = new FirefoxDriver();
 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
 
    @When("User enters username as {string}")
    public void entersUsername(String userName) throws InterruptedException {
 
        System.out.println("Username Entered");
        driver.findElement(By.name("txtUsername")).sendKeys(userName);
 
    }
 
    @When("User enters password as {string}")
    public void entersPassword(String passWord) throws InterruptedException {
 
        System.out.println("Password Entered");
        driver.findElement(By.name("txtPassword")).sendKeys(passWord);
 
        driver.findElement(By.id("btnLogin")).submit();
    }
 
    @Then("User should be able to login sucessfully")
    public void sucessfullLogin() throws InterruptedException {
 
        String newPageText = driver.findElement(By.id("welcome")).getText();
        System.out.println("newPageText :" + newPageText);
        Assert.assertTrue(newPageText.contains("Welcome"));
 
        driver.quit();
 
    }
}