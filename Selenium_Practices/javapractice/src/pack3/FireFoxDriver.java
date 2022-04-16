package pack3;

import java.nio.file.WatchEvent;

public class FireFoxDriver implements WebDriver{

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
	
	public void FirefoxOptions() 
	{
		System.out.println("FirefoxOptions- method");
	}

}
