package packageTwo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({packageTwo.TestListners.class})
public class PackageTwo_ClassTwo 
{
	@Test(priority = 0)
	public void login() throws InterruptedException 
	{

		Assert.assertNotNull(null);		
		System.out.println("package Two - class -2 method -1");
	}
	@Test(priority = 2)
	public void methonTwo() throws InterruptedException 
	{
		
		System.out.println("package Two - class 2- method -2");
	}
	@Test(priority = 3)
	public void methonThree() throws InterruptedException 
	{
		System.out.println("package Two - class 2- method -3");
	}
	@Test(priority = 4)
	public void methonFour() throws InterruptedException 
	{
		System.out.println("package Two - class 2- method -4");
	}
	@Test(priority = 5)
	public void methonFive() throws InterruptedException 
	{
		System.out.println("package Two - class 2- method -5");
	}
	
}
