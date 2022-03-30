package com.Aquilatrack.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.Util_WAITS;

public class AlertsPage extends TestBase {

    public AlertsPage() {
	PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Alerts']")
    WebElement ALerts_Tab;

    public void alerts_Tb() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, ALerts_Tab, 20).click();
    }

    // =========Search Field=================
    @FindBy(id = "downshift-0-input")
    WebElement Alert_SearchField;

    @FindBy(xpath = "//div[@id='downshift-6-item-0']")
    WebElement click_vehicle;

    public void Alert_click_Vehicle() {
	Util_WAITS.waitForElementToBeVisible(driver, click_vehicle, 20).click();
    }

    public void Alert_search_field(String vehicles)
	    throws SQLException, ClassNotFoundException, InterruptedException, AWTException {
	Util_WAITS.waitForElementToBeVisible(driver, Alert_SearchField, 20).sendKeys(vehicles);
	Robot robo = new Robot();
	robo.delay(2000);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
    }
    /// ==============submit on Alerts=================

    @FindBy(xpath = "//span[normalize-space()='Submit']")
    WebElement clickSubmit;

    public void vehicle_submit() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, clickSubmit, 20).click();

    }

    // ========================== Download ==================
    @FindBy(xpath = "//button[@title='Download Excel']//span[1]//*[name()='svg']")
    WebElement download_btn;

    public void alert_download_Button() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, download_btn, 20).click();
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//div[@role='button']")
    WebElement alerts_dropdown;

    public void alert_dropdown() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alerts_dropdown, 20).click();
	Thread.sleep(1000);
    }

///===============hour===================================

    @FindBy(xpath = "//li[normalize-space()='Last Hour']")
    WebElement dropdown_lastHour;

    public void dropdown_lasthour() {
	Util_WAITS.waitForElementToBEClickable(driver, dropdown_lastHour, 20).click();
    }
    // ================Day================================

    @FindBy(xpath = " //li[normalize-space()='Last Day']")
    WebElement dropdown_lastDay;

    public void dropdown_lastDay() {
	Util_WAITS.waitForElementToBEClickable(driver, dropdown_lastDay, 20).click();
    }

    // ===================Week===================

    @FindBy(xpath = "//li[normalize-space()='Last Week']")
    WebElement dropdown_week;

    public void dropdown_Week() {
	Util_WAITS.waitForElementToBEClickable(driver, dropdown_week, 20).click();
    }

    // ==================Month====================

    @FindBy(xpath = "//li[normalize-space()='Last Month']")
    WebElement dropdown_month;

    public void dropdown_Month() {
	Util_WAITS.waitForElementToBEClickable(driver, dropdown_month, 20).click();
    }

    // ===============custom==================
    @FindBy(xpath = "//li[normalize-space()='Custom']")
    WebElement custom_range;
    @FindBy(xpath = "//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//input[1]")
    WebElement custom_From;
    @FindBy(xpath = "//h6[normalize-space()='2022']")
    WebElement custom_Year;
    @FindBy(xpath = "//h4[normalize-space()='Jan 23']")
    WebElement custom_Month;
    @FindBy(xpath = "")
    WebElement custom_date;

    public void Alert_Custom_Range() {
	Util_WAITS.waitForElementToBEClickable(driver, custom_range, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, custom_From, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, custom_Year, 20);
    }

//=============Alerts Types============

    @FindBy(xpath = "//p[contains(text(),'Panic')]")
    WebElement alert_panic;

    public void Alert_panic() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_panic, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, clickSubmit, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Overspeed')]")
    WebElement alert_Overspeed;

    public void Alert_Overspeed() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_Overspeed, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Towing')]")
    WebElement alert_towing;

    public void Alert_Towel() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_towing, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'No Response')]")
    WebElement alert_noresponse;

    public void Alert_NoRespose() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_noresponse, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Vehicle Battery Low')]")
    WebElement alert_vehicleBatteryLow;

    public void Alert_Vehicle_batteryLow() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_vehicleBatteryLow, 20).click();
	Thread.sleep(500);

    }

    @FindBy(xpath = "//p[contains(text(),'Device Battery Low')]")
    WebElement alert_deviceBatteryLow;

    public void Alert_Device_batteryLow() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_deviceBatteryLow, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Device Pullout')]")
    WebElement alert_devicePullout;

    public void Alert_Device_PullOut() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_devicePullout, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'AOI Geofence Breach')]")
    WebElement alert_AOI_Breach;

    public void Alert_AOI_Geofence_Breach() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_AOI_Breach, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Route fence Breach IN/OUT')]")
    WebElement alert_RouteFence_Breach;

    public void Alert_RouteFence_Breach() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_RouteFence_Breach, 20).click();
	Thread.sleep(500);

    }

    @FindBy(xpath = "//p[contains(text(),'Halt alert')]")
    WebElement alert_halt;

    public void Alert_HAlt() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_halt, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Idle Alert')]")
    WebElement alert_Idle;

    public void Alert_Idle() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_Idle, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Schedule Maintenance')]")
    WebElement alert_schedule_maintanance;

    public void Alert_Schedule_Maintanance() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_schedule_maintanance, 20).click();
	Thread.sleep(500);

    }

    @FindBy(xpath = "//p[contains(text(),'Conditional Maintenance')]")
    WebElement alert_conditinal_maintainance;

    public void Alert_Conditional_Maintance() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_conditinal_maintainance, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Refuel Alert')]")
    WebElement alert_refuel;

    public void Alert_Refuel() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_refuel, 20).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//p[contains(text(),'Pilferage Alert')]")
    WebElement alert_pilferage;

    public void Alert_Pilferage() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_pilferage, 20).click();
	Thread.sleep(500);
    }

    public void all_alerts() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alert_panic, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, clickSubmit, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_Overspeed, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_towing, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_noresponse, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_vehicleBatteryLow, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_deviceBatteryLow, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_devicePullout, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_AOI_Breach, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_RouteFence_Breach, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_halt, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_Idle, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_schedule_maintanance, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_conditinal_maintainance, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_refuel, 20).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, alert_pilferage, 20).click();
	Thread.sleep(500);
    }
}
