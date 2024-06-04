package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;

public class Patient_ChangePasswordPage extends BaseClass {
	
	WebDriver driver;
	public Patient_ChangePasswordPage(WebDriver driver) {            
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getCurrentpassword() {
		return currentpassword;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getClickSubmit() {
		return clickSubmit;
	}

	
	
    @FindBy(xpath = "//a[@href='change-password.php']")
	private WebElement changePassword;
    
    @FindBy(name="cpass")
    private WebElement currentpassword;
    
    @FindBy(name="npass")
    private WebElement newpassword;
    
    @FindBy(name="cfpass")
    private WebElement confirmpassword;
    
    @FindBy(name="submit")
    private WebElement clickSubmit; 
    
}
