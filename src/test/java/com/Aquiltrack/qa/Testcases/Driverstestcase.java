package com.Aquiltrack.qa.Testcases;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.Drivers;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

@Listeners
public class Driverstestcase extends TestBase {

	LoginPage loginpage;
	DashboardPage dashbrdpage;
	Drivers driverPage;

	public Driverstestcase() {
		super();
	}

	@BeforeClass
	public void setup() throws InterruptedException {
		Intialization();
		driverPage = new Drivers();

		loginpage = new LoginPage();
		dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

		driverPage = dashbrdpage.clickondriverpage();

	}

	@Test(priority = 1)
	public void add() throws InterruptedException, ClassNotFoundException, SQLException {
		driverPage.createnewDriver();

	}

	@Test(priority = 2)
	public void driverbtn() {
		driverPage.driver();

	}

	@Test(priority = 3)
	public void downloadbtn() {
		driverPage.downloadtemplete();

	}

	@Test(priority = 4)
	public void Edit_DriverDetails() throws InterruptedException, ClassNotFoundException, SQLException {
		driverPage.editDriverDetails();
	}

	@Test(priority = 5, enabled = false)
	public void bulkUpload_Driver() throws InterruptedException {
		driverPage.verify_uploading_bulk_driver();

	}

	@AfterMethod(alwaysRun = true)
	public void refreshthe_page() throws InterruptedException {
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}

}
