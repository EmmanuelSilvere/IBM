
package com.TestSuite;

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
import com.pageFunctions.taxfilerfunc;
import com.pageFunctions.taxfilestatusfunc;
import com.pageFunctions.termsandconditionsfunc;
import com.pageFunctions.yearhomebuiltfunc;
import com.utilities.BusinessMethods;
import com.utilities.Constants;
import com.utilities.LoggerClass;



public class TwoHouseHold extends BaseClass {

	// Primary Applicant : 
		String pswd,Fname,ssn, Lname, dob, sex;

		
	// Common Variables : 
		
		public static int ARows,ACols,IRows,ICols,GRows,GCols,Arw,Grw,Irw,ApplRows,ApplCols,IncomeRows,IncomeCols;
		public static String AData[][],IData[][],GData[][],ApplData[][],IncomeData[][],temp,temp1,uname,uname1; ;
		
		
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
		additionalinfofunc additional_info;
		moreabtudetailsfunc more_details;
		streetresifunc street_residence;
		yearhomebuiltfunc year_built;
		educationdetailsfunc education_details;
		bedroomsfunc bed_rooms;
		othermembersinappfunc othermembers_app;
		appgrpmemdetailsfunc groupmembers_app;
		appgrpmemxtradetailsfunc groupxtradetails_app;
		pregnancyfunc pregnant;
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
	  		
/*	  	if(d.findElement(By.xpath("//*[@id='disp_popup_once']//button[@class='close']")).isDisplayed())
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
		street_residence = new streetresifunc(d);
		year_built = new yearhomebuiltfunc(d);
		education_details = new educationdetailsfunc(d);
		bed_rooms = new bedroomsfunc(d);
		othermembers_app = new othermembersinappfunc(d);
		groupmembers_app = new appgrpmemdetailsfunc(d);
		groupxtradetails_app = new appgrpmemxtradetailsfunc(d);
		pregnant = new pregnancyfunc(d);
		foster_care = new fostercarefunc(d);
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
	public void TC1029() throws Exception { 
		
		LoadVariables();
		
		lgnpage.CreateAccount(uname,pswd,Fname,Lname,dob,ssn,sex);	
	
		lpage.login(uname,pswd);
	
		secpage.filing_ans1();
		
		spage.click();
	 
		WriteToLog();
		
		getting_started.click();
	
		common_elements.click();
		
		terms_conditions.click();
	
		common_elements.click();
		
		FirstMemberDetails();   // **************Primary Applicant (First Member) ***************************
		
		midWait(6);
		street_residence.opt();
		midWait(2);
		year_built.opt();
		midWait(2);
		education_details.opt();
		midWait(2);
		bed_rooms.opt();
		midWait(2);
		common_elements.click();
		midWait(1);
		
		
		SecondMemberDetails();    // **************Second Member ***************************
		
		midWait(5);

		add_people.no_morepeople();    
		
		midWait(3);				
		
		Relationships();  
		
		midWait(6);				
		
		FilingTaxes();
		
		midWait(2);
		
		common_elements.click();  // Group Summary
		midWait(2);
		common_elements.click();  // Group Income Section Info Page
		midWait(7);
				
		// First person has income?
		
		//income_info.no_income();  
		income_info.yes_income();
		midWait(2);
		FirstIncomeDetails();
		midWait(6);
		
		// Second person has income?
		
		income_info.no_income();
/*		income_info.yes_income();
		midWait(3);
		SecondIncomeDetails();*/
		midWait(3);
		
			
		// Common Questions
		
		common_elements.click(); // More about appl group
		midWait(2);
		common_elements.click();  // Addl info like Incarceration etc
		midWait(2);
		/*common_elements.click();  //enable if there is Indian in group (tribal health program)		
		midWait(3);*/
							 		
		//add_details.NonMagi();  // 2 HH -- Has unpaid bill then No for all questions ******************
		add_details.UAT();     // 2 HH -- No Unpaid and NO for all questions ******************
		
		common_elements.click();  //Summary
		
