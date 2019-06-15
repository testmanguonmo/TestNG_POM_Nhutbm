package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.ui.RegisterPageUI;

import CommonPage.commonFunction;

public class RegisterPage extends commonFunction {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	public void inputEmailToRegister(String value)
	{
		waitVisible(RegisterPageUI.EMAIL_REGISTER_TXT);
		input(RegisterPageUI.EMAIL_REGISTER_TXT, value );
	}

	public void clickSubmit()
	{
		waitVisible(RegisterPageUI.EMAIL_REGISTER_SUBMITBTN);
		click(RegisterPageUI.EMAIL_REGISTER_SUBMITBTN);
	}
	
	public String getUsername()
	{
		waitVisible(RegisterPageUI.USERNAME);
		return getText(RegisterPageUI.USERNAME);
	}
	
	public String getPassword()
	{
		waitVisible(RegisterPageUI.PASSWORD);
		return getText(RegisterPageUI.PASSWORD);
	}
	
	
	public LogInPage navigateToLoginPage(String value)
	{
		openUrl(value);
		return PageFactory.initElements(driver, LogInPage.class);
	}
	
	
}
