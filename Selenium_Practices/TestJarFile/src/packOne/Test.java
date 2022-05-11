package packOne;

import convertjarfilepack.*;


public class Test 
{
	public static void main(String[] args) 
	{
		Addition a = new Addition();
		System.out.println(a.add(5, 5));
		
		Subtraction s = new Subtraction();
		System.out.println(s.sub(15, 5));
		
		Multiplication m = new Multiplication();
		System.out.println(m.mul(5, 5));
		
		Division d = new Division();
		System.out.println(d.div(5, 5));
	}
}
