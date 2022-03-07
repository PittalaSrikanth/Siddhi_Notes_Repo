package com.hoursplus.testCases;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hoursplus.pageObjects.LoginPage;
import com.hoursplus.utilities.ExcelUtils;

public class LoginDataDriven extends LoginPage
{

	@Test(dataProvider = "LoginCredentials")
	public void TC_Login_ValidateCredentails(String user,String pswd)
	{
		LoginPage lp = new LoginPage();
		lp.Login(user,pswd);
		lp.titleVerify();
	}
	@DataProvider(name = "LoginCredentials")
	String[][] getData() throws IOException
	{
		String path = "./src/test/java/com/hoursplus/testData/Book1.xlsx";
		int rcount = ExcelUtils.rowCount(path, "Sheet1");
		int ccount = ExcelUtils.cellCount(path, "Sheet1",1);
		String logininput[][]= new String[rcount][ccount];
		for(int i=1;i<=rcount;i++) 
		{
			for(int j=0;j<ccount;j++) 
			{
				logininput[i-1][j] = ExcelUtils.CellDataByIndexes(path, "sheet1", i, j);
			}
		}
		return logininput;
		
	}
 }

