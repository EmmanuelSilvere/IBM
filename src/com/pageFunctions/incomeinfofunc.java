package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.incomeinfo;



public class incomeinfofunc extends com.selenium.SafeActions implements incomeinfo {

	WebDriver d;
	public incomeinfofunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void yes_income() throws Exception{
		

		
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		d.findElement(By.xpath("//input[@role='textbox' and @id='__o3id6']")).clear();
		d.findElement(By.xpath("//input[@role='textbox' and @id='__o3id6']")).sendKeys("Yes"); 
		//d.findElement(By.xpath("//input[@id='__o3id6' and starts-with(@title,'Is this what you expect')]")).sendKeys("Yes");
		
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	/*	safeClearAndType(incomeinfo, "yes", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();*/
		waitForPageToLoad(30);
		
		
	}
	public void income(String amt) throws Exception{
		

		
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		d.findElement(By.xpath("//input[@id='__o3id6']")).clear();
		d.findElement(By.xpath("//input[@id='__o3id6']")).sendKeys(amt);  // temporarily removed for answering new Annual Income question
		//d.findElement(By.xpath("//input[@id='__o3id6' and starts-with(@title,'Is this what you expect')]")).sendKeys("Yes");
		
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	/*	safeClearAndType(incomeinfo, "yes", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();*/
		waitForPageToLoad(30);
		
		
	}
	

public void no_income() throws Exception{
	
	
	
	d.switchTo().defaultContent();
	Thread.sleep(3000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	d.findElement(By.xpath("//input[@role='textbox' and @id='__o3id6']")).clear();
	d.findElement(By.xpath("//input[@role='textbox' and @id='__o3id6']")).sendKeys("No");  // temporarily removed for answering new Annual Income question
	//d.findElement(By.xpath("//input[@id='__o3id6' and starts-with(@title,'Is this what you expect')]")).sendKeys("Yes");
	
	d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	
	waitForPageToLoad(30);

	}


}


