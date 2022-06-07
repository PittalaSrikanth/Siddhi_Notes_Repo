package packageThree;

import org.testng.annotations.Test;

@Test
public class PackageThree_ClassTwo 
{
	
	
	
	public void ClassThreemethonOne() 
	{
		System.out.println("package one - class 3- method -1");
	}
	public void ClassThreemethonTwo() 
	{
		System.out.println("package one - class 3- method -2");
	}
	public void ClassThreemethonThree() 
	{
		System.out.println("package one - class 3- method -3");
	}
	public void ClassThreemethonFour() 
	{
		System.out.println("package one - class 3- method -4");
	}
	public void ClassThreemethonFive() 
	{
		System.out.println("package one - class 3- method -5");
	}
	
	@Test(groups = "TrashUser")
	public void deleteProfile() 
	{
		System.out.println("package Three - class 1- method -5 - TrashUser");
	}
	
}
