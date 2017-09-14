package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.streetresidence;

import com.selenium.SafeActions;

public class streetresifunc extends SafeActions implements streetresidence{
WebDriver d;
	public streetresifunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void opt() throws Exception{
		
		
		d.switchTo().defaultContent();

		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
		//d.findElement(By.xpath("//input[@type='radio'and @title='NONE OF THE ABOVE']")).click();
		d.findElement(By.id("__o3id6_4")).click();   // None of the Above 
		
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	
		
/*		//waitUntilPresent(fifthopt,10);
		//selectFrame(curamUAIframe, 30);
		safeMouseClick(fifthopt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);*/
		
	}
	
	
}
