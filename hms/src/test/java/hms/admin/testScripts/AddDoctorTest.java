package hms.admin.testScripts;

import org.testng.annotations.Test;

import generic.basetest.BaseClass;
import objectRepositoryUtility.AddDoctorPage;
import objectRepositoryUtility.AdminLoginPage;
import objectRepositoryUtility.AdminPage;

public class AddDoctorTest extends BaseClass {

	@Test
	public void addDoctors() throws Throwable {
		AdminLoginPage alp = new AdminLoginPage(driver);
		alp.loginToapp();
		AdminPage ap = new AdminPage(driver);
		ap.getDoctorDD().click();
		ap.getAddDoctorLink().click();
		AddDoctorPage adp = new AddDoctorPage(driver);
		adp.addDoctor();
	}
}