		common_elements.click();  // Broker Details
	
		common_elements.click();  // Voter Registration
		
		common_elements.click();  // List of Items require verification
		midWait(2);
		submit_app.fillin_app(Fname,Lname);
	
		/*eligibilty_results.click();
		
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
		ARows = ExcelUtilities.FindNumbeOfRows(Constants.Data2, "Applicant");
		ACols = ExcelUtilities.FindNumbeOfColumns(Constants.Data2, "Applicant");
		IRows = ExcelUtilities.FindNumbeOfRows(Constants.Data2, "Income");
		ICols = ExcelUtilities.FindNumbeOfColumns(Constants.Data2, "Income");
		GRows = ExcelUtilities.FindNumbeOfRows(Constants.Data2, "Group");
		GCols = ExcelUtilities.FindNumbeOfColumns(Constants.Data2, "Group");
		
		AData = fetchdata("Applicant", ARows,ACols);
		IData = fetchdata("Income", IRows,ICols);
		GData = fetchdata("Group", GRows,GCols);
		
		for(int A=0; (A<=ARows-1); A++){
			if(AData[A][0].equals(CuramDriver.TCID)){
				Arw=A;
				System.out.println("TCIdA" + A);
				break;
			}
		}
		
		for(int G=0; (G<=GRows-1); G++){
			if(GData[G][0].equals(CuramDriver.TCID)){
				Grw=G;
				System.out.println("TCIdG" + G);
				break;
			}
		}
		
		for(int I=0; (I<=IRows-1); I++){
			if(IData[I][0].equals(CuramDriver.TCID)){
				Irw= I;
				System.out.println("TCIdI" + I);
				break;
			}
		}
		
		//  Primary Applicant FName,LName, Dob & SSN

		pswd=AData[Arw][3];sex=AData[Arw][9];  // used for creating account in EA
		
		if(AData[Arw][4].equalsIgnoreCase("Random")) {
			 temp=BusinessMethods.getDynamicStr();
			 uname=temp+"@gmail.com";
			 Fname=temp;			
			 Lname=BusinessMethods.getDynamicLname();
			 ssn = BusinessMethods.GetSSN();
			 dob = BusinessMethods.getDOB(Integer.parseInt(AData[Arw][7]));
		} else {
			 uname = AData[Arw][4]+"@gmail.com";
			 Fname= AData[Arw][4];
			 ssn = AData[Arw][6];
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
		 		 
					String addrl1, ct, st, zip1, elig, enrlmnt;
					
		 			addrl1=AData[Arw][11];st=AData[Arw][14];ct=AData[Arw][13];
					zip1=AData[Arw][15];elig=AData[Arw][45];enrlmnt=AData[Arw][50];							
					
					info_abtu.fillin(Fname,Lname,dob,sex,addrl1,ct,st,zip1,elig); // --> Lives in DC	
					
				//	info_abtu.OutOfDC(Fname,Lname,dob,sex,addrl1,ct,st,zip1,elig);  //-->Lives of DC<90Days..Change address in Excel sheet

					 
				//   Primary American Indian **** 
					 midWait(3);					 
					 
					 
					 moreinfo_abtu.fillin(ssn,enrlmnt); // Not American Indian  	  					
				//	 moreinfo_abtu.fillin1(ssn,enrlmnt);  //--> American Indian  (Also enable Next Btn for tribal question at the end application )			 
					 									 
					 
					 
			//*******************Any one of the following (Pregnant, Foster Care or Student) *********************		 
					 
				//  1 Primary Pregnant  ****	
					
					/* String PPregKids,PPregDueDt;  
					 PPregKids=AData[Arw][60];PPregDueDt=AData[Arw][61];
					 pregnant.fillin(PPregKids,PPregDueDt); // Use this when pregnant (Also update Excel sheet in ARow 60 & 61)
					 										// Change gender in DataSheet (ARow 9) to Female.
*/					 
					 
