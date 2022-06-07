package packageTwo;


import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestListners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("********************************************");
		System.out.println("Test started : "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success : "+ result.getName());
		System.out.println("********************************************");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test failed -- : "+result.getName());
		System.out.println("********************************************");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestSkipped -- : "+result.getName());
		System.out.println("********************************************");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
