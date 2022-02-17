package com.Aquilatrack.qa.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
import com.Excel.Utility.WriteExcel;
import com.Excel.Utility.Xls_Reader;

public class AOIPage1 extends TestBase {
	Xls_Reader reader = new Xls_Reader(
			"D:\\Eclipse WorkSpace\\AquilaTrack_portal\\src\\main\\java\\com\\Aquiltrack\\qa\\TestData\\AOI.xlsx");

	public AOIPage1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[contains(text(),'Area of Interest (AOI) Dashboard')]")
	WebElement aoiLable;

	@FindBy(xpath = "//span[contains(text(),'CREATE AOIs')]")
	WebElement createaoilink;

	@FindBy(xpath = "//input[@value='circle']")
	WebElement circlradiobtn;
	@FindBy(xpath = "//input[@value='places']")
	WebElement placebtn;

	@FindBy(xpath = "//input[@id='places-input']")
	WebElement AoitextField;
	@FindBy(xpath = "//input[@id='radius_in_meters']")
	WebElement radius;
	@FindBy(xpath = "//span[normalize-space()='View']")
	WebElement viewBtn;
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement savebtn;
	@FindBy(xpath = "//input[@id='input']")
	WebElement aoiname;
	@FindBy(xpath = "//input[@id='input']")
	private WebElement Save_AOI_As;
	@FindBy(xpath = "//body/div[2]/div[3]/div[2]/div[2]/button[1]")
	WebElement confirmsavebtn;
	@FindBy(xpath = "//div[contains(text(),'AOI saved!')]")
	private WebElement AOI_Success_Msg;
	@FindBy(xpath = "//div[contains(text(),'You already have area configured with this name. Try another one')]")
	WebElement textaoi;

	// create AOI using polygon and coordinates
	@FindBy(xpath = "//input[@value='polygon']")
	WebElement Polygenradiobtn;
	@FindBy(xpath = "//input[@value='coordinates']")
	WebElement coordrdaiobtn;
	@FindBy(xpath = "//input[@id='latitude']")
	WebElement Latitudebtn;
	@FindBy(xpath = "//input[@id='longitude']")
	WebElement lognitudebtn;
	@FindBy(xpath = "//input[@id='radius_in_meters']")
	WebElement radiusbtn;
	@FindBy(xpath = "//span[contains(text(),'View')]")
	WebElement viewbtn2;

	// searchAoi
	@FindBy(xpath = "//input[@placeholder='Search AOI']")
	WebElement searchaoi;
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement testaoi;

	// Delete aoi
	@FindBy(xpath = "//td[contains(text(),'test12')]")
	WebElement createdaoi;
	@FindBy(xpath = "//button[@title='Delete this Aoi']//span[@class='MuiIconButton-label']//*[name()='svg']")
	WebElement deletebtn;
	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement confirmbtn;
	@FindBy(xpath = "//span[contains(text(),'Ok')]")
	WebElement okbtn;
	@FindBy(xpath = "//h6[text()='Deleted successfully!']")
	private WebElement Deleted_Successfully;

	// Edit aoi
	@FindBy(xpath = "//tbody/tr[3]/td[1]")
	WebElement createdAOIedit;
	@FindBy(xpath = "//div[3]//button[1]")
	WebElement editbtn;
	@FindBy(xpath = "//span[contains(text(),'Circle')]")
	private WebElement Circle;
	@FindBy(xpath = "//li[contains(text(),'Polygon')]")
	private WebElement Polygon;
	@FindBy(xpath = "//input[@type='number']")
	WebElement Edit_Fence;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement Edit_AOI;
	@FindBy(xpath = "//span[contains(text(),'GO BACK')]")
	WebElement back;

	@FindBy(xpath = "//button[@title='Cancel edit']")
	WebElement canceledit;
	@FindBy(xpath = "//button[@title='Confirm edit']")
	private WebElement Confirm_Edit_Button;
	@FindBy(xpath = "//div[3]//button[1]")
	WebElement confirmedit;
	@FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[1]/button[1]")
	WebElement OKbtn;
	@FindBy(xpath = "//h6[@id='modal-title']")
	WebElement Success_msg;

	// BUlkCReation
	@FindBy(xpath = "//span[contains(text(),'BULK CREATION')]")
	WebElement bulkcreationbtn;
	@FindBy(xpath = "//span[contains(text(),'Download Template')]")
	WebElement download;
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement canclebtn;
	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	private WebElement Upload;
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	private WebElement Submit;
	@FindBy(xpath = "//div[contains(text(),'Successfully added 1 AOI(s).')]")
	private WebElement Success_Bulk_AOI;
	@FindBy(xpath = "//span[text()='AOI']")
	private WebElement AOI_Tab;

