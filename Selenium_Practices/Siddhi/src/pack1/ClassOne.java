package pack1;
public class ClassOne {
	 int x = 5;
	 int y = 10;
	 static int z = 15;	
	public void classOneMethodOne() 
	{
		x = 10;
		y = 20;
		z= 30;
		classOneMethodTwo();		
	}
	public static void classOneMethodTwo() 
	{
		ClassOne one1 = new ClassOne();
		one1.x = 15;
		one1.y=25;
		z= 35;
		
		classOneMethodThree();
	}
	public static void classOneMethodThree() 
	{
		ClassOne two = new ClassOne();
		two.x = 45;
		two.y=55;
		z= 65;
	}
	public static void main(String[] args) 
	{
		ClassOne one2 = new ClassOne();
		ClassOne two = new ClassOne();	
		one2.classOneMethodOne();		
		System.out.println(one2.x); //15 10
		System.out.println(one2.y);//25 20
		System.out.println(one2.z);//35 //15		
		System.out.println(two.x); //10  15
		System.out.println(two.y);//20  25
		System.out.println(two.z);//30  35  
		
		
		
	}

	
}
