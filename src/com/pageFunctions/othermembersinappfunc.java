package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.othermembersinapp;

import com.selenium.SafeActions;



public class othermembersinappfunc extends SafeActions implements othermembersinapp {

    WebDriver d;	
	public othermembersinappfunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}
	
	
	public void fillin(String newmem) throws Exception{
				
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		safeClearAndType(othersinapp, newmem, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
	public void Yes() throws Exception{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		System.out.println("Inside Yes members");
		
		safeClearAndType(othersinapp, "Yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
	public void No() throws Exception{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		System.out.println("Inside No members");
		safeClearAndType(othersinapp, "No", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
public void fillin1(String newmem1) throws Exception{
	
	//waitUntilPresent(othersinapp,10);	
	//selectFrame(curamUAIframe, 60);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
		safeClearAndType(othersinapp, newmem1, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
public void fillin2(String newmem2) throws Exception{
	//waitUntilPresent(othersinapp,10);
	//selectFrame(curamUAIframe, 60);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(othersinapp, newmem2, 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

}

}
