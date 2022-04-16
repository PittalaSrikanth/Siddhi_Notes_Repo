package test.execute;
public class ClassOne extends ClassFour
{
	 int x = 10;
	 int y = 10;
	 int z =10;
	
	ClassOne()
	{
		
		System.out.println("this is  parent class constructor");
		
				
	}
	
	ClassOne(boolean g)
	{
		System.out.println(x);		
		System.out.println(y);		
		
	}
	
	
	
	void classonemethodOne() {
		System.out.println(x);		
		System.out.println(y);
	}
	
	static void classonemethodTwo() 
	{
		System.out.println("old login logic");
	}
	
	
	public static void main(String[] args) 
	{	
		
	}

}
