package com.amazon.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
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
		
		AssertJUnit.assertEquals(driver.getTitle(), "Amazon.in : iphone");
		
	}

}
