package com.QB.Test;

import org.testng.annotations.Test;

import com.QB.PageObject.MarketingPage;

public class MarketingTest extends MarketingPage {
	
	//@Test
	
	//public void SignUp(){
	public static void main(String args[]){
		openURL("http://www.quickbooks.intuit.com/start/core_sui?bc=USP-TDN");
		double rno=randNo();
		setEmail("testu18nov"+rno+"@gmail.com");
		setConfirmEmail("testu18nov"+rno+"@gmail.com");
		setFirstName("Test");
		setLastName("LName");
		setPassword("Passw0rd#");
		setConfirmPassword("Passw0rd#");
		setPhone("6509440000");
		clickSignUp();
		
	
	}
	
	
}
