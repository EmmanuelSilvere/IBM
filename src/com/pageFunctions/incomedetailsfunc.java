package com.pageFunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.incomedetails;




public class incomedetailsfunc extends com.selenium.SafeActions implements incomedetails {

	
	WebDriver d;
	public incomedetailsfunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void fillin(String incmtyp,String empname,String strt,String citi,String ste,String zpcd,String amt,String freq,String stdate) throws Exception{
		//waitUntilPresent(incometype,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		
		
		safeClearAndType(incometype, incmtyp, 30);

		pressTabKey_Action(incometype, 10);
		
		safeClearAndType(taxtype, "W2 Tax Form", 30);
		
		pressTabKey_Action(taxtype, 10);
		
		safeClearAndType(employername, empname, 30);

		safeClearAndType(street, strt, 30);
		
		safeClearAndType(city, citi, 30);
		
		safeClearAndType(state, ste, 10);
		
       safeClearAndType(zip, zpcd, 30);
		
		safeClearAndType(amount, amt, 30);
		
		safeClearAndType(frquency, freq, 30);

		safeClearAndType(startdate, stdate, 30);
		
		safeClearAndType(otherincome, "no", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
		
	}
	
	public void enddate(String incmtyp,String empname,String strt,String citi,String ste,String zpcd,String amt,String freq,String stdate,String ndate) throws Exception{
		//waitUntilPresent(incometype,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		
		
		safeClearAndType(incometype, incmtyp, 30);

		pressTabKey_Action(incometype, 10);
		
		safeClearAndType(taxtype, "W2 Tax Form", 30);
		
		pressTabKey_Action(taxtype, 10);
		
		safeClearAndType(employername, empname, 30);

		safeClearAndType(street, strt, 30);
		
		safeClearAndType(city, citi, 30);
		
		safeClearAndType(state, ste, 10);
		
       safeClearAndType(zip, zpcd, 30);
		
		safeClearAndType(amount, amt, 30);
		
		safeClearAndType(frquency, freq, 30);

		safeClearAndType(startdate, stdate, 30);
		
		safeClearAndType(enddate, ndate, 30);  // for dan remove it later
		
		safeClearAndType(otherincome, "no", 30);
		
		safeMouseClick(nextbtn, 60);
		
		defaultFrame();
		waitForPageToLoad(30);
		
	}
	
public void fillin1(String incmtyp1,String empname1,String strt1,String citi1,String ste1,String zpcd1,String amt1,String freq1,String stdate1) throws Exception{
	
	//waitUntilPresent(incometype,10);
	//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
				safeClearAndType(incometype, incmtyp1, 30);

				pressTabKey_Action(incometype, 10);
				
				safeClearAndType(taxtype, "W2 Tax Form", 30);
				
				pressTabKey_Action(taxtype, 10);
				
				safeClearAndType(employername, empname1, 30);

				safeClearAndType(street, strt1, 30);
				
				safeClearAndType(city, citi1, 30);
				
				safeClearAndType(state, ste1, 10);
				
		       safeClearAndType(zip, zpcd1, 30);
				
				safeClearAndType(amount, amt1, 30);
				
				safeClearAndType(frquency, freq1, 30);

				safeClearAndType(startdate, stdate1, 30);
				
				safeClearAndType(otherincome, "no", 30);
				
				safeMouseClick(nextbtn, 60);
				
				defaultFrame();
				waitForPageToLoad(30);
		
		
	}

public void fillin2(String incmtyp2,String empname2,String strt2,String citi2,String ste2,String zpcd2,String amt2,String freq2,String stdate2) throws Exception
	
{
	//waitUntilPresent(incometype,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(incometype, incmtyp2, 30);

	pressTabKey_Action(incometype, 10);
			
			safeClearAndType(taxtype, "W2 Tax Form", 30);
			
			pressTabKey_Action(taxtype, 10);
			
			safeClearAndType(employername, empname2, 30);

			safeClearAndType(street, strt2, 30);
			
			safeClearAndType(city, citi2, 30);
			
			safeClearAndType(state, ste2, 10);
			
	       safeClearAndType(zip, zpcd2, 30);
			
			safeClearAndType(amount, amt2, 30);
			
			safeClearAndType(frquency, freq2, 30);

			safeClearAndType(startdate, stdate2, 30);
			
			safeClearAndType(otherincome, "no", 30);
			
			safeMouseClick(nextbtn, 60);
			
			defaultFrame();
			waitForPageToLoad(30);
	
}



public void fillin1(String incmtyp1,String amt1,String freq1,String stdate1) throws Exception{
		
	//waitUntilPresent(incometype,10);
	//selectFrame(curamUAIframe, 30);
		
	d.switchTo().defaultContent();
	Thread.sleep(4000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
				safeClearAndType(incometype, incmtyp1, 30);
	
				safeClearAndType(amount, amt1, 30);
				
				safeClearAndType(frquency, freq1, 30);

				safeClearAndType(startdate, stdate1, 30);
				
				safeClearAndType(otherincome, "no", 30);
				
				safeMouseClick(nextbtn, 60);
				
				defaultFrame();
				waitForPageToLoad(30);
		
	}
	
	
	public void fillin2(String incmtyp2,String amt2,String freq2,String stdate2) throws Exception{
		
		
		//waitUntilPresent(incometype,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
				safeClearAndType(incometype, incmtyp2, 30);
	
				safeClearAndType(amount, amt2, 30);
				
				safeClearAndType(frquency, freq2, 30);

				safeClearAndType(startdate, stdate2, 30);
				
				safeClearAndType(otherincome, "no", 30);
				
				safeMouseClick(nextbtn, 60);
				
				defaultFrame();
				waitForPageToLoad(30);
	
	}
	
	public void fillin3(String incmtyp3,String amt3,String freq3,String stdate3) throws Exception{
		
		//waitUntilPresent(incometype,10);
		//selectFrame(curamUAIframe, 30);

		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
				safeClearAndType(incometype, incmtyp3, 30);
	
				safeClearAndType(amount, amt3, 30);
				
				safeClearAndType(frquency, freq3, 30);

				safeClearAndType(startdate, stdate3, 30);
				
				safeClearAndType(otherincome, "no", 30);
				
				safeMouseClick(nextbtn, 60);
				
				defaultFrame();
				waitForPageToLoad(30);
			
	}

public void fillin4(String incmtyp4,String amt4,String freq4,String stdate4) throws Exception{	

	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
				safeClearAndType(incometype, incmtyp4, 30);
	
				safeClearAndType(amount, amt4, 30);
				
				safeClearAndType(frquency, freq4, 30);

				safeClearAndType(startdate, stdate4, 30);
				
				safeClearAndType(otherincome, "yes", 30);
				
				safeMouseClick(nextbtn, 60);
				
				defaultFrame();
				waitForPageToLoad(30);
			
	}  // end of fillin4

public void Adjustments(String AdjIncTp,String AdjInc,String AdjStDt,String AdjEndDt,String AdjFreq) throws Exception{

	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
				safeClearAndType(AnyAdjustments, "Yes", 30);
				
				safeMouseClick(nextbtn, 60);
				
				Thread.sleep(2000);
				
				safeClearAndType(Adjincometype, AdjIncTp, 30);
	
				safeClearAndType(AdjIncome, AdjInc, 30);
				
				safeClearAndType(Adjstartdate, AdjStDt, 30);

				safeClearAndType(Adjenddate, AdjEndDt, 30);
				
				safeClearAndType(AdjFrequency, AdjFreq, 30);
				
				safeClearAndType(AdjAnyMoreAmt, "No", 30);
				
				safeMouseClick(nextbtn, 60);
				
				defaultFrame();
				waitForPageToLoad(30);
			
	}  // end of Adjustments

}
