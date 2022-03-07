package PackageTwo;

abstract interface SerchContext  
{
	 public static  int SerchContext_add(int a ,int b) 
	 {
		int result = a+b;
		 return result;
	 }
	 
	 public static int SerchContext_sub(int a ,int b) 
	 {
		int result = a-b;
		 return result;
	 }
	 
	 public static int SerchContext_mulitpe(int a ,int b) 
	 {
		int result = a*b;
		 return result;
	 }
	 public int SerchContext_division(int a ,int b);
}