	public String getText(WebElement WebElement_Name) {
		return WebElement_Name.getText();
	}

	public boolean verifyLable() {
		return aoiLable.isDisplayed();
	}

	public void clickoncreateaoi() throws InterruptedException {
		// createaoilink.click();
		Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();

	}

	public String createAOIUsingCircleAndPlaces() throws InterruptedException, ClassNotFoundException, SQLException {
		String Searchfield = reader.getCellData("AOITEST", "Search", 2);
		System.out.println(Searchfield);
		String radiustest = reader.getCellData("AOITEST", "radiustest", 2);
		System.out.println(radiustest);

		Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();

		Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();
		// createaoilink.click();

		Util_WAITS.waitForElementToBeVisible(driver, AoitextField, 20).sendKeys(Searchfield);
		// AoitextField.sendKeys(Searchfield);

		// AoitextField.sendKeys(Keys.ENTER);
		Util_WAITS.waitForElementToBeVisible(driver, AoitextField, 20).sendKeys(Keys.ENTER);

		Util_WAITS.waitForElementToBeVisible(driver, radius, 20).sendKeys(radiustest);
		Thread.sleep(1000);
		// radius.sendKeys(radiustest);

		// viewBtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, viewBtn, 20).click();

		// savebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, savebtn, 20).click();

		// Save_AOI_As.click();
		Util_WAITS.waitForElementToBEClickable(driver, Save_AOI_As, 20).click();

		String AOI_Name = "AOI_" + TestBase.generateRandomDigits(2);
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into AOI(Name) values('" + AOI_Name + "')");
		// Save_AOI_As.sendKeys(AOI_Name);
		Util_WAITS.waitForElementToBeVisible(driver, Save_AOI_As, 20).sendKeys(AOI_Name);

		// confirmsavebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, confirmsavebtn, 20).click();

		return Util_WAITS.waitForElementToBEClickable(driver, AOI_Success_Msg, 20).getText();
		// AOI_Success_Msg.getText();
	}

	public String createAOIUsingCircleAndCoordinates()
			throws InterruptedException, ClassNotFoundException, SQLException {
		String latitude = reader.getCellData("CrclCordinates", "Latitude", 2);
		System.out.println(latitude);
		String longitude = reader.getCellData("CrclCordinates", "Longitude", 2);
		System.out.println(longitude);
		String radiustest = reader.getCellData("CrclCordinates", "radiustest", 2);
		System.out.println(radiustest);

		// Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();
		// createaoilink.click();
		Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();

		coordrdaiobtn.click();
		// Util_WAITS.waitForElementToBEClickable(driver, coordrdaiobtn, 20).click();
		// Latitudebtn.sendKeys(latitude);
		Util_WAITS.waitForElementToBeVisible(driver, Latitudebtn, 20).sendKeys(latitude);

		// lognitudebtn.sendKeys(longitude);
		Util_WAITS.waitForElementToBeVisible(driver, lognitudebtn, 20).sendKeys(longitude);

		// radiusbtn.sendKeys(radiustest);
		Util_WAITS.waitForElementToBeVisible(driver, radiusbtn, 20).sendKeys(radiustest);
		Thread.sleep(1000);
		// viewbtn2.click();
		Util_WAITS.waitForElementToBEClickable(driver, viewbtn2, 20).click();
		Thread.sleep(1000);

		// savebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, savebtn, 20).click();
		Thread.sleep(1000);

		// Save_AOI_As.click();
		Util_WAITS.waitForElementToBEClickable(driver, Save_AOI_As, 20).click();
		String AOI_Name = "AOI_" + TestBase.generateRandomDigits(2);
		// Save_AOI_As.sendKeys(AOI_Name);
		Util_WAITS.waitForElementToBeVisible(driver, Save_AOI_As, 20).sendKeys(AOI_Name);

		// confirmsavebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, confirmsavebtn, 20).click();

		// String text = textaoi.getText();
		/*
		 * if(AOI_Name.equals(text)) { Save_AOI_As.sendKeys("AOITEST123");
		 * 
		 * }else{ Save_AOI_As.sendKeys(AOI_Name); }
		 */
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into AOI values('" + AOI_Name + "')");

		return Util_WAITS.waitForElementToBEClickable(driver, AOI_Success_Msg, 20).getText();
		// AOI_Success_Msg.getText();

	}

