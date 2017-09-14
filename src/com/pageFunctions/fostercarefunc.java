package com.pageFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestSuite.OneScript;
import com.selenium.SafeActions;

public class fostercarefunc extends SafeActions implements com.pageObjects.fostercare {
	
	
public WebDriver d;
	
	public fostercarefunc(WebDriver d) {
		super(d);
		this.d=d;
	}

	public void fillin() throws InterruptedException{
		
		waitUntilPresent(student,10);
		selectFrame(curamUAIframe, 30);
		
		safeClearAndType(student, "yes", 30);
		pressTabKey_Action(student, 10);
		safeClearAndType(studenttype, "Full Time", 30);
		safeClearAndType(schooltype, "Undergraduate", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	
	}
	
public void fillin1() throws InterruptedException{
		
//		waitUntilPresent(InFosterCare,3);
//		selectFrame(curamUAIframe, 3);
		
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		safeClearAndType(InFosterCare, "Yes", 3);
		pressTabKey_Action(InFosterCare, 3);
		safeClearAndType(WhichState, "DC", 3);
		safeClearAndType(HowOld, "18", 3);
		pressTabKey_Action(HowOld, 3);
		safeClearAndType(enrollment, "Yes", 3);
		safeMouseClick(nextbtn, 3);
		defaultFrame();
		waitForPageToLoad(3);
		
	
	}
	
	public void OSStudent() throws InterruptedException{
		
		d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		
		safeClearAndType(student, "yes", 30);
		pressTabKey_Action(student, 10);
		safeClearAndType(studenttype, "Full Time", 30);
		safeClearAndType(schooltype, "Undergraduate", 30);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
		
	
	}

	public void Primary() throws InterruptedException{   // Primary in Foster Care
		
		d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

	//	if(OneScript.AData[OneScript.Arw][64].equalsIgnoreCase("Yes")){ //Ever lived in Foster Care?	
			
			safeClearAndType(InFosterCare,"Yes", 60); 
			pressTabKey_Action(InFosterCare, 3);
			safeClearAndType(WhichState,"DC", 60); 
			safeClearAndType(HowOld,"9", 60); 
			pressTabKey_Action(HowOld, 3);
			//safeMouseClick(nextbtn, 60);
			
	//	} //Ever lived in Foster Care?
		
	}
}