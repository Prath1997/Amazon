package com.amazon.tests;

<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.WebdriverSetup;
import pages.LoginPage;
import utils.WaitUtility;

public class LoginTest extends WebdriverSetup {
	
	WebDriver driver;
	LoginPage login;
	WaitUtility waitUtil;

	@BeforeMethod
	public void setUp() {
		driver = launchbrowser();
		login = new LoginPage(driver);
		waitUtil =new WaitUtility(driver);
		
	}

	@Test(enabled = true)
	private void LoginAmazon() {
		// TODO Auto-generated method stub
		waitUtil.waitForElementToBeVisible(login.Profile);
		login.Profile.click();
		
		waitUtil.waitForElementToBeVisible(login.Username);
		login.Username.sendKeys("7875315045");
		
		waitUtil.waitForElementToBeVisible(login.Continue);
		login.Continue.click();
		
		waitUtil.waitForElementToBeVisible(login.Password);
		login.Password.sendKeys("7875315045");
		
		waitUtil.waitForElementToBeVisible(login.Signin);
		login.Signin.click();
	}

	@Test(enabled = true)
	private void Search() throws InterruptedException {
		
		waitUtil.waitForElementToBeVisible(login.ClickSearch);
		login.ClickSearch.click();
		
		waitUtil.waitForElementToBeVisible(login.EnterSearch);
		login.EnterSearch.sendKeys("iphone");
		
		waitUtil.waitForElementToBeVisible(login.Searchicon);
		login.Searchicon.click();
		
		Assert.assertEquals(driver.getTitle(), "Amazon.in : iphone");
		
	}

=======
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.WebdriverSetup;
import pages.LoginPage;

public class LoginTest extends WebdriverSetup {
	
    LoginPage loginAmazon;

    @BeforeMethod
    public void setUp() {
        launchbrowser();
        loginAmazon = new LoginPage(driver);
    }
    
    @Test
    private void LoginAmazon() {
		// TODO Auto-generated method stub
    	
    	loginAmazon.Profile();
    	loginAmazon.enterusername();
    	loginAmazon.Continue();
    	loginAmazon.enterPassword();
    	loginAmazon.Signin();
	}
    
	@Test(enabled = true)
	private void Search() {

		loginAmazon.ClickSearch();
		loginAmazon.EnterSearch();
		loginAmazon.Searchicon();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : iphone");
	}
    
    
>>>>>>> branch 'main' of https://github.com/Prath1997/Amazon.git
}
