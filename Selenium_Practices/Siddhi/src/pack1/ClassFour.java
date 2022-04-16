package pack1;

public class ClassFour {

	public void classFourMethodOne() 
	{
		System.out.println("classFourMethodOne");

	}
	
	public static void main(String[] args) 
	{
		ClassOne one2 = new ClassOne();
		ClassOne two = new ClassOne();
		// 10 20 35 5 10 35
		
		one2.classOneMethodOne();		
		System.out.println(one2.x); //15 10
		System.out.println(one2.y);//25 20
		System.out.println(one2.z);//35 //15
		
		
		System.out.println(two.x); //10  15
		System.out.println(two.y);//20  25
		System.out.println(two.z);//30  35  
		
		
		
	}

}
