package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.nomedicaid_moreabtu;
import com.selenium.SafeActions;

public class nomedicaid_moreabtufunc extends SafeActions implements nomedicaid_moreabtu {

	WebDriver d;
	public nomedicaid_moreabtufunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void fillin(String ssn, String Ind,String enrlmnt) throws InterruptedException{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		
		safeClearAndType(ssnno, ssn, 30);
		safeClearAndType(ruamericanindian, Ind, 30);		
		safeClearAndType(EnrolledInHP, enrlmnt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
	}
	
	public void MainApplicant(String ssn,String enrlmnt) throws InterruptedException{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		
		safeClearAndType(ssnno, ssn, 30);
		safeClearAndType(enrollment, enrlmnt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
	}
}
	
	
	
	
	
	