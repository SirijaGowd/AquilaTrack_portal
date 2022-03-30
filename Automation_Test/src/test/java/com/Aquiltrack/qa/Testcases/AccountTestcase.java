package com.Aquiltrack.qa.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.Accountpages;
import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

public class AccountTestcase extends TestBase {

    LoginPage loginpage;
    DashboardPage dashboardpge;
    Accountpages accpge;

    public AccountTestcase() {
	super();
    }

    @BeforeClass
    public void setup() throws InterruptedException {
	Intialization();
	accpge = new Accountpages();
	loginpage = new LoginPage();
	dashboardpge = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	accpge = dashboardpge.clickonAccount();
    }

    @Test(priority = 1)
    public void verifyuseraccount() throws Exception {
	accpge.verifyaccountname();
    }

    @Test(priority = 2)
    public void verifyusername() throws Exception {
	accpge.verifyusernmae();
    }

    @Test(priority = 3, enabled = false)
    public void changepwd() throws Exception {
	accpge.changepassword();
    }

    @Test(priority = 4, enabled = false)
    public void verifynoofdevices() throws Exception {
	accpge.verifydevices();
    }

    @AfterClass

    public void teardown() {

	driver.quit();
    }

    @AfterMethod
    public void navigate() {
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }
}
