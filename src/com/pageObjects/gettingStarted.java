package com.pageObjects;

import org.openqa.selenium.By;

public interface gettingStarted {
	
	public static By curamUAIframe = By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");

	
	public static By Formyselfandormyfamily = By.xpath("//input[starts-with(@title,'For myself')]");
	
	//public static By Formyselfandormyfamily = By.xpath("html/body/form/div/div[3]/div[5]/div/div/div/div/div[3]/table/tbody/tr/td/div/fieldset/div/div[1]/div/input");

	
	//	public static By CallCenterRepresentativeCaseworker = By.id("__o3id6_1107545605");
//	
//	public static By Asanauthorizedrepresentative = By.id("__o3id6_1107545605");
	
}


	

