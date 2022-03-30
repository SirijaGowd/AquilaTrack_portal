package com.Aquiltrack.qa.Testcases;

import java.awt.AWTException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Aquilatrack.qa.pages.AlertsPage;
import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

@Listeners(com.Aquilatrack.Listeners.Listenerclass.class)
public class AlertsTest extends TestBase {
    LoginPage loginpage;
    DashboardPage dashbrdpage;

    AlertsPage alertpage;
    public static Logger logger;

    public AlertsTest() {
	super();
    }

    @BeforeClass
    public void setup() throws Exception {
	Intialization();
	loginpage = new LoginPage();
	dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	alertpage = new AlertsPage();
    }

    @Test(priority = 1)
    public void vehicle_ALert_hour() throws ClassNotFoundException, SQLException, InterruptedException, AWTException {
	alertpage.alerts_Tb();
	alertpage.alert_dropdown();
	alertpage.dropdown_lasthour();

	alertpage.all_alerts();
    }

    @Test(priority = 2)
    public void vehicle_ALert_Day() throws ClassNotFoundException, SQLException, InterruptedException, AWTException {
	alertpage.alerts_Tb();
	alertpage.alert_dropdown();
	alertpage.dropdown_lastDay();

	alertpage.all_alerts();
    }

    @Test(priority = 3)
    public void vehicle_ALert_Week() throws ClassNotFoundException, SQLException, InterruptedException, AWTException {
	alertpage.alerts_Tb();
	alertpage.alert_dropdown();
	alertpage.dropdown_Week();

	alertpage.all_alerts();
    }

    @Test(priority = 4)
    public void vehicle_ALert_Month() throws ClassNotFoundException, SQLException, InterruptedException, AWTException {
	alertpage.alerts_Tb();
	alertpage.alert_dropdown();
	alertpage.dropdown_Month();

	alertpage.Alert_panic();
	alertpage.Alert_Overspeed();
	alertpage.Alert_Towel();
	alertpage.Alert_NoRespose();
	alertpage.alert_download_Button();
	alertpage.Alert_Vehicle_batteryLow();
	alertpage.Alert_Device_batteryLow();
	alertpage.Alert_Device_PullOut();
	alertpage.Alert_AOI_Geofence_Breach();
	alertpage.Alert_RouteFence_Breach();
	alertpage.Alert_HAlt();
	alertpage.Alert_Idle();
	alertpage.Alert_Schedule_Maintanance();
	alertpage.Alert_Conditional_Maintance();
	alertpage.Alert_Refuel();
	alertpage.Alert_Pilferage();
    }

    @AfterMethod
    public void refreshpage() throws InterruptedException {
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
    }

    @AfterClass
    public void teardown() {
	driver.quit();
    }
}
