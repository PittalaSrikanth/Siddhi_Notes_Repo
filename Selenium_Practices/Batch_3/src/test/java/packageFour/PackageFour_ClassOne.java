package packageFour;

import org.testng.annotations.Test;

@Test
public class PackageFour_ClassOne 
{
	public void methonOne() 
	{
		System.out.println("package Four - class 1- method -1");
	}
	
	@Test(groups = "smoke")
	public void methonTwo() 
	{
		System.out.println("package Four - class 1- method -2");
	}
	public void methonThree() 
	{
		System.out.println("package Four - class 1- method -3");
	}
	@Test(groups = "smoke")
	public void methonFour() 
	{
		System.out.println("package Four - class 1- method -4");
	}
	@Test(groups = "smoke")
	public void methonFive() 
	{
		System.out.println("package Four - class 1- method -5");
	}
	
}
