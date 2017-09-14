
package com.TestSuite;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

import com.businessutilities.ExcelUtilities;
import com.dataprovider.ConfigManager;
import com.pageFunctions.DcGovLoginPage;
import com.pageFunctions.Securityqsnspage;
import com.pageFunctions.Studentfunc;
import com.pageFunctions.UAT_CreateAccountFunc;
import com.pageFunctions.additionaldetailsfunc;
import com.pageFunctions.additionalinfofunc;
import com.pageFunctions.addpeoplefunc;
import com.pageFunctions.annualincomefunc;
import com.pageFunctions.appgrpmemdetailsfunc;
import com.pageFunctions.appgrpmemxtradetailsfunc;
import com.pageFunctions.bedroomsfunc;
import com.pageFunctions.brokerdetailsfunc;
import com.pageFunctions.commonelelmentsfunc;
import com.pageFunctions.dependencyontaxreturnfunc;
import com.pageFunctions.educationdetailsfunc;
import com.pageFunctions.eligibilityresultsfunc;
import com.pageFunctions.gettingstartedfunc;
import com.pageFunctions.incomeadjustmentsfunc;
import com.pageFunctions.incomedetailsfunc;
import com.pageFunctions.incomeinfofunc;
import com.pageFunctions.infoabtufunc;
import com.pageFunctions.moreabtudetailsfunc;
import com.pageFunctions.moreabtufunc;
import com.pageFunctions.othermembersinappfunc;
import com.pageFunctions.fostercarefunc;
import com.pageFunctions.pregnancyfunc;
import com.pageFunctions.relationshipfunc;
import com.pageFunctions.startappfunc;
import com.pageFunctions.streetresifunc;
import com.pageFunctions.submitappfunc;
import com.pageFunctions.supportdocdetailsfunc;
import com.pageFunctions.taxfilerfunc;
import com.pageFunctions.taxfilestatusfunc;
import com.pageFunctions.termsandconditionsfunc;
import com.pageFunctions.yearhomebuiltfunc;
import com.utilities.BusinessMethods;
import com.utilities.Constants;
import com.utilities.LoggerClass;



public class New1HHApp extends BaseClass {

	// Primary Applicant : 
		String pswd,Fname,ssn, Lname, dob, sex;

		
	// Common Variables : 
		
		public static int Age;
		public static String NData[][],temp,temp1,uname,uname1; 
		//public static String Fname1,dob1,ssn1; //--> Use these if you want to use own values instead of random
		
		public static int NRows,NCols,Nrw;
		
		WebDriver d; 
		ConfigManager confMngr=new ConfigManager("App");
		UAT_CreateAccountFunc lgnpage;
			
		DcGovLoginPage lpage;
		Securityqsnspage secpage;
		startappfunc spage;
		gettingstartedfunc getting_started;
		commonelelmentsfunc common_elements;
		termsandconditionsfunc terms_conditions;
		infoabtufunc info_abtu;
		moreabtufunc moreinfo_abtu;
		pregnancyfunc pregnant;
		Studentfunc Student;
		additionalinfofunc additional_info;
		moreabtudetailsfunc more_details;
		streetresifunc street_residence;
		yearhomebuiltfunc year_built;
		educationdetailsfunc education_details;
		bedroomsfunc bed_rooms;
		othermembersinappfunc othermembers_app;
		appgrpmemdetailsfunc groupmembers_app;
		appgrpmemxtradetailsfunc groupxtradetails_app;
		supportdocdetailsfunc supportdoc_details;
		fostercarefunc foster_care;
		addpeoplefunc add_people;
		relationshipfunc relation_ship;
		taxfilerfunc tax_filer;
		taxfilestatusfunc taxfiler_status;
		dependencyontaxreturnfunc dependency_taxreturn;
		incomeinfofunc income_info;
		incomedetailsfunc income_details;
		incomeadjustmentsfunc income_adjustments;
		annualincomefunc annual_income;
		additionaldetailsfunc add_details;
		brokerdetailsfunc broker_details;
	    submitappfunc submit_app;
	    eligibilityresultsfunc eligibilty_results;
     
	
     @BeforeMethod
 	
 	public void bsateup() //(ITestContext context) throws InterruptedException
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
	 		
  		
  		
	  /*		if(d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).isDisplayed())
	  			d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).click();*/
	  		
	  	/*if(d.findElement(By.xpath("//*[@id='disp_popup_once']//button[@class='close']")).isDisplayed())
			d.findElement(By.xpath("//*[@id='disp_popup_once']//button[@class='close']")).click();*/
	  		
