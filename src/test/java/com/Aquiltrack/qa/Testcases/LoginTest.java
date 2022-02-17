package com.Aquiltrack.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;

public class LoginTest extends TestBase{
	
	LoginPage loginpge;
	DashboardPage dbpage;
	
	
	public LoginTest() {
		super();
	}
	
	@BeforeClass
		public void setup() {
			Intialization();
			loginpge = new LoginPage();
		}
	
	
	@Test
	public void loginmethod() throws InterruptedException {
		dbpage=loginpge.login(prop.getProperty("username"), prop.getProperty("password"));
		//ExtentLogger.pass("login successfull");
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
}


