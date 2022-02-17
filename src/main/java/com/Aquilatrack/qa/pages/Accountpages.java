package com.Aquilatrack.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.Util_WAITS;


public class Accountpages extends TestBase {
	public Accountpages() {
		PageFactory.initElements(driver, this);
	}
	
	//click on account button
	
	
	
@FindBy(xpath="//span[contains(text(),'Change Password')]//following::h2[1]")
WebElement verifyacname;

@FindBy(xpath="//span[contains(text(),'Change Password')]//following::input[1]")
WebElement verfyusname;

@FindBy(xpath="//span[contains(text(),'Change Password')]")
WebElement changepwd;

@FindBy(xpath="//input[@id='Old Password']")
WebElement oldpwd;

@FindBy(xpath="//label[@id='New Password-label']")
WebElement newpwd;

@FindBy(xpath="//label[@id='Confirm Password-label']")
WebElement cnfrmpwd;

@FindBy(xpath="//span[contains(text(),'Cancel')]")
WebElement cancel;

@FindBy(xpath="//span[contains(text(),'Cancel')]//following::button[1]")
WebElement changebtn;

@FindBy(xpath="//h5[contains(text(),'50')]")
WebElement totaldevices;

@FindBy(xpath="//h5[contains(text(),'48')]")
WebElement regstrddevices;

@FindBy(xpath="//h5[contains(text(),'2')]")
WebElement unregdevices;

@FindBy(xpath="//p[contains(text(),'SMS Balance')]//following::h5[1]")
WebElement smsbalance;

@FindBy(xpath="//span[contains(text(),'Change Password')]//following::span[8]")
WebElement smshistory;

@FindBy(xpath="//span[contains(text(),'Account')]")
WebElement clickonaccountbtn;

public boolean verifyaccountname()
{
	return verifyacname.isDisplayed();
}
public boolean verifyusernmae()
{
	return verfyusname.isDisplayed();
}
public void changepassword()
{
	Util_WAITS.waitForElementToBEClickable(driver, changepwd, 10).click();
	Util_WAITS.waitForElementToBeVisible(driver, oldpwd, 10).sendKeys("travels");
	Util_WAITS.waitForElementToBeVisible(driver, newpwd, 10).sendKeys("travels1");
	Util_WAITS.waitForElementToBeVisible(driver, cnfrmpwd, 10).sendKeys("travels1");
	Util_WAITS.waitForElementToBEClickable(driver, changebtn, 10).click();

		/*
		 * changepwd.click(); oldpwd.sendKeys("travels"); newpwd.sendKeys("travels1");
		 * cnfrmpwd.sendKeys("travels1"); changebtn.click();
		 */	
}
public void verifydevices()
{
	System.out.println("Total no devices is "+ totaldevices.getText());
    System.out.println("Total no of registered devices is "+regstrddevices.getText());
    System.out.println("Total no of unregistered devices is"+unregdevices.getText());
}


}
