package com.Aquilatrack.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Attachlogo {
	
	@Test
	public void attachlogo() throws IOException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		spark.loadXMLConfig(new File("extentconfig.xml"));
		extent.attachReporter(spark);
		
		ExtentTest test=extent.createTest("First Test");
		test.pass("test case passed");
		
		extent.flush();
		
		Desktop.getDesktop().browse(new File("index.html").toURI());
		
	}

}
