package upcatinganddowncasting;

public class ChildClassOne
{
	int x = 10;
	int y = 20;
	
	void methodOne_ClassOne() 
	{
		
	}
	
	public static void main(String[] args) 
	{

		ChildClassOne one = new ChildClassOne();
		
		ChildClassOne two = new ChildClassOne();
		
		

		one.x = 20;
		
		
		System.out.println(one.x);
		System.out.println(two.x);
		
		
		


	}
}
