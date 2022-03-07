package com.hoursplus.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hoursplus.testCases.BaseClass;
import com.hoursplus.utilities.Readconfig;


public class LoginPage extends BaseClass
{
	WebDriver ldriver;
	public static Readconfig config;
	public String LoginPageTilte = "Guru99 Bank Manager HomePage";
	public LoginPage()
	{
		ldriver = driver;
		config = rconfig;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement tb_UserName;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement tb_Password;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btn_Login;

	public void setUserName(String uname)
	{
		tb_UserName.sendKeys(uname);
	}
	public void setPassword(String pswd)
	{
		tb_Password.sendKeys(pswd);
	}
	public void clickLogin()
	{
		btn_Login.click();
	}
	
	public void Login(String userName,String pasSword)
	{
		setUserName(userName);
		log.info("Enter UserName");
		setPassword(pasSword);
		log.info("Enter Password");
		clickLogin();
	}
	public void titleVerify()
	{
		Assert.assertTrue(ldriver.getTitle().equals(LoginPageTilte));
		log.info("Verify Bashboard Tittle");
	}
}