	public String createAOIUsingPolygonAndPlaces() throws InterruptedException, ClassNotFoundException, SQLException {

		String Searchfield = reader.getCellData("AOITEST", "Search", 2);
		System.out.println(Searchfield);
		String radiustest = reader.getCellData("AOITEST", "radiustest", 2);
		System.out.println(radiustest);
		// Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();
		// Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();
		// createaoilink.click();

		Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();

		Polygenradiobtn.click();
		// Util_WAITS.waitForElementToBEClickable(driver, Polygenradiobtn, 20).click();
		// AoitextField.sendKeys(Searchfield);
		Util_WAITS.waitForElementToBeVisible(driver, AoitextField, 20).sendKeys(Searchfield);

		// AoitextField.sendKeys(Keys.ENTER);
		Util_WAITS.waitForElementToBeVisible(driver, AoitextField, 20).sendKeys(Keys.ENTER);

		// radiusbtn.sendKeys(radiustest);
		Util_WAITS.waitForElementToBeVisible(driver, radiusbtn, 20).sendKeys(radiustest);
		Thread.sleep(1000);
		// viewbtn2.click();
		Util_WAITS.waitForElementToBEClickable(driver, viewbtn2, 20).click();
		Thread.sleep(1000);

		// savebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, savebtn, 20).click();
		Thread.sleep(1000);
		// Save_AOI_As.click();
		Util_WAITS.waitForElementToBEClickable(driver, Save_AOI_As, 20).click();
		String AOI_Name = "AOI_" + TestBase.generateRandomDigits(2);
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into AOI values('" + AOI_Name + "')");
		// Save_AOI_As.sendKeys(AOI_Name);
		Util_WAITS.waitForElementToBeVisible(driver, Save_AOI_As, 20).sendKeys(AOI_Name);
		// confirmsavebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, confirmsavebtn, 20).click();

		return Util_WAITS.waitForElementToBEClickable(driver, AOI_Success_Msg, 20).getText();
		// AOI_Success_Msg.getText();

	}

	public String createAOIUsingPolygonAndCoordinates()
			throws InterruptedException, ClassNotFoundException, SQLException {
		String latitude = reader.getCellData("CrclCordinates", "Latitude", 2);
		System.out.println(latitude);
		String longitude = reader.getCellData("CrclCordinates", "Longitude", 2);
		System.out.println(longitude);
		String radiustest = reader.getCellData("CrclCordinates", "radiustest", 2);
		System.out.println(radiustest);
		// Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();
		// Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();
		// createaoilink.click();

		Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();
		Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();
		Polygenradiobtn.click();
		Thread.sleep(2000);
		// Util_WAITS.waitForElementToBEClickable(driver, Polygenradiobtn, 20).click();

		coordrdaiobtn.click();
		// Util_WAITS.waitForElementToBeVisible(driver, coordrdaiobtn, 20).click();
		// Latitudebtn.sendKeys(latitude);
		Util_WAITS.waitForElementToBeVisible(driver, Latitudebtn, 20).sendKeys(latitude);

		// lognitudebtn.sendKeys(longitude);
		Util_WAITS.waitForElementToBeVisible(driver, lognitudebtn, 20).sendKeys(longitude);

		// radiusbtn.sendKeys(radiustest);
		Util_WAITS.waitForElementToBeVisible(driver, radiusbtn, 20).sendKeys(radiustest);
		Thread.sleep(1000);
		// viewbtn2.click();
		Util_WAITS.waitForElementToBEClickable(driver, viewbtn2, 20).click();
		Thread.sleep(1000);

		// savebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, savebtn, 20).click();
		Thread.sleep(1000);
		// Save_AOI_As.click();
		Util_WAITS.waitForElementToBEClickable(driver, Save_AOI_As, 20).click();
		String AOI_Name = "AOI_" + TestBase.generateRandomDigits(2);
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into AOI values('" + AOI_Name + "')");
		// Save_AOI_As.sendKeys(AOI_Name);
		Util_WAITS.waitForElementToBeVisible(driver, Save_AOI_As, 20).sendKeys(AOI_Name);

		// confirmsavebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, confirmsavebtn, 20).click();

		return Util_WAITS.waitForElementToBEClickable(driver, AOI_Success_Msg, 20).getText();
		// AOI_Success_Msg.getText();
	}

	public void searchAOI(String AOI_Name) {

		// searchaoi.sendKeys(AOI_Name);
		Util_WAITS.waitForElementToBeVisible(driver, searchaoi, 20).sendKeys(AOI_Name);

	}

