package com.pageFunctions;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.additionaldetails;
import com.selenium.SafeActions;





public class additionaldetailsfunc extends SafeActions implements additionaldetails {
	Logger log =Logger.getLogger("additionaldetailsfunc");
	
	WebDriver d;
public additionaldetailsfunc(WebDriver d) {
		super(d);
		this.d=d;
	}

	public void fillin() throws Exception{  // Use this function when application has 1 HH (Single Memeber)
				
		//waitUntilPresent(blindinfo,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(Last3MonthsBills, "no", 30);
		
		safeClearAndType(blindinfo, "no", 30);
	
		safeClearAndType(disability, "no", 30);
		
		safeClearAndType(helpdailyactivities, "no", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
		
	}


	
public void fillin1() throws Exception{   // Use this function when application has 2 HH 
	//waitUntilPresent(blindinfo1,10);
//	selectFrame(curamUAIframe, 30);
		
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(Last3MonthsBills, "no", 30);
	
	safeClearAndType(blindinfo1, "no", 30);
		
	safeClearAndType(disability1, "no", 30);
		
	safeClearAndType(helpdailyactivities1, "no", 30);
		
	safeMouseClick(nextbtn, 60);
		
	defaultFrame();
	
	waitForPageToLoad(30);
		
	}

public void fillin2() throws Exception{
	//waitUntilPresent(blindinfo1,10);
	
	//selectFrame(curamUAIframe, 30);
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(Last3MonthsBills, "no", 30);
	
	safeClearAndType(blindinfo1, "no", 30);
	
	safeClearAndType(disability1, "yes", 30);
	
	safeClick(disabled,30);
	
	safeClearAndType(helpdailyactivities1, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin3() throws Exception{
	//waitUntilPresent(blindinfo2,10);
	//selectFrame(curamUAIframe, 30);
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(Last3MonthsBills, "no", 30);
	
	safeClearAndType(blindinfo2, "no", 30);
	
	safeClearAndType(disability2, "no", 30);
	
	safeClearAndType(helpdailyactivities2, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin4() throws Exception{    // Use this function when application has 3 HH 
	//waitUntilPresent(blindinfo3,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(Last3MonthsBills, "no", 30);
	
	safeClearAndType(blindinfo3, "no", 30);
	
	safeClearAndType(disability3, "no", 30);
	
	safeClearAndType(helpdailyactivities3, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin5() throws Exception{
//	waitUntilPresent(blindinfo4,10);
//	selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(Last3MonthsBills, "no", 30);
	
	safeClearAndType(blindinfo4, "no", 30);
	
	safeClearAndType(disability4, "no", 30);
	
	safeClearAndType(helpdailyactivities4, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void fillin6() throws Exception{
	//waitUntilPresent(blindinfo5,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(Last3MonthsBills, "no", 30);
	
	safeClearAndType(blindinfo5, "no", 30);
	
	safeClearAndType(disability5, "no", 30);
	
	safeClearAndType(helpdailyactivities5, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
		
}

public void fillin7() throws Exception{
	//waitUntilPresent(blindinfo6,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(blindinfo6, "no", 30);
	
	safeClearAndType(disability6, "no", 30);
	
	safeClearAndType(helpdailyactivities6, "no", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void NonMagi() throws Exception{
	//waitUntilPresent(blindinfo6,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	
	safeClearAndType(UnPaidBills, "Yes", 30);
	pressTabKey_Action(UnPaidBills, 30);

	midWait(2);
	
	d.findElement(By.xpath("//input[@id='__o3id7']")).click();
	d.findElement(By.xpath("//input[@id='__o3id8']")).click();

	safeClearAndType(Residence, "No", 30);
	safeClearAndType(Citizen, "No", 30);
	safeClearAndType(Income, "No", 30);
	safeClearAndType(Blind, "No", 30);
	safeClearAndType(Disable, "No", 30);
	safeClearAndType(Help, "No", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}
public void UAT() throws Exception{
	//waitUntilPresent(blindinfo6,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(UnPaidBills, "No", 30);
	safeClearAndType(Blind, "No", 30);
	safeClearAndType(Disable, "No", 30);
	safeClearAndType(Help, "No", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}
}

