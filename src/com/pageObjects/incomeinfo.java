package com.pageObjects;

import org.openqa.selenium.By;

public interface incomeinfo {
	
	public static By curamUAIframe = By.xpath(".//*[@id='curamUAIframe']");
	
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");

	public static By incomeinfo = By.xpath("//input[@id='__o3id6' and @role='textbox']");
}
