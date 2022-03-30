package com.Aquilatrack.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.Util_WAITS;

public class KM_Report_Page extends TestBase {
    public KM_Report_Page() {
	PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'DAILY')]")
    WebElement km_dropdown;

    public void kl_Dropdown() {
	Util_WAITS.waitForElementToBEClickable(driver, km_dropdown, 10).click();
    }

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]")
    WebElement Daily;

    public void clickDaily() {
	Util_WAITS.waitForElementToBEClickable(driver, km_dropdown, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Daily, 10).click();
    }

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[2]")
    WebElement Month;

    public void clickMonth() {
	Util_WAITS.waitForElementToBEClickable(driver, km_dropdown, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Month, 10).click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div/div[3]/div[2]/div/div/input")
    WebElement From;

    public void From() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, From, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, OK, 10).click();
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//span[contains(text(),'OK')]")
    WebElement OK;

    public void From_Ok() {
	Util_WAITS.waitForElementToBEClickable(driver, OK, 10).click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div/div[3]/div[3]/div/div/input")
    WebElement To;

    public void km_To() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, To, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, OK, 10).click();
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//span[contains(text(),'Get Report')]")
    WebElement get_report;

    public void Get_Report() {
	Util_WAITS.waitForElementToBEClickable(driver, get_report, 10).click();
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/*[1]")
    WebElement Km_search;

    public void KM_Search() throws AWTException {

	Robot robo = new Robot();
	robo.setAutoDelay(100);

	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);

	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	robo.setAutoDelay(100);

//	StringSelection strSelect = new StringSelection("Test_03_May_2021");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelect, null);
//	robo.keyPress(KeyEvent.VK_ENTER);
//	robo.keyRelease(KeyEvent.VK_ENTER);

	// Util_WAITS.waitForElementToBEClickable(driver, Km_search,
	// 10).sendKeys("sgdvhj");
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div/div[4]/div/div/div[1]/div[2]/button[2]")
    WebElement KM_download;

    public void KM_Download() throws InterruptedException, AWTException {

	Util_WAITS.waitForElementToBEClickable(driver, KM_download, 10).click();
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div/div[4]/div/div/div[1]/div[2]/span[2]/button")
    WebElement View_column;

    public void km_view_column() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, View_column, 10).click();
	Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div/div[4]/div/div/div[1]/div[2]/span[3]/button")
    WebElement filter;

    public void KM_filter() throws InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, filter, 10).click();
	Thread.sleep(1000);
    }
}
