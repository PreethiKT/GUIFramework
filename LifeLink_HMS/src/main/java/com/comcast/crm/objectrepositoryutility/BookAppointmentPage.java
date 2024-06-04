package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class BookAppointmentPage extends WebDriverUtility{                             
        
		WebDriver driver;
		 public BookAppointmentPage(WebDriver driver) {            
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }

	@FindBy(xpath = "(//a[@href='book-appointment.php'])[1]")
	private WebElement bookAppointment;
	
	
	@FindBy(xpath="//input[@class='form-control datepicker']")
	private WebElement date;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDate() {
		return date;
	}

	@FindBy(name = "Doctorspecialization")
	private WebElement selectDoctorSpecialist;
	
	@FindBy(name="doctor")
	private WebElement selectDoctor;
	
	@FindBy(id="fees")
	private WebElement enterFees;
	
	@FindBy(name="//th[text()='June 2024']/ancestor::table[@class=' table-condensed']/descendant::td[text()='3']")
	private WebElement selectDate;
	
	@FindBy(name="apptime")
	private WebElement selectTime;
	
	@FindBy(name="submit")
	private WebElement clickSubmit;

	public WebElement getBookAppointment() {
		return bookAppointment;
	}

	public WebElement getSelectDoctorSpecialist() {
		return selectDoctorSpecialist;
	}

	public WebElement getSelectDoctor() {
		return selectDoctor;
	}

	public WebElement getEnterFees() {
		return enterFees;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}

	public WebElement getSelectTime() {
		return selectTime;
	}

	public WebElement getClickSubmit() {
		return clickSubmit;
	}
	
		
}
