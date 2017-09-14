package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.additionalinfo;



public class additionalinfofunc extends com.selenium.SafeActions implements additionalinfo {
	
	WebDriver d;
	
public additionalinfofunc(WebDriver d) {
		super(d);
		this.d=d;
		
	}


	public void fillin(String plan,String date,String benefits) throws Exception{
		//waitUntilPresent(coveragestartdate,10);
		//selectFrame(curamUAIframe, 60);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(enrolledplan, plan, 60);
		safeClearAndType(coveragestartdate, date, 60);
		safeClearAndType(otherbenfits, benefits, 60);
		safeClick(nextbtn, 60);
				
		defaultFrame();
		waitForPageToLoad(60);
		
	
	}
	
	public void plnWithEnddate(String plan,String date,String enddate,String benefits) throws Exception{
		//waitUntilPresent(coveragestartdate,10);
		//selectFrame(curamUAIframe, 60);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(enrolledplan, plan, 60);
		safeClearAndType(coveragestartdate, date, 60);
		safeClearAndType(coverageenddate, enddate, 60);
		safeClearAndType(otherbenfits, benefits, 60);
		safeClick(nextbtn, 60);
				
		defaultFrame();
		waitForPageToLoad(60);
		
	
	}
	
public void fillin1(String plan1,String date1,String benefits1) throws InterruptedException{
	//waitUntilPresent(enrolledplan,10);
	//selectFrame(curamUAIframe, 30);
		
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
		safeClearAndType(enrolledplan, plan1, 60);
				
				safeClearAndType(coveragestartdate, date1, 60);
				
				safeClearAndType(otherbenfits, benefits1, 60);
				safeMouseClick(nextbtn, 60);
				defaultFrame();
				waitForPageToLoad(60);
		
	
	}

public void fillin2(String plan2,String date2,String benefits2) throws InterruptedException{
	//waitUntilPresent(enrolledplan,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
		safeClearAndType(enrolledplan, plan2, 60);
		
		safeClearAndType(coveragestartdate, date2, 60);
		
		safeClearAndType(otherbenfits, benefits2, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		
}

public void Incarceration(String IncarceDt) throws Exception{
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	d.findElement(By.id("__o3id6")).click();  // Person incarcerated check box
	safeClick(nextbtn, 60);
	
	safeClearAndType(PendingDisp, "No", 60);//Is SLFPOF incarcerated pending disposition of charges?*  (yes/no)
	//safeClearAndType(ExpReleaseDT, plan, 60);  //What is the expected release date for SLFPOF?  (Calendar)
	safeClearAndType(DtOfIncarc, IncarceDt, 60);  //What is the date that SLFPOF became Incarcerated?*  (Calendar)
	safeClearAndType(Involuntarily, "Yes", 60); //Is SLFPOF involuntarily incarcerated in a jail, detention center, or halfway house in Washington, DC?* (yes/no)
	
	safeClick(nextbtn, 60);
			
	defaultFrame();
	waitForPageToLoad(60);
	

}

public void EligibleForESI(String Esi2,String Esi3,String Esi4,String Esi5,String Esi6,String Esi7,String Esi8,
		 String Esi9,String Esi10,String Esi11,String Esi12,String Esi13,String Esi14,String Esi15) throws Exception{
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	//safeClearAndType(ESIEligible, "Yes", 60);
	d.findElement(By.id("__o3id8")).click();
	safeClick(nextbtn, 60);
	Thread.sleep(3000);
	
	safeClearAndType(ESIEmpName, Esi2, 60);
	safeClearAndType(ESIEmpID, Esi3, 60);
	safeClearAndType(ESIAdd1, Esi4, 60);
	safeClearAndType(ESICity, Esi5, 60);
	safeClearAndType(ESIState, Esi6, 60);
	safeClearAndType(ESIZip, Esi7, 60);
	safeClearAndType(ESIWaiting, Esi8, 60);
	safeClearAndType(ESIStDate, Esi9, 60);
	safeClearAndType(OfferESI, Esi10, 60);
	safeClearAndType(ESILowestCost, Esi11, 60);
	safeClearAndType(ESIPayFreq, Esi12, 60);
	safeClearAndType(ESIEndDate, Esi13, 60);
	
	//safeClearAndType(ESIOtherAppl, Esi15, 60);
	
	safeClick(nextbtn, 60);
			
	defaultFrame();
	waitForPageToLoad(60);
	
}


}
