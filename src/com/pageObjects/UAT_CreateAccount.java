package com.pageObjects;

import org.openqa.selenium.By;

public interface UAT_CreateAccount {
	
	public static By terms = By.linkText("I ACCEPT THE TERMS");
	public static By createacc = By.linkText("Create Account");	
	
	public static By login = By.linkText("Login");
	
	public static By logout = By.linkText("Logout");
	
	public static By individualandfamily = By.xpath(".//*[@id='trigger_individual']/div[1]/a/img[1]");
	
	public static By yes_assistance = By.xpath("(//input[@id='assisted']/../a/img[contains(@src,'radio-off.png')])[1]");
	
	public static By no_assistance = By.xpath("(//input[@id='assisted']/../a/img[contains(@src,'radio-off.png')])[2]");
	
	public static By continuebtn = By.xpath("//input[@id='choose-account']");
	
	//public static By email = By.xpath("//input[@id='user_email']");
	public static By email = By.xpath("//input[@id='user_oim_id']");

	public static By pwd = By.xpath("//input[@id='user_password']");
	
	public static By confirmpswd = By.xpath("//input[@id='user_password_confirmation']");
	
	public static By crtaccount = By.xpath("//input[@value='Create account']");
	
	public static By fstname = By.xpath("//input[@id='person_first_name']");
	
	public static By lstname = By.xpath("//input[@id='person_last_name']");
	
	public static By bdate = By.xpath("//input[@id='jq_datepicker_ignore_person_dob']");
	
	public static By social = By.xpath("//input[@id='person_ssn']");
	
	public static By no_ssn = By.xpath("//input[@id='person_no_ssn']");
	
	public static By male = By.xpath("//*[@id='personal_info']/div[2]/div[4]/div/label");
	
	public static By female = By.xpath("//*[@id='personal_info']/div[2]/div[5]/div/label");
	
	//public static By cntn = By.xpath("//button[contains(text(),'CONTINUE')]");
	public static By cntn = By.xpath("//span[contains(text(),'CONTINUE')]");
	public static By contnu = By.xpath("//a[contains(text(),'Continue')]");
	public static By InfoCont = By.xpath("//a[contains(text(),'CONTINUE')]");
	//public static By ContinueasanIndividual = By.linkText("Continue as an Individual");
	
	
	//-----------------------------folloing for QA env
	
	public static By indNfly = By.xpath(".//*[@id='block-menu-block-1']//a[@title='Individuals & Families']");	 
	public static By ApplyNow =  By.xpath(".//a[@class='btn btn-green first']");
	public static By FName = By.cssSelector("#f-first_name_1");
	public static By LName = By.cssSelector("#f-last_name_1");
	public static By UName = By.cssSelector("#f-username_1");
	public static By PWD = By.cssSelector("#f-password_1");
	public static By ConfirmPWD = By.cssSelector("#f-confirm_password_1");
	public static By CreateAc = By.cssSelector("#e-submit_individual");
	
	
	
}
