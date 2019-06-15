package com.bankguru.testcase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.EditCustomer;
import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.NewCustomer;
import com.bankguru.actions.RegisterPage;

import CommonPage.CommonTestcase;

public class EditCustomerScript extends CommonTestcase {
	
	WebDriver driver;

	String email, emailLogin, passwordLogin, idCustomer;

	LogInPage loginPage;

	RegisterPage registerPage;

	HomePage homePage;

	NewCustomer newcustomer;

	EditCustomer editcustomer;
	
	String typeIdCustomerNull, typeIdCustomerNumeric, typeIdCustomerSpecial, typeIdCustomerValid, typeAddressNull, typeCityNull, typeCityNumeric, typeCitySpecial ; 

	@Parameters({ "browser", "version", "url" })
	@BeforeClass

	public void beforeClass(String browser, String version, String url) {
		driver = openMultiBrowser(browser, version, url);

		email = "Nhutbm" + randomEmail() + "@gmail.com";

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
//
//		loginPage = registerPage.navigateToLoginPage("http://demo.guru99.com/v4/");

		loginPage.inputUserName(RegisterAccount.emailLogin);

		loginPage.inputPassword(RegisterAccount.passwordLogin);

		homePage = loginPage.clickButonLogin();
		
//		newcustomer=homePage.clickNewCustomer();
//		
//		newcustomer.inputCustomerName("GiinBM");
//		newcustomer.inputDOB("03191995");
//		newcustomer.inputAddress("Flemington123");
//		newcustomer.inputCity_TXT("SaiGon");
//		newcustomer.inputState_TXT("Saigon");
//		newcustomer.inputPin_TXT("671164");
//		newcustomer.inputMobileNumber_TXT("0344145987");
//		newcustomer.inputEmail_TXT(email);
//		newcustomer.inputPassword("123456");
//		newcustomer.clickSubmit();
//		idCustomer=newcustomer.getTextCustomer_ID();
//		System.out.println(idCustomer);
		
		
		
		

	}

	@BeforeMethod

	public void beforeMethod() {

//		newcustomer = homePage.clickNewCustomer();
		editcustomer = homePage.clickEditCustomer();

	}
	
	//Verify Customer id cannot be empty
	@Test
	public void testcase_01()
	{
		editcustomer.tabCustomerID_TXT(Keys.TAB);
		verifyEqual(editcustomer.getTextCustomerID_TXT_MESSAGE(), "Customer ID is required");
	}
	
	//Verify Customer id  must be numeric
	@Test
	public void testcase_02()
	{
		editcustomer.inputCustomerID_TXT("1234Aaa");
		verifyEqual(editcustomer.getTextCustomerID_TXT_MESSAGE(), "Characters are not allowed");
	}
	
	//Verify Customer id cannot have special character
	@Test
	public void testcase_03()
	{
		editcustomer.inputCustomerID_TXT("1234!@#");
		verifyEqual(editcustomer.getTextCustomerID_TXT_MESSAGE(), "Special characters are not allowed");
	}
	
	//Verify valid Customer id 
	@Test
	public void testcase_04()
	{
		editcustomer.inputCustomerID_TXT("xyz");
		editcustomer.clickSubmit_BTT();
		System.out.println(editcustomer.getTextAlert());
		verifyEqual(editcustomer.getTextPopup(), "Please fill all fields");
		editcustomer.acceptAlert();
	}
	
