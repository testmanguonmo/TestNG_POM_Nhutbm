package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.bankguru.ui.EditCustomerUI;

import CommonPage.commonFunction;

public class EditCustomer extends commonFunction {

	public EditCustomer(WebDriver driver) {
		super(driver);
	}

	public void tabCustomerID_TXT(Keys key)
	{
		waitVisible(EditCustomerUI.CUSTOMER_ID_TXT);
		inputKeys(EditCustomerUI.CUSTOMER_ID_TXT, key);
	}
	
	public String getTextCustomerID_TXT_MESSAGE()
	{
		waitVisible(EditCustomerUI.CUSTOMER_ID_TXT_MESSAGE);
		return getText(EditCustomerUI.CUSTOMER_ID_TXT_MESSAGE);
	}
	
	public void inputCustomerID_TXT(String value)
	{
		waitVisible(EditCustomerUI.CUSTOMER_ID_TXT);
		input(EditCustomerUI.CUSTOMER_ID_TXT, value);
	}
	
	public void clickSubmit_BTT()
	{
		waitVisible(EditCustomerUI.SUBMIT_BTT);
		click(EditCustomerUI.SUBMIT_BTT);
	}
	
	public String getTextPopup()
	{
		return getTextAlert();
	}
	
	
	public void cleanAddress_AREA()
	{
		waitVisible(EditCustomerUI.ADDRESS_AREA);
		clear(EditCustomerUI.ADDRESS_AREA);
	}
	
	public String getTextAddress_AREA_MESSAGE()
	{
		waitVisible(EditCustomerUI.ADDRESS_AREA_MESSAGE);
		return getText(EditCustomerUI.ADDRESS_AREA_MESSAGE);
	}
	
	public void cleanCity_TXT()
	{
		waitVisible(EditCustomerUI.CITY_TXT);
		clear(EditCustomerUI.CITY_TXT);
	}
	
	public void inputCity_TXT(String value)
	{
		waitVisible(EditCustomerUI.CITY_TXT);
		input(EditCustomerUI.CITY_TXT, value);
	}

	
	public String getTextCity_TXT_MESSAGE()
	{
		waitVisible(EditCustomerUI.CITY_TXT_MESSAGE);
		return getText(EditCustomerUI.CITY_TXT_MESSAGE);
	}
	
	public void cleanState_TXT()
	{
		waitVisible(EditCustomerUI.STATE_TXT);
		clear(EditCustomerUI.STATE_TXT);
	}
	
	public void inputState_TXT(String value)
	{
		waitVisible(EditCustomerUI.STATE_TXT);
		input(EditCustomerUI.STATE_TXT, value);
	}

	public String getTextState_TXT_MESSAGE()
	{
		waitVisible(EditCustomerUI.STATE_TXT_MESSAGE);
		return getText(EditCustomerUI.STATE_TXT_MESSAGE);
	}
		
	public void cleanPin_TXT()
	{
		waitVisible(EditCustomerUI.PIN_TXT);
		clear(EditCustomerUI.PIN_TXT);
	}
	
	public void inputPin_TXT(String value)
	{
		waitVisible(EditCustomerUI.PIN_TXT);
		input(EditCustomerUI.PIN_TXT, value);
	}

	
	public String getTextPin_TXT_MESSAGE()
	{
		waitVisible(EditCustomerUI.PIN_TXT_MESSAGE);
		return getText(EditCustomerUI.PIN_TXT_MESSAGE);
	}
	
	public void cleanTelephoneNumber_TXT()
	{
		waitVisible(EditCustomerUI.MOBILENUMBER_TXT);
		clear(EditCustomerUI.MOBILENUMBER_TXT);
	}
	
	public void inputTelephoneNumber_TXT(String value)
	{
		waitVisible(EditCustomerUI.MOBILENUMBER_TXT);
		input(EditCustomerUI.MOBILENUMBER_TXT, value);
	}

	
	public String getTextTelephoneNumber_TXT_MESSAGE()
	{
		waitVisible(EditCustomerUI.MOBILENUMBER_TXT_MESSAGE);
		return getText(EditCustomerUI.MOBILENUMBER_TXT_MESSAGE);
	}
	
	public void cleanEmail_TXT()
	{
		waitVisible(EditCustomerUI.EMAIL_TXT);
		clear(EditCustomerUI.EMAIL_TXT);
	}
	
	public void inputEmail_TXT(String value)
	{
		waitVisible(EditCustomerUI.EMAIL_TXT);
		input(EditCustomerUI.EMAIL_TXT, value);
	}

	
	public String getTextEmail_TXT_MESSAGE()
	{
		waitVisible(EditCustomerUI.EMAIL_TXT_MESSAGE);
		return getText(EditCustomerUI.EMAIL_TXT_MESSAGE);
	}
	
	
//	public void 
	
}
