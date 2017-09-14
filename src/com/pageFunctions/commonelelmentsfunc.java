package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.CommonElements;


import com.selenium.SafeActions;

public class commonelelmentsfunc extends SafeActions implements CommonElements {

WebDriver d;
	
	public commonelelmentsfunc(WebDriver d) {
		super(d);
		this.d=d;
	
		
	}

	public void click1() throws Exception {
		waitUntilElementVisible(xyz,10);
		//selectFrame(curamUAIframe, 60);
		//waitUntilElementVisible(xyz,60);
		
		d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		waitForPageToLoad(60);
		defaultFrame();
		
		//waitUntilElementVisible(xyz,60);
		
		
		
	}
public void click() throws Exception {

	
	d.switchTo().defaultContent();
	Thread.sleep(4000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	Thread.sleep(2000);
	d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	
	/*//waitUntilPresent(nextbtn,30);
			defaultFrame();
	      selectFrame(curamUAIframe, 60);
			
			safeMouseClick(nextbtn, 60);
			//safeJavaScriptClick(nextbtn, 60);
		
			waitForPageToLoad(60);
			waitUntilEleDisappear(By.xpath(".//div[@dojoattachpoint='_underlayNode']"), 60);
			defaultFrame();
			
				midWait(2);
			*/
	
	}

public void click2() throws Exception {
	
	
	
	safeJavaScriptClick(nextbtn, 60);
	
	
	waitForPageToLoad(60);


}

	

}
