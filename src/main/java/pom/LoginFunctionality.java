package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality {

	@FindBy(name="user_id")
	WebElement user;
	
	@FindBy(name="password")
	WebElement passw;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement submit;
	
	public LoginFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Forlogin(String username,String password) {
		user.sendKeys("username");
		passw.sendKeys("password");
		submit.click();
	}
	
	
	
	
	
	
	
}
