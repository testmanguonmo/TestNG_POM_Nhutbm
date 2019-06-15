package com.bankguru.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.RegisterPage;

import CommonPage.CommonTestcase;

public class LoginScript extends CommonTestcase {
	WebDriver driver;

	String email, emailLogin, passwordLogin;

	LogInPage loginPage;

	RegisterPage registerPage;
	
	HomePage homePage;

	@Parameters({ "browser", "version", "url" })
	
	@BeforeClass

	public void beforeClass(String browser, String version, String url) {
		driver = openMultiBrowser(browser, version, url);

		email = "Nhutbm" + randomEmail() + "@gmail.com";

	}

	@Test
	public void testcase_01() {

//		loginPage= new LogInPage(driver);

		loginPage = PageFactory.initElements(driver, LogInPage.class);

//		registerPage = loginPage.clickHerLink();

//		registerPage= new RegisterPage(driver);

//		registerPage.inputEmailToRegister(email);
//
//		registerPage.clickSubmit();
//
//		emailLogin = registerPage.getUsername();
//
//		passwordLogin = registerPage.getPassword();

		loginPage = registerPage.navigateToLoginPage("http://demo.guru99.com/v4/");

		loginPage.inputUserName(RegisterAccount.emailLogin);

		loginPage.inputPassword(passwordLogin);
		
		

//		loginPage.clickButonLogin();

		homePage = loginPage.clickButonLogin();

//		homePage= new HomePage(driver);

		verifyEqual(homePage.getTextWelcome(), "Welcome To Manager's Page of Guru99 Bank");

	}

	@AfterClass
	public void afterClass() {

	}
}
