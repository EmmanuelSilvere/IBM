package com.pageFunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.taxfiler;

import com.selenium.SafeActions;

public class taxfilerfunc extends SafeActions implements taxfiler {

	WebDriver d;
	public taxfilerfunc(WebDriver d) {
		super(d);
		this.d=d;
	}

public void click() throws Exception{
		//waitUntilPresent(taxfiler,50);
			// selectFrame(curamUAIframe, 30);
				
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	Thread.sleep(3000);
	d.findElement(By.id("__o3id6")).click();
	d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
				//safeMouseClick(taxfiler, 60);
				//safeMouseClick(nextbtn, 60);
				//defaultFrame();
	waitForPageToLoad(30);				
		}
		

	
public void click1() throws Exception{

	//waitUntilPresent(taxfiler,25);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();

	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
			
			//safeMouseClick(taxfiler, 60);
			d.findElement(By.xpath("//input[@id='__o3id6']")).click();	
			
			//safeMouseClick(taxfiler1, 30);
			d.findElement(By.xpath("//input[@id='__o3id7']")).click();
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(30);		
		 }

		
public void click2() throws Exception{
		//waitUntilPresent(taxfiler,25);
		//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(4000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
		//safeMouseClick(taxfiler, 60);
		d.findElement(By.xpath("//input[@id='__o3id6' and @type='checkbox']")).click();
		//safeMouseClick(taxfiler1, 30);
		d.findElement(By.xpath("//input[@id='__o3id7' and @type='checkbox']")).click();
		//safeMouseClick(taxfiler2, 30);
		d.findElement(By.xpath("//input[@id='__o3id9' and @type='checkbox']")).click();
		
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	 }

	

public void click3() throws Exception{

	//waitUntilPresent(taxfiler,25);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(4000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	Thread.sleep(2000);
	//safeMouseClick(taxfiler, 60);
	d.findElement(By.xpath(".//input[@id='__o3id6' and @type='checkbox']")).click();
	//safeMouseClick(taxfiler1, 30);
	d.findElement(By.xpath(".//input[@id='__o3id7' and @type='checkbox']")).click();
	//safeMouseClick(taxfiler3, 30);
	d.findElement(By.xpath(".//input[@id='__o3id8' and @type='checkbox']")).click();
	
	safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(30);
			
		 }

public void click1and3() throws Exception{

	//waitUntilPresent(taxfiler,25);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();

	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
			
			//safeMouseClick(taxfiler, 60);
			d.findElement(By.xpath("//input[@id='__o3id6']")).click();	
			
			//safeMouseClick(taxfiler1, 30);
			d.findElement(By.xpath("//input[@id='__o3id8']")).click();
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(30);		
		 }

}
