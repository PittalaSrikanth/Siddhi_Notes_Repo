package upanddown;

public class DowncastingAndUpcasting {

	public static void main(String[] args) 
	{
		Parent p ;  
		Child c = new Child();
		p = c;
		c=(Child)p;
		
		
		
		c.PrintData();
		
	}

}
