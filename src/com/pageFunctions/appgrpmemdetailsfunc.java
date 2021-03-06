package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestSuite.OneScript;
import com.pageObjects.appgroupmembersdetails;

import com.selenium.SafeActions;

public class appgrpmemdetailsfunc extends SafeActions implements appgroupmembersdetails  {
	

	WebDriver d;
	
	public appgrpmemdetailsfunc(WebDriver d) {
		super(d);
		this.d=d;
	}

	public void fillinx(String f1name, String l1name,String db1, String gndr1) throws Exception{
		//waitUntilPresent(firstname,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
		
		
         safeClearAndType(firstname, f1name, 30);
		
		safeClearAndType(lastname, l1name, 30);
		
		safeClearAndType(dob, db1, 30);

		safeClearAndType(gender, gndr1, 30);
		
		safeClearAndType(personlivewithu, "yes", 30);
		
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		
}
	
	public void fillin(String f1name, String l1name,String db1, String gndr1) throws Exception{
		//waitUntilPresent(firstname,10);
		//selectFrame(curamUAIframe, 30);

		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
				
        safeClearAndType(firstname, f1name, 30);
		
		safeClearAndType(lastname, l1name, 30);
		
		safeClearAndType(dob, db1, 30);

		safeClearAndType(gender, gndr1, 30);
		
		safeClearAndType(personlivewithu, "yes", 30);
		
		safeClearAndType(eligibility, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);

}
	
