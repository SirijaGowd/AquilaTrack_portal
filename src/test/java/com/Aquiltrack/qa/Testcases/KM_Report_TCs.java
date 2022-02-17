package com.Aquiltrack.qa.Testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.KM_Report_Page;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

public class KM_Report_TCs extends TestBase {

    LoginPage loginpage;
    DashboardPage dashbrdpage;
    KM_Report_Page kmpage;

    public KM_Report_TCs() {
	super();
    }

    @BeforeClass
    public void setup() throws InterruptedException {
	Intialization();

	loginpage = new LoginPage();
	dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	kmpage = dashbrdpage.clickonKM_TAB();
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
    public void km_Daily() throws InterruptedException, AWTException {
	kmpage.clickDaily();
	kmpage.From();
	kmpage.km_To();
	kmpage.Get_Report();
	//kmpage.KM_Search();

	kmpage.KM_Download();
	kmpage.km_view_column();
    }

    @Test(priority = 2)
    public void km_Month() throws InterruptedException, AWTException {
	kmpage.clickMonth();
	kmpage.From();
	kmpage.km_To();
	kmpage.Get_Report();

	kmpage.KM_Download();
	kmpage.KM_filter();
    }

}
