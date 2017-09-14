package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.yearhomebuilt;

import com.selenium.SafeActions;

public class yearhomebuiltfunc extends SafeActions implements yearhomebuilt {

	WebDriver d;
	
	public yearhomebuiltfunc(WebDriver d) {
		super(d);
	this.d=d;
	}

	public void opt() throws InterruptedException{

	    	d.switchTo().defaultContent();
			Thread.sleep(2000);
			d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
			Thread.sleep(3000);
			//d.findElement(By.xpath("//input[@type='radio'and @title='NONE OF THE ABOVE']")).click();
			d.findElement(By.id("__o3id6_4")).click();   // None of the Above 
			d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	
		
		
		/*//waitUntilPresent(fourthopt,10);
		//selectFrame(curamUAIframe, 60);
		safeMouseClick(fourthopt, 60);
		safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);*/
		
	}
	
	
}
