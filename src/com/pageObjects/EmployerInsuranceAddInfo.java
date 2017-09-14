package com.pageObjects;


import org.openqa.selenium.By;

public interface EmployerInsuranceAddInfo {
	
	public static By curamUAIframe = By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']");
		
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
public static By emplyrname = By.id("__o3id6");
	
	public static By EIN = By.id("__o3id7");
	
public static By empyetyp = By.id("__o3id8");
	
	public static By adrsln1 = By.id("__o3id9");
	
public static By cty = By.id("__o3idc");
	
	public static By stt = By.id("__o3idd");
	
public static By zpcode = By.id("__o3ide");
	
	public static By costplan = By.id("__o3id10");
	
public static By empcontribution = By.id("__o3id11");
	
	public static By contributionfreq = By.id("__o3id12");
	
	public static By EligibleESI = By.id("__o3id7");
	

	
	//  Following objects are for Eligible for ESI Screen
	
	public static By ESI_PersonEligible = By.id("__o3id7");
	public static By ESI_Employer= By.id("__o3id6"); 
	public static By ESI_AddLine1 = By.id("__o3id8");
	public static By ESI_City = By.id("__o3idb");
	public static By ESI_State = By.id("__o3idc");
	public static By ESI_Zip = By.id("__o3idd");
	public static By ESI_InWaitingPeriod = By.id("__o3idf");
	public static By ESI_StartDt = By.id("__o3id10");
	public static By ESI_MeetsMVS = By.id("__o3id11");
	public static By ESI_LowestMVS = By.id("__o3id12");
	public static By ESI_HowOften = By.id("__o3id13");
	public static By ESI_EndDt = By.id("__o3id14");
	
}

