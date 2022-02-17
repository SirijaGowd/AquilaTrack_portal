package com.Aquiltrack.qa.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.AletConfig;
import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;

public class Alertconfigtestcases extends TestBase {

    AletConfig alertpage;

    public Alertconfigtestcases() {
	super();
    }

    @BeforeClass
    public void setup() throws InterruptedException {
	Intialization();

	alertpage = new AletConfig();
	LoginPage loginpage = new LoginPage();
	DashboardPage dashbrdpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(2000);
	alertpage = dashbrdpage.clickonalertspage();

    }

    @AfterMethod
    public void refresh() {

	driver.navigate().refresh();
    }

    // --------------------------------------------------- Panic_Alert
    @Test(priority = 1)
    public void Panic_Alert_Disable() throws InterruptedException {
	alertpage.panic_disable();
	alertpage.panic_enable_Edit();
	alertpage.panic_enable_Delete();
    }

    // --------------------------------------------------- OverSpeed_Alert

    @Test(priority = 4)
    public void OverSpeed_Alert_Disable() throws InterruptedException {
	alertpage.overspeed_disable();
	alertpage.overspeed_enable_Edit();
	alertpage.overspeed_enable_Delete();
    }

    // --------------------------------------------------- TOWING_Alert

    @Test(priority = 7)
    public void Towing_ALert_Disable() throws InterruptedException {
	alertpage.towing_disable();
    }

    @Test(priority = 8)
    public void Towing_ALert_Enable_Edit() throws InterruptedException {
	alertpage.towing_enable_Edit();
    }

    @Test(priority = 9)
    public void Towing_ALert_Enable_Delete() throws InterruptedException {
	alertpage.towing_enable_Delete();
    }

    // --------------------------------------------------- FALL_Alert
    @Test(priority = 10)
    public void Fall_ALert_Disable() throws InterruptedException {
	alertpage.fall_disable();
    }

    @Test(priority = 11)
    public void Fall_ALert_Enable_Edit() throws InterruptedException {
	alertpage.fall_enable_Edit();
    }

    @Test(priority = 12)
    public void Fall_ALert_Enable_Delete() throws InterruptedException {
	alertpage.fall_enable_Delete();
    }

    // --------------------------------------------------- No Response_Alert
    @Test(priority = 13)
    public void NoResponse_ALert_Disable() throws InterruptedException {
	alertpage.noResponse_Disable();
    }

    @Test(priority = 14)
    public void NoResponse_ALert_Enable_Edit() throws InterruptedException {
	alertpage.noResponse_Enable_Edit();
    }

    @Test(priority = 15)
    public void NoResponse_ALert_Enable_Delete() throws InterruptedException {
	alertpage.noResponse_Enable_Delete();
    }

    // --------------------------------------------------- Vehicle Battery Low_Alert

    @Test(priority = 16)
    public void VehicleBtryLow_Disable() throws InterruptedException {
	alertpage.VehicleBtryLow_disable();
    }

    @Test(priority = 17)
    public void VehicleBtryLow_Enable_Edit() throws InterruptedException {
	alertpage.VehicleBtryLow_Enable_edit();
    }

	/*
	 * @Test(priority = 18) public void VehicleBtryLow_Enable_Delete() throws
	 * InterruptedException { alertpage.VehicleBtryLow_Enable_delete(); }
	 */

    // --------------------------------------------------- Device Battery Low_Alert

    @Test(priority = 19)
    public void DeviceBtryLow_Disable() throws InterruptedException {
	alertpage.DeviceBtryLow_disable();
    }

    @Test(priority = 20)
    public void DeviceBtryLow_Enable_Edit() throws InterruptedException {
	alertpage.DeviceBtryLow_enable_edit();
    }

    @Test(priority = 21)
    public void DeviceBtryLow_Enable_Delete() throws InterruptedException {
	alertpage.DeviceBtryLow_enable_delete();
    }

    // --------------------------------------------------- Device PullOut _Alert

    @Test(priority = 22)
    public void DevicePullout_Disable() throws InterruptedException {
	alertpage.DevicePullout_disable();
    }

    @Test(priority = 23)
    public void DevicePullout_Enable_Edit() throws InterruptedException {
	alertpage.DevicePullout_Enable_edit();
    }

