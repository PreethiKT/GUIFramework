package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;

public class PatientProfileUpdatePage extends BaseClass {
	
	WebDriver driver;
	public PatientProfileUpdatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='panel-body']/descendant::a[@href='edit-profile.php']")
	private WebElement clickUpdateProfile;
	
	
	@FindBy(name="submit")
	private WebElement clickSubmitBtn;
	
	@FindBy(xpath = "h5[style='color: green; font-size:18px; ']")
	private WebElement updateMsg;
	
	
	public WebElement getUpdationMsg() {
		return updateMsg;
	}


	public WebElement getClickUpdateProfile() {
		return clickUpdateProfile;
	}


	public WebElement getClickSubmitBtn() {
		return clickSubmitBtn;
	}
	
	
	
	

}
