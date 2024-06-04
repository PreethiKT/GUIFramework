package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileutility.FileUtility;


public class Patient_LoginPage {
	WebDriver driver;
	public Patient_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='hms/user-login.php']")
	private WebElement patientLnk;
	
	@FindBy(name = "username")
	private WebElement patientUserName;
	
	@FindBy(name = "password")
	private WebElement  patientPassword;
	
	@FindBy(name="submit")
	private WebElement clickLoginBtn;
	
	@FindBy(xpath = "//a[@href='forgot-password.php']")
	private WebElement clickForgotPasword;
	
	@FindBy(xpath = "//a[@href='registration.php']")
	private WebElement createAccount;
	

	public WebElement getPatientLnk() {
		return patientLnk;
	}

	public WebElement getPatientUserName() {
		return patientUserName;
	}

	public WebElement getPatientPassword() {
		return patientPassword;
	}

	public WebElement getClickLoginBtn() {
		return clickLoginBtn;
	}

	public WebElement getClickForgotPasword() {
		return clickForgotPasword;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}
	
	public void loginToApp() throws Throwable {
		FileUtility fLib = new FileUtility();
		String URL = System.getProperty("url" ,fLib.getDataFromPropertiesFile("url") );
		String USERNAME = System.getProperty("username" , fLib.getDataFromPropertiesFile("username"));
		String PASSWORD = System.getProperty("password" , fLib.getDataFromPropertiesFile("password"));

		driver.get(URL);
		patientLnk.click();
		patientUserName.sendKeys(USERNAME);
		patientPassword.sendKeys(PASSWORD);
		clickLoginBtn.click();
	}
	
	
	
	
	
}
