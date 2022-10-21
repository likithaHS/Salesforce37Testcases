package com.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.test.helpers.UserServiceHelpers;

public class ListenerClass extends UserServiceHelpers implements ITestListener {
	
	//GenerateReports report=GenerateReports.getInstance();
	
	public void onTestFailure(ITestResult result) {
		report.logTestFailed("TestCase Failed" +result.getName());
		//String pathOfScreenShot=getscreenshortdriver();
		//report.logScreenshotCapture(pathOfScreenShot, pathOfScreenShot);	
	}
	
	public void onTestSuccess(ITestResult result) {
		report.logTestInfo("Testcase pass for" +result.getName());
	}

}
