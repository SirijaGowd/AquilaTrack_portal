package com.Aquilatrack.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.Util_WAITS;

public class Analytics_Page extends TestBase {
    public Analytics_Page() {
	PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Analytics')]")
    WebElement Analytics_Tab;

    public void CLickAnalytic_Tab() throws InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, Analytics_Tab, 10).click();
	Thread.sleep(500);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[3]/button")
    WebElement download;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[1]/div")
    WebElement Fleet_Distance;

    @FindBy(xpath = "//h5[contains(text(),'Fleet Analytics & Usage')]")
    WebElement Fleet_Analytics_dropdown;

    public void analytics_dropdown() {
	Util_WAITS.waitForElementToBEClickable(driver, Fleet_Analytics_dropdown, 10).click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[6]/div/div/div[2]/div/div[2]/div[1]/input")
    WebElement Fleet_Utlization_vehicle;

    public void fleet_utilization_vehicle() throws InterruptedException {
	Util_WAITS.waitForElementToBeVisible(driver, Fleet_Utlization_vehicle, 10).sendKeys("Ka dsgfu");
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[10]/div/div/div[2]/div/div[2]/div[1]/input")
    WebElement Idle_Vehicle;

    public void Idle_vehicle() throws InterruptedException {
	Util_WAITS.waitForElementToBeVisible(driver, Idle_Vehicle, 10).sendKeys("suygfbyhj");
	Thread.sleep(2000);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[11]/div/div/div[2]/div/div[2]/div[1]/input")
    WebElement Halt_Vehicle;

    public void halt_vehicle() throws InterruptedException {
	Util_WAITS.waitForElementToBeVisible(driver, Halt_Vehicle, 10).sendKeys("shgdb");
	Thread.sleep(2000);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[7]/div/div/div[2]/div/div[2]/div[1]/input")
    WebElement No_Gps_Vehicle;

    public void no_gps_vehicle() throws InterruptedException {
	Util_WAITS.waitForElementToBeVisible(driver, No_Gps_Vehicle, 10).sendKeys("dgjbkjv");
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[8]/div/div/div[2]/div/div[2]/div[1]/input")
    WebElement Offline_vehicle;

    public void Offline_Vehicle() throws InterruptedException {
	Util_WAITS.waitForElementToBeVisible(driver, Offline_vehicle, 10).sendKeys("sdgvhjb");
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[9]/div/div/div[2]/div/div[2]/div[1]/input")
    WebElement Running_Vehicle;

    public void running_vehicle() throws InterruptedException {
	Util_WAITS.waitForElementToBeVisible(driver, Running_Vehicle, 10).sendKeys("jdhbuj");
	Thread.sleep(1000);
    }

    public void fleet_distance() {
	Util_WAITS.waitForElementToBEClickable(driver, Fleet_Distance, 10).getText();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[4]/div/div/div[3]/div[2]/div")
    WebElement Running_Time;

    public void running_time() {
	Util_WAITS.waitForElementToBEClickable(driver, Running_Time, 10).getText();
    }
    // ===================================== Last Day

    @FindBy(xpath = "//span[contains(text(),'Last Day')]")
    WebElement LastDay;

    public void lastday() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, LastDay, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, download, 10).click();

    }

    // ==================================== Last Week

    @FindBy(xpath = "//span[contains(text(),'Last Week')]")
    WebElement LastWeek;

    public void lastweek() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, LastWeek, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, download, 10).click();
	Thread.sleep(5000);
    }

    // =============================== Last Month

    @FindBy(xpath = "//span[contains(text(),'Last Month')]")
    WebElement lastMonth;

    public void lastMonth() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, lastMonth, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, download, 10).click();
	Thread.sleep(5000);
    }

    // ======================================= All Time

    @FindBy(xpath = "//span[contains(text(),'All Time')]")
    WebElement AllTime;

    public void All_time() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, AllTime, 10).click();
	Thread.sleep(500);
	Util_WAITS.waitForElementToBEClickable(driver, download, 10).click();
	Thread.sleep(5000);

    }
}
