package com.Aquilatrack.reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.IReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG implements IReporter {

    static ExtentReports extent;

    public static ExtentReports getReportObject() {

	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	String actualdate = format.format(date);

	String path = System.getProperty("user.dir") + "/reports/index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);

	reporter.config().setReportName("Aquilatrcak Portal Automation Result");
	reporter.config().setDocumentTitle("Test Result");

	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Swati beekle");

	return extent;

    }

}
