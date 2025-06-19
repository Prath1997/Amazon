package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSetup {

	protected static WebDriver driver;
	
	String BuildPath = "https://www.amazon.in/";
	
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BuildPath);
		
	}
	
}
