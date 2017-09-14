package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.addpeople;



public class addpeoplefunc extends com.selenium.SafeActions implements addpeople {
	
	WebDriver d;
	public addpeoplefunc(WebDriver d) {
		super(d);
		this.d=d;
	}


	public  void no_morepeople() throws Exception{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(anymorepeople, "No", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);

	}
	
	public  void yes_morepeople() throws Exception{
		//waitUntilPresent(anymorepeople,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

	safeClearAndType(anymorepeople, "Yes", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
	
	}
}
