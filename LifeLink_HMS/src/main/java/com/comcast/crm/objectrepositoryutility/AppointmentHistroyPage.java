package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentHistroyPage {
	WebDriver driver;
	 public AppointmentHistroyPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath ="//span[text()=' Appointment History ']")
	private WebElement clickAppHistory;

    public WebElement getClickAppHistory() {
		return clickAppHistory;
	}

	public WebElement getCheckDoctorName() {
		return checkDoctorName;
	}

	@FindBy(xpath = "//td[@class='hidden-xs']")
    private WebElement checkDoctorName;
    
	
	@FindBy(xpath = "//p[@style='color:red;']")
	private WebElement cancelledMsg;
	
	
	public WebElement getCancelledMsg() {
		return cancelledMsg;
	}
    


}
