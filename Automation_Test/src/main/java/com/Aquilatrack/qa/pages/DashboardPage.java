package com.Aquilatrack.qa.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.MysqlConnection;
import com.Excel.Utility.TestUtil;
import com.Excel.Utility.Util_WAITS;
import com.Excel.Utility.Xls_Reader;

public class DashboardPage extends TestBase {

    private static final JavascriptExecutor JavaSCriptExecuter = null;

    public DashboardPage() {
	PageFactory.initElements(driver, this);
    }

    Xls_Reader reader = new Xls_Reader("./src/main/java/com/Aquiltrack/qa/TestData/dashboard.xlsx");

    public static String Searched_Data;

    @FindBy(xpath = "//h5[text()='Dashboard']")
    WebElement Dashboard;
    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    WebElement Dashboard_Tab;
    @FindBy(xpath = "//header/div[1]/button[4]")
    WebElement button;
    @FindBy(xpath = "//p[contains(text(),'abhinav')]")
    WebElement usernamelable;
    @FindBy(xpath = "//span[contains(text(),'AOI')]")
    WebElement AOIpage;

    @FindBy(xpath = "//h5[contains(text(),'Dashboard')]//following::h6[1]")
    WebElement Tracking;
    @FindBy(xpath = "//span[contains(text(),'RUNNING')]")
    WebElement running;
    @FindBy(xpath = "//div[contains(text(),'AT_3333333')]")
    WebElement Runvehicle;

    @FindBy(xpath = "//span[contains(text(),'IDLE')]")
    WebElement Idle;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[1]")
    WebElement vehiclepath;

    @FindBy(xpath = "//span[contains(text(),'HALT')]")
    WebElement Halt;
    @FindBy(xpath = "//div[contains(text(),'KA 02 AB1235')]")
    WebElement Haltvehicle;
    @FindBy(xpath = "//span[contains(text(),'NO GPS')]")
    WebElement NoGPS;
    @FindBy(xpath = "//div[contains(text(),'KA 02 AB1235')]")
    WebElement NoGPsvehicle;

    @FindBy(xpath = "//h6[contains(text(),'Non Tracking:')]")
    private WebElement Non_Tracking_Button;
    @FindBy(xpath = "//span[contains(text(),'OFFLINE')]")
    WebElement offline;
    @FindBy(xpath = "//div[contains(text(),'KA02Test04')]")
    WebElement offlinevehicle;
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root']")
    WebElement backbtn;
    @FindBy(xpath = "//h6[normalize-space()='40']")
    WebElement speedoflinevehicle;
    @FindBy(xpath = "//span[contains(text(),'NO DATA')]")
    WebElement NoData;
    @FindBy(xpath = "//div[contains(text(),'359633106159820')]")
    WebElement Nodatavehicle;
    @FindBy(xpath = "//span[contains(text(),'DEAD')]")
    WebElement dead;
    @FindBy(xpath = "//div[contains(text(),'testingEcu')]")
    WebElement deadvehicle;
    @FindBy(xpath = "//p[contains(text(),'Speed (km/h)')]")
    WebElement speed;

