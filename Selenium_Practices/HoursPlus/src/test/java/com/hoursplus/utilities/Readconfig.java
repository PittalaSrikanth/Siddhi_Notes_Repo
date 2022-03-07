package com.hoursplus.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig
{
	Properties prop;
	public Readconfig()
	{
		File directory = new File("./Configurations/config.properties");	
		try
		{
			FileInputStream file = new FileInputStream(directory);
			prop = new Properties();
			prop.load(file);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public String getUrl()
	{
		return prop.getProperty("baseURL");
	}
	public String getUserName()
	{
		return prop.getProperty("username");
	}
	public String getPassword()
	{
		return prop.getProperty("password");
	}
}
