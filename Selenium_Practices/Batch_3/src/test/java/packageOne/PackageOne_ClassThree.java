package packageOne;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class PackageOne_ClassThree 
{
	
	@Test(groups = "smoke1")
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
	@Test(groups = "smoke1")
	public void ClassThreemethonFour() 
	{
		System.out.println("package one - class 3- method -4");
	}
	public void ClassThreemethonFive() 
	{
		System.out.println("package one - class 3- method -5");
	}
	
}