	//Verify Address Field cannot be empty
	@Test
	public void testcase_08()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
//		editcustomer.acceptAlert();
		editcustomer.cleanAddress_AREA();
		verifyEqual(editcustomer.getTextAddress_AREA_MESSAGE(), "Address Field must not be blank");
	}
	
	//Verify City Field cannot be empty
	@Test
	public void testcase_09()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanCity_TXT();
		verifyEqual(editcustomer.getTextCity_TXT_MESSAGE(), "City Field must not be blank");
	}
	
	//Verify City Field cannot be numeric
	@Test
	public void testcase_10()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanCity_TXT();
		editcustomer.inputCity_TXT("1234 city");
		verifyEqual(editcustomer.getTextCity_TXT_MESSAGE(), "Numbers are not allowed");
	}
	
	//Verify City Field cannot have special character 
	@Test
	public void testcase_11()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanCity_TXT();
		editcustomer.inputCity_TXT("city$!@$!");
		verifyEqual(editcustomer.getTextCity_TXT_MESSAGE(), "Special characters are not allowed");
	}
	
	//Verify State Field state cannot be empty
	@Test
	public void testcase_12()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanState_TXT();
		verifyEqual(editcustomer.getTextState_TXT_MESSAGE(), "State must not be blank");
	}

	//Verify State Field state cannot be numeric 
	@Test
	public void testcase_13()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanState_TXT();
		editcustomer.inputState_TXT("123State");
		verifyEqual(editcustomer.getTextState_TXT_MESSAGE(), "Numbers are not allowed");
	}
	
	//Verify State Field state cannot have special character
	@Test
	public void testcase_14()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanState_TXT();
		editcustomer.inputState_TXT("!@#%State");
		verifyEqual(editcustomer.getTextState_TXT_MESSAGE(), "Special characters are not allowed");
	}
	
	//Verify PIN Field cannot be empty
	@Test
	public void testcase_15()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanPin_TXT();
		verifyEqual(editcustomer.getTextPin_TXT_MESSAGE(), "PIN Code must not be blank");
	}
	
	//Verify PIN Field must be numeric
	@Test
	public void testcase_16()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanPin_TXT();
		editcustomer.inputPin_TXT("123PIN");
		verifyEqual(editcustomer.getTextPin_TXT_MESSAGE(), "Characters are not allowed");
	}
	
	//Verify PIN must have 6 digits
	@Test
	public void testcase_17()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanPin_TXT();
		editcustomer.inputPin_TXT("123");
		verifyEqual(editcustomer.getTextPin_TXT_MESSAGE(), "PIN Code must have 6 Digits");
	}
	
	//Verify PIN cannot have special character
	@Test
	public void testcase_18()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanPin_TXT();
		editcustomer.inputPin_TXT("!@#!");
		verifyEqual(editcustomer.getTextPin_TXT_MESSAGE(), "Special characters are not allowed");
	}
	
	
	//Verify Telephone Field cannot be empty
	@Test
	public void testcase_19()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanTelephoneNumber_TXT();
		verifyEqual(editcustomer.getTextTelephoneNumber_TXT_MESSAGE(), "Mobile no must not be blank");
	}
	
	//Verify Telephone cannot have special character 
	@Test
	public void testcase_20()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanTelephoneNumber_TXT();
		editcustomer.inputTelephoneNumber_TXT("886636!@12 ");
		verifyEqual(editcustomer.getTextTelephoneNumber_TXT_MESSAGE(), "Special characters are not allowed");
	}
	
	//Verify Email Field Email cannot be empty
	@Test
	public void testcase_21()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanEmail_TXT();
		verifyEqual(editcustomer.getTextEmail_TXT_MESSAGE(), "Email-ID must not be blank");		
	}
	
	//Verify Email must be in format career@guru99.com 
	@Test
	public void testcase_22()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanEmail_TXT();
		editcustomer.inputEmail_TXT("guru99@gmail guru99 Guru99@ gurugmail.com");
		verifyEqual(editcustomer.getTextEmail_TXT_MESSAGE(), "Email-ID is not valid");		
	}
	
	
	@Test
	public void testcase_23()
	{
		editcustomer.inputCustomerID_TXT(NewCustomerScript.idCustomer);
		editcustomer.clickSubmit_BTT();
		editcustomer.cleanEmail_TXT();
		editcustomer.inputEmail_TXT("guru99@gmail guru99 Guru99@ gurugmail.com");
		verifyEqual(editcustomer.getTextEmail_TXT_MESSAGE(), "Email-ID is not valid");		
	}
	
	
	
	@AfterClass
	public void afterClass() {

	}
}
