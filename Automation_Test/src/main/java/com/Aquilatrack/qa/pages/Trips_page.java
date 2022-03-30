package com.Aquilatrack.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.MysqlConnection;
import com.Excel.Utility.Util_WAITS;

public class Trips_page extends TestBase {
    public Trips_page() {
	PageFactory.initElements(driver, this);
    }

    public static String Searched_Data;

    public String Searched_Data() throws ClassNotFoundException, SQLException {
	Statement stmt = MysqlConnection.setup().createStatement();

	ResultSet rs = stmt.executeQuery(
		"SELECT vehicleNumber from test_automation_test.entities where clientLoginId=3959 order by rand() limit 1");
	while (rs.next()) {
	    Searched_Data = rs.getString("vehiclenumber");
	}
	System.out.println("Vehicle no =  " + Searched_Data);
	return Searched_Data;
    }

    @FindBy(xpath = "//input[@id='downshift-0-input']")
    WebElement trip_vehicle;

    public void trip_vehicle_search() throws ClassNotFoundException, SQLException, AWTException, InterruptedException {
	Util_WAITS.waitForElementToBeVisible(driver, trip_vehicle, 10).sendKeys(Searched_Data());
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
    }

    @FindBy(xpath = "//div[@title='All trips']")
    WebElement All_trips;

    @FindBy(xpath = "//p[normalize-space()='Completed']")
    WebElement completed;

    @FindBy(xpath = "//p[normalize-space()='In progress']")
    WebElement In_progress;

    @FindBy(xpath = "//p[normalize-space()='Expired']")
    WebElement Expired;

    @FindBy(xpath = "//p[normalize-space()='Deleted']")
    WebElement Deleted;

    public void trip_Alerts() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, All_trips, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, completed, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, In_progress, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, Expired, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, Deleted, 10).click();
    }

    @FindBy(xpath = "//span[normalize-space()='CREATE TRIPS'] ")
    WebElement create_trip_tab;

    public void trip_create() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, create_trip_tab, 10).click();
	Thread.sleep(2000);

    }
}
