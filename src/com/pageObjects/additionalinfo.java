package com.pageObjects;

import org.openqa.selenium.By;

public interface additionalinfo {
	
	public static By curamUAIframe = By.id("curamUAIframe");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	public static By enrolledplan = By.id("__o3id6");

	public static By coveragestartdate = By.id("__o3idb");
	
	public static By coverageenddate = By.id("__o3idc");
	
	public static By otherbenfits = By.id("__o3ide");
	
	
	public static By ESIEligible = By.id("__o3id8");
	public static By ESIEmpName = By.id("__o3id6");
	public static By ESIEmpID = By.id("__o3id7");
	public static By ESIAdd1 = By.id("__o3id8");
	public static By ESICity = By.id("__o3idb");
	public static By ESIState = By.id("__o3idc");
	public static By ESIZip = By.id("__o3idd");
	public static By ESIWaiting = By.id("__o3idf");
	public static By ESIStDate = By.id("__o3id10");
	public static By OfferESI = By.id("__o3id11");
	public static By ESILowestCost = By.id("__o3id12");
	public static By ESIPayFreq = By.id("__o3id13");
	public static By ESIEndDate = By.id("__o3id14");
	public static By ESIOtherAppl = By.id("__o3id15"); // check box
	
	
	// Incarceration page objects
	
	public static By PendingDisp = By.id("__o3id6");  //Is SLFPOF incarcerated pending disposition of charges?*
	public static By ExpReleaseDT = By.id("__o3id7"); //What is the expected release date for SLFPOF?
	public static By DtOfIncarc = By.id("__o3id8"); 	 //What is the date that SLFPOF became Incarcerated?*
	public static By Involuntarily = By.id("__o3id9"); //Is SLFPOF involuntarily incarcerated in a jail, detention center, or halfway house in Washington, DC?*
	
	
	

	
	
}
