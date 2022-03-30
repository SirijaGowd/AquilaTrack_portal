package com.Aquilatrack.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Aquilatrack.reports.ExtentReporterNG;
import com.Aquiltrack.qa.Base.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listenerclass extends TestBase implements ITestListener ,ISuiteListener{
	//TestBase b = new TestBase();

	ExtentReports extent=ExtentReporterNG.getReportObject();
	ExtentTest test ;
	@Override
	public void onStart(ISuite suite) {

	}

	@Override
	public void onFinish(ISuite suite) {

		//ExtentTest.flushreport();


	}

	@Override
	public void onTestStart(ITestResult result) {
		test =extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Failed Test");
	//	test.log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+ " failed");
		test.fail(result.getThrowable());

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String actualdate=format.format(date);


		String screenshotpath = System.getProperty("user.dir")+"/screenshots/"+actualdate+".png";
		File dest = new File(screenshotpath);
		try {
			FileUtils.copyFile(scrFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(screenshotpath, "failed testcase screenshot");
		}catch(Exception e1) {
			e1.printStackTrace();
		}


	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
