package com.pageObjects;

import org.openqa.selenium.By;


public interface CommonElements {

	public static By curamUAIframe = By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']");
	public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
	//public static By SaveAndExit=By.id("__o3btn.save_and_exit_label");
	
	public static By xyz = By.linkText("View Privacy Act Statement");
	//public static By nextbtn1 = By.id("__o3btn.next_label]");
	
	
		
	}

