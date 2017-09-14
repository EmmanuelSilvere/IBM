package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.TestSuite.OneScript;
import com.pageObjects.*;
import com.selenium.SafeActions;

public class CheckFosterOrPregOrStudent extends SafeActions implements  fostercare, pregnancy {

	static WebDriver d;
	public CheckFosterOrPregOrStudent(WebDriver d) {
		super(d);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	public static void Primary() throws InterruptedException{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		String ClickNext = "No";
		
        int dobint = Integer.parseInt(OneScript.AData[OneScript.Arw][7]); // Get DOB convert to int
		
       // if(OneScript.AData[OneScript.Arw][64].equalsIgnoreCase("Yes")){ //Ever lived in Foster Care?	
        if (18 <= dobint && dobint <= 26)	{ //Ever lived in Foster Care?
			System.out.println("Inside Foster");
			d.findElement(InFosterCare).clear();
			d.findElement(InFosterCare).sendKeys(OneScript.AData[OneScript.Arw][64]);	
			d.findElement(WhichState).sendKeys(OneScript.AData[OneScript.Arw][65]);	
			d.findElement(WhichState).sendKeys(OneScript.AData[OneScript.Arw][66]);	
		
			ClickNext = "Yes";
			
		} //Ever lived in Foster Care?
		
		if(OneScript.AData[OneScript.Arw][9].equalsIgnoreCase("female")){ //if Female?
			
			if((OneScript.AData[OneScript.Arw][59].equals("Yes"))) //if pregnant ?
				
				if (18 <= dobint && dobint <= 25)				
					{ 					
							
					Thread.sleep(3000);
					d.findElement(pregF).clear();
					d.findElement(pregF).sendKeys(OneScript.AData[OneScript.Arw][59]);	
					d.findElement(pregF).sendKeys(Keys.TAB);
					d.findElement(childrenF).sendKeys(OneScript.AData[OneScript.Arw][60]);
					d.findElement(duedateF).sendKeys(OneScript.AData[OneScript.Arw][61]);
					d.findElement(enddateF).sendKeys(OneScript.AData[OneScript.Arw][62]);
					d.findElement(EnrolledMedicaidF).sendKeys(OneScript.AData[OneScript.Arw][63]);
		
					}else {
						
						Thread.sleep(3000);
						d.findElement(preg).clear();
						d.findElement(preg).sendKeys(OneScript.AData[OneScript.Arw][59]);	
						d.findElement(preg).sendKeys(Keys.TAB);
						d.findElement(children).sendKeys(OneScript.AData[OneScript.Arw][60]);
						d.findElement(duedate).sendKeys(OneScript.AData[OneScript.Arw][61]);
						d.findElement(enddate).sendKeys(OneScript.AData[OneScript.Arw][62]);
						d.findElement(EnrolledMedicaid).sendKeys(OneScript.AData[OneScript.Arw][63]);
					
					} 	//end if pregnant ?
					
					ClickNext = "Yes";
		   	
		}	//end if Female?	
		
		//if(OneScript.AData[OneScript.Arw][67].equalsIgnoreCase("Yes")){ //Are you a Student?	
		if (19 <= dobint && dobint <= 21)
		{
			System.out.println("Inside Student");
			d.findElement(student).clear();
			d.findElement(student).sendKeys(OneScript.AData[OneScript.Arw][67]);	
			d.findElement(studenttype).sendKeys(OneScript.AData[OneScript.Arw][67]);
			d.findElement(schooltype).sendKeys(OneScript.AData[OneScript.Arw][67]);
			d.findElement(EndDate).sendKeys(OneScript.AData[OneScript.Arw][67]);			
			ClickNext = "Yes";
			
		} //Ever lived in Foster Care?
		
		if(ClickNext.equals("Yes"))			
			{
				System.out.println("Inside Next");
				Thread.sleep(3000);
				d.findElement(By.xpath("//*[@id='__o3btn.next']")).click();    //sendKeys(OneScript.AData[OneScript.Arw][67]);	
			}
		
	} // End of Primary
	
	public static void Member() throws InterruptedException{
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		String ClickNext = "No";
		
        int dobint = Integer.parseInt(OneScript.GData[OneScript.Grw][5]); // Get DOB convert to int
		
       // if(OneScript.AData[OneScript.Arw][64].equalsIgnoreCase("Yes")){ //Ever lived in Foster Care?	
        
        if (18 <= dobint && dobint <= 26)	{ // if Age is between 18 & 26 Ever lived in Foster Care?
			System.out.println("Inside Foster");
			d.findElement(InFosterCare).clear();
			d.findElement(InFosterCare).sendKeys(OneScript.GData[OneScript.Grw][58]);	
			d.findElement(WhichState).clear();
			d.findElement(WhichState).sendKeys(OneScript.GData[OneScript.Grw][59]);	
		
			ClickNext = "Yes";
			
		} //Ever lived in Foster Care?
		
		if(OneScript.GData[OneScript.Grw][7].equalsIgnoreCase("female")){ //if Female?
			
			if((OneScript.GData[OneScript.Grw][53].equals("Yes"))) //if pregnant in excel sheet ?
				
				if (18 <= dobint && dobint <= 25)  // If Age between 18-25 then pregnant question.	 
					{ 					
							
					Thread.sleep(3000);
					d.findElement(pregF).clear();
					d.findElement(pregF).sendKeys(OneScript.GData[OneScript.Grw][53]);	
					d.findElement(pregF).sendKeys(Keys.TAB);
					d.findElement(childrenF).sendKeys(OneScript.GData[OneScript.Grw][54]);
					d.findElement(duedateF).sendKeys(OneScript.GData[OneScript.Grw][55]);
					d.findElement(enddateF).sendKeys(OneScript.GData[OneScript.Grw][56]);
					d.findElement(EnrolledMedicaidF).sendKeys(OneScript.GData[OneScript.Grw][57]);
		
					}else {
						
						Thread.sleep(3000);
						d.findElement(preg).clear();
						d.findElement(preg).sendKeys(OneScript.GData[OneScript.Grw][53]);	
						d.findElement(preg).sendKeys(Keys.TAB);
						d.findElement(children).sendKeys(OneScript.GData[OneScript.Grw][54]);
						d.findElement(duedate).sendKeys(OneScript.GData[OneScript.Grw][55]);
						d.findElement(enddate).sendKeys(OneScript.GData[OneScript.Grw][56]);
						d.findElement(EnrolledMedicaid).sendKeys(OneScript.GData[OneScript.Grw][57]);
					
					} 	//end if pregnant ?
					
					ClickNext = "Yes";
		   	
		}	//end if Female?	
		
		//if(OneScript.AData[OneScript.Arw][67].equalsIgnoreCase("Yes")){ //Are you a Student?	
		if (19 <= dobint && dobint <= 21)   // If Age between 19-21 (Student)
		{
			System.out.println("Inside Student");
			d.findElement(student).clear();
			d.findElement(student).sendKeys(OneScript.GData[OneScript.Grw][61]);	
			d.findElement(studenttype).sendKeys(OneScript.GData[OneScript.Grw][62]);
			d.findElement(schooltype).sendKeys(OneScript.GData[OneScript.Grw][63]);
			d.findElement(EndDate).sendKeys(OneScript.GData[OneScript.Grw][64]);			
			ClickNext = "Yes";
			
		} //Ever lived in Foster Care?
		
		if(ClickNext.equals("Yes"))			
			{
				System.out.println("Inside Next");
				Thread.sleep(3000);
				d.findElement(By.xpath("//*[@id='__o3btn.next']")).click();    //sendKeys(OneScript.AData[OneScript.Arw][67]);	
			}
		
	} // End of Member
	
}
