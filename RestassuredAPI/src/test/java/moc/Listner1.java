package moc;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner1 implements ITestListener 
{
	//ExtentSparkReporter htmlreport;
	public void onTestStart(ITestResult result) 
	{
		//execution start from here
		
		
	}
	public void onTestSuccess(ITestResult result) {
		
	}
	public void onTestFailure(ITestResult result) {
		
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
	public void onStart(ITestContext context) 
	{
		//create html report
		//ExtentSparkReporter htmlreport =new ExtentSparkReporter("./Extentreport/report.html");
		
		
	}
	public void onFinish(ITestContext context) {
		
	}
	
}
