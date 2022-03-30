package com.Aquilatrack.qa.pages;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Aquiltrack.qa.Base.TestBase;
import com.Excel.Utility.MysqlConnection;
import com.Excel.Utility.Util_WAITS;


public class Routespage extends TestBase{
	@FindBy(xpath="//span[contains(text(),'Routes')]")
	WebElement routes;

	@FindBy(xpath="//span[normalize-space()='CREATE ROUTES']")
	WebElement createroute;

	@FindBy(xpath="//input[@value='aoi']")
	WebElement aoibtn;

	@FindBy(xpath="//input[@id='buffer_in_meters']")
	WebElement buffermeter;

	@FindBy(xpath="//input[@id='downshift-0-input']")
	WebElement inputs;

	@FindBy(xpath="//span[normalize-space()='View']")
	WebElement viewbtn;

	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement savebtn;

	@FindBy(xpath="//span[normalize-space()='Clear']")
	WebElement clear;

	/*
	 * Bulk creation
	 */		

	@FindBy(xpath="//span[normalize-space()='BULK CREATION']")
	WebElement bulkcreation;

	@FindBy(xpath="//span[normalize-space()='Download Template']")
	WebElement download;

	@FindBy(xpath="//span[normalize-space()='Cancel']")
	WebElement cancel;


	
	@FindBy(xpath="//span[contains(text(),'Ok')]")
	WebElement confirlOk;
	


	@FindBy(xpath="//span[normalize-space()='GO BACK']")
	WebElement goback;

	/*
	 * edit
	 */

	@FindBy(xpath="//td[normalize-space()='balajijewllersroutes']")
	WebElement select;

	@FindBy(xpath="(//button[@title='Edit route details'])[1]")
	WebElement editbtn;


	@FindBy(xpath="//button[@title='Confirm edit']//span[@class='MuiIconButton-label']//*[name()='svg']")
	WebElement edit;

	@FindBy(xpath="//span[normalize-space()='Confirm']")
	WebElement conformedit;

	@FindBy(xpath="//span[normalize-space()='Ok']")
	WebElement okbtn1;

	/*
	 * view
	 */		
	@FindBy(xpath="//td[normalize-space()='geotestroute03']")
	WebElement select2;

	@FindBy(xpath="//button[@title='Edit route details']")
	WebElement viewedit;

	@FindBy(xpath="//button[@title='View route fence']//span[@class='MuiIconButton-label']//*[name()='svg']")
	WebElement veiwicon;

	@FindBy(xpath="//button[@title='Cancel edit']//span[@class='MuiIconButton-label']//*[name()='svg']")
	WebElement cancelview;
	@FindBy(xpath="//button[@title='Edit route details']")
	private WebElement Edit_Route_Details;
	@FindBy(xpath="//h6[text()='Edited route successfully']")
	private WebElement Edited_Successfully;
	@FindBy(xpath="//input[@type='text']")
	private WebElement Edit_Route_Name;
	@FindBy(xpath="//input[@type='number']")
	private WebElement Edit_Fence_Buffer;
	@FindBy(xpath="//button[@title='Confirm edit']")
	private WebElement Confirm_Edit_Button;
	@FindBy(xpath="//span[contains(text(),'Confirm')]")
	private WebElement Confirm_button;

	/*
	 * delete
	 */		
	@FindBy(xpath="//span[contains(text(),'GO BACK')]")
	WebElement backbtn;
	
	  @FindBy(xpath="//span[contains(text(),'Routes')]")
	    private WebElement Routes_Tab;
	  @FindBy(xpath="//h6[text()='Deleted successfully!']")
	    private WebElement Deleted_Succ_Msg;
	    @FindBy(xpath="//button[@title='Delete this route']")
	    private WebElement Delete_This_Route;
	    @FindBy(xpath="//span[contains(text(),'Confirm')]")
	    private WebElement Confirm_Button;
	@FindBy(xpath="//td[normalize-space()='routetest']")
	WebElement select3;

	@FindBy(xpath="//*[name()='path' and contains(@d,'M6 19c0 1.')]")
	WebElement deleteicon;

	@FindBy(xpath="//span[normalize-space()='Cancel']")
	WebElement cancelroute;

	@FindBy(xpath="//button[@title='Previous page']")
	WebElement backroute;


	@FindBy(xpath="//span[contains(text(),'Confirm')]")
	WebElement confrmbtn;

	@FindBy(xpath="//span[contains(text(),'Ok')]")
	WebElement okbtn;


	@FindBy(xpath="//input[@placeholder='Search Routes']")
	WebElement search1;

	@FindBy(xpath="//input[@id='downshift-0-input']")
	WebElement searchaoi;


	@FindBy(xpath="//td[normalize-space()='geotestroute03']")
	WebElement item;

	@FindBy(xpath="//td[normalize-space()='routetest']")
	WebElement selectroute;

	@FindBy(xpath="//td[normalize-space()='KA 02 AB1235']")
	WebElement vehicleno;

	@FindBy(xpath="//button[@title='Track this vehicle']")
	WebElement trackvehicle;

	@FindBy(xpath="(//button[@title='Previous page'])[1]")
	WebElement previouspage;
	@FindBy(xpath="//input[@placeholder='Search Routes']")
	WebElement Search_Routes;
	@FindBy(xpath="//input[contains(@id,'downshift')]")
	private WebElement Search_Available_AOI;
	@FindBy(xpath="//span[contains(text(),'View')]")
	private WebElement View_Button;
	@FindBy(xpath="//span[contains(text(),'Save')]")
	private WebElement Save_Button;
	@FindBy(xpath="//input[@id='input']")
	private WebElement Save_Route_As;
	@FindBy(xpath="//span[contains(text(),'SAVE')]")
	private WebElement SAVE_Last_Button;
	@FindBy(xpath="//div[contains(text(),'Route saved!')]")
	private WebElement Route_Saved;
	
	
	
	
	public Routespage() {
		PageFactory.initElements(driver, this);
	}

