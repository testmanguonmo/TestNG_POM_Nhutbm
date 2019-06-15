package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.ui.LogInPageUI;

import CommonPage.commonFunction;

public class LogInPage extends commonFunction {

	public LogInPage(WebDriver driver) {
		super(driver);

	}
	public RegisterPage clickHerLink()
	{
		
		waitVisible(LogInPageUI.HERE_LINK);
		
		click(LogInPageUI.HERE_LINK);
		
		return PageFactory.initElements(driver, RegisterPage.class);
	}

	public void inputUserName(String value) {
		waitVisible(LogInPageUI.USERNAME_LOGIN);

		input(LogInPageUI.USERNAME_LOGIN, value);
	}

	public void inputPassword(String value) {
		waitVisible(LogInPageUI.PASSWORD_LOGIN);

		input(LogInPageUI.PASSWORD_LOGIN, value);
	}

	public HomePage clickButonLogin() {
		waitVisible(LogInPageUI.BTN_LOGIN);

		click(LogInPageUI.BTN_LOGIN);
		
		return PageFactory.initElements(driver, HomePage.class );
	}

	
	
}