    @Test(priority = 24)
    public void DevicePullout_Enable_Delete() throws InterruptedException {
	alertpage.DevicePullout_Enable_delete();
    }

    // --------------------------------------------------- AOI_Alert

    @Test(priority = 25)
    public void AOI_Alert_Disable() throws InterruptedException {
	alertpage.aoi_Alert_disable();
    }

    @Test(priority = 26)
    public void AOI_Alert_Enable_Edit() throws InterruptedException {
	alertpage.aoi_Alert_enable_edit();
    }

    @Test(priority = 27)
    public void AOI_Alert_Enable_Delete() throws InterruptedException {
	alertpage.aoi_Alert_enable_delete();
    }

    // --------------------------------------------------- Route_Alert

    @Test(priority = 28)
    public void Route_Alert_Disable() throws InterruptedException {
	alertpage.route_Alert_disable();
    }

    @Test(priority = 29)
    public void Route_Alert_Enable_Edit() throws InterruptedException {
	alertpage.route_Alert_enable_edit();
    }

    @Test(priority = 30)
    public void Route_Alert_Enable_Delete() throws InterruptedException {
	alertpage.route_Alert_enable_delete();
    }

    // --------------------------------------------------- Halt_Alert

    @Test(priority = 31)
    public void Halt_Alert_Disable() throws InterruptedException {
	alertpage.haltAlert_Disable();
    }

    @Test(priority = 32)
    public void Halt_ALert_Enable_Edit() throws InterruptedException {
	alertpage.halt_enable_editbtn();
    }

    @Test(priority = 33)
    public void Halt_Enable_Deletebtn() throws InterruptedException {
	alertpage.halt_deletebtn();
    }

    // --------------------------------------------------- Idle_Alert

    @Test(priority = 34)
    public void Idle_ALert_Disable() throws InterruptedException {
	alertpage.idle_disable();
    }

    @Test(priority = 35)
    public void Idle_Enable_edit() throws InterruptedException {
	alertpage.idle_enable_editbtn();
    }

    @Test(priority = 36)
    public void Idle_Enable_deletebtn() throws InterruptedException {
	alertpage.idle_deletebtn();
	Thread.sleep(2000);
    }

    // --------------------------------------------Schedule_Maintenance_Alert

    @Test(priority = 37)
    public void Schedule_Disable() throws InterruptedException {
	alertpage.schedule_Disable();
    }

    @Test(priority = 38)
    public void Schedule_Enable_Edit() throws InterruptedException {
	alertpage.schedule_enable_edit();
    }

    @Test(priority = 39)
    public void Scheduele_Enable_deletebtn() throws InterruptedException {
	alertpage.schedule_enable_deletebtn();
    }

    // --------------------------------------------Refuel_Alert

    @Test(priority = 40)
    public void Refuel_Disable() throws InterruptedException {
	alertpage.refuel_disable();
    }

    @Test(priority = 41)
    public void Refuel_Enable_Edit() throws InterruptedException {
	alertpage.refuel_editbtn();
    }

    @Test(priority = 42)
    public void Refuel_Enable_Delete() throws InterruptedException {
	alertpage.refuel_delete();
    }

//------------------------------------Conditional_ALert
    @Test(priority = 43)
    public void Conditional_Disable() throws InterruptedException {
	alertpage.conditional_disable();
    }

    @Test(priority = 44)
    public void Conditional_Enable_Edit() throws InterruptedException {
	alertpage.conditional_edit();
    }

    @Test(priority = 45)
    public void Conditional_Enable_Delete() throws InterruptedException {
	alertpage.conditional_delete();
    }

//------------------------------------------Pilferage_Alert
    @Test(priority = 46)
    public void Pilferage_Disable() throws InterruptedException {
	alertpage.pilferage_disable();
    }

    @Test(priority = 47)
    public void Pilferage_Enable_edit() throws InterruptedException {
	alertpage.pilferage_Edit();
    }

    @Test(priority = 48)
    public void Pilferage_Enable_delete() throws InterruptedException {
	alertpage.pilferage_delete();
    }

    @AfterClass
    public void teardown() {
	driver.quit();
    }

}
