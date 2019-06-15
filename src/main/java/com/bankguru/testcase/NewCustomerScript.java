package com.bankguru.testcase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.NewCustomer;
import com.bankguru.actions.RegisterPage;

import CommonPage.CommonTestcase;
import ObjectPageJson.JsonData;

public class NewCustomerScript extends CommonTestcase {
	WebDriver driver;

	String email, emailLogin, passwordLogin;

	static String idCustomer;

	String typeNameNull, typeNameNumeric, typeNameSpecial, typeNameBlank, typeAddressNull, typeAddressFistBlank,
			typeCityNull, typeCityNumeric, typeCitySpecial, typeCityBlank, typeStatenull, typeStateNumeric,
			typeStateSpecial, typeStateBlank, typePinCharacter, typePinNull, typePin3Number, typePinSpecial,
			typePinFirstBlank, typePinBlank, typeTelephoneNull,typeTelephoneBlank, typeTelephoneCharater, typeTelephoneSpecial, typeEmailNull,
			typeEmailInvalid, typeEmailBlank;

	LogInPage loginPage;

	RegisterPage registerPage;

	HomePage homePage;

	NewCustomer newcustomer;

	JsonData json;

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

//		emailLogin = registerPage.getUsername();
//
//		passwordLogin = registerPage.getPassword();

//		loginPage = registerPage.navigateToLoginPage("http://demo.guru99.com/v4/");

		loginPage.inputUserName(RegisterAccount.emailLogin);

		loginPage.inputPassword(RegisterAccount.passwordLogin);

		homePage = loginPage.clickButonLogin();

		/*
		 * typeNameNull = "Customer name must not be blank"; typeNameNumeric =
		 * "Numbers are not allowed"; typeNameSpecial =
		 * "Special characters are not allowed"; typeNameBlank =
		 * "First character can not have space"; typeAddressNull =
		 * "Address Field must not be blank"; typeAddressFistBlank =
		 * "First character can not have space"; typeCityNull =
		 * "City Field must not be blank"; typeCityNumeric = "Numbers are not allowed";
		 * typeCitySpecial = "Special characters are not allowed"; typeCityBlank =
		 * "First character can not have space"; typeStatenull =
		 * "State must not be blank"; typeStateNumeric = "Numbers are not allowed";
		 * typeStateSpecial = "Special characters are not allowed"; typeStateBlank =
		 * "First character can not have space"; typePinCharacter =
		 * "Characters are not allowed"; typePinNull = "PIN Code must not be blank";
		 * typePin3Number = "PIN Code must have 6 Digits"; typePinSpecial =
		 * "Special characters are not allowed"; typePinFirstBlank =
		 * "First character can not have space"; typePinBlank =
		 * "First character can not have space"; typeTelephoneNull =
		 * "Mobile no must not be blank"; typeTelephoneBlank =
		 * "First character can not have space"; typeTelephoneSpecial =
		 * "Special characters are not allowed"; typeEmailNull =
		 * "Email-ID must not be blank"; typeEmailInvalid = "Email-ID is not valid";
		 * typeEmailBlank = "First character can not have space";
		 */

