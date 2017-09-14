package com.pageFunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.TestSuite.OneScript;
import com.pageObjects.infoabtyou;


import com.selenium.SafeActions;


public class infoabtufunc extends SafeActions implements infoabtyou{
	
	WebDriver d;
	
	public infoabtufunc(WebDriver d) {
		super(d);
		this.d=d;
		
		// TODO Auto-generated constructor stub
	}


	public void fillin (String Fname, String Lname,String dob,String sex,  String addrl1,  String ct,  String st, 
			String zip1,String elig) throws Exception{
		//waitUntilPresent(firstname,10);
			//selectFrame(curamUAIframe, 60);
		
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
			safeClearAndType(firstname, Fname, 60);
			safeClearAndType(lastname, Lname, 60);
			safeClearAndType(bdate, dob, 60);
			safeClearAndType(gender, sex, 60);
			safeClearAndType(ruhomeless, "no", 60);
			pressTabKey_Action(ruhomeless,60);
			safeClearAndType(addressline1, addrl1, 60);	
		    safeClearAndType(city, ct, 60);
		    safeClearAndType(state, st, 60);
			safeClearAndType(zipcode1, zip1, 60);
			safeClearAndType(SameAsHomeAddrs, "Yes", 60);
			
		//	safeClearAndType(langcomm, "Spanish", 60); //(only for notice testing) -->  Spanish, Simplified Chinese, Amharic, French, Mandarin
			
			safeClearAndType(eligibility4coverage, elig, 60);
			pressTabKey_Action(eligibility4coverage,60);
			safeClick(nextbtn, 60);
			
			defaultFrame();
			waitForPageToLoad(60);
		
	}
	
