package com.pageObjects;

import org.openqa.selenium.By;

public interface additionaldetails {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
//	public static By blindinfo=By.xpath(".//div[@aria-label='Is anyone in the Application Group blind? Mandatory']/div[1]/input");
//	
//	public static By no_blindinfo = By.xpath(".//div[@id='__o3id8_popup1']");
	
	public static By Last3MonthsBills = By.id("__o3id6");

	public static By blindinfo = By.id("__o3id8");
	
//	public static By disabilityinfo=By.xpath(".//div[@aria-label='Is anyone in the Application Group disabled? Mandatory']/div[1]/input");
//	
//	public static By no_disability = By.xpath(".//div[@id='__o3ida_popup1']");
	
	public static By disability = By.id("__o3ida");
	
//	public static By helpindailyactivities=By.xpath(".//div[@aria-label='Does anyone in the Application Group need help with activities of daily living (i.e. bathing, eating) through home health services, a nursing home, or other medical facility? Mandatory']/div[1]/input");
//
//	public static By no_helpdailyactivities= By.xpath(".//div[@id='__o3idc_popup1']");
	
	public static By helpdailyactivities= By.id("__o3idc");
	
	
public static By blindinfo1 = By.id("__o3id9");
	

	
	public static By disability1 = By.id("__o3idc");
	
	public static By disabled = By.id("__o3ide");
	

	
	public static By helpdailyactivities1 = By.id("__o3idf");
	
public static By blindinfo2 = By.id("__o3idf");
	

	public static By disability2 = By.id("__o3id18");
	
	public static By helpdailyactivities2 = By.id("__o3id21");
	
public static By blindinfo3 = By.id("__o3ida");
	

	public static By disability3 = By.id("__o3ide");
	
	public static By helpdailyactivities3 = By.id("__o3id12");
	
public static By blindinfo4 = By.id("__o3idb");
	

	public static By disability4 = By.id("__o3id10");
	
	public static By helpdailyactivities4 = By.id("__o3id15");
	
public static By blindinfo5 = By.id("__o3idc");
	

	public static By disability5 = By.id("__o3id12");
	
	public static By helpdailyactivities5 = By.id("__o3id18");
	
public static By blindinfo6 = By.id("__o3idd");
	
	public static By disability6 = By.id("__o3id14");
	
	public static By helpdailyactivities6 = By.id("__o3id1b");
	
	
	//==============================Non-Magi 2 HH ========================
	
	public static By UnPaidBills = By.xpath("//input[contains(@title,'medical bills') and @role='textbox']");	
	public static By Person1 = By.id("__o3id7");
	public static By Person2 = By.id("__o3id8");
	public static By Residence = By.id("__o3id9");
	public static By Citizen = By.id("__o3ida");
	public static By Income = By.id("__o3idb");
	
	
	
	
	public static By Bills = By.xpath("//input[contains(@title,'medical bills') and @role='textbox']");		
	public static By Blind = By.xpath("//input[contains(@title,'Group blind') and @role='textbox']");
	public static By Disable = By.xpath("//input[contains(@title,'Group disabled') and @role='textbox']");
	public static By Help = By.xpath("//input[contains(@title,'help with activities of daily') and @role='textbox']");
	
	
	
	
	
	
	
}
