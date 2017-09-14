package com.pageFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestSuite.OneScript;
import com.selenium.SafeActions;


public class Studentfunc extends SafeActions implements com.pageObjects.Student {
	
	
public WebDriver d;
	
	public Studentfunc(WebDriver d) {
		super(d);
		this.d=d;
	}
	public void Primary() throws InterruptedException{
		
		d.switchTo().defaultContent();
		Thread.sleep(4000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));

		//if(OneScript.AData[OneScript.Arw][64].equalsIgnoreCase("Yes")){ //Student?	
			
			safeClearAndType(student,OneScript.AData[OneScript.Arw][67], 60); 
			safeClearAndType(studenttype,OneScript.AData[OneScript.Arw][68], 60); 
			safeClearAndType(schooltype,OneScript.AData[OneScript.Arw][69], 60); 
			safeClearAndType(EndDate,OneScript.AData[OneScript.Arw][70], 60); 
			
		//} //Ever lived in Foster Care?
	
		
		
	}
}