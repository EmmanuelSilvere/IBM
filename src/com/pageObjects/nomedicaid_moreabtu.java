package com.pageObjects;

import org.openqa.selenium.By;

public interface nomedicaid_moreabtu {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");

	public static By ssnno = By.id("__o3id6");
	public static By ruamericanindian = By.xpath(".//input[@id='__o3id7']");
	public static By enrollment = By.id("__o3id12");
	public static By EnrolledInHP = By.id("__o3id13");
	
}