  		lgnpage= new UAT_CreateAccountFunc(d);
		lpage=new DcGovLoginPage(d);
		secpage = new Securityqsnspage(d);
		spage=new startappfunc(d);
		getting_started = new gettingstartedfunc(d);
		common_elements = new commonelelmentsfunc(d);
		terms_conditions = new termsandconditionsfunc(d);
		info_abtu = new infoabtufunc(d);
		moreinfo_abtu= new moreabtufunc(d);
		additional_info = new additionalinfofunc(d);
		more_details = new moreabtudetailsfunc(d);
		pregnant = new pregnancyfunc(d);
		street_residence = new streetresifunc(d);
		year_built = new yearhomebuiltfunc(d);
		education_details = new educationdetailsfunc(d);
		bed_rooms = new bedroomsfunc(d);
		othermembers_app = new othermembersinappfunc(d);
		groupmembers_app = new appgrpmemdetailsfunc(d);
		groupxtradetails_app = new appgrpmemxtradetailsfunc(d);
		supportdoc_details = new supportdocdetailsfunc(d);
		pregnant = new pregnancyfunc(d);
		foster_care = new fostercarefunc(d);
		Student = new Studentfunc(d);
		add_people = new addpeoplefunc(d);
		relation_ship = new relationshipfunc(d);
		tax_filer = new taxfilerfunc(d);
		taxfiler_status = new taxfilestatusfunc(d);
		dependency_taxreturn = new dependencyontaxreturnfunc(d);
		income_info = new incomeinfofunc(d);
		income_details = new incomedetailsfunc(d);
		income_adjustments = new incomeadjustmentsfunc(d);
		annual_income = new annualincomefunc(d);
		add_details = new additionaldetailsfunc(d);
		broker_details = new brokerdetailsfunc(d);
		submit_app = new submitappfunc(d);
		eligibilty_results = new eligibilityresultsfunc(d);
		
		
	}
     
     public static java.util.logging.Logger logger = LoggerClass.getLogInstance();
	
	@Test 
	public void TC1033() throws Exception { 
		
		LoadVariables();
		
		lgnpage.CreateAccount(uname,pswd,Fname,Lname,dob,ssn,sex);	
		//lgnpage.CreateAccount(uname,pswd,Fname1,Lname,dob1,ssn1,sex);	 // ---Use if you want to use your own data instead of random values
	
		lpage.login(uname,pswd);
		
		secpage.filing_ans1();
		
		spage.click();
	 
		WriteToLog();
		
		getting_started.click();
	
		common_elements.click();
		
		terms_conditions.click();
	
		common_elements.click();
		
		midWait(2);
		
		FirstMemberDetails();   // **************Primary Applicant (First Member) ***************************
		
		midWait(8);
		
		street_residence.opt();
		
		midWait(2);
		
		year_built.opt();
		
		midWait(2);
		
		education_details.opt();
		
		midWait(2);
		
		bed_rooms.opt();		
		
		midWait(2);
		
		common_elements.click();
		
		midWait(2);
		
		add_people.no_morepeople();	
			
		midWait(7);				
		
		if((NData[Nrw][33].equals("Yes"))) //if filing taxes ?
			
			{  tax_filer.click();} 		
		
		else {	common_elements.click();}  // Not Filing taxes
						
		midWait(3);
		
		dependency_taxreturn.fillin();
				
		midWait(3);
		
		common_elements.click();  // Group Summary
		
		midWait(3);
		
		common_elements.click();  // Group Income Section Info Page
		
		midWait(2);		

		FirstIncomeDetails();  // comment this if no income --> Update this function with income type W2 or Non W2		
		
		midWait(3);
		
		// Common Questions
		
		common_elements.click(); // More about appl group
		
		midWait(3);
		
		
		
		if((NData[Nrw][35].equals("Yes"))) //if Incarcerated ?
			
		{additional_info.Incarceration(NData[Nrw][36]);  		
	
		}else {	common_elements.click();}  // Not Incarcerated
		
		
		midWait(3);
		
		if((NData[Nrw][12].equals("Yes"))) //if Indian tribe ?			
		{common_elements.click();} 

		add_details.UAT();   // ****Non-MAGI Question (Blind, Disabled or Need daily help)****** 
		midWait(3);
		common_elements.click();  //Summary
		midWait(3);
		common_elements.click();  // Broker Details
		midWait(3);
		common_elements.click();  // Voter Registration
		midWait(3);
		common_elements.click();  // List of Items require verification
		midWait(3);
		submit_app.fillin_app(Fname,Lname);
	
	/*	eligibilty_results.click();
		
		midWait(3);*/
		
	}  // end of main()
	
	
	
	
	
	
	
	
	
	//*****************************Below are Functions ****************************************
	
	public String[][] fetchdata(String Sheet, int ApplRows, int ApplCols) throws Exception
	  {
		String[][] testObjArray = ExcelUtilities.getTableArray(Constants.Data2,Sheet, ApplRows,ApplCols);
		return (testObjArray);
	  }
	
	 public void LoadVariables() throws Exception
	  {	 
	 
		System.out.println("Inside Load Var");

		
		NRows = ExcelUtilities.FindNumbeOfRows(Constants.Data2, "New");
		NCols = ExcelUtilities.FindNumbeOfColumns(Constants.Data2, "New");
		NData = fetchdata("New", NRows,NCols);
		

		
		for(int N=0; (N<=NRows-1); N++){
			if(NData[N][0].equals(CuramDriver.TCID)){
				Nrw=N;
				System.out.println("Row #" + N);
				break;
			}
		}
	
		
		//  Primary Applicant FName,LName, Dob & SSN

		sex=NData[Nrw][10];  // used for creating account in EA
		pswd=Constants.pswd;
		
		if(NData[Nrw][1].equalsIgnoreCase("Yes")) {  // if Random #s to be created
			 
			 temp=BusinessMethods.getDynamicStr();
			 uname=temp+"@gmail.com";
			 Fname=temp;			
			 Lname=BusinessMethods.getDynamicLname();
			 ssn = BusinessMethods.GetSSN();
			 dob = BusinessMethods.getDOB(Integer.parseInt(NData[Nrw][4]));

		} else {
			
			 uname = NData[Nrw][2]+"@gmail.com";
			 Fname= NData[Nrw][2];
			 Lname= NData[Nrw][3];
			 dob = NData[Nrw][4];
			 ssn = NData[Nrw][13];
			 
			 
		} // end if 
		

	  } // end load variables method
	
	 
	 
	 
	 
	 public void WriteToLog() throws Exception
	 
	 {
			logger.info("                  ");
			logger.info("First Name: "+Fname);
			logger.info("Last Name: "+ Lname);
			logger.info("Social: "+ssn);
			logger.info("DOB : "+ dob);
			logger.info("EMAIL: "+ uname );
			logger.info("PassWord: "+ pswd);	
	 }
	 

	 /////////////////////////***********************************************************************
	 
	 
	 public void FirstMemberDetails() throws Exception {
				
		 		 
				//  Primary DC Resident  ****
		 		 
					
					String Ind=NData[Nrw][12], HaveSSN=NData[Nrw][13],
							ApldSSN=NData[Nrw][15],Reason=NData[Nrw][16],Ctzn=NData[Nrw][17],
							Nat=NData[Nrw][18],DocType=Constants.DocType,NatInUS="No",
							ImgStatus=NData[Nrw][19],SupDoc=Constants.SuppDoc,LivedInUS="No",
							MEC=NData[Nrw][26],
							Military="No",Vet="No",DepVet="No",
							EnrolledMC = "No";  // Pregnant women is enrolled in MC during pregnancy?
					
					
					
					
					if (NData[Nrw][5].equalsIgnoreCase("Yes")){  //Homeless?
						
						info_abtu.Homeless( Fname,Lname,dob,sex,NData[Nrw][11]);	//-->  Homeless
						
					} else if (NData[Nrw][6].equalsIgnoreCase("Yes")){   // Lives in DC?
					
						info_abtu.fillin(Fname,Lname,dob,sex,Constants.DCStreet,Constants.DCCity,Constants.DCState,Constants.DcZip,NData[Nrw][11]); 
						
						}else if (NData[Nrw][7].equalsIgnoreCase("Yes")){  // Lives Out of DC?  
						
							if (NData[Nrw][8].equalsIgnoreCase("Yes")){  // Temporarily and returns in < 90 Days?
					
								info_abtu.OutOfDCTemp(Fname,Lname,dob,sex,Constants.NonDCStreet,
									 Constants.NonDCCity,Constants.NonDCState,Constants.NonDcZip,NData[Nrw][11]);  //-->Lives out of DC temporarily
							
							}else
							
							info_abtu.OutOfDCPerm(Fname,Lname,dob,sex,Constants.NonDCStreet,Constants.NonDCCity,
								      Constants.NonDCState,Constants.NonDcZip,NData[Nrw][11]);  //-->Lives out of DC and NOT returning in <90Days..
					}
				
					
					
					//  Below function deals with (Primary Applicant) Indian,SSN,citizen,naturalized, immigration etc.
					
					
					
					
					midWait(3);  // till next page is displayed.
					
					moreinfo_abtu.AddionalInfo(Ind,HaveSSN,ssn,ApldSSN,Reason,Ctzn,Nat,DocType,NatInUS,ImgStatus,SupDoc,LivedInUS,Military,Vet,DepVet,MEC); 
					
					midWait(3);  // till next page is displayed.
					
					
					
					
					String FFS = "No"; // If Female/Foster/Student
					
					if(sex.equalsIgnoreCase("female")){ //if Female?
						FFS="Yes";
						if((NData[Nrw][20].equals("Yes"))) //if pregnant ?
						{ pregnant.Primary(sex,NData[Nrw][20],NData[Nrw][21],NData[Nrw][22],NData[Nrw][23],EnrolledMC);}
					}	
					
					Age = Integer.parseInt(NData[Nrw][4]);
					
				if(Age >=18 && Age <26 ) //if Age is for Foster Care or Student ?
					
					{	FFS="Yes";
						if((NData[Nrw][24].equals("Yes"))) //if Foster Care ?
						{ foster_care.Primary();}
					
						if((NData[Nrw][25].equals("Yes"))) //if Student ?						
						{Student.Primary();}
					
				    }					
					
					if(FFS.equalsIgnoreCase("Yes")){ common_elements.click();}
					
					
					
					if((ImgStatus.equals("Yes"))) //if Eligible Immigration Status is Yes
					{
						
					 String alienno="6"+BusinessMethods.getRandomNumber(8);
					 String CardNo = "AAA" + BusinessMethods.getRandomNumber(10);  					 
					 supportdoc_details.fillPRCard(alienno,CardNo);
	
					}
					
					if((Nat.equals("Yes"))) //if Naturalized Citizen
					{
						
					 String alienno="6"+BusinessMethods.getRandomNumber(8);
					 String CardNo = "AAA" + BusinessMethods.getRandomNumber(6);  					 
					 supportdoc_details.fillPRCard(alienno,CardNo);
	
					}
					
					 
					if (NData[Nrw][26].equalsIgnoreCase("Yes")){  //MEC?
						 
						 midWait(3);							
						 
						 String PPlan, PBenefits, PDate; 
						 PPlan=Constants.PlnName;PDate=Constants.PlnStDt;PBenefits=Constants.No;  
						 additional_info.fillin(PPlan,PDate,PBenefits);  // No click for next in this function
							
					}
					
				
					 
			//*******************End of MEC  *********************	
					 
			
					 
	 }  // End of primary applicant
	 
	 
	 
	 /////////////////////////***********************************************************************
	 
	
	


	
	
