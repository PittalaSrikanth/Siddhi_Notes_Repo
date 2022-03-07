package com.hoursplus.testCases;
import org.testng.annotations.Test;

import com.hoursplus.pageObjects.LoginPage;

public class Login extends LoginPage
{

	@Test
	public void TC_Login_ValidCredentails()
	{
		LoginPage lp = new LoginPage();
		lp.Login(config.getUserName(),config.getPassword());
		lp.titleVerify();
	}
 }

