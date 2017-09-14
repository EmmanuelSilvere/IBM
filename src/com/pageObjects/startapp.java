

package com.pageObjects;

import org.openqa.selenium.By;

public interface startapp {
	
	public static By curamUAIframe = By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @title='Welcome to DC Health Link.']");
	

	public static By startapplication = By.linkText("Start Application");
	
	//public static By startapplication = By.cssSelector(".field-link");	
}
