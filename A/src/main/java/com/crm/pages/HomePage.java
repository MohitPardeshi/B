package com.crm.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class HomePage extends TestBase {

	Actions a = new Actions(driver);
	
	// Label
	@FindBy(xpath = "//td[contains(text(),'User: group automation')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//td[contains(text(),'User:automation')]")
	WebElement userNameLabel1;

	// Buttons
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutButton;

	@FindBy(xpath = "//a[contains(text(),'Setup')]")
	WebElement setupButton;

	@FindBy(xpath = "//a[contains(text(),'Help')]")
	WebElement helpButton;

	// Open Button Page
	@FindBy(xpath = "//td[contains(text(),'Global Account Administration')]")
	WebElement setupPageOpen;

	// Top Menus
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeButton;

	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement calendar;

	@FindBy(xpath = "//a[contains(text(),'Companies')]")
	WebElement companies;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contacts;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement deals;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasks;

	@FindBy(xpath = "//a[contains(text(),'Cases')]")
	WebElement cases;

	@FindBy(xpath = "//a[contains(text(),'Call')]")
	WebElement call;

	@FindBy(xpath = "//a[contains(text(),'Email')]")
	WebElement email;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS')]")
	WebElement textsms;

	@FindBy(xpath = "//a[contains(text(),'Print')]")
	WebElement print;

	@FindBy(xpath = "//a[contains(text(),'Campaigns')]")
	WebElement campaigns;

	@FindBy(xpath = "//a[contains(text(),'Docs')]")
	WebElement docs;

	@FindBy(xpath = "//a[contains(text(),'Forms')]")
	WebElement forms;

	@FindBy(xpath = "//a[contains(text(),'Reports')]")
	WebElement reports;
	
	// Mouse over menu of Calender
	
	
	// MenuPageOpen

	public void calendarPageOpen() {

	}

	// Mouse over
	public void mouseOver(String menuName) {
		switch (menuName) {
		case "Calendar":
			a.moveToElement(calendar).build().perform();
			break;
		case "Companies":
			a.moveToElement(companies).build().perform();
			break;
		case "" :
			break;
		}
	}

	@FindBy(xpath = "//a[contains(text(),'Audit Trail')]")
	WebElement auditTrail;

	@FindBy(xpath = "//td[contains(text(),'')]")
	WebElement auditTrailOpen;

	// Initialize the page element
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public Boolean getUserNameLabel() {
		return userNameLabel.isDisplayed();
	}

	public LoginPage logoutClick() {
		logoutButton.click();
		return new LoginPage();
	}

	public SetupPage setupClick() {
		setupButton.click();
		return new SetupPage();
	}

	public Set<String> helpClick() {
		helpButton.click();
		return driver.getWindowHandles();
	}

	public boolean setupPageDisplayed() {
		return setupPageOpen.isDisplayed();
	}

	public AuditTrailPage auditTrailClick() {
		auditTrail.click();
		return new AuditTrailPage();
	}

	public boolean auditTrailPageDisplayed() {
		return auditTrailOpen.isDisplayed();
	}
}
