package com.bankguru.testcase;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.NewCustomer;
import com.bankguru.actions.RegisterPage;

import CommonPage.CommonTestcase;

public class RegisterAccount extends CommonTestcase {

	WebDriver driver;

	String email;
	
	static String emailLogin, passwordLogin;

	LogInPage loginPage;

	RegisterPage registerPage;
	
	HomePage homePage;

	@Parameters({ "browser", "version", "url" })
	
	@BeforeClass

	public void beforeClass(String browser, String version, String url) {
		//Ten file
		inititalReport("ReportNhutbm.html");
		driver = openMultiBrowser(browser, version, url);

		email = "Nhutbm" + randomEmail() + "@gmail.com";

	}

	@Test
	public void getAccountRegister() {
		//Ten testcase
		logTestCase("Testcase01");
		loginPage = PageFactory.initElements(driver, LogInPage.class);
		registerPage = loginPage.clickHerLink();
		registerPage.inputEmailToRegister(email);
		registerPage.clickSubmit();
		emailLogin = registerPage.getUsername();
		passwordLogin = registerPage.getPassword();
	}
	//Bat buoc them de xuat file report
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		getResult(result);
	}
	
	//Bat buoc them de xuat file report
	@AfterClass
	public void afterClass() {

		exportReport();
		driver.quit();
	}
}
