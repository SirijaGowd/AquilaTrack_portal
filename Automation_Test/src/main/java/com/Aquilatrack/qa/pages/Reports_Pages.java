package com.Aquilatrack.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.Util_WAITS;

public class Reports_Pages extends TestBase {
	public Reports_Pages() {
		PageFactory.initElements(driver, this);
	}

	/// ==================== AOI IN/OUT ====================

	@FindBy(xpath = "//h6[contains(text(),'AOI IN/OUT Report')]")
	WebElement aoi_in_out;

	public void aoi_in_out_click() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, aoi_in_out, 10).click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//input[@id='downshift-0-input']")
	WebElement Aoi_vehicle_search;

	@FindBy(xpath = "//div[@id='mui-component-select-dateRangeType']")
	WebElement report_Aoi_dropdown;

	@FindBy(xpath = "//li[contains(text(),'Last Day')]")
	WebElement aoi_day;

	@FindBy(xpath = "//span[text()='Generate Report']/..")
	private WebElement generateReport;

	public void Reports_Day() throws InterruptedException {
		enterVehicle();
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_day, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//li[contains(text(),'Last Week')]")
	WebElement aoi_weeek;

	public void Reports_Week() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_weeek, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//li[contains(text(),'Custom Range')]")
	WebElement Custom_Rge;

	// ================== From ==================
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div[1]/div/div[3]/div/div/input")
	WebElement From_aoi;

	@FindBy(xpath = "//body[@style='overflow: hidden;']/div[@class='MuiDialog-root']/div[@class='MuiDialog-container MuiDialog-scrollPaper']/div[@class='MuiPaper-root MuiDialog-paper MuiPickersModal-dialogRoot MuiPickersModal-dialogRootWider MuiDialog-paperScrollPaper MuiDialog-paperWidthSm MuiPaper-elevation24 MuiPaper-rounded']/div[@class='MuiDialogContent-root MuiPickersModal-dialog']/div[@class='MuiPickersBasePicker-container']/div[@class='MuiPickersBasePicker-pickerView']/div/div[@class='MuiPickersCalendarHeader-switchHeader']/button[1]/span[1]/*[1]")
	WebElement From_back_arrow;

	@FindBy(xpath = "//p[contains(text(),'10')]")
	WebElement From_Date_10;

	// ======================== To ===============

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div[1]/div/div[4]/div/div/input")
	WebElement To_aoi;
	@FindBy(xpath = "//span[contains(text(),'OK')]")
	WebElement aoi_ok;

	// ===============Reset ==========

	@FindBy(xpath = "//span[contains(text(),'Reset')]")
	WebElement Reset_aoi;

	// =============BAck to all reports ===========
	@FindBy(xpath = "//span[contains(text(),'Back to All Reports')]")
	WebElement back_to_reports;

	public void Reports_Custom_Range() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		/// ==================== From ================

		Util_WAITS.waitForElementToBEClickable(driver, From_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_back_arrow, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		/// ======================= To =====================

		Util_WAITS.waitForElementToBEClickable(driver, To_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(1000);
		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
		Thread.sleep(500);
	}

//=======================COnsolidated Report
	@FindBy(xpath = "//h6[contains(text(),'Consolidated Report')]")
	WebElement consolidate_report;

	@FindBy(xpath = "//h6[contains(text(),'Current Summary Report')]")
	WebElement current_summary_report;

	public void consolidate_report_click() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, consolidate_report, 10).click();
		Thread.sleep(1000);
	}

	public void current_summary() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, current_summary_report, 10).click();
		enterVehicle();
		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);
		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
	}

	@FindBy(xpath = "//h6[contains(text(),'Day Wise Report')]")
	WebElement day_wise_report;

	public void daywise_report_click() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, day_wise_report, 10).click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement From_Date_DayWise;

	@FindBy(xpath = "//h4[@class='MuiTypography-root MuiPickersToolbarText-toolbarTxt MuiTypography-h4 MuiTypography-alignCenter']")
	WebElement Month_dayWise;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']")
	WebElement From_back_arrow_Day;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day MuiPickersDay-daySelected']//span[@class='MuiIconButton-label']")
	WebElement From_back_arrow_Date;

	public void DayWise_Custom_Range() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, From_Date_DayWise, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Month_dayWise, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, From_back_arrow_Day, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, To_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);

		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
	}

	@FindBy(xpath = "//h6[contains(text(),'Halt Report')]")
	WebElement Halt_Report;

	public void Halt_alert() {
		Util_WAITS.waitForElementToBEClickable(driver, Halt_Report, 10).click();
	}

	@FindBy(xpath = "//div[@class='MuiPickersCalendarHeader-switchHeader']//button[1]")
	WebElement from_back_considate;

	public void Consolidate_Custom_Range() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, From_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, from_back_considate, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, To_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);

		Util_WAITS.waitForElementToBEClickable(driver, Reset_aoi, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
		Thread.sleep(500);
	}

	@FindBy(xpath = "//h6[contains(text(),'Idling Report')]")
	WebElement Idle_alert;

	public void Idle_alert() {
		Util_WAITS.waitForElementToBEClickable(driver, Idle_alert, 10).click();

	}

	public void Idle_Custom_Range() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, From_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_back_arrow, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, To_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, Reset_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
		Thread.sleep(500);
	}

	@FindBy(xpath = "//h6[contains(text(),'Ignition ON/OFF Report')]")
	WebElement Ignition_tab;

	public void Ignition_click() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, Ignition_tab, 10).click();
	}

	public void Ignition_Custom_range() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, From_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_back_arrow, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, To_aoi, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);

		Util_WAITS.waitForElementToBEClickable(driver, Reset_aoi, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
		Thread.sleep(500);
	}

	@FindBy(xpath = "//h6[contains(text(),'J1939 Report')]")
	WebElement J1939_tab;

	public void J1939_Tab() {
		Util_WAITS.waitForElementToBEClickable(driver, J1939_tab, 10).click();
	}

	public void J1939_Custom_Range() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, From_aoi, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_back_arrow, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 20).click();

		Util_WAITS.waitForElementToBEClickable(driver, To_aoi, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 20).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		Util_WAITS.waitForElementToBEClickable(driver, Reset_aoi, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
		Thread.sleep(500);
	}

	@FindBy(xpath = "//h6[normalize-space()='OBD II Report']")
	WebElement OBD_tab;

	public void OBD_tab() {
		Util_WAITS.waitForElementToBEClickable(driver, OBD_tab, 10).click();
	}

	public void OBD_Custom_Range() throws InterruptedException {
		J1939_Custom_Range();
	}

	@FindBy(xpath = "//h6[normalize-space()='Overspeed Report']")
	WebElement OverSpeed_tab;

	public void OverSpeed_Tab() {
		Util_WAITS.waitForElementToBEClickable(driver, OverSpeed_tab, 10).click();
	}

	public void OverSpeed_Custom_Range() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, From_aoi, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_back_arrow, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, To_aoi, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		Util_WAITS.waitForElementToBEClickable(driver, Reset_aoi, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
		Thread.sleep(500);
	}

	@FindBy(xpath = "//h6[normalize-space()='Panic Report']")
	WebElement Panic_tab;

	public void Panic_Tab() {
		Util_WAITS.waitForElementToBEClickable(driver, Panic_tab, 10).click();
	}

	public void Panic_Custom_range() throws InterruptedException {
		J1939_Custom_Range();
	}

	@FindBy(xpath = "//h6[normalize-space()='Tracking Report']")
	WebElement Tracking_tab;

	public void Tracking_Tab() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, Tracking_tab, 10).click();
	}

	@FindBy(xpath = "//input[@placeholder='Search Vehicles or Groups']")
	WebElement enterVehicle;

	public void enterVehicle() throws InterruptedException {
		Thread.sleep(2000);
		Util_WAITS.waitForElementToBEClickable(driver, Aoi_vehicle_search, 20).click();
		Thread.sleep(2000);
		Util_WAITS.waitForElementToBEClickable(driver, enterVehicle, 10).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Util_WAITS.waitForElementToBEClickable(driver, enterVehicle, 10).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//div[@id='mui-component-select-intervalRange']")
	WebElement Tracking_timeinterval;
	@FindBy(xpath = "//li[normalize-space()='5']")
	WebElement Tracking_time_mints;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement From_tracking;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement To_tracking;

	public void Tracking_Custom_Range() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Custom_Rge, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Tracking_timeinterval, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Tracking_time_mints, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, From_tracking, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_back_arrow, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, From_Date_10, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, To_tracking, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, aoi_ok, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);
		Util_WAITS.waitForElementToBEClickable(driver, Reset_aoi, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, back_to_reports, 10).click();
		Thread.sleep(500);
	}

	@FindBy(xpath = "//h6[normalize-space()='Trip Report']")
	WebElement Trip_tab;

	public void Trip_Report_tab() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, Trip_tab, 10).click();
	}

	public void Trip_Custom_Range() throws InterruptedException {
		J1939_Custom_Range();
	}

	public void Tracking_Day() throws InterruptedException {
		enterVehicle();
		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_day, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Tracking_timeinterval, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Tracking_time_mints, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);

	}

	public void Tracking_Week() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, report_Aoi_dropdown, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, aoi_weeek, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Tracking_timeinterval, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Tracking_time_mints, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, generateReport, 10).click();
		Thread.sleep(2000);

	}
}
