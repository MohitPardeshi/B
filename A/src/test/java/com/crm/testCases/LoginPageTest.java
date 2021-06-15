package com.crm.testCases;

import java.lang.reflect.Method;

import org.apache.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;
import com.crm.utill.TestUtil;

@Listeners(com.crm.TestNGListener.TestNGListener.class)

public class LoginPageTest extends TestBase {

public static Logger log=LogManager.getLogger(LoginPageTest.class.getName());	
	LoginPage loginPage;
	TestUtil testUtil;
	String excelSheetPath;
	String sheetName;

	public LoginPageTest() {
		
		
		super();
		log.info("### "+this.getClass().getName()+" CONSTRUCTOR ###");
		testUtil = new TestUtil();
		excelSheetPath = prop.getProperty("excelSheetPath");
		sheetName = prop.getProperty("sheetName");
	}

	@BeforeMethod
	public void setUp(Method method) {
		log.info("### BEFORE METHOD OF "+method.getName()+" ###");
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1, enabled=true)
	public void loginPageTitleTest() {
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("LoginPage"));
	}

	@DataProvider(name = "getData")
	public Object[][] getData() {
		Object[][] data = testUtil.getData(excelSheetPath, sheetName);
		return data;
	}

	@Test(priority = 2, dataProvider = "getData", enabled=false)
	public void loginIncorrectDetailsTest(String userName, String password) {

		loginPage.login(userName, password);
		// loginPage.login(prop.getProperty("userName1"), prop.getProperty("password"));
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.get("HomePage"));
	}

	@Test(priority = 3, enabled=true)
	public void successfulLoginTest() {
		loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}

	@Test(priority = 4, enabled=false)
	public void homeButton() {
		loginPage.clickHome();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("HomePage"));
	}

	@Test(priority = 5, enabled=false)
	public void signUpButton() {
		loginPage.clickSignUp();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("SignUpPage"));

	}

	@Test(priority = 6, enabled=false)
	public void pricingButton() {
		loginPage.clickPricing();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("PricingPage"));
	}

	@Test(priority = 7, enabled=false)
	public void featuresButton() {
		loginPage.clickFeatures();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("FeaturesPage"));
	}

	@Test(priority = 8, enabled=false)
	public void customersButton() {
		loginPage.clickCustomers();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("CustomersPage"));
	}

	@Test(priority = 9, enabled=false)
	public void contactButton() {
		loginPage.clickContact();
		testUtil.switchWindow();
		Assert.assertEquals(testUtil.getWindowTitle(), propertyPageTitles.getProperty("ContactPage"));
	}
	
	@Test(priority= 10, enabled=false )
	public void brokenLinksLoginPage()
	{
		testUtil.brokenLinks();
	}
	@AfterMethod
	public void tearDown(Method method) {
		log.info("### AFTER METHOD OF "+method.getName()+" ###");
		driver.quit();
	}
}
