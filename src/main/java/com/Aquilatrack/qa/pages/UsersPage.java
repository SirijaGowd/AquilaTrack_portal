package com.Aquilatrack.qa.pages;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.MysqlConnection;
import com.Excel.Utility.Xls_Reader;

public class UsersPage extends TestBase {
	Xls_Reader reader = new Xls_Reader(
			"C:\\Eclipse WorkSpace\\Aquilatrack_Portal\\src\\main\\java\\com\\Aquiltrack\\qa\\TestData\\Users.xlsx");

	// xpath or locators
	@FindBy(xpath = "//span[contains(text(),'Users')]")
	WebElement usertab;

	@FindBy(xpath = "//span[contains(text(),'Roles')]")
	WebElement Rolestab;

	@FindBy(xpath = "//span[normalize-space()='New Role']")
	WebElement newrole;

	// Creating a role
	@FindBy(xpath = "//input[@name='roleName']")
	WebElement Role_name;

	@FindBy(xpath = "//span[contains(text(),'Verify')]")
	WebElement Verify_button;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement SAVE_button;

	@FindBy(xpath = "//div[text()='Added new role successfully']")
	WebElement success_msg;

	// Creating a User
	@FindBy(xpath = "//span[contains(text(),'New User')]")
	WebElement userTab;

