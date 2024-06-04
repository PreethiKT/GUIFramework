package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;

public class Patient_ContactUsPage extends BaseClass{
	WebDriver driver;
	public Patient_ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='contact.php']")
	private WebElement contactUs ;
	
	@FindBy(name="fullname")
	private WebElement fullName ;
	
	@FindBy(name="emailid")
	private WebElement emailid ;
	
	@FindBy(name="mobileno")
	private WebElement mobileNo ;
	
	@FindBy(name="description")
	private WebElement description;
	
	@FindBy(name="submit")
	private WebElement clickSubmit;
	
	public WebElement getClickSubmit() {
		return clickSubmit;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getDescription() {
		return description;
	}
	
	
	
	
	
	

}
