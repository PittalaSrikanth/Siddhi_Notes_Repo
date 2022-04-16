package practiceonabstract;

public class TestClass  extends ParentAbstractClass{

	
	
	
	public static void main(String[] args) 
	{
		ParentAbstractClass ab = new TestClassTwo();
		ab.findElement();
	}
	
	@Override
	public void get() {
		System.out.println("fget- method");
		
	}

	@Override
	public void getTitle() 
	{
		System.out.println("fgetTitle- method");
		
	}

	@Override
	public void findElement() {
		System.out.println("ffindElement- method");
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("fgetCurrentUrl- method");
		
	}

	@Override
	public void findElements() {
		System.out.println("ffindElements- method");
		
	}

	@Override
	public void switchTo() {
		System.out.println("fswitchTo- method");
		
	}

	@Override
	public void getVersion() {
		System.out.println("fgetVersion- method");
		
	}

	@Override
	public void getCapabilities() {
		System.out.println("fgetCapabilities- method");
		
	}

	@Override
	public void getPageSource() {
		System.out.println("fgetPageSource- method");
		
	}
	@Override
	public void abstractMethodOne() {
		// TODO Auto-generated method stub
		
	}

}
