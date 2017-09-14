package com.pageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestSuite.CuramDriver;
import com.businessutilities.Butility;
import com.pageObjects.eligibilityresults;



	
	
	public class eligibilityresultsfunc implements eligibilityresults {
		
		public WebDriver d;
			
			public eligibilityresultsfunc(WebDriver d) {
				super();
				this.d=d;
			}
			
			public void click() throws InterruptedException{
				
				
				//driver.switchTo().frame("curamUAIframe");
				d.switchTo().defaultContent();
				Thread.sleep(2000);
				if(CuramDriver.env.equals("IBMDev"))
				{
				d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='dummy']")));
				} else {
					d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe']")));
				}
				Thread.sleep(1000);
				
				Butility.scrollIntoElementView(d,results);
				Thread.sleep(5000);
				Butility.saveScreenShot(d);
				Thread.sleep(2000);
				d.findElement(results).click();
				d.switchTo().defaultContent();
				Thread.sleep(4000);
				Butility.saveScreenShot(d);
				
				
				
			}
		}



