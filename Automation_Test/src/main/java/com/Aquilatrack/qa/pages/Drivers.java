package com.Aquilatrack.qa.pages;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.MysqlConnection;
import com.Excel.Utility.Util_WAITS;

public class Drivers extends TestBase {
    Util_WAITS utils = new Util_WAITS();

    // Xls_reader reader1 = new
    // Xls_reader("/home/shruthi/eclipse-workspace/Aquilatrack/Exceldata/drivers.xlsx");

    @FindBy(xpath = "//h5[contains(text(),'Drivers')]")
    WebElement driverbtn;

    @FindBy(xpath = "//span[normalize-space()='Add Driver']")
    WebElement ADD_Driver_button;

    @FindBy(xpath = "//input[@id='name']")
    WebElement name;

    @FindBy(xpath = "//input[@id='contactNumber']")
    WebElement contactno;

    @FindBy(xpath = "//input[@id='license']")
    WebElement license;

    @FindBy(xpath = "//input[@id='downshift-0-input']")
    WebElement assignvehicle;

    @FindBy(xpath = "//span[@class='MuiButton-label']//div[contains(te'Add')]")
    WebElement add;
    @FindBy(xpath = "//div[text()=' Add']")
    WebElement Add_button;
    @FindBy(xpath = "//span[normalize-space()='Cancel']")
    WebElement canceldriver;

    @FindBy(xpath = "//td[contains(text(),'Abhisshek')]")
    WebElement mainpage;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement cancel;

    @FindBy(xpath = "//div[contains(text(),'Save')]")
    WebElement save;

    @FindBy(xpath = "//span[contains(text(),'Download Template')]")
    WebElement downloadtemp;

    @FindBy(xpath = "(//span[@class='MuiButton-label'])[4]")
    WebElement bulk;

    @FindBy(xpath = "//span[contains(text(),'Choose File')]")
    WebElement choosefile;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submit;

    @FindBy(xpath = "//button[@aria-label='Search']")
    WebElement search;

    @FindBy(xpath = "//td[contains(text(),'Abhinav Singh(driver name)')]")
    WebElement abhinav;

    @FindBy(xpath = "//div[@id='downshift-14-item-0']")
    WebElement assignveh;

    @FindBy(xpath = "//span[normalize-space()='Cancel']")
    WebElement cancel2;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message']")
    WebElement text;

    @FindBy(xpath = "//input[@placeholder='Assign Vehicle (Type Something)']")
    WebElement Assign_vehicle;
    @FindBy(xpath = "//div[text()='Driver added successfully']")
    WebElement success_msg;

    @FindBy(xpath = "//span[text()='Edit']")
    WebElement Edit_buttotn;
    @FindBy(xpath = "//button[@title='Search']")
    WebElement search_icon;
    @FindBy(xpath = "//div[contains(text(),'Driver details edited successfully')]")
    private WebElement Driver_Edited_Successfully;
    // @FindBy(xpath="//div[@data-test-id='Search' and @aria-label='Search']")
    @FindBy(xpath = "//input[@type='text']")
    private WebElement Search_Text_Fiels;
    @FindBy(xpath = "//div[contains(text(),'Save')]")
    private WebElement Save_Button;

    @FindBy(xpath = "//div[2]/a[@role='button']")
    WebElement upload_icon;
    @FindBy(xpath = "//span[contains(text(),'Choose File')]")
    WebElement CHOOSE_FILE_button;
    @FindBy(xpath = "//input[@value='disabled']")
    WebElement overwrite;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submit_button;

    public Drivers() {
	PageFactory.initElements(driver, this);
    }

    public void driver() {
	Util_WAITS.waitForElementToBEClickable(driver, driverbtn, 10).click();
    }

    public void downloadtemplete() {
	Util_WAITS.waitForElementToBEClickable(driver, downloadtemp, 10).click();
    }

