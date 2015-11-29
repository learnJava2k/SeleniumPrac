package com.QB.PageObject;

import com.QB.util.BaseClass;

public class MarketingPage extends BaseClass{
	
	static String Email="#ius-email";
	static String ConfirmEmail="#ius-confirm-email-address";
	static String FirstName="#ius-first-name";
	static String LastName="#ius-last-name";
	static String Password="#ius-password";
	static String ConfirmPassword="ius-confirm-password";
	static String Phone="#ius-mobile-phone";
	static String SignUp="#ius-sign-up-submit-btn";
	public static String getEmail() {
		return Email;
	}
	public static void setEmail(String email) {
		SetValue(email,Email);
	}
	
	public static void setConfirmEmail(String confirmemail) {
		SetValue(confirmemail,ConfirmEmail);
	}
	public static String getFirstName() {
		return FirstName;
	}
	public static void setFirstName(String Fname) {
		SetValue(Fname,FirstName);
	}
	public static String getLastName() {
		return LastName;
	}
	public static void setLastName(String Lname) {
		SetValue(Lname,LastName);
	}
	public static String getPassword() {
		return Password;
	}
	public static void setPassword(String password) {
		SetValue(password,Password);
	}
	public static String getConfirmPassword() {
		return ConfirmPassword;
	}
	public static void setConfirmPassword(String Cpassword) {
		SetValue(Cpassword,ConfirmPassword);
	}
	public static String getPhone() {
		return Phone;
	}
	public static void setPhone(String phone) {
		SetValue(phone,Phone);
	}
	public static double randNo()
	{
		double no= Math.random();
		return no;
		
	}
	public static void clickSignUp(){
		click(SignUp);
	}


}