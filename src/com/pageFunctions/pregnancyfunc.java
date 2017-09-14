
package com.pageFunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestSuite.OneScript;
import com.pageObjects.pregnancy;

import com.selenium.SafeActions;

public class pregnancyfunc extends SafeActions implements pregnancy {

	WebDriver d;
	public pregnancyfunc(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public void fillin(String Kids,String DueDt) throws InterruptedException{

		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(preg, "Yes", 30);
		pressTabKey_Action(preg, 10);
		safeClearAndType(children, Kids, 30);
		safeClearAndType(duedate, DueDt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	}
	
	public void Primary(String Gender,String Preg,String kids,String DueDt,String EndDt,String EnrollMC) throws InterruptedException{
		
		d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		if(Gender.equalsIgnoreCase("female")){ //if Female?
			
			if((Preg.equals("Yes"))) //if pregnant ?
			{ 			
			safeClearAndType(preg,Preg, 60); 
			pressTabKey_Action(preg, 10);
			safeClearAndType(children,kids, 60); 
			safeClearAndType(duedate,DueDt, 60); 
			safeClearAndType(enddate,EndDt, 60);
			safeClearAndType(EnrolledMedicaid,EnrollMC, 60);
			//safeMouseClick(nextbtn, 60);
			defaultFrame();
			waitForPageToLoad(30);
			} //end if pregnant ?
			
		}	//end if Female?	
		
	}
	
	public void PE(String Kids,String DueDt) throws InterruptedException{

		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		safeClearAndType(PEPreg, "Yes", 30);
		pressTabKey_Action(PEPreg, 10);
		safeClearAndType(PEKids, Kids, 30);
		safeClearAndType(PEDueDt, DueDt, 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	}
}