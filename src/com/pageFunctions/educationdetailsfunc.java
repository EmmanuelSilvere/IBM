package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.educationdetails;



public class educationdetailsfunc extends com.selenium.SafeActions implements educationdetails {

	WebDriver d;
	public educationdetailsfunc(WebDriver d) {
		super(d);
		this.d=d;
	}

	public void opt() throws Exception{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		Thread.sleep(3000);
		//d.findElement(By.xpath("//input[@type='radio'and @title='NONE OF THE ABOVE']")).click();
		d.findElement(By.id("__o3id6_4")).click();   // None of the Above 
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	
		
		
		
		/*//waitUntilPresent(fifthopt,10);
		//selectFrame(curamUAIframe, 30);
		
		safeMouseClick(fifthopt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
*/	
	}
	

}
