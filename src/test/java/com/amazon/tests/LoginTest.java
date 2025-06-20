package com.amazon.tests;

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
    
    
}