	public String clickAtSerachedAOI() throws ClassNotFoundException, SQLException {
		Statement stmt = MysqlConnection.setup().createStatement();

		ResultSet rs = stmt.executeQuery("select * from testdb.AOI");
		String AOI_Name = null;
		while (rs.next()) {
			AOI_Name = rs.getString(1);
			// return vehicle_no;
		}

		searchAOI(AOI_Name);
		driver.findElement(By.xpath("//td[contains(text(),'" + AOI_Name + "')]")).click();
		return AOI_Name;
	}

	public String editAOI() throws InterruptedException, ClassNotFoundException, SQLException {

		// back.click();
		//
		Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();
		String AOI_Name = clickAtSerachedAOI();

		// editbtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, editbtn, 20).click();

		String Edited_AOI_Name = editAOIName();

		/*
		 * Circle.click(); Polygon.click();;
		 */

		editFenceBuffer();

		// confirmedit.click();
		Util_WAITS.waitForElementToBEClickable(driver, confirmedit, 20).click();

		String Success_Msg = Success_msg.getText();
		System.out.println(Success_Msg);

		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("update AOI set Name='" + Edited_AOI_Name + "' where Name='" + AOI_Name + "' ");

		return Success_Msg;

	}

	private void editFenceBuffer() throws InterruptedException {
		// TODO Auto-generated method stub
		// Edit_Fence.sendKeys(Keys.CONTROL+"A");
		// Edit_Fence.sendKeys(Keys.DELETE);

		// Edit_Fence.clear();
		Util_WAITS.waitForElementToBeVisible(driver, Edit_Fence, 20).clear();
		// Edit_Fence.sendKeys(Keys.CONTROL + "a");
		Util_WAITS.waitForElementToBeVisible(driver, Edit_Fence, 20).sendKeys(Keys.CONTROL + "a");
		// Edit_Fence.sendKeys(Keys.DELETE);
		Util_WAITS.waitForElementToBeVisible(driver, Edit_Fence, 20).sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		// Edit_Fence.sendKeys("70");
		Util_WAITS.waitForElementToBeVisible(driver, Edit_Fence, 20).sendKeys("70");

	}

	private String editAOIName() throws InterruptedException, ClassNotFoundException, SQLException {

		// Edit_AOI.clear();
		Util_WAITS.waitForElementToBeVisible(driver, Edit_AOI, 20).clear();
		Thread.sleep(3000);
		String AOI_Name = "AOI_" + TestBase.generateRandomDigits(2);
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into AOI values('" + AOI_Name + "')");
		// Edit_AOI.sendKeys(AOI_Name);
		Util_WAITS.waitForElementToBeVisible(driver, Edit_AOI, 20).sendKeys(AOI_Name);
		return AOI_Name;
	}

	public void deleteAOI() throws InterruptedException, ClassNotFoundException, SQLException {
		String AOI_Name = clickAtSerachedAOI();

		Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();

		// deletebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, deletebtn, 20).click();

		// confirmbtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, confirmbtn, 20).click();
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("DELETE FROM testdb.AOI WHERE Name='" + AOI_Name + "'");
		// okbtn.click();
		// Util_WAITS.waitForElementToBEClickable(driver, okbtn, 20).click();
		// return Deleted_Successfully.getText();
		// Deleted_Successfully.getText();

	}

	public void bulcreationAOIDownload() throws InterruptedException {
		Util_WAITS.waitForElementToBEClickable(driver, AOI_Tab, 20).click();

		Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();
		// createaoilink.click();

		// bulkcreationbtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, bulkcreationbtn, 20).click();

		// download.click();
		Util_WAITS.waitForElementToBEClickable(driver, download, 20).click();

		// canclebtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, canclebtn, 20).click();
	}

	public String bulcreationAOIupload() throws Exception {
		Util_WAITS.waitForElementToBEClickable(driver, createaoilink, 20).click();
		// createaoilink.click();

		// bulkcreationbtn.click();
		Util_WAITS.waitForElementToBEClickable(driver, bulkcreationbtn, 20).click();

		// Upload.click();
		Util_WAITS.waitForElementToBEClickable(driver, Upload, 20).click();

		String loc = "/home/swati/Downloads/AOI Template (1).xlsx";
		String AOI_Name = "AOI_" + TestBase.generateRandomDigits(2);
		WriteExcel.setDat(loc, 0, 1, 0, AOI_Name);
		// uploadFileByRobot(path + "\\Resource\\Bulk_AOI.xlsx");
		uploadFileByRobot(loc);

		// Submit.click();
		Util_WAITS.waitForElementToBEClickable(driver, Submit, 20).click();

		return Success_Bulk_AOI.getText();
	}

	public static void uploadFileByRobot(String filepath) {
		try {
			// Setting clipboard with file location
			StringSelection stringSelection = new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}

}
