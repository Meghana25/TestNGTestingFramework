package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Need to use ITestlistener interface which implements TestNG listeners
public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result)
	{
		
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("I succesfully executed listeners PASS code");
	}
	public void onTestFailure(ITestResult result)
	{
		//screenshot code
		//response if API is failed
		System.out.println("I failed listeners FAIL code "+result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onStart(ITestContext result)
	{
		
	}

}
