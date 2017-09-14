package com.pageObjects;

import org.openqa.selenium.By;

public interface addpeople {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	
	//public static By anymorepeople  = By.id("__o3id6");
	public static By anymorepeople  = By.xpath("//input[@role='textbox' and @id='__o3id6']");
}