	public void searchroute(String Route_Name) {
		Search_Routes.sendKeys(Route_Name);
		
	}

	private  String clickAtSearchedRoute() throws SQLException, ClassNotFoundException 
	{
		Statement stmt=MysqlConnection.setup().createStatement();


		ResultSet rs=stmt.executeQuery("select * from route");  
		String  Route_Name = null;
		while(rs.next())
		{
			Route_Name=rs.getString(1);
			break;
			//return vehicle_no;
		}
		//System.out.println(vehicle_no); 
		System.out.println(Route_Name);
		searchroute(Route_Name);
		driver.findElement(By.xpath("//td[contains(text(),'"+Route_Name+"')]")).click();
		return Route_Name;
	}

	private void enterRouteFence() 
	{
		buffermeter.sendKeys("50");

	}

	private String enterAOIs() throws ClassNotFoundException, SQLException, InterruptedException 
	{
		Statement stmt=MysqlConnection.setup().createStatement();


		ResultSet rs=stmt.executeQuery("select * from AOI");  
		String AOI_Name1 = null;
		String AOI_Name2 = null;
		while(rs.next())
		{
			AOI_Name1=rs.getString(1);
			System.out.println("aoi 1:  "+AOI_Name1);
			rs.next();
			AOI_Name2=rs.getString(1);

			System.out.println("aoi 2:  "+AOI_Name2);
			break;
		}

		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(Search_Available_AOI);
		Search_Available_AOI.sendKeys(AOI_Name1 );
		Search_Available_AOI.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Search_Available_AOI.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		a.moveToElement(Search_Available_AOI);
		Thread.sleep(2000);
		Search_Available_AOI.clear();
		a.moveToElement(Search_Available_AOI);
		Thread.sleep(2000);
		Search_Available_AOI.sendKeys(AOI_Name2 );
		Thread.sleep(2000);
		Search_Available_AOI.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Search_Available_AOI.sendKeys(Keys.ENTER);
		return AOI_Name1+","+AOI_Name2;
	}

	public void createRouteUsingAOIs() throws Exception 
	{
		createroute.click();
		Thread.sleep(1000);

		enterRouteFence();
		Thread.sleep(1000);
		enterAOIs();
		Thread.sleep(2000);
		Util_WAITS.waitForElementToBEClickable(driver, View_Button, 10).click();
		//View_Button.click();
		Thread.sleep(1000);
		Util_WAITS.waitForElementToBEClickable(driver, Save_Button, 20).click();
		
		//Save_Button.click();
		
		String Route_Name="Route_"+TestBase.generateRandomDigits(2);
		Thread.sleep(2000);
		Statement stmt=MysqlConnection.setup().createStatement();
		stmt.executeUpdate("insert into route(Name) values('"+Route_Name+"')");
		Thread.sleep(2000);
		Save_Route_As.sendKeys(Route_Name);
		Thread.sleep(2000);
		SAVE_Last_Button.click();
		Thread.sleep(3000);

		//return Route_Saved.getText();
	}

	private String  editRouteName() throws ClassNotFoundException, SQLException, InterruptedException 
	{
		Edit_Route_Name.clear();
		Thread.sleep(1000);
		String Route_Name="Route_"+TestBase.generateRandomDigits(2);
		Edit_Route_Name.sendKeys(Route_Name);
		//Statement stmt=ConnectMysql.setUp().createStatement();
		return Route_Name;
	}

	private void editFenceBuffer() 
	{
		Edit_Fence_Buffer.clear();
		Edit_Fence_Buffer.sendKeys("70");

	}

	public void editRouteDetails() throws InterruptedException, ClassNotFoundException, SQLException 
	{

		Thread.sleep(1000);
		Routes_Tab.click();
		Thread.sleep(2000);
		String Route_Name=clickAtSearchedRoute();
		Thread.sleep(3000);
		Edit_Route_Details.click();
		Thread.sleep(2000);
		String Edited_Route_Name=editRouteName();
		Thread.sleep(3000);
		editFenceBuffer();
		Confirm_Edit_Button.click();
		Thread.sleep(2000);
		Confirm_button.click();
		Thread.sleep(2000);
		confirlOk.click();
		Thread.sleep(2000);
		//String Success_MSG=Edited_Successfully.getText();
		//Thread.sleep(3000);
		Statement stmt=MysqlConnection.setup().createStatement();
		stmt.executeUpdate("update route set Name='"+Edited_Route_Name+"' where Name='"+Route_Name+"' ");
		
	}
	public String deleteRoute() throws ClassNotFoundException, SQLException, InterruptedException
	{
		Thread.sleep(2000);
		Routes_Tab.click();
	     String Route_Name=clickAtSearchedRoute();
		Thread.sleep(1000);
		Delete_This_Route.click();
		Thread.sleep(2000);
		Confirm_Button.click();
		String Delete_Succ_Msg=Deleted_Succ_Msg.getText();
		Statement stmt=MysqlConnection.setup().createStatement();
		stmt.executeUpdate("Delete from route where Name='"+Route_Name+"'");
		return Delete_Succ_Msg;
	}


}
