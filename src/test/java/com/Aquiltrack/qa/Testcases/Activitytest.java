package com.Aquiltrack.qa.Testcases;

//import org.testng.ReporterConfig.Property;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.Activitypage;
import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;

public class Activitytest extends TestBase {

	LoginPage loginpage;
	DashboardPage dashbrdpage;
	Activitypage actpge;

	public Activitytest() {
		super();
	}

	@BeforeClass
	public void setup() throws InterruptedException {

		Intialization();
		actpge = new Activitypage();
		loginpage = new LoginPage();
		dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		actpge = dashbrdpage.clickonActivity();
	}

	/*
	 * @Test public void verifyactivitylastday() throws Exception {
	 * 
	 * actpge.getexceldata(); actpge.verifyactlastday();
	 * actpge.printactivitydetails(); }
	 * 
	 */
	@Test(priority = 1)
	public void verifyactivitylastweek() throws Exception {
		actpge.verifyactlastweek();
		// actpge.getexceldata();
		actpge.printactivitydetails();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void verifyactivitylastmonth() throws Exception {

		actpge.verifyactlastmonth();
		// actpge.getexceldata();
		actpge.printactivitydetails();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void verifyactivitycustom() throws Exception {

		actpge.verifyactcustom();
		// actpge.getexceldata();
		actpge.printactivitydetails();
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void verifysearchvehicle() throws Exception {
		actpge.searchactivityforvehicle();
		// actpge.getexceldata();
		actpge.printactivitydetails();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void refreshpage() {
		driver.navigate().refresh();
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
