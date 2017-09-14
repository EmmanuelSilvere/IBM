package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.taxfilestatus;

import com.selenium.SafeActions;

public class taxfilestatusfunc extends SafeActions implements taxfilestatus {

	WebDriver d;
	public taxfilestatusfunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void yes_filetaxes() throws Exception{
		//waitUntilPresent(filetaxes,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		//safeClearAndType(filetaxes, "yes", 30);
		d.findElement(By.xpath("//input[@id='__o3id6']")).sendKeys("Yes");
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		/*safeMouseClick(nextbtn, 60);
		defaultFrame();*/
		waitForPageToLoad(30);
		midWait(2);
	}

public void no_filetaxes() throws Exception{
	//waitUntilPresent(filetaxes,10);
	//selectFrame(curamUAIframe, 30);
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
		safeClearAndType(filetaxes, "No", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		midWait(2);
	}
}
