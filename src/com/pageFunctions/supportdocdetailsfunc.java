package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.supportdocdetails;

import com.selenium.SafeActions;

public class supportdocdetailsfunc extends SafeActions implements supportdocdetails {

	WebDriver d;
	public supportdocdetailsfunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void fillin(String alienno) throws Exception {     //I-571 (Refugee Travel Document)
		//waitUntilPresent(sprtdoc,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(sprtdoc, alienno, 30);
		
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	
	}
	
public void fillin1(String alienno1) throws Exception {
	   //waitUntilPresent(sprtdoc,10);
	  // selectFrame(curamUAIframe, 30);
	
	   d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(sprtdoc, alienno1, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}

public void fillin2(String alienno2) throws Exception {
	//waitUntilPresent(sprtdoc,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(sprtdoc, alienno2, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	

}
public void fillPRCard(String alienno, String cardno) throws Exception {
	//waitUntilPresent(sprtdoc,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(sprtdoc, alienno, 30);
	safeClearAndType(CardNo, cardno, 30);
	
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);


}
	
}
