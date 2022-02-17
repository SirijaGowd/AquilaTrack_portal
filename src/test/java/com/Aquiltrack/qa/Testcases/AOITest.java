package com.Aquiltrack.qa.Testcases;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.AOIPage1;
import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

@Listeners
public class AOITest extends TestBase {

	LoginPage loginpage;
	DashboardPage dashbrdpage;
	AOIPage1 aoispage;

	public AOITest() {
		super();
	}

	@BeforeClass
	public void setup() throws InterruptedException {

		Intialization();
		aoispage = new AOIPage1();
		loginpage = new LoginPage();
		dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		aoispage = dashbrdpage.clickonAOIbtn();

	}

	@Test(priority = 1)
	public void createAOIUsingCircleAndCoordinatesTest() throws Exception {
		aoispage.createAOIUsingCircleAndCoordinates();
	}

	@Test(priority = 2)
	public void createAOIUsingPolygonAndPlacesTest() throws ClassNotFoundException, InterruptedException, SQLException {
		aoispage.createAOIUsingPolygonAndPlaces();
	}

	@Test(priority = 3)
	public void createAOIUsingPolygonAndCoordinatesTest()
			throws InterruptedException, ClassNotFoundException, SQLException {
		aoispage.createAOIUsingPolygonAndCoordinates();
	}

	@Test(priority = 6)
	public void AoibulkDownload() throws InterruptedException {
		aoispage.bulcreationAOIDownload();
	}

	@Test(priority = 5)
	public void createAOIUsingCircleAndPlacesTest() throws InterruptedException, ClassNotFoundException, SQLException {
		aoispage.createAOIUsingCircleAndPlaces();
	}

	@Test(enabled = false)
	public void AOiupload() throws Exception {
		aoispage.bulcreationAOIupload();
	}

	@Test(priority = 7, dependsOnMethods = "createAOIUsingCircleAndPlacesTest")
	public void editAOITest() throws InterruptedException, ClassNotFoundException, SQLException {
		aoispage.editAOI();
	}

	@Test(priority = 8)
	public void testdeleteAOI() throws InterruptedException, ClassNotFoundException, SQLException {
		aoispage.deleteAOI();
	}

	@Test(enabled = false)
	public void test() throws ClassNotFoundException, InterruptedException, SQLException {
		// aoispage.alertconfig();
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