    // search field
    @FindBy(xpath = "//h5[contains(text(),'Dashboard')]//following::input[1]")
    WebElement searchbox;
    @FindBy(xpath = "//div[contains(text(),'123456')]")
    WebElement serachvehicle;
    @FindBy(xpath = "//input[@id='places-input']")
    WebElement mapsearch;
    @FindBy(xpath = "//span[contains(text(),'Current Trackinfo')]")
    WebElement currenttrackinfobtn;
    @FindBy(xpath = "//h6[contains(text(),'Current Trackinfo')]")
    WebElement currenttrackinfopage;
    @FindBy(xpath = "//button[@title='View Columns']")
    WebElement View_Columns_Icon;
    @FindBy(xpath = "//span[contains(text(),'Vehicle No')]")
    WebElement Vehicle_No_Column_Name;
    @FindBy(xpath = "//span[contains(text(),'Current Summary')]")
    WebElement currentsummary;
    @FindBy(xpath = "//h6[contains(text(),'Current Summary')]")
    WebElement currentsumpage;
    @FindBy(xpath = "//button[@aria-label='Download CSV']//span[@class='MuiIconButton-label']//*[name()='svg']")
    WebElement Downloadcsv;
    @FindBy(xpath = "//button[@title='Download CSV']")
    private WebElement Download_CSV;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    WebElement checkbox;
    @FindBy(xpath = "//span[contains(text(),'Live Alerts')]")
    WebElement alert;
    @FindBy(xpath = "//a[text()='here']")
    WebElement herelink;
    @FindBy(xpath = "//span[contains(text(),'Slide Show')]")
    WebElement slideshow;
    @FindBy(xpath = "//h5[contains(text(),'Dashboard')]//following::input[2]")
    WebElement toggle;
    @FindBy(xpath = "//button[@aria-label='Menu']")
    WebElement Menu;
    @FindBy(xpath = "//a[@class='jss513']")
    WebElement logotest;

    @FindBy(xpath = "//span[contains(text(),'Users')]")
    WebElement usertab;

    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[1]/ul[1]/a[6]")
    WebElement activity;

    @FindBy(xpath = "//span[contains(text(),'OFFLINE')]")
    WebElement offlineTab;

