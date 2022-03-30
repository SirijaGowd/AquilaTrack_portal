package com.Aquilatrack.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.Util_WAITS;

public class AletConfig extends TestBase {

	@FindBy(xpath = "//span[normalize-space()='Alerts']")
	WebElement alertsbtn;

	@FindBy(xpath = "//span[normalize-space()='Configurations']")
	WebElement configbtn;

	@FindBy(xpath = "//div[@id='mui-component-select-selectedAlert']")
	WebElement selectalert;

	// ====================Over Speed
	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[2]")
	WebElement overspeed;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/span[1]/*[1]")
	WebElement overspeed_disable_tick;
	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement Disablevehicles;

	@FindBy(xpath = "//input[@id='downshift-0-input']")
	WebElement Disablesearch;

	@FindBy(xpath = "(//span[@class='MuiChip-label'][normalize-space()='VEHICLE'])[1]")
	WebElement disablevehicles;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/span[1]/*[1]")
	WebElement disableconfig;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/input[1]")
	WebElement overspeed_Value;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[3]/div/div/input")
	WebElement overspeed_Email;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[4]/div/div/input")
	WebElement overspeed_Pno;
	@FindBy(xpath = "//span[normalize-space()='Enabled Vehicles']")
	WebElement enable;

	@FindBy(xpath = "//tbody//button[1]")
	WebElement enable_editbtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']//span[@class='MuiIconButton-label']//*[name()='svg']")
	WebElement editbtn1;

	@FindBy(xpath = "//tbody/tr[4]/td[5]/button[2]")
	WebElement delete;

	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']")
	WebElement enable_delete;

	@FindBy(xpath = "//input[@id='downshift-11-input']")
	WebElement enablesearch;

	// ===========================================Panic Alert

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[1]")
	WebElement alertpanic;

	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item'])[2]")
	WebElement panicsearch;

	@FindBy(xpath = "//div[normalize-space()='353549090892836']")
	WebElement vehiclecick;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement message;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement emailaddress;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[3]/div/div/input")
	WebElement phonenno;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement btn;

	@FindBy(xpath = "//div[@class='MuiSnackbarContent-message']")
	WebElement validation;

	@FindBy(xpath = "//p[normalize-space()='1-5 of 10']")

	WebElement previouspage;

	@FindBy(xpath = "//span[normalize-space()='Enabled Vehicles']")

	WebElement enablepanic;

	@FindBy(xpath = "//input[@id='downshift-1-input']")

	WebElement enablepanicsearch;

	@FindBy(xpath = "//div[@id='downshift-1-item-0']//div[@class='MuiGrid-root MuiGrid-container MuiGrid-align-items-xs-center MuiGrid-justify-xs-space-between']")

	WebElement panicvehicleclick;

	@FindBy(xpath = "//input[@id='downshift-45-input']")

	WebElement enableoverspeedsearch;

	@FindBy(xpath = "//div[@id='downshift-3-item-0']//div[@class='MuiGrid-root MuiGrid-container MuiGrid-align-items-xs-center MuiGrid-justify-xs-space-between']")

	WebElement enableoverspeedvehicle;

	@FindBy(xpath = "//input[@placeholder='Search Vehicles/Groups']")
	WebElement Search_Vehicles_Groups_enabled_side;
	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']")
	WebElement Delete_alert_for_Vehicle;

	@FindBy(xpath = "//input[@placeholder='Search Vehicle Number / Groups']")
	WebElement Search_Vehicle_Number_Groups;

	@FindBy(xpath = "//h6[text()='No vehicles have this alert enabled, Go to DISABLED VEHICLES tab to add vehicles here ']")
	WebElement no_vehicle;

	// ===========================Towing

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[3]")
	WebElement Towing;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")

	WebElement disableTowing;

	@FindBy(xpath = "//input[@id='downshift-51-input']")

	WebElement disableTowingsearch;

	@FindBy(xpath = "//input[@id='downshift-51-input']")

	WebElement vehicleTowingsearch;

	@FindBy(xpath = "(//input[@type='text'])[2]")

	WebElement towingemail;

	@FindBy(xpath = "(//input[@type='text'])[3]")

	WebElement towingphn;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")

	WebElement updatetowing;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")

	WebElement edittowing;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")

	WebElement conformeditbtn;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[2]")

	WebElement deletetowing;

	// =================================== AOI

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[9]")
	WebElement AOI1;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement disableAOI1;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]")
	WebElement aoivalue;

	@FindBy(xpath = "(//li[normalize-space()='AOI_name1561699041288']")
	WebElement aoiselect;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement aoiemail;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement aoiphn;

	@FindBy(xpath = "(//tbody/tr[1]/td[5]/button[1]")
	WebElement updateaoi;

	@FindBy(xpath = "//button[@title='Edit Values for Vehicle']")
	WebElement editaoi;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement conformeditaoi;

	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']")
	WebElement deleteaoi;

	// ============================ Route

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[10]")
	WebElement route;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement disableroute;

	@FindBy(xpath = "(//div[@role='button'])[2]")
	WebElement valueroute;

	@FindBy(xpath = "//li[normalize-space()='Route1561041552813']")
	WebElement selectroute;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement emairoute;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phnroute;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	WebElement updateroute;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	WebElement editroute;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement conformroutebtn;

	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']")
	WebElement deleteroute;

	// =======================FALL

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[4]")
	WebElement fall;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement disablefall;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement emailfall;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phnfall;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement updatefall;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement editfall;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement conformeditfall;

	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']")
	WebElement deletefall;

	// =======================No response
	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[5]")
	WebElement noresponse;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement disablenoresponse;

	@FindBy(xpath = "//input[@id='tracking']")
	WebElement tracking_CheckBox;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement emailnoresponse;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement phnnoresponse;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/button[1]/span[1]//*[name()='svg']")
	WebElement updatenoresponse;

	@FindBy(xpath = "//button[@title='Edit Values for Vehicle']")
	WebElement editnoresponse;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement conformeditnoresponse;

	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']//span[1]//*[name()='svg']")
	WebElement deletenoresponse;

	// ================================Vehicle_battreylow

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[6]")
	WebElement vehiclebattrey;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement disablevehiclebattrey;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement valuevehicle;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement emailvehiclebattrey;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement phnvehiclebattrey;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	WebElement enable_updatevehiclebattrey;

	@FindBy(xpath = "//tbody/tr[2]/td[5]/button[1]")
	WebElement editvehiclebattrey;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement conformeditvehicle;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[5]/button[2]")
	WebElement deletevehiclebattrey;

	// =============================Device_battrey low

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[7]")
	WebElement devicebattrey;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement disabledevicebattrey;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement emaildevice;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phndevice;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement updatedevicebattrey;

	@FindBy(xpath = "//tbody/tr[3]/td[4]/button[1]")
	WebElement editdevicebattrey;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement conformeditdevice;

	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']")
	WebElement deletedevicebattrey;

	// =============================device pullout

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[8]")
	WebElement devicepullout;

	@FindBy(xpath = "//span[normalize-space()='Disabled Vehicles']")
	WebElement disabledevicepullout;

	@FindBy(xpath = "(//div[@role='button'])[2]")
	WebElement valuedevicepullout;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement emaildevicepullout;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phndevicepullout;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	WebElement updatedevicepullout;

	@FindBy(xpath = "//button[@title='Edit Values for Vehicle']")
	WebElement editdevicepullout;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")
	WebElement conformeditdevicepullout;

	@FindBy(xpath = "//button[@title='Delete alert for Vehicle']")
	WebElement deletedevicepullout;

	@FindBy(xpath = "//div[@title='This is generated when a user presses Emergency button in the vehicle']")
	WebElement panic_button;

	@FindBy(xpath = "//h6[text()='Panic']")
	WebElement Panic_details_page;

	// =============================halt

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[11]")
	WebElement halt;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/input[1]")
	WebElement haltduration;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	WebElement halt_fromTime;

	@FindBy(xpath = "//span[contains(text(),'Disabled Vehicles')]")
	WebElement disablehalt;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[5]/div/div/input")
	WebElement haltemail;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[6]/div/div/input")
	WebElement haltphn;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement haltupdate;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement edithalt;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement conformhalt;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[2]")
	WebElement deletehalt;

	// ===================idle alert

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[12]")
	WebElement idle;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/input[1]")
	WebElement idle_duration;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	WebElement idle_From;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
	WebElement idle_To;

	@FindBy(xpath = "//span[contains(text(),'Disabled Vehicles')]")
	WebElement disableidle;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[5]/div/div/input")
	WebElement idleemail;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[6]/div/div/input")
	WebElement idlephn;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement idleupdate;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement editidle;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/input[1]")
	WebElement editphn;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement conformidle;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[7]/button[2]")
	WebElement deleteidle;

	// ==================================refuel alert

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[15]")
	WebElement refuel;

	@FindBy(xpath = "//span[contains(text(),'Disabled Vehicles')]")
	WebElement disablerefuel;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement refuelemail;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[3]/div/div/input")
	WebElement refuelphn;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement refuelupdate;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement editrefuel;

	@FindBy(xpath = "//button[@title='Edit Values for Vehicle']")
	WebElement reful_edit_enable;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/input[1]")
	WebElement editphn1;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[4]/button[1]/span[1]/svg/path")
	WebElement conformrefuel;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]/span[1]//*[name()='svg']")
	WebElement deleterefuel;

	// =================================pilferage alert

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[16]")
	WebElement pilferage;

	@FindBy(xpath = "//span[contains(text(),'Disabled Vehicles')]")
	WebElement disablepilferage;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement pilferageemail;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[3]/div/div/input")
	WebElement pilferagephn;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement pilferageupdate;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement editpilferage;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/input[1]")
	WebElement editphnpilferage;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement conformpilferage;

	@FindBy(xpath = "//tbody/tr[2]/td[4]/button[2]")
	WebElement deletepilferage;

	// ========================================Schedule maintaince

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[13]")
	WebElement scheduel;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]/span[1]/*[1]")
	WebElement panic_Disable_tick;

	@FindBy(xpath = "//span[contains(text(),'Disabled Vehicles')]")
	WebElement disablescheduel;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/input[1]")
	WebElement runninghours;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/input[1]")
	WebElement numberofdays;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/span[1]/span[1]/input[1]")
	WebElement recurring;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[5]/div/div/input")
	WebElement scheduelemail;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[6]/div/div/input")
	WebElement scheduelphn;

	@FindBy(xpath = "///tbody/tr[1]/td[7]/button[1]")
	WebElement scheduelupdate;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement editscheduel;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/input[1]")
	WebElement editphnscheduel;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	WebElement conformscheduel;

	@FindBy(xpath = "//tbody/tr[2]/td[7]/button[2]")
	WebElement deletescheduel;

	// ===================================Conditional Maitainance_ALert

	@FindBy(xpath = "//header/div[1]/button[1]/span[1]/*[1]")
	WebElement dashboard_menu;

	@FindBy(xpath = "//body/div[@id='menu-selectedAlert']/div[3]/ul[1]/li[14]")
	WebElement ConditionalAlert;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div[2]/td[1]/span[1]")
	WebElement engine_cool;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div[2]/td[2]/span[1]")
	WebElement engine_load;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div[2]/td[3]/span[1]")
	WebElement Intake_pressure;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/tr[1]/td[2]/div[1]/input[1]")
	WebElement Intake_min;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/tr[1]/td[3]/div[1]/input[1]")
	WebElement Intake_max;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[4]/div/div/input")
	WebElement con_email;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[5]/div/div/input")
	WebElement con_pnone;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[6]/button")
	WebElement con_update;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/button[1]")
	WebElement con_edit;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/button[2]")
	WebElement con_delete;

	public AletConfig() {
		PageFactory.initElements(driver, this);
	}

	public void scrolldown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

	}

	public void overspeed_disable() throws InterruptedException {

		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, overspeed, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Value, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Value, 10).sendKeys("50");

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Email, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Email, 20).sendKeys("shruti@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Pno, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Pno, 10).sendKeys("7337853878");

		Util_WAITS.waitForElementToBEClickable(driver, overspeed_disable_tick, 10).click();
		Thread.sleep(500);
		System.out.println("OverSpeed Alert --- " + message.getText());
		Thread.sleep(1000);
	}

	public void overspeed_enable_Edit() throws InterruptedException {
		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, overspeed, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, enable_editbtn, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Value, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Value, 10).sendKeys("50");

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Email, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, overspeed_Email, 10).sendKeys("absd@gmail.com");

		Util_WAITS.waitForElementToBEClickable(driver, overspeed_disable_tick, 10).click();

		Thread.sleep(500);
		System.out.println("OverSpeed Alert --- " + message.getText());
		Thread.sleep(1000);
	}

	public void overspeed_enable_Delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, overspeed, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enable_delete, 10).click();
		Thread.sleep(500);
		System.out.println("OverSpeed Alert --- " + message.getText());
		Thread.sleep(1000);
	}

	public void panic_disable() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, alertpanic, 10).click();

		///// =============Disable CLick

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		///// =============Disblae_ScrollCLick

		//// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		///// =============Disblae_Scroll_vehicle_CLick

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emailaddress, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emailaddress, 10).sendKeys("lucky123@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phonenno, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, phonenno, 10).sendKeys("7337853878");

		Util_WAITS.waitForElementToBEClickable(driver, panic_Disable_tick, 10).click();
		Thread.sleep(2000);
		System.out.println("Panic Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void panic_enable_Edit() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, alertpanic, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, enablepanicsearch,
		// 10).click();

		///// =============Disblae_Scroll_vehicle_CLick

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enable_editbtn, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emailaddress, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, emailaddress, 10).sendKeys("lucky@mail.in");

		Util_WAITS.waitForElementToBeVisible(driver, phonenno, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, phonenno, 10).sendKeys("7337853878");

		Util_WAITS.waitForElementToBEClickable(driver, enable_editbtn, 10).click();
		Thread.sleep(500);
		System.out.println("Panic Alert --- " + message.getText());
		Thread.sleep(1000);
	}

	public void panic_enable_Delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, alertpanic, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, enablepanicsearch,
		// 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();
		// Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, enable_delete, 10).click();
		Thread.sleep(500);
		System.out.println("Panic Alert --- " + message.getText());
		Thread.sleep(1000);
	}

	public void towing_disable() throws InterruptedException {
		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Towing, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, towingemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, towingemail, 10).sendKeys("beekle@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, towingphn, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, towingphn, 10).sendKeys("7867565456");

		Util_WAITS.waitForElementToBEClickable(driver, updatetowing, 10).click();
		Thread.sleep(500);
		System.out.println("Towing Alert --- " + message.getText());
		Thread.sleep(1000);

	}

	public void fall_enable_Delete() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, fall, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deletefall, 10).click();
		Thread.sleep(2000);
		System.out.println("Fall Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void haltAlert_Disable() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, halt, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, disablehalt, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, haltduration, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, haltduration, 10).sendKeys("50");

		Util_WAITS.waitForElementToBeVisible(driver, halt_fromTime, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, halt_fromTime, 10).sendKeys("60");

		Util_WAITS.waitForElementToBEClickable(driver, haltupdate, 10).click();

		Thread.sleep(2000);

		System.out.println("Halt Alert --- " + message.getText());
	}

	public void halt_enable_editbtn() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, halt, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, edithalt, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, haltduration, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, haltduration, 10).sendKeys("60");

		Util_WAITS.waitForElementToBeVisible(driver, halt_fromTime, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, halt_fromTime, 10).sendKeys("45");

		Util_WAITS.waitForElementToBEClickable(driver, conformhalt, 10).click();
		Thread.sleep(2000);
		System.out.println("Halt Alert --- " + message.getText());
	}

	public void halt_deletebtn() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, halt, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deletehalt, 10).click();

		Thread.sleep(2000);
		System.out.println("Halt Alert --- " + message.getText());

	}

	public void idle_disable() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, idle, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, disableidle, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, idle_duration, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idle_duration, 10).sendKeys("50");

		Util_WAITS.waitForElementToBeVisible(driver, idle_From, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idle_From, 10).sendKeys("4420");

		Util_WAITS.waitForElementToBeVisible(driver, idle_To, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idle_To, 10).sendKeys("8822");

		Util_WAITS.waitForElementToBeVisible(driver, idleemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idleemail, 10).sendKeys("shrutil@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, idlephn, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idlephn, 10).sendKeys("56783456779");

		Util_WAITS.waitForElementToBEClickable(driver, idleupdate, 10).click();

		Thread.sleep(2000);
		System.out.println("Idle Alert --- " + message.getText());

	}

	public void idle_enable_editbtn() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, idle, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, editidle, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, idle_duration, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idle_duration, 10).sendKeys("50");

		Util_WAITS.waitForElementToBeVisible(driver, idle_From, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idle_From, 10).sendKeys("4420");

		Util_WAITS.waitForElementToBeVisible(driver, idle_To, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idle_To, 10).sendKeys("0615");

		Util_WAITS.waitForElementToBeVisible(driver, idleemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idleemail, 10).sendKeys("swati467@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, idlephn, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, idlephn, 10).sendKeys("86765434567");

		Util_WAITS.waitForElementToBeVisible(driver, conformidle, 10).click();
		Thread.sleep(2000);
		System.out.println("Idle Alert --- " + message.getText());
	}

	public void idle_deletebtn() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, idle, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deleteidle, 10).click();

		Thread.sleep(2000);
		System.out.println("Idle Alert --- " + message.getText());
	}

	public void refuel_disable() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, refuel, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, disablerefuel, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, refuelemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, refuelemail, 10).sendKeys("sh2ru@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, refuelphn, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, refuelphn, 10).sendKeys("9876565453");

		Util_WAITS.waitForElementToBEClickable(driver, refuelupdate, 10).click();

		System.out.println("Refuel Alert --- " + message.getText());
		Thread.sleep(2000);
	}

	public void refuel_editbtn() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, refuel, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, reful_edit_enable, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, refuelemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, refuelemail, 10).sendKeys("sh1ru@gmail.com");

		Util_WAITS.waitForElementToBEClickable(driver, editrefuel, 10).click();
		Thread.sleep(2000);
		System.out.println("Refuel Alert --- " + message.getText());

	}

	public void refuel_delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, refuel, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deleterefuel, 10).click();
		Thread.sleep(2000);
		System.out.println("Refuel Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void pilferage_disable() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, pilferage, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, disablepilferage, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, pilferageemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, pilferageemail, 10).sendKeys("shru3@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, pilferagephn, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, pilferagephn, 10).sendKeys("56783456779");

		Util_WAITS.waitForElementToBEClickable(driver, pilferageupdate, 10).click();

		Thread.sleep(2000);
		System.out.println("Pilferage Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void pilferage_Edit() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, pilferage, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, editpilferage, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, pilferageemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, pilferageemail, 10).sendKeys("shr5u@gmail.com");

		Util_WAITS.waitForElementToBEClickable(driver, conformpilferage, 10).click();
		Thread.sleep(2000);
		System.out.println("Pilferage Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void pilferage_delete() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, pilferage, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, deletepilferage, 10).click();
		Thread.sleep(2000);
		System.out.println("Pilferage Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void schedule_Disable() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, scheduel, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, disablescheduel, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, runninghours, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, runninghours, 10).sendKeys("50");

		Util_WAITS.waitForElementToBeVisible(driver, numberofdays, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, numberofdays, 10).sendKeys("70");

		// Util_WAITS.waitForElementToBeVisible(driver, recurring, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, scheduelemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, scheduelemail, 10).sendKeys("shr4u@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, scheduelphn, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, scheduelphn, 10).sendKeys("56783456779");

		Util_WAITS.waitForElementToBEClickable(driver, conformscheduel, 10).click();
		Thread.sleep(2000);
		System.out.println("Schedule Alert --- " + message.getText());
		Thread.sleep(500);

	}

	public void schedule_enable_edit() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, scheduel, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, editscheduel, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, runninghours, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, runninghours, 10).sendKeys("40");

		Util_WAITS.waitForElementToBeVisible(driver, numberofdays, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, numberofdays, 10).sendKeys("70");

		Util_WAITS.waitForElementToBeVisible(driver, scheduelemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, scheduelemail, 10).sendKeys("sh22ru@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, scheduelphn, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, scheduelphn, 10).sendKeys("56783456779");

		Util_WAITS.waitForElementToBEClickable(driver, conformscheduel, 10).click();
		Thread.sleep(2000);
		System.out.println("Schedule Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void schedule_enable_deletebtn() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, scheduel, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deletescheduel, 10).click();
		Thread.sleep(2000);
		System.out.println("Schedule Alert --- " + message.getText());
		Thread.sleep(500);

	}

	public void towing_enable_Edit() throws InterruptedException {

		Thread.sleep(1000);
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Towing, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, edittowing, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, towingemail, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, towingemail, 10).sendKeys("lucky@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, towingphn, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, towingphn, 10).sendKeys("87654343256");

		Util_WAITS.waitForElementToBEClickable(driver, edittowing, 10).click();
		Thread.sleep(2000);
		System.out.println("Towing Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void towing_enable_Delete() throws InterruptedException {
		Thread.sleep(1000);
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Towing, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, deletetowing, 10).click();
		Thread.sleep(2000);
		System.out.println("Towing Alert --- " + message.getText());
		Thread.sleep(500);

	}

	public void fall_disable() throws InterruptedException {

		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, fall, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emailfall, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, emailfall, 10).sendKeys("abc@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phnfall, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, phnfall, 10).sendKeys("9878798789");

		Util_WAITS.waitForElementToBEClickable(driver, editfall, 10).click();
		Thread.sleep(2000);
		System.out.println("Fall Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void fall_enable_Edit() throws InterruptedException {

		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, fall, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, editfall, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emailfall, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, emailfall, 10).sendKeys("abc@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phnfall, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, phnfall, 10).sendKeys("63929748393235");

		Util_WAITS.waitForElementToBEClickable(driver, editfall, 10).click();
		Thread.sleep(2000);
		System.out.println("Fall Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void fall_enable_Edit_Delete() throws InterruptedException {

		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, fall, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deletefall, 10).click();

		Thread.sleep(2000);
		System.out.println("Fall Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void noResponse_Disable() throws InterruptedException {

		Thread.sleep(500);
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, noresponse, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		Thread.sleep(1000);
		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, tracking_CheckBox, 20).click();

		Util_WAITS.waitForElementToBeVisible(driver, emailnoresponse, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, emailnoresponse, 10).sendKeys("lucky@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phnnoresponse, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBeVisible(driver, phnnoresponse, 10).sendKeys("9786564534");

		Util_WAITS.waitForElementToBEClickable(driver, updatenoresponse, 10).click();
		Thread.sleep(2000);
		System.out.println("NoResponse Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void noResponse_Enable_Edit() throws InterruptedException {

		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, noresponse, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, editnoresponse, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emailnoresponse, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emailnoresponse, 10).sendKeys("rajekan761@ketchet.com");

		Util_WAITS.waitForElementToBeVisible(driver, phnnoresponse, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, phnnoresponse, 10).sendKeys("7565456432");

		Util_WAITS.waitForElementToBEClickable(driver, conformeditnoresponse, 10).click();
		Thread.sleep(2000);
		System.out.println("NoResponse Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void noResponse_Enable_Delete() throws InterruptedException {

		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, noresponse, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, deletenoresponse, 10).click();
		Thread.sleep(2000);
		System.out.println("NoResponse Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void VehicleBtryLow_disable() throws InterruptedException {

		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, vehiclebattrey, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, valuevehicle, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, valuevehicle, 10).sendKeys("20");

		Util_WAITS.waitForElementToBeVisible(driver, emailvehiclebattrey, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emailvehiclebattrey, 10).sendKeys("zeliot@gmmai.com");

		Util_WAITS.waitForElementToBEClickable(driver, enable_updatevehiclebattrey, 10).click();
		Thread.sleep(2000);
		System.out.println("Vehicle Battery Low Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void VehicleBtryLow_Enable_edit() throws InterruptedException {
		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, vehiclebattrey, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, enable_updatevehiclebattrey, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, valuevehicle, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, valuevehicle, 10).sendKeys("10");

		Util_WAITS.waitForElementToBeVisible(driver, emailvehiclebattrey, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emailvehiclebattrey, 10).sendKeys("zeliot@gmail.com");

		Util_WAITS.waitForElementToBEClickable(driver, enable_updatevehiclebattrey, 10).click();
		Thread.sleep(2000);
		System.out.println("Vehicle Battery Low Alert --- " + message.getText());
		Thread.sleep(500);

	}

	public void VehicleBtryLow_Enable_delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, vehiclebattrey, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, deletevehiclebattrey, 10).click();
		Thread.sleep(2000);
		System.out.println("Vehicle Battery Low Alert --- " + message.getText());
		Thread.sleep(500);

	}

	public void DeviceBtryLow_disable() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, devicebattrey, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emaildevice, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emaildevice, 10).sendKeys("aaa@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phndevice, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, phndevice, 10).sendKeys("386598160927359");

		Util_WAITS.waitForElementToBEClickable(driver, updatedevicebattrey, 10).click();
		Thread.sleep(2000);
		System.out.println("Device Battery Low Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void DeviceBtryLow_enable_edit() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, devicebattrey, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, updatedevicebattrey, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emaildevice, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emaildevice, 10).sendKeys("aswse@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phndevice, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBEClickable(driver, phndevice, 10).sendKeys("76349836983983");

		Util_WAITS.waitForElementToBEClickable(driver, conformeditdevice, 10).click();
		Thread.sleep(2000);
		System.out.println("Device Battery Low Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void DeviceBtryLow_enable_delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, devicebattrey, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deletedevicebattrey, 10).click();
		Thread.sleep(2000);
		System.out.println("Device Battery Low Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void DevicePullout_disable() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);

		Util_WAITS.waitForElementToBEClickable(driver, devicepullout, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emaildevicepullout, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emaildevicepullout, 10).sendKeys("itriangle@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phndevicepullout, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, phndevicepullout, 10).sendKeys("87654543456");

		Util_WAITS.waitForElementToBEClickable(driver, conformeditdevicepullout, 10).click();
		Thread.sleep(2000);
		System.out.println("Device_Pull_Out Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void DevicePullout_Enable_edit() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, devicepullout, 10).click();
		Thread.sleep(1000);
		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, editdevicepullout, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, emaildevicepullout, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emaildevicepullout, 10).sendKeys("itriangle@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phndevicepullout, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, phndevicepullout, 10).sendKeys("8765453423");

		Util_WAITS.waitForElementToBEClickable(driver, conformeditdevicepullout, 10).click();
		Thread.sleep(2000);
		System.out.println("Device_Pull_Out Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void DevicePullout_Enable_delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, devicepullout, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deletedevicepullout, 10).click();
		Thread.sleep(2000);
		System.out.println("Device_Pull_Out Alert --- " + message.getText());
		Thread.sleep(500);
	}

	@FindBy(xpath = "//li[normalize-space()='AOI_name1561092155998']")
	WebElement aoi_selected_value;

	public void aoi_Alert_disable() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, AOI1, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBeVisible(driver, aoivalue, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, aoi_selected_value,
		// 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, aoiemail, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBEClickable(driver, aoiemail, 10).sendKeys("abcsd@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, aoiphn, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		Util_WAITS.waitForElementToBEClickable(driver, aoiphn, 10).sendKeys("9876545434");

		Util_WAITS.waitForElementToBEClickable(driver, conformeditaoi, 10).click();
		Thread.sleep(2000);
		System.out.println("AOI Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void aoi_Alert_enable_edit() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, AOI1, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBeVisible(driver, aoivalue,
		// 10).sendKeys("AOI_name1561699041288");
		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, editaoi, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, aoiemail, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBEClickable(driver, aoiemail, 10).sendKeys("lucky@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, aoiphn, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBEClickable(driver, aoiphn, 10).sendKeys("9876546345");

		Util_WAITS.waitForElementToBEClickable(driver, conformeditaoi, 10).click();
		Thread.sleep(2000);
		System.out.println("AOI Alert --- " + message.getText());
		Thread.sleep(500);

	}

	public void aoi_Alert_enable_delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, AOI1, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deleteaoi, 10).click();
		Thread.sleep(2000);
		System.out.println("AOI Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void route_Alert_disable() throws InterruptedException {
		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, route, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBeVisible(driver, valueroute, 10).sendKeys("");

		Util_WAITS.waitForElementToBeVisible(driver, emairoute, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emairoute, 10).sendKeys("abced@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phnroute, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, phnroute, 10).sendKeys("94565434567");

		Util_WAITS.waitForElementToBEClickable(driver, updateroute, 10).click();
		Thread.sleep(2000);
		System.out.println("Route Alert --- " + message.getText());
		Thread.sleep(500);

	}

	public void route_Alert_enable_edit() throws InterruptedException {
		Thread.sleep(1000);

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, route, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, updateroute, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, valueroute, 10).sendKeys("");

		Util_WAITS.waitForElementToBeVisible(driver, emairoute, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, emairoute, 10).sendKeys("werw@gmail.com");

		Util_WAITS.waitForElementToBeVisible(driver, phnroute, 10).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, phnroute, 10).sendKeys("8765564345");
		Util_WAITS.waitForElementToBEClickable(driver, conformroutebtn, 10).click();
		Thread.sleep(2000);
		System.out.println("Route Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void route_Alert_enable_delete() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, route, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, Disablesearch, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, disablevehicles, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, deleteroute, 10).click();
		Thread.sleep(2000);
		System.out.println("Route Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void conditional_disable() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, ConditionalAlert, 10).click();

		Util_WAITS.waitForElementToBEClickable(driver, dashboard_menu, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Disablevehicles, 10).click();

		// Util_WAITS.waitForElementToBEClickable(driver, engine_cool, 10).click();
		// Util_WAITS.waitForElementToBEClickable(driver, engine_load, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, Intake_pressure, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, Intake_min, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, Intake_min, 10).sendKeys("20");

		Util_WAITS.waitForElementToBeVisible(driver, Intake_max, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, Intake_max, 10).sendKeys("40");

		Util_WAITS.waitForElementToBeVisible(driver, con_email, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, con_email, 10).sendKeys("news@mail.com");

		Util_WAITS.waitForElementToBeVisible(driver, con_pnone, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, con_pnone, 10).sendKeys("7959163879");

		Util_WAITS.waitForElementToBEClickable(driver, con_update, 10).click();
		Thread.sleep(2000);
		System.out.println("conditional Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void conditional_edit() throws InterruptedException {

		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, ConditionalAlert, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, dashboard_menu, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, enablepanic, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, con_edit, 10).click();

		Util_WAITS.waitForElementToBeVisible(driver, con_email, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, con_email, 10).sendKeys("news@mail.com");

		Util_WAITS.waitForElementToBeVisible(driver, con_pnone, 10)
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Util_WAITS.waitForElementToBeVisible(driver, con_pnone, 10).sendKeys("7959163879");

		Util_WAITS.waitForElementToBEClickable(driver, con_update, 10).click();
		Thread.sleep(2000);
		System.out.println("conditional Alert --- " + message.getText());
		Thread.sleep(500);
	}

	public void conditional_delete() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, selectalert, 10).click();
		Thread.sleep(100);
		Util_WAITS.waitForElementToBEClickable(driver, ConditionalAlert, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, dashboard_menu, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, con_delete, 10).click();
		Thread.sleep(2000);
		System.out.println("conditional Alert --- " + message.getText());
		Thread.sleep(500);
	}

}
