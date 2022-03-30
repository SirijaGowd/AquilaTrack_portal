package com.Aquiltrack.qa.Testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Excel.Utility.TestUtil;

@Listeners(com.Aquilatrack.Listeners.Listenerclass.class)
public class DashboardTest extends DashboardPage {

    LoginPage loginpage;
    DashboardPage dashbrdpage;

    public static Logger logger;

    public DashboardTest() {
	super();
    }

    @BeforeClass
    public void setup() throws Exception {
	Intialization();
	loginpage = new LoginPage();
	dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void trackingButtonIsEnabledTest() throws SQLException, ClassNotFoundException, IOException {
	Assert.assertEquals(true, dashbrdpage.trackingButton());
	Assert.assertEquals(true, dashbrdpage.runningButtonIsEnabled());
	Assert.assertEquals(true, dashbrdpage.idleButtonIsEnabled());
	Assert.assertEquals(true, dashbrdpage.haltButtonIsEnabled());
	Assert.assertEquals(true, dashbrdpage.noGpsButtonIsEnabled());
	Assert.assertEquals(true, dashbrdpage.nonTrackingButton());
	Assert.assertEquals(true, dashbrdpage.offLineButtonIsEnabled());
	Assert.assertEquals(true, dashbrdpage.noDataButtonIsEnabled());
	Assert.assertEquals(true, dashbrdpage.deadButtonIsEnabled());
    }

    @Test(priority = 2)
    public void TrackingButtonIsEnabledTestClick() {
	dashbrdpage.trackingButton_click();
    }

    @Test(priority = 3)
    public void NOnTrackingButtonIsEnabledTestClick() {
	dashbrdpage.nonTrackingButton_click();
    }

    @Test(priority = 4, enabled = false)
    public void clickOnOfflineVehicle() {
	dashbrdpage.checkofflinevhcl();
    }

    @Test(priority = 5)
    public void links() throws MalformedURLException, IOException, InterruptedException {
	dashbrdpage.brokenLinkOnceClickedOnMenuButton();
    }

    @Test(priority = 6)
    public void currentTrackinfoPageTest() {
	Assert.assertEquals("Current Trackinfo", dashbrdpage.current_TrackinfoPage());
    }

    @Test(priority = 7)
    public void SearchedResuktAtCurrentTrackinfoPageTest()
	    throws SQLException, ClassNotFoundException, IOException, InterruptedException {
	// Assert.assertTrue(d.current_TrackinfoPageTest());
	// Assert.assertEquals("Sorry, no matching records found",
	// d.saerchAtCurrentTrackinfoPage());
	Assert.assertEquals(dashbrdpage.Searched_Data(), dashbrdpage.SearchedResuktAtCurrentTrackinfoPage());
    }

    @Test(priority = 8)
    public void viewColumnAtCurrentTracknfoTest()
	    throws SQLException, ClassNotFoundException, IOException, InterruptedException {
	// Assert.assertTrue(d.current_TrackinfoPageTest());
	// Assert.assertEquals("Sorry, no matching records found",
	// d.saerchAtCurrentTrackinfoPage());
	Assert.assertEquals(0, dashbrdpage.viewColumnAtCurrentTracknfo());
    }

    @Test(priority = 8)
    public void downloadiconAtCurrentTracknfoTest()
	    throws SQLException, ClassNotFoundException, IOException, InterruptedException {
	Assert.assertTrue(dashbrdpage.downloadiconAtCurrentTracknfo());
    }

    @Test(priority = 9)
    public void currentSummaryPageTest()
	    throws SQLException, ClassNotFoundException, IOException, InterruptedException {
	Assert.assertEquals("Current Summary", dashbrdpage.currentSummaryPage());
    }

    @Test(priority = 10)
    public void SearchedResuktAtCurrentSummaryPageTest()
	    throws SQLException, ClassNotFoundException, IOException, InterruptedException {

	// Assert.assertTrue(d.current_TrackinfoPageTest());
	// Assert.assertEquals("Sorry, no matching records found",
	// d.saerchAtCurrentTrackinfoPage());
	Assert.assertEquals(dashbrdpage.Searched_Data(), dashbrdpage.SearchedResuktAtCurrentSummaryPage());
    }

    @Test(priority = 11)
    public void viewColumnAtCurrentSummaryTest()
	    throws SQLException, ClassNotFoundException, IOException, InterruptedException {
	// Assert.assertTrue(d.current_TrackinfoPageTest());
	// Assert.assertEquals("Sorry, no matching records found",
	// d.saerchAtCurrentTrackinfoPage());
	Assert.assertEquals(dashbrdpage.viewColumnAtCurrentSummary(), 0);
    }

    @Test(priority = 12)
    public void downloadiconAtCurrentSummaryTest()
	    throws SQLException, ClassNotFoundException, IOException, InterruptedException {
	Assert.assertTrue(dashbrdpage.downloadiconAtCurrentSummary());
    }

    @Test(priority = 13, enabled = false)
    public void clickontoggle() throws InterruptedException {
	dashbrdpage.checktoggle();
    }

    @Test(priority = 14)
    public void clickonlivealert() throws InterruptedException {
	dashbrdpage.checkLivealert();
    }

    @AfterClass
    public void teardown() {
	driver.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void refresh() {
	dashbrdpage.refreshthe_page();
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

    }
}
