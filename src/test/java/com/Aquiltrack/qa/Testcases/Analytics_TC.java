package com.Aquiltrack.qa.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Aquilatrack.qa.pages.Analytics_Page;
import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;

public class Analytics_TC extends TestBase {
    LoginPage loginpage;
    DashboardPage dashbrdpage;
    Analytics_Page analytics;
    public static Logger logger;

    public Analytics_TC() {
	super();
    }

    @BeforeClass
    public void setup() throws Exception {
	Intialization();
	LoginPage loginpage = new LoginPage();
	DashboardPage dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	analytics = dashbrdpage.CLickAnalytic_Tab();
    }

    @AfterMethod
    public void refreshpage() throws InterruptedException {
	Thread.sleep(5000);
	driver.navigate().refresh();
    }

    @AfterClass
    public void teardown() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
    }

    @Test(priority = 1)
    public void lastDay() throws InterruptedException {
	analytics.lastday();
    }

    @Test
    public void lastWeek() throws InterruptedException {
	analytics.lastweek();
    }
//    @Test(priority = 2)
//    public void lastWe() throws InterruptedException {
//
//	analytics.fleet_utilization_vehicle();
//	analytics.no_gps_vehicle();
//	analytics.Offline_Vehicle();
//	analytics.running_vehicle();
//	analytics.Idle_vehicle();
//	analytics.halt_vehicle();
//    }

    @Test(priority = 3)
    public void lastMonth() throws InterruptedException {
	analytics.lastMonth();
    }

    @Test(priority = 4)
    public void All_Time() throws InterruptedException {
	analytics.All_time();
    }
}
