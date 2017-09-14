package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.termsconditions;

import com.selenium.SafeActions;;

public class termsandconditionsfunc extends SafeActions  implements termsconditions {
	
	public WebDriver d;
	
	public termsandconditionsfunc(WebDriver d){
		super(d);
		this.d=d;
	}

	public void click() throws Exception{
		
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		d.findElement(By.xpath("//input[@name='__o3id6' and @title='I Agree']")).click();
		d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	
		
		
		/*waitUntilPresent(IAgree,10);
		selectFrame(curamUAIframe, 30);
		
		safeMouseClick(IAgree, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);*/
		
	}

}
