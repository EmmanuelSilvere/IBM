package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.TaxDependant;

import com.selenium.SafeActions;

public class TaxDependantFunc extends SafeActions implements TaxDependant {

	WebDriver d;
	public TaxDependantFunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void fillin() throws Exception{
		//waitUntilPresent(accom,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(accom, "No", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
		
	}
	
public void fillin1() throws Exception{
	//waitUntilPresent(accom,10);	
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(4000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
		safeClearAndType(accom, "no", 30);
		pressTabKey_Action(accom, 10);
		safeClearAndType(accom1, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}


}
