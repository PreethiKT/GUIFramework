package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreatePatientAccountpage extends WebDriverUtility{                             
    
WebDriver driver;
public CreatePatientAccountpage(WebDriver driver) {            
this.driver = driver;
PageFactory.initElements(driver, this);
}
	
	@FindBy(name = "full_name")
	private WebElement enterName;

	@FindBy(name="address")
	private WebElement enterAddress;
	
	@FindBy(name="city")
	private WebElement enterCity;
	
	@FindBy(xpath = "label[@for='rg-female']")
	private WebElement clickRadioBtn;
	
	@FindBy(id="email")
	private WebElement enterEmail;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(id="password_again")
	private WebElement enterPasswordAgain;
	
	@FindBy(name="submit")
	private WebElement clickSubmitBtn;

	public WebElement getEnterName() {
		return enterName;
	}

	public WebElement getEnterAddress() {
		return enterAddress;
	}

	public WebElement getEnterCity() {
		return enterCity;
	}

	public WebElement getClickRadioBtn() {
		return clickRadioBtn;
	}

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getEnterPasswordAgain() {
		return enterPasswordAgain;
	}

	public WebElement getClickSubmitBtn() {
		return clickSubmitBtn;
	}
	

}
