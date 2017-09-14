package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.EmployerInsuranceAddInfo;
import com.selenium.SafeActions;




public class EmployerInsuranceAddInfoFunc extends SafeActions implements EmployerInsuranceAddInfo  {
	
public WebDriver d;
	
	public EmployerInsuranceAddInfoFunc(WebDriver d) {
		super(d);
		this.d=d;
	}

public void fillin(){
	waitUntilPresent(emplyrname,10);
	selectFrame(curamUAIframe, 60);
	safeClearAndType(emplyrname, "Deepak", 30);
	safeClearAndType(EIN, "235454854", 30);
	safeClearAndType(empyetyp, "yes", 30);
	safeClearAndType(adrsln1, "8125 48th ave", 30);
	safeClearAndType(cty, "college park", 30);
	safeClearAndType(stt, "MD", 30);
	safeClearAndType(zpcode, "20002", 30);
	safeClearAndType(costplan, "united", 30);
	safeClearAndType(empcontribution, "450", 30);
	safeClearAndType(contributionfreq, "monthly", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

		
}

public void EligibleESI() throws InterruptedException{
		
	d.switchTo().defaultContent();
	midWait(3);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	//safeMouseClick(ESI_PersonEligible,20);
	
	d.findElement(By.xpath("//input[@id='__o3id7']")).click();	
	d.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//	safeMouseClick(nextbtn, 30);
//	waitForPageToLoad(40);
	midWait(5);
	
	safeClearAndType(ESI_Employer, "Employer One", 30);
	safeClearAndType(ESI_AddLine1, "2301 Glenallan Ave", 30);
	safeClearAndType(ESI_City, "Silver Spring", 30);
	safeClearAndType(ESI_State, "MD", 30);
	safeClearAndType(ESI_Zip, "20906", 30);
	
	safeClearAndType(ESI_InWaitingPeriod, "No", 30);
	safeClearAndType(ESI_StartDt, "11/10/2016", 30);
	safeClearAndType(ESI_MeetsMVS, "Yes", 30);
	safeClearAndType(ESI_LowestMVS, "200", 30);
	safeClearAndType(ESI_HowOften, "Monthly", 30);
	
	safeMouseClick(nextbtn, 60);
	defaultFrame();

	}  // end of EligibleESI()

}