	public void filliny(String f1name, String l1name,String db1, String gndr1) throws Exception{
		
		//waitUntilPresent(firstname,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
		
        safeClearAndType(firstname, f1name, 30);
		
		safeClearAndType(lastname, l1name, 30);
		
		safeClearAndType(dob, db1, 30);

		safeClearAndType(gender, gndr1, 30);
		
		safeClearAndType(personlivewithu, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
		

}
	
public void diffadd(String f1name, String l1name,String db1, String gndr1,String adr1, String cti1,String sta1, String zpc1) throws Exception{
	//waitUntilPresent(firstname,10);	
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
       	safeClearAndType(firstname, f1name, 30);
		
		safeClearAndType(lastname, l1name, 30);
		
		safeClearAndType(dob, db1, 30);

		safeClearAndType(gender, gndr1, 30);
		
		safeClearAndType(personlivewithu, "No", 30);
		
		pressTabKey_Action(personlivewithu, 10);
		
		safeClearAndType(ishehomeless, "No", 30);
		
		pressTabKey_Action(ishehomeless, 10);
		
        safeClearAndType(adrs, adr1, 30);
		
		safeClearAndType(cty, cti1, 30);
		
		safeClearAndType(stt, sta1, 30);

		safeClearAndType(zip, zpc1, 30);
		
		safeClearAndType(outofdc1, "Yes", 30);
		
		safeClearAndType(eligibility, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
}

public void diffaddx(String f2name, String l2name,String db2, String gndr2) throws Exception{
	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	safeClearAndType(firstname, f2name, 30);
	
	safeClearAndType(lastname, l2name, 30);
	
	safeClearAndType(dob, db2, 30);

	safeClearAndType(gender, gndr2, 30);
	
	safeClearAndType(personlivewithu, "yes", 30);
	pressTabKey_Action(personlivewithu, 10);
	
	safeClearAndType(outofdc, "yes", 30);  //Removed this for script 1022
	
	safeClearAndType(eligibility, "yes", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
	

}
public void diffadd1(String f2name, String l2name,String db2, String gndr2,String adr2, String cti2,String sta2, String zpc2) throws InterruptedException{
	
	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	safeClearAndType(firstname, f2name, 30);
	
	safeClearAndType(lastname, l2name, 30);
	
	safeClearAndType(dob, db2, 30);

	safeClearAndType(gender, gndr2, 30);
	
	safeClearAndType(personlivewithu, "no", 30);
	
	pressTabKey_Action(personlivewithu, 10);
	
	safeClearAndType(ishehomeless, "no", 30);
	
	pressTabKey_Action(ishehomeless, 10);
	
	safeClearAndType(resiadd, "no", 30);
	
	pressTabKey_Action(resiadd, 10);
	
   safeClearAndType(adrs, adr2, 30);
	
	safeClearAndType(cty, cti2, 30);
	
	safeClearAndType(stt, sta2, 30);

	safeClearAndType(zip, zpc2, 30);
	
	safeClearAndType(outofdc1, "Yes", 30); 
	
	safeClearAndType(eligibility, "yes", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
	

}

public void diffadd2(String f2name, String l2name,String db2, String gndr2,String adr2, String cti2,String sta2, String zpc2) throws Exception{
	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
    safeClearAndType(firstname, f2name, 30);
	
	safeClearAndType(lastname, l2name, 30);
	
	safeClearAndType(dob, db2, 30);

	safeClearAndType(gender, gndr2, 30);
	
	safeClearAndType(personlivewithu, "no", 30);
	
	pressTabKey_Action(personlivewithu, 10);
	
	safeClearAndType(ishehomeless, "no", 30);

	pressTabKey_Action(ishehomeless, 10);
	
   safeClearAndType(adrs, adr2, 30);
	
	safeClearAndType(cty, cti2, 30);
	
	safeClearAndType(stt, sta2, 30);

	safeClearAndType(zip, zpc2, 30);
	
	safeClearAndType(outofdc, "no", 30);
	
	safeClearAndType(eligibility, "yes", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
	

}

public void diffadd4(String f2name, String l2name,String db2, String gndr2,String adr2, String cti2,String sta2, String zpc2) throws Exception{
	
	//waitUntilPresent(firstname,10);
	
	//selectFrame(curamUAIframe, 30);
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	
    safeClearAndType(firstname, f2name, 30);
	
	safeClearAndType(lastname, l2name, 30);
	
	safeClearAndType(dob, db2, 30);

	safeClearAndType(gender, gndr2, 30);
	
	safeClearAndType(personlivewithu, "no", 30);
	
	pressTabKey_Action(personlivewithu, 10);
	
	safeClearAndType(ishehomeless, "no", 30);

	pressTabKey_Action(ishehomeless, 10);
	
   safeClearAndType(adrs, adr2, 30);
	
	safeClearAndType(cty, cti2, 30);
	
	safeClearAndType(stt, sta2, 30);

	safeClearAndType(zip, zpc2, 30);
	
	safeClearAndType(outofdc1, "no", 30);
	
	safeClearAndType(eligibility, "yes", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
	

}

public void NewMember(int RowNum) throws Exception{

	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
		safeClearAndType(firstname, OneScript.MemFName[RowNum], 30);  
		safeClearAndType(lastname, OneScript.MemLName[RowNum], 30);    		
		safeClearAndType(dob, OneScript.MemDob[RowNum], 30);  		
		safeClearAndType(gender, OneScript.GData[OneScript.Grw][7], 30);		
		safeClearAndType(personlivewithu, OneScript.GData[OneScript.Grw][8], 30);
		safeClearAndType(eligibility, OneScript.GData[OneScript.Grw][9], 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
}



	public void fillin1(String f2name, String l2name,String db2, String gndr2) throws Exception{
		
		//waitUntilPresent(firstname,10);
		//selectFrame(curamUAIframe, 30);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
		
		 safeClearAndType(firstname, f2name, 30);
			
			safeClearAndType(lastname, l2name, 30);
			
			safeClearAndType(dob, db2, 30);

			safeClearAndType(gender, gndr2, 30);
			
			safeClearAndType(personlivewithu, "yes", 30);
			
			safeClearAndType(eligibility, "yes", 30);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(60);
		

}
	
	
	
public void fillin2(String f3name, String l3name,String db3, String gndr3) throws InterruptedException{
		
	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
		
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	
			safeClearAndType(firstname, f3name, 30);
			
			safeClearAndType(lastname, l3name, 30);
			
			safeClearAndType(dob, db3, 30);

			safeClearAndType(gender, gndr3, 30);
			
			safeClearAndType(personlivewithu, "yes", 30);
			
			safeClearAndType(eligibility, "yes", 30);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(60);
		

}

public void fillin3(String f4name, String l4name,String db4, String gndr4) throws InterruptedException{
	
	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	
	 safeClearAndType(firstname, f4name, 30);
		
		safeClearAndType(lastname, l4name, 30);
		
		safeClearAndType(dob, db4, 30);

		safeClearAndType(gender, gndr4, 30);
		
		safeClearAndType(personlivewithu, "yes", 30);
		
		safeClearAndType(eligibility, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	

}
public void fillin4(String f5name, String l5name,String db5, String gndr5) throws Exception{
	
	//waitUntilPresent(firstname,10); 
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	 safeClearAndType(firstname, f5name, 30);
		
		safeClearAndType(lastname, l5name, 30);
		
		safeClearAndType(dob, db5, 30);

		safeClearAndType(gender, gndr5, 30);
		
		safeClearAndType(personlivewithu, "yes", 30);
		
		safeClearAndType(eligibility, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);

}
public void fillin5(String f6name, String l6name,String db6, String gndr6) throws InterruptedException{
	
	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	
	 safeClearAndType(firstname, f6name, 30);
		
		safeClearAndType(lastname, l6name, 30);
		
		safeClearAndType(dob, db6, 30);

		safeClearAndType(gender, gndr6, 30);
		
		safeClearAndType(personlivewithu, "yes", 30);
		
		safeClearAndType(eligibility, "yes", 30);
		safeMouseClick(nextbtn, 60);
	
		defaultFrame();
		waitForPageToLoad(60);
}
public void fillin6(String f7name, String l7name,String db7, String gndr7) throws Exception{

	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	 safeClearAndType(firstname, f7name, 30);
		
		safeClearAndType(lastname, l7name, 30);
		
		safeClearAndType(dob, db7, 30);

		safeClearAndType(gender, gndr7, 30);
		
		safeClearAndType(personlivewithu, "yes", 30);
		
		safeClearAndType(eligibility, "yes", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);

}

public void diffadd22(String f1name, String l1name,String db1, String gndr1,String adr1, String cti1,String sta1, String zpc1) throws Exception{
	
	//waitUntilPresent(firstname,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
    safeClearAndType(firstname, f1name, 30);
		
		safeClearAndType(lastname, l1name, 30);
		
		safeClearAndType(dob, db1, 30);

		safeClearAndType(gender, gndr1, 30);
		
		safeClearAndType(personlivewithu, "no", 30);
		
		pressTabKey_Action(personlivewithu, 10);
		
		safeClearAndType(ishehomeless, "no", 30);
		
		pressTabKey_Action(ishehomeless, 10);
		
    safeClearAndType(adrs, adr1, 30);
		
		safeClearAndType(cty, cti1, 30);
		
		safeClearAndType(stt, sta1, 30);

		safeClearAndType(zip, zpc1, 30);
		
		safeClearAndType(eligibility, "No", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
       
}

public void diffadd21(String f2name, String l2name,String db2, String gndr2,String adr2, String cti2,String sta2, String zpc2) throws Exception{
	
	//waitUntilPresent(firstname,10);
//	selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
	
	safeClearAndType(firstname, f2name, 30);
	
	safeClearAndType(lastname, l2name, 30);
	
	safeClearAndType(dob, db2, 30);

	safeClearAndType(gender, gndr2, 30);
	
	safeClearAndType(personlivewithu, "no", 30);
	
	pressTabKey_Action(personlivewithu, 10);
	
	safeClearAndType(ishehomeless, "no", 30);
	
	pressTabKey_Action(ishehomeless, 10);
	
   safeClearAndType(adrs, adr2, 30);
	
	safeClearAndType(cty, cti2, 30);
	
	safeClearAndType(stt, sta2, 30);

	safeClearAndType(zip, zpc2, 30);
	
	safeClearAndType(outofdc1, "NO", 30);
	
	safeClearAndType(eligibility, "NO", 30);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);

}
public void DCRes(String f1name, String l1name,String db1,String LiveWU, String gndr1, String Applying ) throws Exception{

	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='C�ram Health & Human Services Exchange']")));
			
    safeClearAndType(firstname, f1name, 30);
	
	safeClearAndType(lastname, l1name, 30);
	
	safeClearAndType(dob, db1, 30);

	safeClearAndType(gender, gndr1, 30);
	
	safeClearAndType(personlivewithu, LiveWU, 30);
	
	safeClearAndType(eligibility, Applying, 30);
	
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(60);
}

}