				//  2 Primary Foster Care ****			 
				//	foster_care.fillin1();  
				// Foster Care - Change Age of Applicant between 18 & 25 Years  (Comment if NOT FosterCareChild)

					 
					 
				common_elements.click();	//->Use this if you want default values for Foster, Not Pregnant or Not Student.
					 
					 
					 
			//*******************End of Pregnant, Foster Care or Student *********************		 	 
							 
					 
				// 4. Primary MEC Details ****
				// Enter 'Yes' for MEC in (ARW-50)Excel sheet followed by plan information
				
				/*	 midWait(3);
					 String PPlan, PBenefits, PDate; 
					 PPlan=AData[Arw][51];PDate=AData[Arw][52];PBenefits=AData[Arw][55];  
					 additional_info.fillin(PPlan,PDate,PBenefits); */
					 

	 }  // End of primary applicant
	 
	 
	 
	 /////////////////////////***********************************************************************
	 
	 public void SecondMemberDetails() throws Exception{
		 
		// 2nd Group Member
		//===============================================================================================
					 
 				String newmem, ssn1,f1name,Lname1,db1,gndr1;
	
				newmem=AData[Arw][63];
			 	othermembers_app.fillin(newmem);
			 
			 	if(GData[Grw][2].equalsIgnoreCase("Random")) {
					 temp1=BusinessMethods.getDynamicStr();
					 f1name=temp1;
					 Lname1=BusinessMethods.getDynamicLname();
					 ssn1 = BusinessMethods.GetSSN();
					 //db1 = BusinessMethods.getDOB(Integer.parseInt(GData[Grw][5])); // To get Age from Excel Sheet
					 db1 = GData[Grw][5];  // to get DOB from excel sheet  // Change in function if months baby
					gndr1=GData[Grw][7];
				} else {
					f1name= GData[Grw][2];Lname1= GData[Grw][3];ssn1 = GData[Grw][5];db1 = GData[Grw][6];gndr1=GData[Grw][7];
				} // end if 
					 	
					 	
			 	
					// **2nd Member Non-DC Resident
					 	
						/*String adr1,cti1,st1,zip1;
					 	adr1=GData[Grw][11];cti1=GData[Grw][13];st1=GData[Grw][14];zip1=GData[Grw][7];
					 	groupmembers_app.diffadd(f1name,Lname1,db1,gndr1,adr1,cti1,st1,zip1); // For NON DC address <90 Days */						
					 	
					// **2nd Member DC Resident
						groupmembers_app.fillin1(f1name,Lname1,db1,gndr1);  //   For DC address						
						midWait(5);
						
						
					// **  2nd Member American Indian Or NOT
					// **  Update function (groupxtradetails_app.Indian/fillin)for Mother Enrolled in Medicaid when Age < 1 Yr (
						
						String enrlt1=GData[Grw][44];

						// Indian
						//groupxtradetails_app.Indian(ssn1,enrlt1);    // Indian - also handle extra screen for tribal question at the end of application
						
						// Not Indian
						groupxtradetails_app.fillin(ssn1,enrlt1);  // Remove extra "next" line enabled for Am Indian
						
						midWait(4);		
												
			
				
				//*******************Any one of the following (Pregnant, Foster Care or Student) *********************					
						
					//** 2nd Member Pregnant	
					// Change the gender to Female,  Age >=17 years and give pregnant info in Data sheet (Grow 54 & 55)
					/*	String PregKids,PregDueDt;
						PregKids=GData[Grw][54];PregDueDt=GData[Grw][55];		
						pregnant.fillin(PregKids,PregDueDt);		  				
						midWait(3);			*/	
						
						
						
					// **2nd Member Foster Care				
					//	Change Age of Applicant between 18 & 25 Years 
					//	foster_care.fillin1();  
					    
						
					// **2nd Member Student				
					//	Change Age of Applicant between 19 to 21 Years 
					/* 	Student function;*/  


						common_elements.click();	// *********** Use this Next if Not Foster, Not Pregnant or Not Student.	
						
						
			//******************* end of Pregnant, Foster Care or Student *********************							
						
						
					// **2nd Member MEC Details - Mark 'Yes" in RW-Col-44 in Excelsheet is marked as "Yes"
					
					/*	String plan,date,benefits;
						plan=GData[Grw][45];date=GData[Grw][46];benefits=GData[Grw][49];  
						additional_info.fillin(plan,date,benefits);   			
						midWait(3);*/					 
						

	 }
	 
	 	
	
	 /////////////////////////***********************************************************************
 
	public void Relationships() throws Exception {
		
		String rltn26;
		
		// 2 HH
		
		rltn26=GData[Grw][58];    // Grw[58]
		relation_ship.fillin(rltn26);

	} // End of Relationships
	 
	
