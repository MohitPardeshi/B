package com.crm.testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;
import com.crm.utill.TestUtil;
import com.crm.pages.*;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}

	/*
	 * 
	 * @Test(priority = 1) public void validateHomeTitleTest() { String
	 * title=homePage.getHomePageTitle(); Assert.assertEquals(title, "CRMPRO"); }
	 * 
	 * 
	 * @Test(priority = 2) public void userNameLabelDisplayedTest() {
	 * testUtil.switchWindowFrame("mainpanel");
	 * Assert.assertTrue(homePage.getUserNameLabel()); }
	 * 
	 * @Test(priority = 3) public void logoutTest() {
	 * testUtil.switchWindowFrame("mainpanel"); loginPage=homePage.logoutClick();
	 * Assert.
	 * assertEquals("Free CRM - CRM software for customer relationship management, sales, and support."
	 * ,driver.getTitle(),"This case failed due to title is not same"); }
	 * 
	 * 
	 * @Test(priority=4) public void setupButtonTest() {
	 * testUtil.switchWindowFrame("mainpanel"); homePage.setupClick();
	 * Assert.assertTrue(homePage.setupPageDisplayed()); }
	 * 
	 * @Test(priority=5) public void helpButtonTest() {
	 * testUtil.switchWindowFrame("mainpanel"); homePage.helpClick();
	 * testUtil.switchWindow();
	 * Assert.assertEquals("help.crmpro.com",driver.getTitle()
	 * ,"Incorrect tab with incorrect title is opened"); }
	 * 
	 * @Test(priority=6) public void auditTrailPage() {
	 * testUtil.switchWindowFrame("mainpanel"); homePage.auditTrailClick();
	 * Assert.assertTrue(homePage.auditTrailPageDisplayed()); }
	 */

	@Test(priority = 7)
	public void mouseOverCalendar() {
		testUtil.switchWindowFrame("mainpanel");
		homePage.mouseOver("Calendar");
	}

	@AfterMethod
	public void tearDown() {
		// driver.close();
	}

}
