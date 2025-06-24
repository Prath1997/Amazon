package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSetup {

	public WebDriver driver;
	
	String BuildPath = "https://www.amazon.in/";
	
	public WebDriver launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BuildPath);
		return driver;

	
}
}
