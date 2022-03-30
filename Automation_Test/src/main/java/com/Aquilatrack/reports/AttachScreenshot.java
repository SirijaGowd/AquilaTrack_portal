package com.Aquilatrack.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttachScreenshot {

	public ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void startup() throws IOException {
		extent= new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		spark.loadXMLConfig(new File("extentconfig.xml"));
		extent.attachReporter(spark);
	}

	@AfterSuite
	public void teardown() throws IOException {
		extent.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());

	}
	@Test
	public void attachscreen() throws IOException {
		ExtentTest test=extent.createTest("First Test");
		System.setProperty("webdriver.chrome.driver", "/home/swati/Desktop/chromedriver");
		driver= new ChromeDriver();
		test.pass("browser opened");
		driver.manage().window().maximize();
		driver.get("https://portal.aquilatrack.com/home/dashboard");
		//test.pass("value enterd", MediaEntityBuilder.createScreenCaptureFromPath(getscreenshot()).build());
		test.pass("value entered", MediaEntityBuilder.createScreenCaptureFromBase64String(getbase64()).build());
		test.pass("passes");

	}

	public String getscreenshot() throws IOException {
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"/Screenshots/image.png";
		FileUtils.copyFile(Source, new File(path));
		return path;

	}
  public String getbase64() {
	return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	  
	  
  }
}
