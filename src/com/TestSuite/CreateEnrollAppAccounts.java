package com.TestSuite;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
//import com.businessutilities.ExcelUtilities;
import com.dataprovider.ConfigManager;
import com.pageFunctions.DcGovLoginPage;

import com.pageFunctions.Securityqsnspage;
import com.pageFunctions.UAT_CreateAccountFunc;
//import com.pageFunctions.gettingstartedfunc;
import com.pageFunctions.startappfunc;
import com.utilities.BusinessMethods;
import com.utilities.Constants;
import com.utilities.LoggerClass;


public class CreateEnrollAppAccounts extends BaseClass {

	


	public static String temp,uname,Fname,ssn,f1name,pswd,Lname,dob,sex;
	
	
	WebDriver d; 
	ConfigManager confMngr=new ConfigManager("App");
	UAT_CreateAccountFunc lgnpage;
	DcGovLoginPage lpage;
	Securityqsnspage secpage;
	startappfunc spage;
	

	
    @BeforeMethod
    
 	public void bsateup() throws Exception  //(ITestContext context) throws InterruptedException
 	{
    	
    
		OpenApp();
		
  		lgnpage= new UAT_CreateAccountFunc(d);
		lpage=new DcGovLoginPage(d);
		secpage = new Securityqsnspage(d);
		spage=new startappfunc(d);
		
		
	}
	
	public static java.util.logging.Logger logger = LoggerClass.getLogInstance();
	
	@Test  
	public void TC1032() throws Exception{

				LoadVariables();
				midWait(4);
				lgnpage.CreateAccount(uname,pswd,Fname,Lname,dob,ssn,sex);
				lpage.login(uname,pswd);	
				secpage.filing_ans1();
				WriteToLog();
				afterMethod();
			
			

		}
	
	public void LoadVariables() throws Exception
	  {	 
		pswd="Abcd@1234"; sex="Female";
		temp=BusinessMethods.getDynamicStr();
		 uname=temp+"@gmail.com";
		 Fname=temp;			
		 Lname=BusinessMethods.getDynamicLname();
		 ssn = BusinessMethods.GetSSN();
		 dob = BusinessMethods.getDOB(32);
	  }
	 
	 
	 @AfterMethod
		  public void afterMethod() {

			   d.close();
			   
		}
	 
	 
		public void OpenApp() throws Exception
		 
		 { 
				this.d=getdriver(Constants.Browser);	
				d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				switch (CuramDriver.env){	
				
				case "PreProd" :
					d.get(Constants.PreprodURL);
					break;
				case "UAT" :	
					d.get(Constants.UATURL);
					break;
				case "IBMDev" :	
					d.get(Constants.IBMDev);
					break;
				case "IBMBase" :	
					d.get(Constants.IBMBase);
					break;

		} // End Switch	
		
				d.manage().window().maximize();
		 }
		
		public void WriteToLog() throws Exception
		 
		 { 	
		
		 File FC = new File(Constants.ReportFile);//Created object of java File class.
		  if (!FC.exists()) 
		  {
			  FC.createNewFile();//Create file.
			  FileWriter FW = new FileWriter(Constants.ReportFile);
			  BufferedWriter BW = new BufferedWriter(FW);
			  BW.write("Enroll App Accounts Created On :" + Calendar.getInstance().getTime() + " In "+CuramDriver.env + " Env" + "\r\n"); //Writing In To File.
			  BW.write("---------------------------------------------------- \r\n"); //Writing In To File.
			  BW.write("\r\n");
			  BW.close();
			}
		//-----write into Note Pad Report -------------
			FileWriter FW = new FileWriter(Constants.ReportFile,true); //the true will append the new data
			FW.write("\r\n"); //Writing In To File.
			FW.write("First Name: "+ Fname+ "    Last Name: "+ Lname+"    Social: "+ssn+"    DOB : "+ dob + "    EMAIL: "+ uname);
			FW.close();
		 }
		
}