    public void bulk() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, bulk, 10).click();
    }

    public String createnewDriver() throws InterruptedException, ClassNotFoundException, SQLException {
	Util_WAITS.waitForElementToBEClickable(driver, ADD_Driver_button, 10).click();
	Thread.sleep(1000);
	String Driver_Name = "Driver_" + TestBase.generateRandomDigits(2);
	Util_WAITS.waitForElementToBeVisible(driver, name, 10).sendKeys(Driver_Name);
	Thread.sleep(1000);
	long Currrent_time = System.currentTimeMillis();
	int v1 = (int) (Currrent_time / 1000);
	String mobile_no = "8" + v1;
	Util_WAITS.waitForElementToBeVisible(driver, contactno, 10).sendKeys(mobile_no);
	Thread.sleep(1000);
	String Licence_no = "lic" + (System.currentTimeMillis());
	Util_WAITS.waitForElementToBeVisible(driver, license, 10).sendKeys(Licence_no);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Util_WAITS.waitForElementToBEClickable(driver, Add_button, 10).click();
	Thread.sleep(1000);
	String Succ_Msg = success_msg.getText();
	Statement stmt = MysqlConnection.setup().createStatement();
	stmt.executeUpdate("insert into driver (name) values('" + Driver_Name + "')");

	return Succ_Msg;
    }

    public void verify_uploading_bulk_driver() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, bulk, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, choosefile, 10).click();
	Util_WAITS.waitForElementToBeVisible(driver, choosefile, 10)
		.sendKeys("/home/shruthi/Downloads/addDriverUpload (91).xlsx");
	Util_WAITS.waitForElementToBEClickable(driver, overwrite, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, submit, 10).click();
    }

    public boolean verifyupload_icon() {
	return upload_icon.isEnabled();
    }

    public String editDriverDetails() throws ClassNotFoundException, SQLException, InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, search_icon, 10).click();
	Thread.sleep(1000);
	Statement stmt = MysqlConnection.setup().createStatement();
	ResultSet rs = stmt.executeQuery("select * from driver");
	String Driver_Name = null;
	while (rs.next()) {
	    Driver_Name = rs.getString(1);
	    break;

	}
	Util_WAITS.waitForElementToBeVisible(driver, Search_Text_Fiels, 10).sendKeys(Driver_Name);
	clickAtSerachedResult(Driver_Name);
	String Edited_Driver_Name = editFieldValue();
	String Success_Msg = Driver_Edited_Successfully.getText();

	stmt.executeUpdate("update driver set name='" + Edited_Driver_Name + "' where name='" + Driver_Name + "' ");

	return Success_Msg;
    }

    private void clickAtSerachedResult(String Driver_Name) {
	driver.findElement(By.xpath("//td[contains(text(),'" + Driver_Name + "')]")).click();
    }

    private String editFieldValue() throws InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, name, 10).clear();

	Util_WAITS.waitForElementToBeVisible(driver, name, 10).sendKeys(Keys.CONTROL + "a");
	Util_WAITS.waitForElementToBeVisible(driver, name, 10).sendKeys(Keys.CONTROL + "a");

	Thread.sleep(2000);
	String Edited_Name = "Driver_" + TestBase.generateRandomDigits(2);
	Util_WAITS.waitForElementToBeVisible(driver, name, 10).sendKeys(Edited_Name);

	Util_WAITS.waitForElementToBEClickable(driver, contactno, 10).clear();
	Util_WAITS.waitForElementToBeVisible(driver, contactno, 10).sendKeys(Keys.CONTROL + "a");
	Util_WAITS.waitForElementToBeVisible(driver, contactno, 10).sendKeys(Keys.DELETE);

	Thread.sleep(2000);
	String Edited_Mobile_No = "9" + TestBase.generateRandomDigits(9);

	Util_WAITS.waitForElementToBeVisible(driver, contactno, 10).sendKeys(Edited_Mobile_No);

	Util_WAITS.waitForElementToBEClickable(driver, license, 10).clear();

	Util_WAITS.waitForElementToBeVisible(driver, license, 10).sendKeys(Keys.CONTROL + "a");
	Util_WAITS.waitForElementToBeVisible(driver, license, 10).sendKeys(Keys.DELETE);

	Thread.sleep(2000);
	String Edited_Lic = "Lic_" + TestBase.generateRandomDigits(5);
	Util_WAITS.waitForElementToBeVisible(driver, license, 10).sendKeys(Edited_Lic);

	Util_WAITS.waitForElementToBEClickable(driver, Save_Button, 10).click();

	return Edited_Name;
    }
}
