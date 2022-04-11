package com.Aquiltrack.qa.Testcases;

import java.awt.AWTException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquilatrack.qa.pages.Trips_page;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

public class Trips_Tcs extends TestBase {
	LoginPage loginpage;
	DashboardPage dashbrdpage;
	Trips_page trip_page;

	public Trips_Tcs() {
		super();
	}

	@BeforeClass
	public void setup() throws InterruptedException {
		Intialization();
		loginpage = new LoginPage();
		dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		trip_page = dashbrdpage.clickOnTrips();
	}

	@AfterMethod(alwaysRun = true)
	public void refreshthe_page() throws InterruptedException {
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1)
	public void Trips() throws ClassNotFoundException, SQLException, AWTException, InterruptedException {
		trip_page.trip_vehicle_search();
		trip_page.trip_Alerts();
	}

	@Test(priority = 2)
	public void Create_Trip() throws InterruptedException, ClassNotFoundException, SQLException, AWTException {
		trip_page.trip_create();
	}
}
