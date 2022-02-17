package com.Aquilatrack.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;


public class LoginPage extends TestBase{
	
//WebElements or Object repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'LOGIN')]")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public DashboardPage login(String un,String pw) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		Thread.sleep(3000);
		
		return new DashboardPage();
	}


}
