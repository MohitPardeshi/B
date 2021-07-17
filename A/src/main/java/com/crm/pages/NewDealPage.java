package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class NewDealPage extends TestBase {

	// All the WebElements of the Page
	
	@FindBy(xpath = "//fieldset[@class='fieldset']/legend")
	WebElement pageTitle;
	
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;

	@FindBy(xpath = "//input[@value='Save and Create Another']")
	WebElement saveAndCreateAnother;

	@FindBy(xpath = "//input[@name='title']")
	WebElement titleTextBox;

	@FindBy(xpath = "//input[@name='client_lookup']")
	WebElement companyTextBox;

	@FindBy(xpath = "//input[@name='client_lookup']")
	WebElement companySearchButton;

	@FindBy(xpath = "//input[@name='contact_lookup']")
	WebElement primaryContactTextBox;

	@FindBy(xpath = "//input[@name='contact_lookup']")
	WebElement primaryContactSearchButton;

	@FindBy(xpath = "//input[@id='amount']")
	WebElement amountTextBox;

	@FindBy(xpath = "//input[@id='probability']")
	WebElement probability;

	@FindBy(xpath = "//input[@id='commission']")
	WebElement commission;

	@FindBy(xpath = "//input[@name='identifier']")
	WebElement identifier;

	@FindBy(xpath = "//select[@name='owner_user_id']")
	WebElement ownerSelect;

	@FindBy(xpath = "//select[@name='product_id']")
	WebElement productSelect;

	@FindBy(xpath = "//input[@name='quantity']")
	WebElement quantity;

	@FindBy(xpath = "//select[@name='type']")
	WebElement typeSelect;

	@FindBy(xpath = "//select[@name='source']")
	WebElement sourceSelect;

	@FindBy(xpath = "//input[@name='closed']")
	WebElement statusOpen;

	@FindBy(xpath = "//input[@name='closed'][2]")
	WebElement statusClosed;

	@FindBy(xpath = "//input[@name='close_date']")
	WebElement predictedCloseDate;

	@FindBy(xpath = "//input[@name='actual_close_date']")
	WebElement actualCloseDate;

	@FindBy(xpath = "//input[@name='exclude_reports']")
	WebElement excludeReports;

	@FindBy(xpath = "//input[@name='tags']")
	WebElement tags;

	@FindBy(xpath = "//input[@name='description']")
	WebElement description;

	@FindBy(xpath = "//input[@name='next_step']")
	WebElement nextStep;

	public NewDealPage() {
		// Constructor of NewDealPage. Initializing the all the WebElements.
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPageTitle()
	{
		return pageTitle;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getsaveAndCreateAnother() {
		return saveAndCreateAnother;
	}

	public WebElement gettitleTextBox() {
		return titleTextBox;
	}

	public WebElement getcompanyTextBox() {
		return companyTextBox;
	}

	public WebElement getcompanySearchButton() {
		return companySearchButton;
	}

	public WebElement getprimaryContactTextBox() {
		return primaryContactTextBox;
	}

	public WebElement getamountTextBox() {
		return amountTextBox;
	}

	public WebElement getprobability() {
		return probability;
	}

	public WebElement getcommission() {
		return commission;
	}

	public WebElement getidentifier() {
		return identifier;
	}

	public WebElement getownerSelect() {
		return ownerSelect;
	}

	public WebElement getproductSelect() {
		return productSelect;
	}

	public WebElement getquantity() {
		return quantity;
	}

	public WebElement gettypeSelect() {
		return typeSelect;
	}
	
	public WebElement getsourceSelect() {
		return sourceSelect;
	}
	
	public WebElement getstatusOpen() {
		return statusOpen;
	}
	public WebElement getpredictedCloseDate() {
		return predictedCloseDate;
	}
	public WebElement getactualCloseDate() {
		return actualCloseDate;
	}
	public WebElement getexcludeReports() {
		return excludeReports;
	}
	public WebElement gettags() {
		return tags;
	}
	public WebElement getdescription() {
		return description;
	}
	
	public WebElement getnextStep() {
		return nextStep;
	}
	
	
}
