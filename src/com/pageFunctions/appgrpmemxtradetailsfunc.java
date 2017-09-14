package com.pageFunctions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.appgrpmemxtradetails;
import com.selenium.SafeActions;



public class appgrpmemxtradetailsfunc extends SafeActions implements appgrpmemxtradetails {
	
	
	WebDriver d;
	public appgrpmemxtradetailsfunc(WebDriver d) {
		super(d);
		this.d=d;
	}


	public void fillin(String ssn1,String enrlt1) throws InterruptedException{
		//waitUntilPresent(havessn,10);
		//selectFrame(curamUAIframe, 30);
		
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		
		safeClearAndType(ruamericanindian, "No", 60);
		 safeClearAndType(havessn, "Yes", 30);
		 pressTabKey_Action(havessn, 10);
			
			safeClearAndType(ssn, ssn1, 30);
			
			safeClearAndType(citizen, "yes", 30);
			 pressTabKey_Action(citizen, 10);

			safeClearAndType(naturalizedcitizen, "No", 30);
			
			safeClearAndType(enrolment, enrlt1, 30);
			safeClearAndType(motherenrolment, "No", 30);  // enable this when child < 1 year
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(60);
		
	}
	

	public void Indian(String ssn1,String enrlt1) throws InterruptedException{
		//waitUntilPresent(havessn,10);
		//selectFrame(curamUAIframe, 30);
		
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		
		safeClearAndType(ruamericanindian, "YES", 60);
		 safeClearAndType(havessn, "Yes", 30);
		 pressTabKey_Action(havessn, 10);
			
			safeClearAndType(ssn, ssn1, 30);
			
			safeClearAndType(citizen, "yes", 30);
			 pressTabKey_Action(citizen, 10);

			safeClearAndType(naturalizedcitizen, "No", 30);
			
			safeClearAndType(enrolment, enrlt1, 30);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(60);
		
	}
	public void fillinx(String ssn1) throws InterruptedException{
		//waitUntilPresent(havessn,10);
		//selectFrame(curamUAIframe, 30);
		 
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(havessn, "yes", 30);
		 pressTabKey_Action(havessn, 10);
			
			safeClearAndType(ssn, ssn1, 30);
			
			safeClearAndType(citizen, "yes", 30);
			 pressTabKey_Action(citizen, 10);

			safeClearAndType(naturalizedcitizen1, "no", 30);
			
			safeClearAndType(enrolment1, "no", 30);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(60);
		
  }
	
public void fillin1(String ssn2,String enrlt2) throws InterruptedException{
	//waitUntilPresent(havessn,10);	
	//selectFrame(curamUAIframe, 30);
		
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(havessn, "yes", 30);
		 pressTabKey_Action(havessn, 10);
			
			safeClearAndType(ssn, ssn2, 30);
			
			safeClearAndType(citizen, "yes", 30);
			 pressTabKey_Action(citizen, 10);

			safeClearAndType(naturalizedcitizen, "no", 30);
			
			safeClearAndType(enrolment, enrlt2, 30);
			Thread.sleep(4000);
			safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(60);
		
	}

public void fillin2(String ssn3,String enrlt3) throws InterruptedException{
	//waitUntilPresent(havessn,10);
	//selectFrame(curamUAIframe, 30);
	 
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(havessn, "yes", 30);
		pressTabKey_Action(havessn, 10);
		
		safeClearAndType(ssn, ssn3, 30);
		
		safeClearAndType(citizen, "yes", 30);
		 pressTabKey_Action(citizen, 10);

		safeClearAndType(naturalizedcitizen, "no", 30);
		
		safeClearAndType(enrolment, enrlt3, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
}

public void fillin3(String ssn4,String enrlt4) throws InterruptedException{
	//waitUntilPresent(havessn,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

	 safeClearAndType(havessn, "yes", 30);
	 pressTabKey_Action(havessn, 10);
		
		safeClearAndType(ssn, ssn4, 30);
		
		safeClearAndType(citizen, "yes", 30);
		 pressTabKey_Action(citizen, 10);

		safeClearAndType(naturalizedcitizen, "no", 30);
		
		safeClearAndType(enrolment, enrlt4, 30);
		safeClearAndType(motherenrolment, "no", 30);  // enable this line when age is <1 year
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
	
}

public void fillin4(String ssn5,String enrlt5) throws InterruptedException{
	//waitUntilPresent(havessn,10);
	//selectFrame(curamUAIframe, 30);
	 
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

	safeClearAndType(havessn, "yes", 30);
	 pressTabKey_Action(havessn, 10);
		
		safeClearAndType(ssn, ssn5, 30);
		
		safeClearAndType(citizen, "yes", 30);
		 pressTabKey_Action(citizen, 10);

		safeClearAndType(naturalizedcitizen, "no", 30);
		
		safeClearAndType(enrolment, enrlt5, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
}

public void fillin5(String ssn6,String enrlt6) throws InterruptedException{
	
	//waitUntilPresent(havessn,10);
	//selectFrame(curamUAIframe, 30);
	 
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

	safeClearAndType(havessn, "Yes", 30);
	 pressTabKey_Action(havessn, 10);
		
		safeClearAndType(ssn, ssn6, 30);
		
		safeClearAndType(citizen, "Yes", 30);
		 pressTabKey_Action(citizen, 10);

		safeClearAndType(naturalizedcitizen, "No", 30);
		
		safeClearAndType(enrolment, enrlt6, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
	
}

public void fillin6(String ssn7,String enrlt7) throws InterruptedException{
	//waitUntilPresent(havessn,10);
	//selectFrame(curamUAIframe, 30);
	 
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

	safeClearAndType(havessn, "yes", 30);
	 pressTabKey_Action(havessn, 10);
		
		safeClearAndType(ssn, ssn7, 30);
		
		safeClearAndType(citizen, "yes", 30);
		 pressTabKey_Action(citizen, 10);

		safeClearAndType(naturalizedcitizen, "no", 30);
		
		safeClearAndType(enrolment, enrlt7, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
}

public void fillin7(String ssn8) throws InterruptedException{
	//waitUntilPresent(havessn,10);
	//selectFrame(curamUAIframe, 30);
	 
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(havessn, "yes", 30);
		pressTabKey_Action(havessn, 10);
		
		safeClearAndType(ssn, ssn8, 30);
		
		safeClearAndType(citizen, "yes", 30);
		 pressTabKey_Action(citizen, 10);

		safeClearAndType(naturalizedcitizen, "no", 30);
		
		safeClearAndType(enrolment, "no", 30);
		safeClearAndType(motherenrolment, "no", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
}

public void fillin21(String ssn21,String enrlt21) throws InterruptedException{
	
	//waitUntilPresent(social,10);
	//selectFrame(curamUAIframe, 30);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(social, ssn21, 30);
		pressTabKey_Action(social, 10);
		safeClearAndType(enroll, enrlt21, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	
}

	
}