    @FindBy(xpath = "//input[@placeholder='Search Offline Vehicles']")
    WebElement Offline_VleSearch;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]")
    WebElement ClickVehcl;

    @FindBy(xpath = "//button[@title='Search']")
    private WebElement Search_Icon;
    @FindBy(xpath = "//input[@type='text']")
    WebElement Search_Text_Field;

    @FindBy(xpath = "//tbody/tr/td[4]")
    private WebElement Searched_Vehicle_Srl_NO;

    // ==============
    @FindBy(xpath = "//span[contains(text(),'Routes')]")
    WebElement routes;
    @FindBy(xpath = "//span[contains(text(),'Drivers')]")
    WebElement driverspage;

    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    WebElement vehiclepage;

    public void checkenable() {

	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();

    }

    public boolean trackingButton() {
	return Tracking.isEnabled();
    }

    public boolean runningButtonIsEnabled() {
	return running.isEnabled();
    }

    public boolean idleButtonIsEnabled() {
	return Idle.isDisplayed();
    }

    public boolean haltButtonIsEnabled() {
	return Halt.isEnabled();
    }

    public boolean noGpsButtonIsEnabled() {
	return NoGPS.isEnabled();
    }

    // Non TRacking vehicle

    public Object nonTrackingButton() {
	return Non_Tracking_Button.isEnabled();
    }

    public boolean offLineButtonIsEnabled() {
	return offline.isEnabled();
    }

    public boolean noDataButtonIsEnabled() {
	return NoData.isEnabled();
    }

    public boolean deadButtonIsEnabled() {
	return dead.isEnabled();
    }

    // Click on tracking
    public void trackingButton_click() {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Tracking, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, running, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Idle, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Halt, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, NoGPS, 10).click();

    }

    // non tracking

    public void nonTrackingButton_click() {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, Non_Tracking_Button, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, offline, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, NoData, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, dead, 20).click();

    }

    public void checkofflinevhcl() {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, offline, 20).click();

	Util_WAITS.waitForElementToBEClickable(driver, searchbox, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, searchbox, 20).sendKeys(Searched_Data);

	Util_WAITS.waitForElementToBEClickable(driver, vehiclepath, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, backbtn, 20).click();

	System.out.println("offline vehicle clicked");
    }

    void clickAtMenubutton() {
	Menu.click();
    }

    public int menuButton() {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 20).click();
	clickAtMenubutton();
	List<WebElement> ele = driver.findElements(By.xpath("//li[contains(text(),'Home')]"));
	return ele.size();
    }

    public void brokenLinkOnceClickedOnMenuButton() throws MalformedURLException, IOException, InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 20).click();
	Thread.sleep(2000);
	clickAtMenubutton();
	Thread.sleep(2000);

	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("size of all links " + links.size());

	List<WebElement> activelinks = new ArrayList<WebElement>();

	for (int i = 0; i < links.size(); i++) {
	    System.out.println(links.get(i).getAttribute("href"));
	    if (links.get(i).getAttribute("href") != null) {
		activelinks.add(links.get(i));

	    }

	}
	System.out.println("size of active links " + activelinks.size());
	Thread.sleep(2000);

	// htt connection api
	for (int j = 0; j < activelinks.size(); j++) {
	    HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href"))
		    .openConnection();

	    connection.connect();
	    String responce = connection.getResponseMessage();
	    connection.disconnect();
	    System.out.println(activelinks.get(j).getAttribute("href") + "----->" + responce);
	}

    }

    public String current_TrackinfoPage() {
	Dashboard_Tab.click();
	Util_WAITS.waitForElementToBEClickable(driver, currenttrackinfobtn, 20).click();

	return currenttrackinfopage.getText();
    }

    public String SearchedResuktAtCurrentTrackinfoPage()
	    throws InterruptedException, ClassNotFoundException, SQLException {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, currenttrackinfobtn, 10).click();
	Thread.sleep(1000);
	Util_WAITS.waitForElementToBEClickable(driver, Search_Icon, 20).click();

	// String Searched_Data = Searched_Data();
	Search_Text_Field.sendKeys(Searched_Data);
	System.out.println(Searched_Data());
	// --//td[contains(text(),'434343434')]
	// actions.moveToElement(driver.findElement(By.xpath("//span[text()='" + hour +
	// "']"))).click().perform();
	return driver.findElement(By.xpath("//td[contains(text(),'" + Searched_Data + "')]")).getText();
    }

    public String Searched_Data() throws ClassNotFoundException, SQLException {
	Statement stmt = MysqlConnection.setup().createStatement();

	ResultSet rs = stmt.executeQuery(
		"SELECT vehicleNumber from test_automation_test.entities where clientLoginId=3959 order by rand() limit 1");
	// Searched_Data;

	while (rs.next()) {
	    Searched_Data = rs.getString("vehiclenumber");
	    // return vehicle_no;
	}
	// System.out.println(vehicle_no);
	// System.out.println("Vehicle no" + Searched_Data);
	// MysqlConnection.close();

	return Searched_Data;
    }

    public String searchedVehicleSerialNO() {
	return Searched_Vehicle_Srl_NO.getText();
    }

    public int viewColumnAtCurrentTracknfo() throws InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, currenttrackinfobtn, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, View_Columns_Icon, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Vehicle_No_Column_Name, 10).click();

	List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'Vehicle No')]"));

	return ele.size();
    }

    public boolean downloadiconAtCurrentTracknfo() throws InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, currenttrackinfobtn, 20).click();

	return Download_CSV.isEnabled();
    }

    public String currentSummaryPage() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, currentsummary, 20).click();

	return currentsumpage.getText();
    }

    public String SearchedResuktAtCurrentSummaryPage()
	    throws InterruptedException, ClassNotFoundException, SQLException {

	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 20).click();

	Util_WAITS.waitForElementToBEClickable(driver, currentsummary, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Search_Icon, 20).click();

	String Searched_Data = Searched_Data();
	Search_Text_Field.sendKeys(Searched_Data);
	// System.out.println(Searched_Data());
	// --//td[contains(text(),'434343434')]
	// actions.moveToElement(driver.findElement(By.xpath("//span[text()='" + hour +
	// "']"))).click().perform();
	return driver.findElement(By.xpath("//td[contains(text(),'" + Searched_Data + "')]")).getText();
    }

    public Object viewColumnAtCurrentSummary() throws InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, currentsummary, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, View_Columns_Icon, 10).click();
	Util_WAITS.waitForElementToBEClickable(driver, Vehicle_No_Column_Name, 10).click();

	List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'Vehicle No')]"));
	return ele.size();
    }

    public boolean downloadiconAtCurrentSummary() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 10).click();

	Util_WAITS.waitForElementToBEClickable(driver, currentsummary, 10).click();
	Thread.sleep(1000);
	return Download_CSV.isEnabled();
    }

    public boolean checkboxmethod() throws InterruptedException {

	Util_WAITS.waitForElementToBEClickable(driver, Tracking, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, checkbox, 20).click();
	Thread.sleep(2000);

	return checkbox.isDisplayed();
    }

    public void checktoggle() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, Dashboard_Tab, 20).click();

	Util_WAITS.waitForElementToBEClickable(driver, toggle, 20).click();

    }

    public void refreshthe_page() {
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

	Instant strattime = Instant.now();
	System.out.println(strattime.toString());

	driver.navigate().refresh();

	Instant endtime = Instant.now();
	System.out.println(endtime.toString());
	Duration duration = Duration.between(strattime, endtime);
	System.out.println("Page Load Time" + duration.toMillis() + "milli seconds");

    }

    public boolean checkLivealert() throws InterruptedException {
	alert.click();
	Thread.sleep(2000);
	return alert.isEnabled();

    }

    public AOIPage1 clickonAOIbtn() {
	AOIpage.click();
	return new AOIPage1();

    }

    public UsersPage1 clickonuserpage() {
	usertab.click();
	return new UsersPage1();
    }

    public Routespage clickonroutespage() {
	routes.click();

	return new Routespage();

    }

    public Drivers clickondriverpage() {

	driverspage.click();
	return new Drivers();
    }

    @FindBy(xpath = "//span[normalize-space()='Alerts']")
    WebElement alertsbtn;
    @FindBy(xpath = "//span[normalize-space()='Configurations']")
    WebElement configbtn;

    public AletConfig clickonalertspage() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, alertsbtn, 20).click();
	Util_WAITS.waitForElementToBEClickable(driver, configbtn, 10).click();
	Thread.sleep(1000);
	return new AletConfig();
    }

    @FindBy(xpath = "//span[contains(text(),'KM Report')]")
    WebElement KM_tab;

    public KM_Report_Page clickonKM_TAB() {
	Util_WAITS.waitForElementToBEClickable(driver, KM_tab, 10).click();
	return new KM_Report_Page();
    }

    @FindBy(xpath = "//span[contains(text(),'Analytics')]")
    WebElement Analytics_Tab;

    public Analytics_Page CLickAnalytic_Tab() {
	Util_WAITS.waitForElementToBEClickable(driver, Analytics_Tab, 10).click();
	return new Analytics_Page();
    }

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    WebElement clickonaccountbtn;

    public Accountpages clickonAccount() {
	clickonaccountbtn.click();
	return new Accountpages();
    }

    @FindBy(xpath = "//span[contains(text(),'Activity')]")
    WebElement activitybtn;

    public Activitypage clickonActivity() {
	activitybtn.click();
	return new Activitypage();
    }

    public VehiclePage clickonVehicle() {
	vehiclepage.click();
	return new VehiclePage();
    }

    @FindBy(xpath = "//span[contains(text(),'Reports')]")
    WebElement reports_tab;

    public Reports_Pages clickOnReports() throws InterruptedException {
	Util_WAITS.waitForElementToBEClickable(driver, reports_tab, 10).click();
	return new Reports_Pages();
    }

    @FindBy(xpath = "//span[contains(text(),'Trips')]")
    WebElement trips_tab;

    public Trips_page clickOnTrips() {
	Util_WAITS.waitForElementToBEClickable(driver, trips_tab, 10).click();
	return new Trips_page();
    }

}
