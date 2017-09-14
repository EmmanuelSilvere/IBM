package com.pageFunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObjects.dependencyontaxreturn;



public class dependencyontaxreturnfunc extends com.selenium.SafeActions implements dependencyontaxreturn {
	
	WebDriver d;
public dependencyontaxreturnfunc(WebDriver d) {
		super(d);
		this.d=d;
	}

	
	public void select(){
		
		waitUntilPresent(dependency,10);
		selectFrame(curamUAIframe, 60);
		safeClearAndType(dependency, "no", 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}
	
public void fillin() throws Exception{
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	
		safeClearAndType(singledependency, "no", 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(60);
	

	}


public void select12() throws Exception{
	
	//waitUntilPresent(dependency,10);
	//selectFrame(curamUAIframe, 60);
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
		safeClearAndType(dependency, "yes", 60);
		pressTabKey_Action(dependency, 10);
		safeClick(taxclaimer, 60);
		safeMouseClick(nextbtn, 60);
		defaultFrame();
		waitForPageToLoad(30);
	
	}

public void select2() throws Exception{
	//waitUntilPresent(dependency,10);
	//selectFrame(curamUAIframe, 60);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	safeClearAndType(dependency, "yes", 60);
	pressTabKey_Action(dependency, 10);
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@type='radio' and @id='__o3id7_1']")).click();
	//safeClick(taxclaimer1, 60);
	
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
}

public void select3() throws Exception{
	
	//waitUntilPresent(dependency,10);
	//selectFrame(curamUAIframe, 60);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(dependency, "no", 60);
	pressTabKey_Action(dependency, 10);
	safeClearAndType(dependent, "no", 60);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);

}




public void select1() throws Exception{
	//waitUntilPresent(dependency,10);
	//selectFrame(curamUAIframe, 60);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	
	safeClearAndType(dependency, "Yes", 60);
	pressTabKey_Action(dependency,10);
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@type='radio' and @id='__o3id7']")).click();
	//safeClick(taxclaimer, 60);
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
 }

public void select2NOs() throws Exception{
	//waitUntilPresent(dependency,10);
	//selectFrame(curamUAIframe, 60);
	
	d.switchTo().defaultContent();
	Thread.sleep(2000);
	d.switchTo().frame(d.findElement(By.xpath("//iframe[starts-with(@id,'curamUAIframe') and @class='curam-iframe' and @title='Cúram Health & Human Services Exchange']")));
	
	safeClearAndType(dependency, "No", 60);
	pressTabKey_Action(dependency,10);
	Thread.sleep(2000);
	safeClearAndType(dependent, "No", 60);
	pressTabKey_Action(dependent,10);
	
	safeMouseClick(nextbtn, 60);
	defaultFrame();
	waitForPageToLoad(30);
	
 }



}

