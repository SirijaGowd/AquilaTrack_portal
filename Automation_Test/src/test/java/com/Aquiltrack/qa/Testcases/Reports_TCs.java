package com.Aquiltrack.qa.Testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquilatrack.qa.pages.Reports_Pages;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

public class Reports_TCs extends TestBase {
    LoginPage loginpage;
    DashboardPage dashbrdpage;
    Reports_Pages reportPage;

    public Reports_TCs() {
	super();
    }

    @BeforeClass
    public void setup() throws InterruptedException {
	Intialization();
	loginpage = new LoginPage();
	dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	reportPage = dashbrdpage.clickOnReports();
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

    @Test(priority = 1)
    public void AOI_report() throws InterruptedException, AWTException {
	reportPage.aoi_in_out_click();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.Reports_Custom_Range();
    }

    @Test(priority = 2)
    public void Consolidated_report() throws InterruptedException {
	reportPage.consolidate_report_click();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.Consolidate_Custom_Range();
    }

    @Test(priority = 3)
    public void Current_Summary_report() throws InterruptedException {
	reportPage.current_summary();
    }

    @Test(priority = 4)
    public void Daywise_report() throws InterruptedException {
	reportPage.daywise_report_click();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.DayWise_Custom_Range();
    }

    @Test(priority = 5)
    public void Halt_report() throws InterruptedException {
	reportPage.Halt_alert();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.Reports_Custom_Range();
    }

    @Test(priority = 6)
    public void Idle_report() throws InterruptedException {
	reportPage.Idle_alert();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.Idle_Custom_Range();
    }

    @Test(priority = 7)
    public void Ignition_Report() throws InterruptedException {
	reportPage.Ignition_click();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.Ignition_Custom_range();
    }

    @Test(priority = 8)
    public void J1939_Report() throws InterruptedException {
	reportPage.J1939_Tab();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.J1939_Custom_Range();
    }

    @Test(priority = 9)
    public void OBD_Report() throws InterruptedException {
	reportPage.OBD_tab();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.OBD_Custom_Range();
    }

    @Test(priority = 10)
    public void OverSpeed_Report() throws InterruptedException {
	reportPage.OverSpeed_Tab();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.OverSpeed_Custom_Range();
    }

    @Test(priority = 11)
    public void Panic_Report() throws InterruptedException {
	reportPage.Panic_Tab();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.Panic_Custom_range();
    }

    @Test(priority = 12)
    public void Tracking_Report() throws InterruptedException {
	reportPage.Tracking_Tab();
	reportPage.Tracking_Day();
	reportPage.Tracking_Week();
	reportPage.Tracking_Custom_Range();
    }

    @Test(priority = 13)
    public void Trip_Report() throws InterruptedException {
	reportPage.Trip_Report_tab();
	reportPage.Reports_Day();
	reportPage.Reports_Week();
	reportPage.Trip_Custom_Range();
    }
}
