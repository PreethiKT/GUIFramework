package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class DashboardPage extends WebDriverUtility{                             
    
WebDriver driver;
public DashboardPage(WebDriver driver) {            
this.driver = driver;
PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//span[text()=' Dashboard ']")
	private WebElement clickDashBorad;
	
	@FindBy(xpath="//a[@href='edit-profile.php']")
	private WebElement editProfile;
	
	@FindBy(xpath = "//a[@href='change-password.php']")
	private WebElement changePassword;
	
	@FindBy(xpath = "//a[@href='logout.php']")
	private WebElement logOut;
	
	@FindBy(xpath = "//i[@class='ti-pencil-alt']")
	private WebElement bookicon;
	
	@FindBy(xpath = "//i[@class='ti-angle-down']")
	private WebElement dropDown;
	

	public WebElement getDropDown() {
		return dropDown;
	}

	public void setDropDown(WebElement dropDown) {
		this.dropDown = dropDown;
	}

	public WebElement getBookicon() {
		return bookicon;
	}

	public WebElement getClickDashBorad() {
		return clickDashBorad;
	}

	public WebElement getEditProfile() {
		return editProfile;
	}

	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getLogOut() {
		return logOut;
	}
}
