package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class HomePageDefinition {
	 
    WebDriver driver;
 
    @Given("User Navigates to HRM login page")
    public void userOnHomePage() {
 
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Vibha\\Software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
 
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
 
    @Given("User login with valid credentials")
    public void entersCredentials() throws InterruptedException {
        Thread.sleep(1000);
 
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).submit();
 
    }
 
    @When("User is in Dashboard page")
    public void verifyDashboardPage() {
 
        String dashboardTitle = driver.findElement(By.id("welcome")).getText();
        Assert.assertTrue(dashboardTitle.contains("Welcome"));
 
    }
 
    @Then("there are valid QuickLaunch options {string}")
    public void verifyQuickLinks(String options) throws InterruptedException {
 
        switch (options) {
        case "Assign Leave":
            String linkOne = driver
                    .findElement(By.xpath(
                            "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/span"))
                    .getText();
            Assert.assertEquals(linkOne, options);
            Thread.sleep(1000);
            break;
        case "Leave List ":
            String linkTwo = driver
                    .findElement(By.xpath(
                            "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[2]/div/a/span"))
                    .getText();
            Assert.assertEquals(linkTwo, options);
            Thread.sleep(1000);
            break;
        case "Timesheets":
            String linkThree = driver
                    .findElement(By.xpath(
                            "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[3]/div/a/span"))
                    .getText();
            Assert.assertEquals(linkThree, options);
            Thread.sleep(1000);
            break;
        default:
            break;
        }
 
        driver.quit();
 
    }
 
    @Then("there are valid Legend options {string}")
    public void verifyMenuOptions(String options) throws InterruptedException {
 
        switch (options) {
        case "Not assigned to Subunits":
            String linkOne = driver
                    .findElement(
                            By.xpath("//*[@id='div_legend_pim_employee_distribution_legend']/table/tbody/tr[1]/td[2]"))
                    .getText();
            Assert.assertEquals(linkOne, options);
            Thread.sleep(1000);
            break;
        case "Administration":
            String linkTwo = driver
                    .findElement(
                            By.xpath("//*[@id='div_legend_pim_employee_distribution_legend']/table/tbody/tr[2]/td[2]"))
                    .getText();
            Assert.assertEquals(linkTwo, options);
            Thread.sleep(1000);
            break;
        case "Client Services":
            String linkThree = driver
                    .findElement(
                            By.xpath("//*[@id='div_legend_pim_employee_distribution_legend']/table/tbody/tr[3]/td[2]"))
                    .getText();
            Assert.assertEquals(linkThree, options);
            Thread.sleep(1000);
            break;
        default:
            break;
 
        }
        driver.quit();
    }
}