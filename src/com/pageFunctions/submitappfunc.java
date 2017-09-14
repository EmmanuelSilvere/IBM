package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.submitapp;

import com.selenium.SafeActions;


public class submitappfunc extends SafeActions  implements submitapp {

	WebDriver d;
	public submitappfunc(WebDriver d) {
		super(d);
		this.d=d;
	}

	public void fillin_app(String fnname,String lnname) throws Exception
	{
		//waitUntilPresent(IAgree1,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		d.findElement(By.id("__o3id6")).click();
		d.findElement(By.id("__o3id7")).click();
		d.findElement(By.xpath(".//input[@name='__o3id8' and @title='2 Years']")).click();
		d.findElement(By.id("__o3id9")).click();
		d.findElement(By.id("__o3idc")).click();
		d.findElement(By.id("__o3idd")).click();
		d.findElement(By.id("__o3ide")).sendKeys(fnname);
		d.findElement(By.id("__o3id10")).sendKeys(lnname);
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	/*	safeMouseClick(IAgree1, 30);
		safeMouseClick(IAgree2, 30);
		safeMouseClick(renewal2, 30);
		safeMouseClick(IAgree3, 30);
		safeMouseClick(IAgree4, 30);
		safeMouseClick(IAgree5, 30);
		safeClearAndType(firstname, fnname, 30);
		safeClearAndType(lastname, lnname, 30);
		safeMouseClick(nextbtn, 60);*/
		
		defaultFrame();
		waitForPageToLoad(30);
		
		
	}
	

}
