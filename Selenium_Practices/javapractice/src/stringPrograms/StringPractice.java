package stringPrograms;

public class StringPractice 
{
	public static void main(String[] args) 
	{
		String  str1 = " hello siddhi intitute good morning fsadfsdkf asdfasdfs fsfdf asfksdfsajdlf safkdsjflaf sad jdafsf ksdafj klsdajfas";
		String  str = str1.trim();
		
	//	Holle Sihddi Ietutitn Sihddi Gdoo Mgninro	
		
		String[] words = str.split(" ");		
		for(String word : words) 
		{
			char[] charectors = word.toCharArray();
			
			
			String s = "s";
			
			String firstletter =String.valueOf(charectors[0]).toUpperCase();
				
			System.out.print(firstletter);
			for(int i=charectors.length-1 ;i>=1; i--) 
			{				
				System.out.print(charectors[i]);
			}
			
			System.out.print(" ");
		}





		
		
		
		
		
		
		
		


		


		

		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
