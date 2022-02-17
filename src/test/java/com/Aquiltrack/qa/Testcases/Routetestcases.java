package com.Aquiltrack.qa.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquilatrack.qa.pages.Routespage;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

@Listeners
public class Routetestcases extends TestBase {

	LoginPage loginpage;
	DashboardPage dashbrdpage;

	Routespage routepage;

	public Routetestcases() {
		super();
	}

	@BeforeClass
	public void setup() throws InterruptedException {
		Intialization();

		routepage = new Routespage();
		loginpage = new LoginPage();
		dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		routepage = dashbrdpage.clickonroutespage();

	}

	@Test(priority = 1)
	public void createRouteUsingAOIsTest() throws Exception {

		routepage.createRouteUsingAOIs();
	}

	@Test(priority = 2)
	public void editRouteDetailsTest() throws Exception {

		routepage.editRouteDetails();
	}

	@Test(priority = 3, dependsOnMethods = "editRouteDetailsTest")
	public void deleteRouteTest() throws Exception {

		routepage.deleteRoute();
	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}

	@AfterMethod(alwaysRun = true)
	public void refreshthe_page() throws InterruptedException {
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

}