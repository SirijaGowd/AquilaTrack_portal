package com.Aquilatrack.qa.pages;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.Util_WAITS;

public class Activitypage extends TestBase {

	public Activitypage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='mui-component-select-dateRangeType']")
	WebElement clickondd;

	@FindBy(xpath = "//li[normalize-space()='Last Week']")
	WebElement chooselastweek;

	@FindBy(xpath = "//li[normalize-space()='Last Month']")
	WebElement chooselastmonth;

	@FindBy(xpath = "//li[normalize-space()='Custom Range']")
	WebElement customrange;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement fromdate;

	@FindBy(xpath = "//div[@class='MuiPickersCalendarHeader-switchHeader']//button[1]")
	WebElement chooseprev;

	@FindBy(xpath = "//p[contains(text(),'13')]")
	WebElement choosefromdate;

	@FindBy(xpath = "//span[normalize-space()='OK']")
	WebElement okbtn;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement todate;

	@FindBy(xpath = "//span[normalize-space()='GENERATE']")
	WebElement generatebtn;

	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement clickonactivityrecord;

	@FindBy(xpath = "//input[@placeholder='Search Vehicle']")
	WebElement searchbox;

	@FindBy(xpath = "//div[@id='mui-component-select-dateRangeType']//following::input[2]")
	WebElement searchvehicleno;

	@FindBy(xpath = "//p[contains(text(),'Distance covered')]")
	WebElement distnccovered;

	@FindBy(xpath = "//p[contains(text(),'Running time')]")
	WebElement runingtym;
	@FindBy(xpath = "//p[contains(text(),'Idling time')]")
	WebElement Idletym;

	@FindBy(xpath = "//p[contains(text(),'Halt time')]")
	WebElement halttym;

	@FindBy(xpath = "//p[contains(text(),'Harsh accelerations')]")
	WebElement HA;

	@FindBy(xpath = "//p[contains(text(),'Harsh Braking')]")
	WebElement HB;

	@FindBy(xpath = "//p[contains(text(),'Driving Score')]")
	WebElement Drivingscore;

	@FindBy(xpath = "//span[@class='MuiFab-label']//*[name()='svg']")
	WebElement playbtn;

	public void verifyactlastday() throws Exception {
		System.out.println("Activity details in the page are ...");

		Util_WAITS.waitForElementToBEClickable(driver, clickonactivityrecord, 10).click();
		// clickonactivityrecord.click();

	}

	public void verifyactlastweek() throws Exception {
		Util_WAITS.waitForElementToBEClickable(driver, clickondd, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, chooselastweek, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, clickonactivityrecord, 10).click();

		// clickondd.click();
		// chooselastweek.click();
		// Thread.sleep(3000);
		// clickonactivityrecord.click();
		System.out.println("Last week activities are ");

	}

	public void verifyactlastmonth() throws Exception {
		Util_WAITS.waitForElementToBEClickable(driver, clickondd, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, chooselastmonth, 10).click();
		System.out.println("-------------------------- ");
		System.out.println("Last Month activities are ");
		Util_WAITS.waitForElementToBEClickable(driver, clickonactivityrecord, 10).click();

		/*
		 * clickondd.click(); chooselastmonth.click();
		 * System.out.println("-------------------------- ");
		 * System.out.println("Last Month activities are "); Thread.sleep(3000);
		 * clickonactivityrecord.click();
		 */
	}

	public void verifyactcustom() throws Exception {
		Util_WAITS.waitForElementToBEClickable(driver, clickondd, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, customrange, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, fromdate, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, choosefromdate, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, okbtn, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, todate, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, okbtn, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, generatebtn, 10).click();
		System.out.println("-------------------------- ");
		System.out.println("Custom Range activities are ");
		// Util_WAITS.waitForElementToBEClickable(driver, clickonactivityrecord,
		// 10).click();

		/*
		 * clickondd.click(); customrange.click(); fromdate.click();
		 * choosefromdate.click(); okbtn.click(); todate.click(); okbtn.click();
		 * generatebtn.click(); System.out.println("-------------------------- ");
		 * System.out.println("Custom Range activities are "); Thread.sleep(3000);
		 * clickonactivityrecord.click();
		 */

	}

	public void searchactivityforvehicle() throws Exception {
		// To get the vehicle number from excel sheet
		FileInputStream fis = new FileInputStream(
				"D:\\Eclipse WorkSpace\\AquilaTrack_portal\\src\\main\\java\\com\\Aquiltrack\\qa\\TestData\\shijitestdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheet("vehicleno");
		String vehicleno = sheet1.getRow(0).getCell(0).getStringCellValue();
		Util_WAITS.waitForElementToBEClickable(driver, clickondd, 10).click();
		Util_WAITS.waitForElementToBEClickable(driver, chooselastweek, 10).click();
		Util_WAITS.waitForElementToBeVisible(driver, searchbox, 10).sendKeys(vehicleno);
		// Util_WAITS.waitForElementToBeVisible(driver, clickonactivityrecord,
		// 10).click();

		/*
		 * clickondd.click(); chooselastweek.click(); searchbox.sendKeys(vehicleno);
		 * Thread.sleep(3000);
		 */ // clickonactivityrecord.click();

		System.out.println("-----------------------");

		System.out.println("Vehicle searched successfully,found activity for vehicle" + vehicleno);
	}

	public void printactivitydetails() throws Exception {

		FileInputStream fis = new FileInputStream(
				"D:\\Eclipse WorkSpace\\AquilaTrack_portal\\src\\main\\java\\com\\Aquiltrack\\qa\\TestData\\activity.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet2 = wb.getSheet("printactivitydetails");

		int rowcount1 = sheet2.getLastRowNum();
		int colcount1 = sheet2.getRow(0).getLastCellNum();
		System.out.println("Events captured during activity");
		for (int i = 0; i <= rowcount1; i++) {
			XSSFRow curntrow = sheet2.getRow(i);
			for (int j = 0; j < colcount1; j++) {
				String data1 = curntrow.getCell(j).toString();

				System.out.println(data1);

			}

		}
	}
}