/////////////////////////***********************************************************************
	
	public void FirstIncomeDetails() throws Exception {
		
		// First Income Details		
		
		if((NData[Nrw][27].equals("Yes"))) // Have Income ?
		
		{   midWait(2); income_info.yes_income(); 	midWait(2);
			
			if((NData[Nrw][28].equals("Yes"))) // Is it W2 ?
			
			{
								
				String  incmtyp, amt, freq,stdate,empname,strt,citi,ste,zpcd;	
				incmtyp=NData[Nrw][29];amt=NData[Nrw][30];freq=NData[Nrw][31];stdate=NData[Nrw][32];
				empname=Constants.EmpName;strt=Constants.Street;citi=Constants.City;ste=Constants.State;zpcd=Constants.DcZip;	
				
				income_details.fillin1(incmtyp,empname,strt,citi,ste,zpcd,amt,freq,stdate);  // W2 Income Details 				
				
			}else {  // Not W2
			
				String incmtyp, amt, freq,stdate;		
				incmtyp=NData[Nrw][29];amt=NData[Nrw][30];freq=NData[Nrw][31];stdate=NData[Nrw][32];
				
				income_details.fillin1(incmtyp,amt,freq,stdate);
				
			} // end W2
			
			common_elements.click();  // Income Adjustments?
			
			midWait(3);  income_info.yes_income();  // Income Calculations Correct? 
			
			
		} else { income_info.no_income();}// end of Yes Income
			
			
	}  // end of First Income Details
	

/////////////////////////***********************************************************************
	
	@AfterMethod
	
		public void afterMethod() {
			//   d.close();
		}
	}







