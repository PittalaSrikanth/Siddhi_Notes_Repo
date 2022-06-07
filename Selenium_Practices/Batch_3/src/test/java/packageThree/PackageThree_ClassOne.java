package packageThree;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import packageOne.PackageOne_ClassThree;



@Test
public class PackageThree_ClassOne
{
	@Parameters({"username","password"})
	@Test
	public void login(@Optional("Admin")String user, String pass)
	{
		System.out.println("package Three - class 1- login -1");
		System.out.println(user);
		System.out.println(pass);
	}	
	
	@Test()
	public void adduser() 
	{
		System.out.println("package Three - class 1- adduser -2");
	}
	
	@Test()
	public void newmethod() 
	{
		System.out.println("package Three - class 1- newmethod -3");
	}
	
	
	
	@Test(groups = {"regression","smoke2"})
	public void closeUser() 
	{
		System.out.println("package Three - class 1- closeUser -3");
	}
	
	@Test(groups = "smoke2")
	public void deleteUser() 
	{
		System.out.println("package Three - class 1- method -4 - TrashUser");
		
	}
	
	
	
}
