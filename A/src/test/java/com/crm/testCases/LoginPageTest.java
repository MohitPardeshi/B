package com.crm.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;
import com.crm.utill.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
	}
	/*
	@Test(priority = 1)
	public void loginPageTitleTest() {
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("LoginPage"));
	}

	@Test(priority = 2)
	public void loginIncorrectDetailsTest() {
		loginPage.login(prop.getProperty("userName1"), prop.getProperty("password"));
	}

	@Test(priority = 3)
	public void successfulLoginTest() {
		loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}

	@Test(priority = 4)
	public void homeButton() {
		loginPage.clickHome();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("HomePage"));
	}

	@Test(priority = 5)
	public void signUpButton() {
		loginPage.clickSignUp();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("SignUpPage"));

	}
	
	@Test(priority = 6)
	public void pricingButton() {
		loginPage.clickPricing();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("PricingPage"));
	}

	@Test(priority = 7)
	public void featuresButton() {
		loginPage.clickFeatures();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("FeaturesPage"));
	}

	@Test(priority = 8)
	public void customersButton() {
		loginPage.clickCustomers();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("CustomersPage"));
	}
	*/
	@Test(priority = 9)
	public void contactButton() {
		loginPage.clickContact();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("ContactPage"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
