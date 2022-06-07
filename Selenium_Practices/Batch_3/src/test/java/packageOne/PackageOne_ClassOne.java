package packageOne;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class PackageOne_ClassOne
{
	@BeforeTest
	public void ClassOnemethonOne() 
	{
		System.out.println("package one - class 1- method -1 -Before");
	}
	public void ClassOnemethonTwo() 
	{
		System.out.println("package one - class 1- method -2");
	}
	public void ClassOnemethonThree() 
	{
		System.out.println("package one - class 1- method -3");
	}
	public void ClassOnemethonFour() 
	{
		System.out.println("package one - class 1- method -4");
	}
	
	
	@AfterTest
	public void ClassOnemethonFive() 
	{
		System.out.println("package one - class 1- method -5 -After");
	}
	
}
