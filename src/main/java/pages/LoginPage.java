package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	String User = "7875315045";
	String Pass = "7875315045";
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/a")
	WebElement Profile;
	
	public void Profile() {
		Profile.click();;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"ap_email_login\"]")
	WebElement Username;
	
	public void enterusername() {
		Username.sendKeys(User);
	}
	
	
	@FindBy(xpath="//*[@id=\"continue\"]/span/input")
	WebElement Continue;
	
	public void Continue() {
		Continue.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement Password;
	public void enterPassword() {
		Password.sendKeys(Pass);
	}
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement Signin;
	
	public void Signin() {
		Signin.click();
	}
}
