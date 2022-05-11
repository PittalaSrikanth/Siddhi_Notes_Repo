package pack3;

public interface WebDriver 
{
	int x=10;
	static int y = 10;
	public static void add() {
		System.out.println("static method in interface");
	}
	
	
	void get();
	void getTitle();
	void findElement();
	void getCurrentUrl();
	void findElements();
	void switchTo();
	void getVersion();
	void getCapabilities();
	void getPageSource();
	
	
	
	
}
