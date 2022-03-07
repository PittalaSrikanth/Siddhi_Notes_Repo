package stepDefinations;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass
{	
	@Before
	public void ChromeLanching() throws IOException  
	{
		properties = new Properties();
		FileInputStream cpropertie = new FileInputStream(".//Configurations/config.properties");
		properties.load(cpropertie);
		String browser = properties.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",properties.getProperty("chromepath"));
			driver = new ChromeDriver();
		}		
	}	
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() 
	{
		lpage = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) 
	{
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String pass) throws InterruptedException
	{
		lpage.setEmail(email);
		lpage.setPassword(pass);
	}

	@When("Click on Login")
	public void click_on_Login() 
	{
	    lpage.clickLoginBtn();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) 
	{
	   
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() 
	{
	    lpage.clickLogoutBtn();
	}

	@Then("close browser")
	public void close_browser() 
	{
	    driver.close();
	    driver.quit();
	}
	
	// cutomer page definations
	@SuppressWarnings("deprecation")
	@Then("User can view Dashboad")
	public void user_can_view_Dashboad() 
	{
	    cpage = new AddCustomerPage(driver);
	    Assert.assertEquals("Customers / nopCommerce administration", driver.getTitle());
	}

	@Then("User click on customers Menu")
	public void user_click_on_customers_Menu() 
	{
	    cpage.clickOnCustomerMenu();
	}

	@Then("click on customers Menu Item")
	public void click_on_customers_Menu_Item() 
	{
		cpage.clickOnCustomerMenuItem();
	}

	@Then("click on Add new button")
	public void click_on_Add_new_button() 
	{
	    
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() 
	{
	    
	}

	@When("User enter customer inf And click on Save button")
	public void user_enter_customer_inf_And_click_on_Save_button() 
	{
	    
	}

	@Then("User can view confirma message {string}")
	public void user_can_view_confirma_message(String string) 
	{ 
		
	}
	
	// setps for search customer by email id
	@When("Enter customer EMail")
	public void enter_customer_EMail() {
	    
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    
	}

	@Then("User should found Email in the Search table")
	public void user_should_found_Email_in_the_Search_table() {
	    
	}


}
