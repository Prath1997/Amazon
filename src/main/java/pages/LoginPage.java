package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

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


}
