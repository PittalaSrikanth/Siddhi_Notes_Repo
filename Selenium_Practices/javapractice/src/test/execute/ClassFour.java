package test.execute;

public class ClassFour {
	 int x = 20;
	 int y = 30;
	 int z =40;	
	
	 ClassFour()
	{		
		 System.out.println("this is super - parent class constructor");
		 System.out.println(x);		
			System.out.println(y);		
		}
	 
	 ClassFour(int x , int y,int z)
		{		
			 System.out.println("this is super - parent class constructor");
			 System.out.println(x);		
				System.out.println(y);		
			}
	 static void classonemethodTwo() 
		{
			System.out.println("super - old login logic");
		}	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
