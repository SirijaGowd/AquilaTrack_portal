
package com.Aquiltrack.qa.Testcases;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Aquilatrack.qa.pages.DashboardPage;
import com.Aquilatrack.qa.pages.LoginPage;
import com.Aquilatrack.qa.pages.UsersPage;
import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.TestUtil;

@Listeners(com.Aquilatrack.Listeners.Listenerclass.class)
public class UserTest extends TestBase {
	LoginPage loginpge;
	DashboardPage dbpage;

	UsersPage users;

	String sheetName = "createuser";

	public UserTest() {
		super();
	}

	@BeforeClass
	public void setup() throws InterruptedException {
		Intialization();
		users = new UsersPage();
		loginpge = new LoginPage();
		dbpage = loginpge.login(prop.getProperty("username"), prop.getProperty("password"));
		users = dbpage.clickonuserpage();

	}

	@Test(priority = 1)
	public void CreateRole() throws InterruptedException, ClassNotFoundException, SQLException {
		users.clickonRoleTab();
	}

	@Test(priority = 2)
	public void selectedModule() throws InterruptedException, ClassNotFoundException, SQLException {
		users.createRole_listodModule();

	}

	@Test(priority = 3)
	public void createUser() throws InterruptedException, ClassNotFoundException, SQLException {
		users.createNewUser();
	}

	@Test(priority = 4)
	public void edituserdeatails() throws InterruptedException, ClassNotFoundException, SQLException {
		users.editUserDetails();
	}

	@Test(priority = 5)
	public void resetpassword() throws InterruptedException, ClassNotFoundException, SQLException {
		users.changePassword();

	}

	@Test(priority = 6)
	public void Deleteuser_assignedvehi() throws InterruptedException, ClassNotFoundException, SQLException {
		users.deleteUser();
	}

	@Test(priority = 7)
	public void checksublogin() throws InterruptedException {
		users.sublogin();
	}

	@AfterMethod(alwaysRun = true)
	public void refreshthe_page() throws InterruptedException {
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
