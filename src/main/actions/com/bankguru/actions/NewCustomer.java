package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.bankguru.ui.NewCustomerUI;

import CommonPage.commonFunction;

public class NewCustomer extends commonFunction {

	public NewCustomer(WebDriver driver) {
		super(driver);
	}

	public String getTextAddNew() {
		waitVisible(NewCustomerUI.WELCOME_ADD_NEW_CUSTOMER);

		return getText(NewCustomerUI.WELCOME_ADD_NEW_CUSTOMER);
	}

	public void tabCustomerName(Keys key) {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);

		inputKeys(NewCustomerUI.CUSTOMER_NAME_TXT, key);

	}

	public String getTextCustomerName() {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_MESSAGE);

		return getText(NewCustomerUI.CUSTOMER_NAME_MESSAGE);
	}

	public void inputCustomerName(String value) {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);

		input(NewCustomerUI.CUSTOMER_NAME_TXT, value);
	}

	public void tabAddress(Keys key) {
		waitVisible(NewCustomerUI.ADDRESS_AREA);
		inputKeys(NewCustomerUI.ADDRESS_AREA, key);

	}

	public String getTextAddress() {
		waitVisible(NewCustomerUI.ADDRESS_AREA_MESSAGE);
		return getText(NewCustomerUI.ADDRESS_AREA_MESSAGE);
	}

	public void inputAddress(String value) {
		waitVisible(NewCustomerUI.ADDRESS_AREA);
		input(NewCustomerUI.ADDRESS_AREA, value);

	}
	
	public void tabCity(Keys key)
	{
		waitVisible(NewCustomerUI.CITY_TXT);
		inputKeys(NewCustomerUI.CITY_TXT, key);
	}
	
	public String getTextCity_TXT()
	{
		waitVisible(NewCustomerUI.CITY_TXT_MESSAGE);
		return getText(NewCustomerUI.CITY_TXT_MESSAGE);
	}
	
	public void inputCity_TXT(String value)
	{
		waitVisible(NewCustomerUI.CITY_TXT);
		input(NewCustomerUI.CITY_TXT, value);
	}
	
	public void tabState_TXT(Keys key)
	{
		waitVisible(NewCustomerUI.STATE_TXT);
		inputKeys(NewCustomerUI.STATE_TXT, key);
	}
	
	public String getTextState_TXT()
	{
		waitVisible(NewCustomerUI.STATE_TXT_MESSAGE);
		return getText(NewCustomerUI.STATE_TXT_MESSAGE);
	}
	
	public void inputState_TXT(String value)
	{
		waitVisible(NewCustomerUI.STATE_TXT);
		input(NewCustomerUI.STATE_TXT, value);
	}

	public void tabPin_TXT(Keys key)
	{
		waitVisible(NewCustomerUI.PIN_TXT);
		inputKeys(NewCustomerUI.PIN_TXT, key);
	}
	
	public void inputPin_TXT(String value)
	{
		waitVisible(NewCustomerUI.PIN_TXT);
		input(NewCustomerUI.PIN_TXT, value);
	}
	
	public String getTextPin_TXT()
	{
		waitVisible(NewCustomerUI.PIN_TXT_MESSAGE);
		return getText(NewCustomerUI.PIN_TXT_MESSAGE);
	}
	
	public void tabMobileNumber_TXT(Keys key)
	{
		waitVisible(NewCustomerUI.MOBILE_NUMBER_TXT);
		inputKeys(NewCustomerUI.MOBILE_NUMBER_TXT, key);
	}
	
	public void inputMobileNumber_TXT(String value)
	{
		waitVisible(NewCustomerUI.MOBILE_NUMBER_TXT);
		input(NewCustomerUI.MOBILE_NUMBER_TXT, value);
	}
	
	public String getTextMobileNumber_TXT()
	{
		waitVisible(NewCustomerUI.MOBILE_NUMBER_TXT_MESSAGE);
		return getText(NewCustomerUI.MOBILE_NUMBER_TXT_MESSAGE);
	}
	
	public void tabEmail_TXT(Keys key)
	{
		waitVisible(NewCustomerUI.EMAIL_TXT);
		inputKeys(NewCustomerUI.MOBILE_NUMBER_TXT, key);
	}
	
	public void inputEmail_TXT(String value)
	{
		waitVisible(NewCustomerUI.EMAIL_TXT);
		input(NewCustomerUI.EMAIL_TXT, value);
	}
	
	public String getTextEmail_TXT()
	{
		waitVisible(NewCustomerUI.EMAIL_TXT_MESSAGE);
		return getText(NewCustomerUI.EMAIL_TXT_MESSAGE);
	}
	
	public void inputPassword(String value)
	{
		waitVisible(NewCustomerUI.PASSWORD_TXT);
		input(NewCustomerUI.PASSWORD_TXT, value);
	}
	
	public void clickSubmit()
	{
		waitVisible(NewCustomerUI.SUBMIT_BTT);
		click(NewCustomerUI.SUBMIT_BTT);
	}
	
	public void inputDOB(String value)
	{
		waitVisible(NewCustomerUI.DATEOFBIRTH_TXT);
		input(NewCustomerUI.DATEOFBIRTH_TXT, value);
	}
	
	public String getTextCustomer_ID()
	{
		waitVisible(NewCustomerUI.CUSTOMER_ID_CONTENT);
		return getText(NewCustomerUI.CUSTOMER_ID_CONTENT);
	}
	
	public String getTextDynamicMSG(String value)
	{
		waitVisibleDynamicElement(NewCustomerUI.DYNAMIC_MSG, value);
		return getTextDynamicElement(NewCustomerUI.DYNAMIC_MSG, value);
	}
	
//	public void input(String value)
//	{
//		waitVisible(NewCustomerUI.PASSWORD_TXT);
//		inputDynamicElement(NewCustomerUI.PASSWORD_TXT, value, dynamic);(NewCustomerUI.PASSWORD_TXT, value);
//	}
	
}
