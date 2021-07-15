package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class CalenderNewEventPage extends TestBase {

	@FindBy(xpath="")
	WebElement titleField;
	
	@FindBy(xpath="")
	WebElement fromDate;
	
	@FindBy(xpath="")
	WebElement toDate;
	
	@FindBy(xpath="")
	WebElement saveButton;
	
	@FindBy(xpath="")
	WebElement category;
	
	@FindBy(xpath="")
	WebElement assignedTo;
	
	@FindBy(xpath="")
	WebElement addButton;
	
	@FindBy(xpath="")
	WebElement removeButton;
	
	@FindBy(xpath="")
	WebElement checkAvailibiltyByRegion;
	
	@FindBy(xpath="")
	WebElement confirmedYes;
	
	@FindBy(xpath="")
	WebElement confirmedNo;
	
	@FindBy(xpath="")
	WebElement emailAlertsToAllAttendees;
	
	@FindBy(xpath="")
	WebElement alsoEmailContactAvailable;
	
	@FindBy(xpath="")
	WebElement remainders;
	
	
	public  CalenderNewEventPage()
	{
		PageFactory.initElements(driver,this);
	}
	
}
