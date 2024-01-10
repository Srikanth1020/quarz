package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pom.LoginFunctionality;

public class Logintest extends TestBase {
	LoginFunctionality login;

	@BeforeMethod

	public void setup() {
		Intialization();
		login=new LoginFunctionality(driver);
	}
	@Test

	public void verifylogin() {
	login.Forlogin("username", "password");
		String homepageurl=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/customer/auth/login", homepageurl);
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
}