	public void OutOfDCTemp (String Fname, String Lname,String dob,String sex,  String addrl1,  String ct,  String st, 
			String zip1,String elig) throws Exception{
			//waitUntilPresent(firstname,10);
			//selectFrame(curamUAIframe, 60);
		
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
			safeClearAndType(firstname, Fname, 60);
			safeClearAndType(lastname, Lname, 60);
			safeClearAndType(bdate, dob, 60);
			safeClearAndType(gender, sex, 60);
			safeClearAndType(ruhomeless, "No", 60);
			pressTabKey_Action(ruhomeless,60);
			safeClearAndType(addressline1, addrl1, 60);	
		    safeClearAndType(city, ct, 60);
		    safeClearAndType(state, st, 60);
			safeClearAndType(zipcode1, zip1, 60);
			safeClearAndType(SameAsHomeAddrs, "Yes", 60);				
			safeClearAndType(tempabsentfrmstate, "Yes", 30);
			safeClearAndType(eligibility4coverage, elig, 60);
			pressTabKey_Action(eligibility4coverage,60);
			safeClick(nextbtn, 60);
			
			defaultFrame();
			waitForPageToLoad(60);
		
	}
	public void OutOfDCPerm(String Fname, String Lname,String dob,String sex,  String addrl1,  String ct,  String st, 
		
			String zip1,String elig) throws Exception{
				
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
			safeClearAndType(firstname, Fname, 60);
			safeClearAndType(lastname, Lname, 60);
			safeClearAndType(bdate, dob, 60);
			safeClearAndType(gender, sex, 60);
			safeClearAndType(ruhomeless, "No", 60);
			pressTabKey_Action(ruhomeless,60);
			safeClearAndType(addressline1, addrl1, 60);	
		    safeClearAndType(city, ct, 60);
		    safeClearAndType(state, st, 60);
			safeClearAndType(zipcode1, zip1, 60);
			safeClearAndType(SameAsHomeAddrs, "Yes", 60);				
			safeClearAndType(tempabsentfrmstate, "No", 30);
			safeClearAndType(eligibility4coverage, elig, 60);
			pressTabKey_Action(eligibility4coverage,60);
			safeClick(nextbtn, 60);
			
			defaultFrame();
			waitForPageToLoad(60);
		
	}
	
	
	

	
	public void fillin1 (String fname, String lname,String db,String gndr,  String addrl1,  String ct,  String st, 
			String zip1,String elig)throws Exception{
		//waitUntilPresent(firstname,10);
		//selectFrame(curamUAIframe, 60);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
				
		safeClearAndType(firstname, fname, 60);		
		safeClearAndType(lastname, lname, 60);				
		safeClearAndType(bdate, db, 60);
		safeClearAndType(gender, gndr, 60);		
		safeClearAndType(ruhomeless, "no", 60);		
		pressTabKey_Action(ruhomeless,60);
		safeClearAndType(addressline1, addrl1, 10);		
        safeClearAndType(city, ct, 60);		
		safeClearAndType(state, st, 60);
		safeClearAndType(zipcode1, zip1, 60);
		safeClearAndType(tempabsentfrmstate, "yes", 60);
		safeClearAndType(SameAsHomeAddrs, "yes", 60);		
		safeClearAndType(eligibility4coverage, elig, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	}
	
	public void Applicant (String Fname, String Lname,String dob,String sex) throws Exception{
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
			safeClearAndType(firstname, Fname, 60);
			safeClearAndType(lastname, Lname, 60);
			safeClearAndType(bdate, dob, 60);
			safeClearAndType(gender, sex, 60);
			defaultFrame();
			waitForPageToLoad(60);
		
	}
	
	public void ApplicantOS (String Fname, String Lname,String dob) throws Exception{
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

			safeClearAndType(firstname, Fname, 60);
			safeClearAndType(lastname, Lname, 60);
			safeClearAndType(bdate, dob, 60);
			safeClearAndType(gender, OneScript.AData[OneScript.Arw][9], 60);
			defaultFrame();
			waitForPageToLoad(60);		
	}
	
	
	public void HomeAddress() throws Exception{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		if (OneScript.AData[OneScript.Arw][10].equalsIgnoreCase("Yes")){  // If Homeless
				
				safeClearAndType(ruhomeless, "Yes", 60);
				pressTabKey_Action(ruhomeless,60);
				safeClearAndType(rudcresident, OneScript.AData[OneScript.Arw][22], 60);	 //DC Resident value Input
				pressTabKey_Action(rudcresident,60);
				
				if (OneScript.AData[OneScript.Arw][22].equals("No")){   // If DC Resident
					safeClearAndType(tempabsentfrmstate, OneScript.AData[OneScript.Arw][29], 60);
					pressTabKey_Action(tempabsentfrmstate,60);
				}//end If DC Resident
				
				if (OneScript.AData[OneScript.Arw][23].equals("Yes")){  //If you have mailing address
					
					 safeClearAndType(mailaddrs, OneScript.AData[OneScript.Arw][23], 60);
					 pressTabKey_Action(mailaddrs,60);
					 safeClearAndType(diffaddrsline1, OneScript.AData[OneScript.Arw][24], 60);
					 safeClearAndType(diffcity, OneScript.AData[OneScript.Arw][26], 60);
					 safeClearAndType(diffstate, OneScript.AData[OneScript.Arw][27], 60);
					 safeClearAndType(diffzipcode1, OneScript.AData[OneScript.Arw][28], 60);
					 
				} else {safeClearAndType(mailaddrs, OneScript.AData[OneScript.Arw][23], 60);}  //Address same as Home?
				
		} else if (OneScript.AData[OneScript.Arw][10].equalsIgnoreCase("No")) //If NOT Homeless
			{
				safeClearAndType(ruhomeless, "No", 60);
				pressTabKey_Action(ruhomeless,60);
				safeClearAndType(addressline1,OneScript.AData[OneScript.Arw][11], 60);
				safeClearAndType(city, OneScript.AData[OneScript.Arw][13], 60);
				safeClearAndType(state, OneScript.AData[OneScript.Arw][14], 60);
				safeClearAndType(zipcode1, OneScript.AData[OneScript.Arw][15], 60);
				safeClearAndType(SameAsHomeAddrs, OneScript.AData[OneScript.Arw][16], 60); // Mailing Address is same
			}	//end If Not Homeless
	}
	
	public void OtherContactInfo () throws Exception{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
			safeClearAndType(contmethd, OneScript.AData[OneScript.Arw][30], 60);
			pressTabKey_Action(contmethd,60);
			Thread.sleep(2000);
			
			if(OneScript.AData[OneScript.Arw][31].equals("Yes")){
				safeMouseClick(electronicnotification, 60);
				pressTabKey_Action(electronicnotification,60);
			}
			if(OneScript.AData[OneScript.Arw][32].equals("Yes")){
				d.findElement(By.xpath(".//input[@id='__o3id20']")).click();
				pressTabKey_Action(papercomm,60);
			}
			
			safeClearAndType(langcomm, OneScript.AData[OneScript.Arw][33], 60);
			safeClearAndType(phno1, OneScript.AData[OneScript.Arw][34], 60);
			safeClearAndType(phno2, OneScript.AData[OneScript.Arw][35], 60);
			safeClearAndType(phno3, OneScript.AData[OneScript.Arw][36], 60);
			safeClearAndType(phnotyp, OneScript.AData[OneScript.Arw][37], 60);
			safeMouseClick(phnotyp, 60);
			
			if(OneScript.AData[OneScript.Arw][30].equals("Email")){
				safeClearAndType(EmailAdd, OneScript.EmailId, 60);
			}

			safeClearAndType(HelpPayingCoverage,  OneScript.AData[OneScript.Arw][38], 60);
			pressTabKey_Action(HelpPayingCoverage,60);
			
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(60);
		
	}
	public void Homeless (String fname, String lname,String db,String gndr,String elig){
		d.switchTo().defaultContent();
		midWait(2);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		
		safeClearAndType(firstname, fname, 3);

		
		safeClearAndType(lastname, lname, 3);
		
		
		safeClearAndType(bdate, db, 3);

		safeClearAndType(gender, gndr, 3);
		
		safeClearAndType(ruhomeless, "Yes", 3);
		
		pressTabKey_Action(ruhomeless,3);
		
		safeClearAndType(rudcresident, "Yes", 3);
		
		pressTabKey_Action(rudcresident,3);
		
		safeClearAndType(mailaddrs, "No", 3);
		
		safeClearAndType(eligibility4coverage, elig, 3);
		safeMouseClick(nextbtn, 3);
		defaultFrame();
		waitForPageToLoad(3);
		
	}
		
	}


