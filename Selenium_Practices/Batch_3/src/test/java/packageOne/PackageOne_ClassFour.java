package packageOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class PackageOne_ClassFour 
{
	@BeforeSuite
	public void ClassThreemethonOne() 
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void ClassThreemethonTwo() 
	{
		System.out.println("@BeforeTest");
	}
	@BeforeGroups(groups = "smoke")
	public void ClassThreemethonThree() 
	{
		System.out.println("@BeforeGroups");
	}
	@BeforeClass
	public void ClassThreemethonFour() 
	{
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void ClassThreemethonFive() 
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void ClassThreemethonSix() 
	{
		System.out.println("@Test");
	}
	
	@Test(groups = "smoke")
	public void ClassThreemethon12() 
	{
		System.out.println("groups = smoke");
	}
	
	@AfterSuite
	public void ClassThreemethonSeven() 
	{
		System.out.println("@AfterSuite");
	}
	@AfterTest
	public void ClassThreemethonEight() 
	{
		System.out.println("@BeforeTest");
	}
	@AfterGroups(groups = "smoke")
	public void ClassThreemethonNine() 
	{
		System.out.println("@AfterGroups");
	}
	@AfterClass
	public void ClassThreemethonTen() 
	{
		System.out.println("@AfterClass");
	}
	@AfterMethod
	public void ClassThreemethonEleven() 
	{
		System.out.println("@AfterMethod");
	}
	
}
