package com.bankguru.ui;

public class NewCustomerUI {
	
	public static final String WELCOME_ADD_NEW_CUSTOMER= "//p[contains(text(),'Add New Customer')]";
	
	public static final String CUSTOMER_NAME_TXT= "//input[@name='name']";
	
	public static final String CUSTOMER_NAME_MESSAGE="//input[@name='name']/following-sibling::label";
	
	public static final String DATEOFBIRTH_TXT = "//input[@id='dob']";
 	
	public static final String ADDRESS_AREA = "//textarea[@name='addr']";
	
	public static final String ADDRESS_AREA_MESSAGE= "//textarea[@name='addr']//following-sibling::label";
	
	public static final String CITY_TXT= "//input[@name='city']";
	
	public static final String CITY_TXT_MESSAGE = "//label[@id='message4']";

	public static final String STATE_TXT = "//input[@name='state']";
	
	public static final String STATE_TXT_MESSAGE = "//input[@name='state']//following-sibling::label";
	
	public static final String PIN_TXT = "//input[@name='pinno']";
	
	public static final String PIN_TXT_MESSAGE = "//input[@name='pinno']//following-sibling::label";

	public static final String MOBILE_NUMBER_TXT  = "//input[@name='telephoneno']";
	
	public static final String MOBILE_NUMBER_TXT_MESSAGE  = "//label[@id='message7']";
	
	public static final String EMAIL_TXT  = "//input[@name='emailid']";
	
	public static final String EMAIL_TXT_MESSAGE  = "//label[@id='message9']";
	
	public static final String PASSWORD_TXT  = "//input[@name='password']";
	
	public static final String SUBMIT_BTT  = "//input[@name='sub']";
	
	public static final String CUSTOMER_ID_CONTENT  = "//td[contains(text(),'Customer ID')]//following-sibling::td";
	
	public static final String DYNAMIC_MSG = "//*[contains(text(),'%s')]";
	
	
 






	

}
