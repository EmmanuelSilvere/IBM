package com.pageFunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestSuite.OneScript;
import com.pageObjects.moreabtu;
import com.selenium.SafeActions;
import com.utilities.BusinessMethods;

public class moreabtufunc extends SafeActions implements moreabtu {

	WebDriver d;
	public moreabtufunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void fillin(String ssn,String enrlmnt) throws InterruptedException{

		//waitUntilPresent(havessn,10);
		//selectFrame(curamUAIframe, 60);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(havessn, "yes", 60);
		pressTabKey_Action(havessn, 10);
		safeClearAndType(ssnno, ssn, 60);
		safeClearAndType(citizen, "yes", 60);
		pressTabKey_Action(citizen, 10);
		safeClearAndType(naturalcitizen, "no", 60);
		safeClearAndType(enrollment, enrlmnt, 60);
		safeClick(nextbtn, 60);
		Thread.sleep(2000);
		defaultFrame();
		waitForPageToLoad(60);
		
	}
	
	
	public void fillin1(String ssn,String enrlmnt) throws InterruptedException{

		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		
		safeClearAndType(ruamericanindian, "YES", 60);
		safeClearAndType(havessn, "yes", 60);
		pressTabKey_Action(havessn, 10);
		safeClearAndType(ssnno, ssn, 60);
		safeClearAndType(citizen, "yes", 60);
		pressTabKey_Action(citizen, 10);
		safeClearAndType(naturalcitizen, "no", 60);
		safeClearAndType(enrollment, enrlmnt, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
	}
	
	public void AddionalInfo(String Ind, String HaveSSN, String SSN, String ApldSSN, String Reason,String Ctzn, String Nat, String DocType,
			String NatInUS, String ImgStatus,String SupDoc,String LivedInUS, String Military, String Vet, String DepVet, String MEC  ) throws InterruptedException{

		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(ruamericanindian, Ind, 60);
		safeClearAndType(havessn,  HaveSSN, 60);
		pressTabKey_Action(havessn, 10);

		if(HaveSSN.equals("Yes")){ //Have SSN?
			
				safeClearAndType(ssnno, SSN, 60);

		}else if((HaveSSN.equals("No"))) {	//No SSN			
			safeClearAndType(appliedssn,  ApldSSN, 60);
			pressTabKey_Action(appliedssn, 10);
			
			if((ApldSSN.equals("No"))) //if Not applied for SSN
				{safeClearAndType(ReasonForNoSSN, Reason, 60);}
				pressTabKey_Action(ReasonForNoSSN, 10);
		}
		
		

		safeClearAndType(citizen,  Ctzn, 60);
		pressTabKey_Action(citizen, 10);
		
		if(Ctzn.equals("Yes")){ //if US Citizen?
			safeClearAndType(naturalcitizen,  Nat, 60); 
			pressTabKey_Action(naturalcitizen, 10);
			
			if((Nat.equals("Yes"))) //if Naturalized Citizen
			{
				safeClearAndType(DocumentType,  DocType, 60);
				safeClearAndType(Nat_LivedInUS,  NatInUS, 60);
			}
		} else if(Ctzn.equals("No")){ //if Not US Citizen
			{safeClearAndType(immigrationstatus,  ImgStatus, 60);
			  pressTabKey_Action(immigrationstatus, 10);
			}  // Eligible Immigration Status?
			
			if((ImgStatus.equals("Yes"))) //if Eligible Immigration Status is Yes
			{
				safeClearAndType(supportdoc,  SupDoc, 60);
				safeClearAndType(livedinus,  LivedInUS, 60);				
				safeClearAndType(military,  Military, 60);
				 pressTabKey_Action(military, 10);
				
				if((Vet.equals("No"))) //if Not a Veteran 
					{safeClearAndType(dependentveteran,  DepVet, 60);}
			}  // end if Eligible Immigration Status is Yes
												
		}// end if Not US Citizen
		safeClearAndType(EnrolledInHP,  MEC, 60);
		safeClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		
		
	} //end if additional info function.
	
	
	public void MemberAddlInfo(int RowNumber) throws InterruptedException{

		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(ruamericanindian, OneScript.GData[OneScript.Grw][30], 60);
		safeClearAndType(havessn,  OneScript.GData[OneScript.Grw][31], 60);
		pressTabKey_Action(havessn, 10);

		if(OneScript.GData[OneScript.Grw][31].equals("Yes")){ //Have SSN?
			if(OneScript.GData[OneScript.Grw][32].equals("Random")){ // SSN Random #?
				safeClearAndType(ssnno,  OneScript.MemSSN[RowNumber], 60);
			}else {safeClearAndType(ssnno,  OneScript.GData[OneScript.Grw][6], 60);}  // Enter SSN 
			
		}else if((OneScript.GData[OneScript.Grw][31].equals("No"))) {	//No SSN			
			safeClearAndType(appliedssn,  OneScript.GData[OneScript.Grw][33], 60);
			pressTabKey_Action(appliedssn, 10);
			
			if((OneScript.GData[OneScript.Grw][33].equals("No"))) //if Not applied for SSN
				{safeClearAndType(ReasonForNoSSN,  OneScript.GData[OneScript.Grw][34], 60);}
				pressTabKey_Action(ReasonForNoSSN, 10);
		}
		
		safeClearAndType(citizen,  OneScript.GData[OneScript.Grw][35], 60);
		pressTabKey_Action(citizen, 10);
		
		if(OneScript.GData[OneScript.Grw][35].equals("Yes")){ //if US Citizen?
			safeClearAndType(naturalcitizen,  OneScript.GData[OneScript.Grw][36], 60); //Are you Naturalized Citizen?
			pressTabKey_Action(naturalcitizen, 10);
			
			if((OneScript.GData[OneScript.Grw][36].equals("Yes"))) //if Naturalized Citizen
			{
				safeClearAndType(DocumentType,  OneScript.GData[OneScript.Grw][37], 60);
				safeClearAndType(Nat_LivedInUS,  OneScript.GData[OneScript.Grw][38], 60);
			}
		} else if(OneScript.GData[OneScript.Grw][35].equals("No")){ //if Not US Citizen
			{safeClearAndType(immigrationstatus,  OneScript.GData[OneScript.Grw][39], 60);
			  pressTabKey_Action(immigrationstatus, 10);
			}  // Eligible Immigration Status?
			
			if((OneScript.GData[OneScript.Grw][39].equals("Yes"))) //if Eligible Immigration Status is Yes
			{
				safeClearAndType(supportdoc,  OneScript.GData[OneScript.Grw][40], 60);
				safeClearAndType(livedinus,  OneScript.GData[OneScript.Grw][41], 60);				
				safeClearAndType(military,  OneScript.GData[OneScript.Grw][42], 60);
				
				if((OneScript.GData[OneScript.Grw][42].equals("No"))) //if Not a Veteran 
					{safeClearAndType(dependentveteran,  OneScript.GData[OneScript.Grw][43], 60);}
			}  // end if Eligible Immigration Status is Yes
												
		}// end if Not US Citizen
		
		safeClearAndType(EnrolledInHP,  OneScript.GData[OneScript.Grw][44], 60);
		safeClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		
	} //end if additional info function.
	
	
	
	
	public void Pregnancy() throws InterruptedException{

		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		

		if(OneScript.AData[OneScript.Arw][9].equalsIgnoreCase("Female")){ //If Female ?
		    if((OneScript.AData[OneScript.Arw][59].equals("Yes"))) {	//If pregnant ?		
		    	safeClearAndType(appliedssn,  OneScript.AData[OneScript.Arw][42], 60);
		    }
				safeClearAndType(appliedssn,  OneScript.AData[OneScript.Arw][42], 60);
				pressTabKey_Action(appliedssn, 10);
			
			if((OneScript.AData[OneScript.Arw][42].equals("No"))) //if Not applied for SSN
				{safeClearAndType(ReasonForNoSSN,  OneScript.AData[OneScript.Arw][43], 60);}
				pressTabKey_Action(ReasonForNoSSN, 10);
		}
		
	
		safeClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		
	} //end if additional info function.
	
	
	
}
