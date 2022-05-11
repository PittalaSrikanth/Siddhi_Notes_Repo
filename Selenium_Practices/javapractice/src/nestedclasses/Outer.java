package nestedclasses;

public class Outer
{
	static int z = 10;
	int f = 100;
	public Outer() 
	{
		z =20;
		f=100;
	}
	public static class Inner
	{
		public Inner() 
		{
			z=40;	
			
		}
		static int x = 10;
		static int y = 10;
		static void m() {
			System.out.println(z);
		}
	}	
	
	public  class InnerTwo
	{
		public InnerTwo() {
			z=30;
			f= 100;
			
		}
		int x = 10;
		int y = 10;
		void m() {
			System.out.println(z);
		}
	}	
	
	public static void main(String[] args)
	{
		Outer o = new Outer();
		InnerTwo two = o.new InnerTwo();
		two.m();
		
		
		
		Outer.Inner.x=100;
		Outer.Inner.m();
		

	}	
}