/////////////////////////***********************************************************************
	
	public void FilingTaxes() throws Exception {
		
		// Filing Taxes
		
		
		// 1 TaxFiler in 2 HH with 1 Dependent 
		
			tax_filer.click();
			midWait(3);
			dependency_taxreturn.select1();
			midWait(3);

		
		
		// 2 Husband & Wife both filing Jointly
		/*	tax_filer.click1();
			midWait(3);
			taxfiler_status.yes_filetaxes();  // Yes filing jointly
*/			
		
			
		// 2 Both filing taxes separately
		
/*			tax_filer.click1();   // 2 HH and both filing taxes separately
			midWait(3);
			dependency_taxreturn.select2NOs();
			midWait(3);			
			dependency_taxreturn.select2NOs();		
*/				
			
			
		// Not Filing Jointly				
			//midWait(3);  // Use only when more than one person is filing taxes
			
		
	}
	
	
/////////////////////////***********************************************************************
	
	public void FirstIncomeDetails() throws Exception {
		
		// First Income Details		
		
		String incmtyp, amt, freq,stdate;		
		incmtyp=IData[Irw][4];amt=IData[Irw][12];freq=IData[Irw][13];stdate=IData[Irw][14];
		
		// Non W2 Income Details - change Income type FROM Wages & Taxes 
			/*income_details.fillin2(incmtyp,amt,freq,stdate);  */
														  
			
		// W2 Income Details - Income type Wages & Taxes
			String empname,strt,citi,ste,zpcd;	
			empname=IData[Irw][6];strt=IData[Irw][7];citi=IData[Irw][9];ste=IData[Irw][10];zpcd=IData[Irw][11];	
			income_details.fillin1(incmtyp,empname,strt,citi,ste,zpcd,amt,freq,stdate);  // W2 Income Details 
			
			
		midWait(3);
		common_elements.click();  // Income Adjustments?
		midWait(7);
		income_info.yes_income();  // Income Calculations Correct? 
		
	}
	
/////////////////////////***********************************************************************
	
	public void SecondIncomeDetails() throws Exception {
		
		// Second Income Details			
			String incmtyp1, amt1, freq1,stdate1;
			incmtyp1=IData[Irw+1][4];amt1=IData[Irw+1][12];freq1=IData[Irw+1][13];stdate1=IData[Irw+1][14];

		// Non W2 Income Details - change Income type FROM Wages & Taxes 		
			 //income_details.fillin2(incmtyp1,amt1,freq1,stdate1);  // Enable when not W2 income

		// W2 Income Details - Income type Wages & Taxes
			 String empname1,strt1,citi1,ste1,zpcd1;	
			 empname1=IData[Irw+1][6];strt1=IData[Irw+1][7];citi1=IData[Irw+1][9];ste1=IData[Irw+1][10];zpcd1=IData[Irw+1][11];		
			 income_details.fillin1(incmtyp1,empname1,strt1,citi1,ste1,zpcd1,amt1,freq1,stdate1);  // Enable when W2
			  		
		midWait(3);
		
		common_elements.click();  // Income Adjustments?
		midWait(7);
		income_info.yes_income();  // Income Calculations Correct? 
		
	}
	
/////////////////////////***********************************************************************
	
	@AfterMethod
	
		public void afterMethod() {
			//   d.close();
		}
	}







