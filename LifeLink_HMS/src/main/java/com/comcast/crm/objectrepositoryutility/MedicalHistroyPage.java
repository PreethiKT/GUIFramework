package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalHistroyPage {
	
	WebDriver driver;
	 public MedicalHistroyPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//span[text()=' Medical History ']")
		private WebElement clickMedicalHistory;

	public WebElement getClickMedicalHistory() {
		return clickMedicalHistory;
	}

	
	
	 
	 

}
