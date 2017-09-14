package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.gettingStarted;




public class gettingstartedfunc extends com.selenium.SafeActions implements gettingStarted {

	
    WebDriver d;
	public gettingstartedfunc(WebDriver d) {
		super(d);
		this.d=d;
	}

	public void click() throws InterruptedException{

		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[starts-with(@title,'For myself')]")).click();	
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		
		/*//waitUntilPresent(Formyselfandormyfamily,30);
		selectFrame(curamUAIframe, 30);
		safeMouseClick(Formyselfandormyfamily, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);*/
	
	}
}
