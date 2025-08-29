package TestngDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{

	public void onTestStart(ITestResult result)
	{
	
	}

	public void onTestSuccess(ITestResult result)
	{
	System.out.println("I am successfully passed");
	}
public void onTestFailure(ITestResult result)
{
	System.out.println("I am excuting when gets failure");
}
}
