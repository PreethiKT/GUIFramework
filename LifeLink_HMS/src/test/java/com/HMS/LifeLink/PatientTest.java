package com.HMS.LifeLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.AppointmentHistroyPage;
import com.comcast.crm.objectrepositoryutility.BookAppointmentPage;
import com.comcast.crm.objectrepositoryutility.DashboardPage;
import com.comcast.crm.objectrepositoryutility.MedicalHistroyPage;
import com.comcast.crm.objectrepositoryutility.PatientProfileUpdatePage;
import com.comcast.crm.objectrepositoryutility.Patient_ChangePasswordPage;
import com.comcast.crm.objectrepositoryutility.Patient_ContactUsPage;
import com.comcast.crm.objectrepositoryutility.Patient_LoginPage;

public class PatientTest extends BaseClass{
	
	@Test
	public void Patient_Test() throws Throwable
	{
		String Doctor_Specialist = eLib.getDataFromExcel("BookApp",1,1);
		String DoctorName = eLib.getDataFromExcel("BookApp", 1, 2);
		String Consultancy_Fees = eLib.getDataFromExcel("BookApp", 1, 3);
		
	// Login
		Patient_LoginPage lp = new Patient_LoginPage(driver);
		lp.loginToApp();
		
	// Book Appointment
		DashboardPage dp = new DashboardPage(driver);
		Thread.sleep(20);
		dp.getBookicon().click();
		
		BookAppointmentPage bp = new BookAppointmentPage(driver);
		
	    WebElement wbsele = bp.getSelectDoctorSpecialist();
	    wLib.select(wbsele, Doctor_Specialist);
	    
	    WebElement wbsele1 = bp.getSelectDoctor();
	    wLib.select(wbsele1, DoctorName);
	    
	    WebElement wbsele2 = bp.getEnterFees();
	    wLib.select(wbsele2, Consultancy_Fees);

	   bp.getDate().click();
	   driver.findElement(By.xpath("//th[text()='June 2024']/ancestor::table[@class=' table-condensed']/descendant::td[text()='3']")).click();

	    bp.getClickSubmit().click();
	    wLib.switchtoAlertAndAccept(driver);
	    
	    dp.getDropDown().click();
	    dp.getLogOut().click();
	    
	}
	    
	// Cancel Appointment
	    
	    @Test
	    public void cancelApp() throws Throwable 
	    {
	    	 
	 		String DoctorName = eLib.getDataFromExcel("BookApp", 1, 2);
	        
	 	 Patient_LoginPage lp = new Patient_LoginPage(driver);
	 		lp.loginToApp();
	 		
	 	 AppointmentHistroyPage ap = new AppointmentHistroyPage(driver);
	 	 ap.getClickAppHistory().click();
	 	driver.findElement(By.xpath("//td[text()='"+DoctorName+"']/ancestor::tr/descendant::a[text()='Cancel']")).click();
	     wLib.switchtoAlertAndAccept(driver);
	     String headerMsg = ap.getCancelledMsg().getText();
	     Assert.assertNotNull(headerMsg);
	     DashboardPage dp = new DashboardPage (driver);
	     dp.getDropDown().click();
		    dp.getLogOut().click();
	    }
	   
	    // To check Medical history
	    @Test
		public void medHist() throws Throwable {		      
			 Patient_LoginPage lp = new Patient_LoginPage(driver);
				lp.loginToApp();
				
				MedicalHistroyPage mp = new MedicalHistroyPage(driver);
				mp.getClickMedicalHistory().click();
				driver.findElement(By.xpath("//a[@href='view-medhistory.php?viewid=27']")).click();
				 DashboardPage dp = new DashboardPage (driver);
			     dp.getDropDown().click();
				    dp.getLogOut().click();
		}
    
	    //Update the Profile
	    @Test
	    public void updateProfile() throws Throwable
	    {	      
		 Patient_LoginPage lp = new Patient_LoginPage(driver);
			lp.loginToApp();
			
			PatientProfileUpdatePage pp = new PatientProfileUpdatePage(driver);
			pp.getClickUpdateProfile().click();
			pp.getClickSubmitBtn().click();	
			 DashboardPage dp = new DashboardPage (driver);
		     dp.getDropDown().click();
			    dp.getLogOut().click();
	    }
	    
	    //To change the Password
	    @Test
	    public void changePassword() throws Throwable {
	    	
	    	 Patient_LoginPage lp = new Patient_LoginPage(driver);
				lp.loginToApp();
				
			String cpassword = eLib.getDataFromExcel("Password", 1, 1);
			String npassword = eLib.getDataFromExcel("Password", 1, 2);
			String cfpassword = eLib.getDataFromExcel("Password", 1, 3);
			
			DashboardPage dp = new DashboardPage (driver);
		     dp.getDropDown().click();
				
			Patient_ChangePasswordPage pc = new Patient_ChangePasswordPage(driver);
			pc.getChangePassword().click();
			pc.getCurrentpassword().sendKeys(cpassword);
			pc.getNewpassword().sendKeys(npassword);
			pc.getConfirmpassword().sendKeys(cfpassword);
			pc.getClickSubmit().click();
			
			 dp.getDropDown().click();
			    dp.getLogOut().click();
	    	
	    }
	    
	    //To Contact to hospital
	    
	    @Test
	    public void contactUs() throws Throwable {
			String URL = System.getProperty("url" ,fLib.getDataFromPropertiesFile("url"));
			driver.get(URL);
			
			String fulName = eLib.getDataFromExcel("ContactUs", 1, 1);
			String email = eLib.getDataFromExcel("ContactUs", 1, 2);
			String mobile = eLib.getDataFromExcel("ContactUs", 1, 3);
			String description = eLib.getDataFromExcel("ContactUs", 1, 4);
			
			Patient_ContactUsPage pu = new Patient_ContactUsPage(driver);
			pu.getContactUs().click();
			pu.getFullName().sendKeys(fulName);
			pu.getEmailid().sendKeys(email);
			pu.getMobileNo().sendKeys(mobile);
			pu.getDescription().sendKeys(description);
			Thread.sleep(2000);
			pu.getClickSubmit().click();
			wLib.switchtoAlertAndAccept(driver);
			
	    }
	    
	    @Test
	    public void test() {
	    	System.out.println("done");
	    }
}
