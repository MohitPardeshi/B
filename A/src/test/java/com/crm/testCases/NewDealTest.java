package com.crm.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.NewDealPage;
import com.crm.utill.TestUtil;

public class NewDealTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	NewDealPage newDealPage;
	TestUtil testUtil;
	
	public NewDealTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeTest
	public void setUp()
	{
		initialization();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
		testUtil= new TestUtil();
		testUtil.switchWindowFrame("mainpanel");
		homePage.mouseOver("Deals");
		newDealPage=homePage.newDealClick();
		
	}
	
	
	@Test
	public void addNewDeal()
	{
		System.out.println(newDealPage.getPageTitle().getText());
		newDealPage.gettitleTextBox().sendKeys(null);
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
}