	@FindBy(xpath = "//input[@name='name']")
	WebElement name;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='contactNumber']")
	WebElement mobno;

	@FindBy(xpath = "//input[@name='address']")
	WebElement address;

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6'])[10]")
	WebElement selectrole1;

	@FindBy(xpath = "//input[@id='downshift-37-input']")
	WebElement grpname;

	@FindBy(xpath = "//div[text()='Added a new user']")
	WebElement success_msg_new_user_created;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement Save_Button;

	// search user
	@FindBy(xpath = "//input[@placeholder='Search User']")
	WebElement serachuser;

	@FindBy(xpath = "//td[3]//button[1]//span[1]")
	WebElement Edit_Icon;

	@FindBy(xpath = "//div[contains(text(),'Edited user successfully')]")
	WebElement Edited_Success_Msg;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement savebtn;

	// delete user
	@FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
	WebElement Deleteuser;

	@FindBy(xpath = "//span[normalize-space()='Delete']")
	WebElement confirmdlt;

	@FindBy(xpath = "//p[text()='Succesfully deleted user']")
	WebElement Deleted_Successfully;

	@FindBy(xpath = "//tbody/tr")
	WebElement records;

	@FindBy(xpath = "//input[@placeholder='Select Group']")
	WebElement select_group;

	@FindBy(xpath = "((//button[@type='button'])[80]")
	WebElement group;

	@FindBy(xpath = "//input[@placeholder='Select Role']")
	WebElement select_role;

	// change password
	@FindBy(xpath = "//div[contains(text(),'Edited Password successfully')]")
	WebElement Edited_Password_Successfully;
	@FindBy(xpath = "//span[text()='Password Reset']")
	WebElement Password_Reset;
	@FindBy(xpath = "//input[@name='password']")
	WebElement New_Password;
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement Confirm_Password;

	// delete user if vehicle assigned to that group
	@FindBy(xpath = "//span[contains(text(),'Vehicles')]")
	WebElement vehiclepage;

	@FindBy(xpath = "//input[@placeholder='Search Groups']")
	WebElement serach;

	@FindBy(xpath = "//span[contains(text(),'Close')]")
	WebElement closebtn;

	@FindBy(xpath = "//th[contains(text(),'test4Group')]")
	WebElement grppath;

	@FindBy(xpath = "//button[@title='Delete']")
	WebElement delete;

	@FindBy(xpath = "//button[@type='button']/span[contains(text(),'Close')]")
	WebElement close;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement savebuttton;

	@FindBy(xpath = "//span[normalize-space()='Delete']")
	WebElement deleteIcon;

	@FindBy(xpath = "//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div[@class='MuiDialogContent-root jss175']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 MuiGrid-item']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']/div[@role='combobox']/div[@class='MuiInputBase-root MuiInput-root jss184 MuiInput-underline MuiInputBase-adornedStart MuiInputBase-adornedEnd']/div[@class='MuiInputAdornment-root']/button[1]")
	WebElement crossbtn;

	// Sublogin
	@FindBy(name = "username")
	WebElement username1;

	@FindBy(name = "password")
	WebElement password1;

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	WebElement loginbtn;

	@FindBy(xpath = "//header/div[1]/button[4]")
	WebElement button;

	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	WebElement logout;

	@FindBy(xpath = "//span[contains(text(),'Agree')]")
	WebElement agree;

	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	WebElement dashboard;

	public UsersPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickonRoleTab() throws InterruptedException, ClassNotFoundException, SQLException {
		Rolestab.click();
		newrole.click();
		Thread.sleep(1000);

		String Role_Name = "Role_" + TestBase.generateRandomDigits(2);
		System.out.println(Role_Name);
		Role_name.sendKeys(Role_Name);
		Verify_button.click();
		Thread.sleep(1000);

		List<WebElement> radio_buttons_view = driver.findElements(By.xpath("//input[@value='VIEW']"));

		int size = radio_buttons_view.size();
		System.out.println("Total Number of checkboxes" + size);

		for (int i = 0; i < size; i++) {
			String value = radio_buttons_view.get(i).getAttribute("value");
			if (value.equalsIgnoreCase("VIEW")) {
				radio_buttons_view.get(i).click();
			}
		}

		Thread.sleep(1000);
		SAVE_button.click();
		Thread.sleep(1000);
		String actual_msg = success_msg.getText();
		String exapcted_masg = "Added new role successfully";
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into role (Name) values('" + Role_Name + "')");
		Assert.assertEquals(actual_msg, exapcted_masg);
	}

	public void createRole_listodModule() throws InterruptedException, ClassNotFoundException, SQLException {
		Rolestab.click();
		Thread.sleep(1000);
		newrole.click();

		String Role_Name = "Role_" + TestBase.generateRandomDigits(2);
		System.out.println(Role_Name);
		Role_name.sendKeys(Role_Name);
		Verify_button.click();
		Thread.sleep(1000);

		List<WebElement> radio_buttons_view = driver.findElements(By.xpath("//input[@value='VIEW']"));
		int yesChexkbox = radio_buttons_view.size();

		for (int i = 0; i < yesChexkbox; i++) {
			if (i < 10) {
				radio_buttons_view.get(i).click();
			}
		}

		List<WebElement> NO_radiobtn = driver
				.findElements(By.xpath("//input[@type='radio' and contains(@value,'EDIT')]"));

		int Nocheckboxes = NO_radiobtn.size();

		for (int i = Nocheckboxes - 5; i < Nocheckboxes; i++) {
			NO_radiobtn.get(i).click();
		}

		SAVE_button.click();
		Thread.sleep(1000);

		System.out.println(success_msg.getText());
		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into role (Name) values('" + Role_Name + "')");

	}

	public void createNewUser() throws InterruptedException, ClassNotFoundException, SQLException {

		userTab.click();
		String User_Name = "User_" + TestBase.generateRandomDigits(2);
		name.sendKeys(User_Name);
		email.sendKeys("Ravi@gmail.com");
		String MobNo = "987657" + TestBase.generateRandomDigits(4);
		mobno.sendKeys(MobNo);

		Calendar.getInstance();
		long Current_time = System.currentTimeMillis();
		// username.sendKeys("user" + Current_time);
		// password.sendKeys("pass" + Current_time);
		username.sendKeys(User_Name);
		password.sendKeys(User_Name);

		Statement stmt = MysqlConnection.setup().createStatement();

		ResultSet rs = stmt.executeQuery("select * from role");
		String Role_Name = null;
		while (rs.next()) {
			Role_Name = rs.getString(1);
			break;
			// return vehicle_no;
		}

		ResultSet rs1 = stmt.executeQuery("select * from VehicleGroup ");
		String Group_Name = null;
		while (rs1.next()) {
			Group_Name = rs1.getString(1);
			break;
		}
		// return vehicle_no; }

		System.out.println("Entered:: " + Role_Name);

		System.out.println("Entered:: " + Role_Name);
		enterRole(Role_Name);
		Thread.sleep(2000);
		enterGroup(Group_Name);
		Thread.sleep(1000);
		SAVE_button.click();
		Thread.sleep(1000);
		String actual_msg = success_msg_new_user_created.getText();
		// String expected_masg = "Added a new user";

		Statement stmt2 = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into user(Name) values('" + User_Name + "')");
		System.out.println(User_Name);

//		Assert.assertEquals(actual_msg, expected_masg);

	}

	public void enterRole(String Role_Name) throws InterruptedException, ClassNotFoundException, SQLException {

		select_role.sendKeys(Role_Name);
		select_role.sendKeys(Keys.ARROW_DOWN);
		select_role.sendKeys(Keys.ENTER);

	}

	public void enterGroup(String Groupname) throws InterruptedException {
		select_group.sendKeys(Groupname);

		select_group.sendKeys(Keys.ARROW_DOWN);
		select_group.sendKeys(Keys.ENTER);

	}

	public void createUserDetails(String frstname, String email11, String address1, String username1, String password1,
			String role, String group) throws InterruptedException {

		userTab.click();
		name.sendKeys(frstname);
		email.sendKeys(email11);

		String MobileNumb = "9" + TestBase.generateRandomDigits(9);
		System.out.println(MobileNumb);
		mobno.sendKeys(MobileNumb);

		address.sendKeys(address1);
		username.sendKeys(username1);
		password.sendKeys(password1);

		selectrole1.click();

		select_role.sendKeys(role);

		select_role.sendKeys(Keys.ARROW_DOWN);
		select_role.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		select_group.click();

		select_group.sendKeys(group);
		Thread.sleep(1000);
		select_group.sendKeys(Keys.ARROW_DOWN);
		select_group.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		SAVE_button.click();
		Thread.sleep(1000);
		// String actual_msg = success_msg_new_user_created.getText();
		System.out.println("success_msg_new_user_created");

	}

	private String searchUser() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Statement stmt = MysqlConnection.setup().createStatement();

		ResultSet rs = stmt.executeQuery("select * from user");
		String User_Name = null;
		while (rs.next()) {
			User_Name = rs.getString(1);
			break;
			// return vehicle_no;
		}
		// System.out.println(vehicle_no);

		serachuser.sendKeys(User_Name);

		// enterEditedValue();

		return User_Name;
	}

	public void editUserDetails() throws InterruptedException, ClassNotFoundException, SQLException {
		usertab.click();

		searchUser();
		Thread.sleep(1000);

		Edit_Icon.click();
		Thread.sleep(3000);
		clearEditUserPage();
		Thread.sleep(1000);
		savebtn.click();
		Thread.sleep(1000);

		// String Success_Msg=Edited_Success_Msg.getText();

		// return Success_Msg;
	}

	private void clearEditUserPage() throws InterruptedException {

		address.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		address.sendKeys("hyderabad");
		Thread.sleep(1000);
		email.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		email.sendKeys("abcde@gmail.com");
		Thread.sleep(1000);
		// select_group.click();
		// Thread.sleep(1000);

		// group.click();
		// group.sendKeys(Keys.chord(Keys.CONTROL,"g", Keys.DELETE));
		// select_group.clear();

	}

	public void deleteUser() throws InterruptedException, ClassNotFoundException, SQLException {
		usertab.click();
		String User_Name = searchUser();
		Deleteuser.click();
		confirmdlt.click();
		Thread.sleep(1000);

		// String Success_Msg= Deleted_Successfully.getText();
		Thread.sleep(2000);

		Statement stmt = MysqlConnection.setup().createStatement();
		stmt.executeUpdate("Delete from user where Name='" + User_Name + "'");
		// return Success_Msg;

	}

	public String changePassword() throws ClassNotFoundException, SQLException, InterruptedException {
		usertab.click();
		searchUser();
		updatePassword();
		Thread.sleep(2000);
		return Edited_Password_Successfully.getText();
	}

	private void updatePassword() throws InterruptedException {
		// TODO Auto-generated method stub
		Password_Reset.click();
		Thread.sleep(2000);
		New_Password.sendKeys("travels");
		Confirm_Password.sendKeys("travels");
		Save_Button.click();

	}

	public void delete_GroupVehicle() throws InterruptedException {
		System.out.println("================");
		String userame = reader.getCellData("DeleteUser_grp", "Search User", 2);
		System.out.println(userame);

		serachuser.click();
		serachuser.sendKeys(userame);
		Thread.sleep(2000);

		Deleteuser.click();
		Thread.sleep(2000);
		deleteIcon.click();
		Thread.sleep(2000);
		closebtn.click();
		Thread.sleep(2000);

		vehiclepage.click();
		Thread.sleep(3000);

		String group = reader.getCellData("DeleteUser_grp", "Search Groups", 2);
		System.out.println(group);

		serach.click();
		serach.sendKeys(group);
		Thread.sleep(1000);
		grppath.click();
		Thread.sleep(1000);

		delete.click();

		savebuttton.click();

		close.click();
		Thread.sleep(1000);

		usertab.click();

		serachuser.click();
		serachuser.sendKeys(userame);
		Thread.sleep(2000);

		Deleteuser.click();
		Thread.sleep(1000);

		confirmdlt.click();
		Thread.sleep(1000);
	}

	public void sublogin() throws InterruptedException {

		dashboard.click();

		button.click();
		Thread.sleep(1000);
		logout.click();
		Thread.sleep(1000);
		username1.sendKeys("AutoTest");
		password1.sendKeys("autotest123");
		Thread.sleep(1000);
		loginbtn.click();

		// agree.click();
		Thread.sleep(1000);

	}
}