		json = getDataJson(".\\Data\\BankGuru.json");

	}

	@BeforeMethod

	public void beforeMethod() {

		newcustomer = homePage.clickNewCustomer();

	}

	@Test
	public void testcase_01() {

		newcustomer.tabCustomerName(Keys.TAB);
//		verifyEqual(newcustomer.getTextCustomerName(), "Customer name must not be blank");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeNameNull()),json.newCustomermessage().getTypeNameNull());

		//Them 1 cai fail mess
/*		System.out.println("json =" + json.newCustomermessage().getTypeNameNull123());
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeNameNull()),
				json.newCustomermessage().getTypeNameNull123());*/

	}

	@Test
	public void testcase_02() {
		newcustomer.inputCustomerName("1234 name123"); //
//		verifyEqual(newcustomer.getTextCustomerName(), "Numbers are not allowed");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeNameNumeric()),
				"Numbers are not allowed");
	}

	@Test
	public void testcase_03() {
		newcustomer.inputCustomerName("name!@# !@#");
//		verifyEqual(newcustomer.getTextCustomerName(), "Special characters are not allowed");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeNameSpecial()), json.newCustomermessage().getTypeNameSpecial());
	}

	@Test
	public void testcase_04() {
		newcustomer.inputCustomerName(" ");
//		verifyEqual(newcustomer.getTextCustomerName(), "First character can not have space");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeNameBlank()), json.newCustomermessage().getTypeNameBlank());

	}

	@Test
	public void testcase_05() {
		newcustomer.tabAddress(Keys.TAB);
//		verifyEqual(newcustomer.getTextAddress(), "Address Field must not be blank");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeAddressNull()), json.newCustomermessage().getTypeAddressNull());

	}

	@Test
	public void testcase_06() {
		newcustomer.inputAddress(" ");
//		verifyEqual(newcustomer.getTextAddress(), "First character can not have space");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeAddressFistBlank()), json.newCustomermessage().getTypeAddressFistBlank());

		
	}

	@Test
	public void testcase_08() {
		newcustomer.tabCity(Keys.TAB);
//		verifyEqual(newcustomer.getTextCity_TXT(), "City Field must not be blank");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeCityNull()), json.newCustomermessage().getTypeCityNull());

	}

	@Test
	public void testcase_09() {
		newcustomer.inputCity_TXT("1234 city123");
//		verifyEqual(newcustomer.getTextCity_TXT(), "Numbers are not allowed");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeCityNumeric()), json.newCustomermessage().getTypeCityNumeric());

	}

	@Test
	public void testcase_10() {
		newcustomer.inputCity_TXT("City!@# !@#");
		
//		verifyEqual(newcustomer.getTextCity_TXT(), "Special characters are not allowed");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeCitySpecial()), json.newCustomermessage().getTypeCitySpecial());

	}

	@Test
	public void testcase_11() {
		newcustomer.inputCity_TXT(" ");
//		verifyEqual(newcustomer.getTextCity_TXT(), "First character can not have space");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeCityBlank()), json.newCustomermessage().getTypeCityBlank());

	}

	@Test
	public void testcase_12() {
		newcustomer.tabState_TXT(Keys.TAB);
//		verifyEqual(newcustomer.getTextState_TXT(), "State must not be blank");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeStatenull()), json.newCustomermessage().getTypeStatenull());

	}

	@Test
	public void testcase_13() {
		newcustomer.inputState_TXT("1234 State123");
		;
//		verifyEqual(newcustomer.getTextState_TXT(), "Numbers are not allowed");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeStateNumeric()), json.newCustomermessage().getTypeStateNumeric());

	}

	@Test
	public void testcase_14() {
		newcustomer.inputState_TXT("State!@# !@#");

//		verifyEqual(newcustomer.getTextState_TXT(), "Special characters are not allowed");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeStateSpecial()), json.newCustomermessage().getTypeStateSpecial());

	}

	@Test
	public void testcase_15() {
		newcustomer.inputState_TXT(" ");

//		verifyEqual(newcustomer.getTextState_TXT(), "First character can not have space");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeStateBlank()), json.newCustomermessage().getTypeStateBlank());

	}

	@Test
	public void testcase_16() {
		newcustomer.inputPin_TXT("1234Pin");
//		verifyEqual(newcustomer.getTextPin_TXT(), "Characters are not allowed");

		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypePinCharacter()), json.newCustomermessage().getTypePinCharacter());

	}

	@Test
	public void testcase_17() {
		newcustomer.tabPin_TXT(Keys.TAB);
		
//		verifyEqual(newcustomer.getTextPin_TXT(), "PIN Code must not be blank");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypePinNull()), json.newCustomermessage().getTypePinNull());

	}

	@Test
	public void testcase_18() {
		newcustomer.inputPin_TXT("123");
//		verifyEqual(newcustomer.getTextPin_TXT(), "PIN Code must have 6 Digits");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypePin3Number()), json.newCustomermessage().getTypePin3Number());
		
	}

	@Test
	public void testcase_19() {
		newcustomer.inputPin_TXT("!@#");
//		verifyEqual(newcustomer.getTextPin_TXT(), "Special characters are not allowed");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypePinSpecial()), json.newCustomermessage().getTypePinSpecial());

	}

	@Test
	public void testcase_20() {
		newcustomer.inputPin_TXT(" ");
//		verifyEqual(newcustomer.getTextPin_TXT(), "First character can not have space");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypePinFirstBlank()), json.newCustomermessage().getTypePinFirstBlank());

	}

	@Test
	public void testcase_21() {
		newcustomer.inputPin_TXT("123 ");
//		verifyEqual(newcustomer.getTextPin_TXT(), "PIN Code must have 6 Digits");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypePin3Number()), json.newCustomermessage().getTypePin3Number());

	}

	@Test
	public void testcase_22() {
		newcustomer.tabMobileNumber_TXT(Keys.TAB);
//		verifyEqual(newcustomer.getTextMobileNumber_TXT(), "Mobile no must not be blank");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeTelephoneNull()), json.newCustomermessage().getTypeTelephoneNull());

	}

	@Test
	public void testcase_23() {
		newcustomer.inputMobileNumber_TXT(" ");
//		verifyEqual(newcustomer.getTextMobileNumber_TXT(), "First character can not have space");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeTelephoneBlank()), json.newCustomermessage().getTypeTelephoneBlank());

	}

	@Test
	public void testcase_24() {
		newcustomer.inputMobileNumber_TXT("123abc");
//		verifyEqual(newcustomer.getTextMobileNumber_TXT(), "Characters are not allowed");
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeTelephoneCharacter()), json.newCustomermessage().getTypeTelephoneCharacter());
		
		System.out.println("mess: " +json.newCustomermessage().getTypeTelephoneCharacter());


	}

	@Test
	public void testcase_25() {
		newcustomer.inputMobileNumber_TXT("1176217!@#");
//		verifyEqual(newcustomer.getTextMobileNumber_TXT(), "Special characters are not allowed");

		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeTelephoneSpecial()), json.newCustomermessage().getTypeTelephoneSpecial());

	}

	@Test
	public void testcase_26() {
		newcustomer.tabEmail_TXT(Keys.TAB);
//		verifyEqual(newcustomer.getTextEmail_TXT(), "Email-ID must not be blank");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeEmailNull()), json.newCustomermessage().getTypeEmailNull());
	}

	@Test
	public void testcase_27() {
		newcustomer.inputEmail_TXT("guru99@gmail guru99 Guru99@ guru99@gmail. guru99gmail. com");
		
//		verifyEqual(newcustomer.getTextEmail_TXT(), "Email-ID is not valid");

		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeEmailInvalid()), json.newCustomermessage().getTypeEmailInvalid());

	}

	@Test
	public void testcase_29() {
		newcustomer.inputEmail_TXT(" ");
//		verifyEqual(newcustomer.getTextEmail_TXT(), "First character can not have space");
		
		verifyEqual(newcustomer.getTextDynamicMSG(json.getNewCustomer().getTypeEmailBlank()), json.newCustomermessage().getTypeEmailBlank());
	}

	@Test
	public void testcase_30() {
		newcustomer.inputCustomerName("GiinBM");
		newcustomer.inputDOB("03191995");
		newcustomer.inputAddress("Flemington123");
		newcustomer.inputCity_TXT("SaiGon");
		newcustomer.inputState_TXT("Saigon");
		newcustomer.inputPin_TXT("671164");
		newcustomer.inputMobileNumber_TXT("0344145987");
		newcustomer.inputEmail_TXT(email);
		newcustomer.inputPassword("123456");
		newcustomer.clickSubmit();
		idCustomer = newcustomer.getTextCustomer_ID();
		System.out.println(idCustomer);
	}

	@AfterClass
	public void afterClass() {

	}
}
