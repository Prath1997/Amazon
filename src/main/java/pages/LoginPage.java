package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
<<<<<<< HEAD

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/a")
	public WebElement Profile;

	@FindBy(xpath = "//*[@id=\"ap_email_login\"]")
	public WebElement Username;

	@FindBy(xpath = "//*[@id=\"continue\"]/span/input")
	public WebElement Continue;

	@FindBy(xpath = "//*[@id=\"ap_password\"]")
	public WebElement Password;

	@FindBy(xpath = "//*[@id=\"signInSubmit\"]")
	public WebElement Signin;

	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
	public WebElement ClickSearch;

	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
	public WebElement EnterSearch;

	@FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
	public WebElement Searchicon;

=======
	
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
	
	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement ClickSearch;

	public void ClickSearch() {
		ClickSearch.click();
	}

	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement EnterSearch;

	public void EnterSearch() {
		EnterSearch.sendKeys("iphone");
	}

	@FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
	WebElement Searchicon;

	public void Searchicon() {
		Searchicon.click();
	}
>>>>>>> branch 'main' of https://github.com/Prath1997/Amazon.git
}
