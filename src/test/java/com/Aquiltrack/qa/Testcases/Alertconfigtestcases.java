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
	public void Panic_Alert() throws InterruptedException {
		alertpage.panic_disable();
		alertpage.panic_enable_Edit();
		alertpage.panic_enable_Delete();
	}

	// --------------------------------------------------- OverSpeed_Alert

	@Test(priority = 2)
	public void OverSpeed_Alert() throws InterruptedException {
		alertpage.overspeed_disable();
		alertpage.overspeed_enable_Edit();
		alertpage.overspeed_enable_Delete();
	}

	// --------------------------------------------------- TOWING_Alert

	@Test(priority = 3)
	public void Towing_ALert() throws InterruptedException {
		alertpage.towing_disable();
		alertpage.towing_enable_Edit();
		alertpage.towing_enable_Delete();
	}

	// --------------------------------------------------- FALL_Alert
	@Test(priority = 4)
	public void Fall_ALert() throws InterruptedException {
		alertpage.fall_disable();
		alertpage.fall_enable_Edit();
		alertpage.fall_enable_Delete();
	}

	// --------------------------------------------------- No Response_Alert
	/*
	 * {
	 * 
	 * @Test(priority = 5) public void NoResponse_ALert() throws
	 * InterruptedException { alertpage.noResponse_Disable();
	 * alertpage.noResponse_Enable_Edit(); alertpage.noResponse_Enable_Delete(); }
	 * 
	 * }
	 */

	// --------------------------------------------------- Vehicle Battery Low_Alert

	@Test(priority = 6)
	public void VehicleBtryLow() throws InterruptedException {
		alertpage.VehicleBtryLow_disable();
		alertpage.VehicleBtryLow_Enable_edit();
		//alertpage.VehicleBtryLow_Enable_delete();
	}

	// --------------------------------------------------- Device Battery Low_Alert

	@Test(priority = 7)
	public void DeviceBtryLow() throws InterruptedException {
		alertpage.DeviceBtryLow_disable();
		alertpage.DeviceBtryLow_enable_edit();
		alertpage.DeviceBtryLow_enable_delete();
	}

	// --------------------------------------------------- Device PullOut _Alert

	@Test(priority = 8)
	public void DevicePullout() throws InterruptedException {
		// alertpage.DevicePullout_disable();
		alertpage.DevicePullout_Enable_edit();
		// alertpage.DevicePullout_Enable_delete();
	}

	// --------------------------------------------------- AOI_Alert

	@Test(priority = 9)
	public void AOI_Alert() throws InterruptedException {
		alertpage.aoi_Alert_disable();
		alertpage.aoi_Alert_enable_edit();
		alertpage.aoi_Alert_enable_delete();
	}

	// --------------------------------------------------- Route_Alert

	@Test(priority = 10)
	public void Route_Alert() throws InterruptedException {
		alertpage.route_Alert_disable();
		alertpage.route_Alert_enable_edit();
		alertpage.route_Alert_enable_delete();
	}

	// --------------------------------------------------- Halt_Alert

	@Test(priority = 11)
	public void Halt_Alert() throws InterruptedException {
		alertpage.haltAlert_Disable();
		alertpage.halt_enable_editbtn();
		alertpage.halt_deletebtn();
	}

	// --------------------------------------------------- Idle_Alert

	@Test(priority = 12)
	public void Idle_ALert() throws InterruptedException {
		alertpage.idle_disable();
		alertpage.idle_enable_editbtn();
		alertpage.idle_deletebtn();
		Thread.sleep(2000);
	}

	// --------------------------------------------Schedule_Maintenance_Alert

	@Test(priority = 13)
	public void Schedule_Disable() throws InterruptedException {
		alertpage.schedule_Disable();
		alertpage.schedule_enable_edit();
		alertpage.schedule_enable_deletebtn();
	}

	// --------------------------------------------Refuel_Alert

	@Test(priority = 14)
	public void Refuel_Disable() throws InterruptedException {
		alertpage.refuel_disable();
		alertpage.refuel_editbtn();
		alertpage.refuel_delete();
	}

//------------------------------------Conditional_ALert
	@Test(priority = 15)
	public void Conditional_Disable() throws InterruptedException {
		alertpage.conditional_disable();
		alertpage.conditional_edit();
		alertpage.conditional_delete();
	}

//------------------------------------------Pilferage_Alert
	@Test(priority = 16)
	public void Pilferage_Disable() throws InterruptedException {
		alertpage.pilferage_disable();
		alertpage.pilferage_Edit();
		alertpage.pilferage_delete();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
