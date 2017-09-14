
package com.TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.businessutilities.Butility;
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
import com.pageFunctions.nomedicaid_moreabtufunc;
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



public class New3HHApp extends BaseClass {

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
		nomedicaid_moreabtufunc nomedicaidmoreinfo_abtu;
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
		Studentfunc Student;
		supportdocdetailsfunc supportdoc_details;
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
	  		d.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
	  		
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
		nomedicaidmoreinfo_abtu= new nomedicaid_moreabtufunc(d);
		street_residence = new streetresifunc(d);
		year_built = new yearhomebuiltfunc(d);
		education_details = new educationdetailsfunc(d);
		bed_rooms = new bedroomsfunc(d);
		othermembers_app = new othermembersinappfunc(d);
		groupmembers_app = new appgrpmemdetailsfunc(d);
		groupxtradetails_app = new appgrpmemxtradetailsfunc(d);
		pregnant = new pregnancyfunc(d);
		foster_care = new fostercarefunc(d);
		Student = new Studentfunc(d);
		supportdoc_details = new supportdocdetailsfunc(d);
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
	public void TC1035() throws Exception { 
		
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
		
	
		
		if (NData[Nrw][11].equalsIgnoreCase("No")){ // Applying for health care?		
			
			SecondMemberWhenPrimary();						
		}		
		
			midWait(7);
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

		if (NData[Nrw][11].equalsIgnoreCase("Yes")){ // Applying for health care?	
			
			add_people.yes_morepeople();  
			midWait(1);
			SecondMemberDetails();
			
		}
		
		add_people.yes_morepeople();
		
		midWait(3);			
				
		ThirdMemberDetails();	// **************Third Member ***************************			
		
		midWait(6);
			
		add_people.no_morepeople();    
		
		midWait(3);				
		
		Relationships();  
		
		midWait(7);				
		
		FilingTaxes();
		
		midWait(2);
		
		common_elements.click();  // Group Summary
		
		midWait(2);
		
		common_elements.click();  // Group Income Section Info Page
		
		midWait(9);
		
		FirstIncomeDetails();   //**************First Income ***************************
				
		midWait(9);
		
		SecondIncomeDetails();   //**************Second Member Income ***************************
		
		midWait(5);
		
		ThirdIncomeDetails();   //**************Third Income ***************************
		
		midWait(5);
		
			
		// Common Questions
		
		common_elements.click(); // More about appl group
		midWait(2);
		common_elements.click();  // Addl info like Incarceration etc
		midWait(2);
		
		if (NData[Nrw][12].equalsIgnoreCase("Yes")){ // If Indian ?
			
			common_elements.click();  //enable if there is Indian in group (tribal health program)			
			midWait(3);
			
			}
		
		add_details.UAT();     //  No Unpaid and NO for all questions ******************
		
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
		}
		

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
			
				// following is verify if address failed screen is displayed
				 boolean TextPresent = Butility.isTextPresent(driver,"Address Validation Failed");
			     if (TextPresent){ common_elements.click();}
				
				//  Below function deals with (Primary Applicant) Indian,SSN,citizen,naturalized, immigration etc.
				
				
								
		//		midWait(7);  // till next page is displayed.
				
				if(NData[Nrw][11].equalsIgnoreCase("Yes")){  // If First Member is Applying for Assistance?
										
					moreinfo_abtu.AddionalInfo(Ind,HaveSSN,ssn,ApldSSN,Reason,Ctzn,Nat,DocType,NatInUS,ImgStatus,SupDoc,LivedInUS,Military,Vet,DepVet,MEC); 
					
				} else {
					
						midWait(3);
						nomedicaidmoreinfo_abtu.MainApplicant(ssn,MEC);
						
						} 
				
				
				
				String FFS = "No"; // If Female/Foster/Student
				
				if(sex.equalsIgnoreCase("female")){ //if Female?
					FFS="Yes";
					if((NData[Nrw][20].equals("Yes"))) //if pregnant ?
					{ pregnant.Primary(sex,NData[Nrw][20],NData[Nrw][21],NData[Nrw][22],NData[Nrw][23],EnrolledMC);}
				}	
				
				Age = Integer.parseInt(NData[Nrw][4]);
				
			if(Age >=18 && Age <26 ) //if Age is for Foster Care or Student ?
				
				{	if((NData[Nrw][24].equals("Yes"))) //if Foster Care ?
					FFS="Yes";
					{ foster_care.Primary();}
				
					if((NData[Nrw][25].equals("Yes"))) //if Student ?
					FFS="Yes";
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
	 
	 public void SecondMemberDetails() throws Exception{
		 
		// 2nd Group Member
		//===============================================================================================
					 
 				String  ssn1 = null,f1name = null,Lname1 = null,db1 = null;
	
 				if(NData[Nrw+1][1].equalsIgnoreCase("Yes")) {  // if Random #s to be created
 					 
 					f1name=BusinessMethods.getDynamicStr();		
 					Lname1=BusinessMethods.getDynamicLname();
 					ssn1 = BusinessMethods.GetSSN();
 					db1 = BusinessMethods.getDOB(Integer.parseInt(NData[Nrw+1][4]));
 					
 				} else {
 					
 					 f1name= NData[Nrw][2];
 					 Lname1 = NData[Nrw][3];
 					 db1 = NData[Nrw][4];
 					 ssn1 = NData[Nrw][13];
 					 
 					 
 				} // end if 
 				
 				String Ind=NData[Nrw+1][12], HaveSSN=NData[Nrw+1][13],
						ApldSSN=NData[Nrw+1][15],Reason=NData[Nrw+1][16],Ctzn=NData[Nrw+1][17],
						Nat=NData[Nrw+1][18],DocType=Constants.DocType,NatInUS="No",
						ImgStatus=NData[Nrw+1][19],SupDoc=Constants.SuppDoc,LivedInUS="No",
						MEC=NData[Nrw+1][26],sex=NData[Nrw+1][10],
						Military="No",Vet="No",DepVet="No",
						EnrolledMC = "No";  // Pregnant women is enrolled in MC during pregnancy?
					 	
					 	
 				
 				
 				
 				if (NData[Nrw+1][5].equalsIgnoreCase("Yes")){  //Homeless?
					
					info_abtu.Homeless( Fname,Lname,dob,sex,NData[Nrw+1][11]);	//-->  Homeless
					
				} else if (NData[Nrw+1][6].equalsIgnoreCase("Yes")){   // Lives in DC?
				
						groupmembers_app.fillin1(f1name,Lname1,db1,sex); 
					
					}else if (NData[Nrw+1][7].equalsIgnoreCase("Yes")){  // Lives Out of DC?  
					
						if (NData[Nrw+1][8].equalsIgnoreCase("Yes")){  // Temporarily and returns in < 90 Days?
											
							info_abtu.OutOfDCTemp(f1name,Lname1,db1,sex,Constants.NonDCStreet,
								 Constants.NonDCCity,Constants.NonDCState,Constants.NonDcZip,NData[Nrw+1][11]);  //-->Lives out of DC temporarily
						
						}else
						
						info_abtu.OutOfDCPerm(f1name,Lname1,db1,sex,Constants.NonDCStreet,Constants.NonDCCity,
							      Constants.NonDCState,Constants.NonDcZip,NData[Nrw+1][11]);  //-->Lives out of DC and NOT returning in <90Days..
				}

 				
				// following is verify if address failed screen is displayed
				 boolean TextPresent = Butility.isTextPresent(driver,"Address Validation Failed");
			     if (TextPresent){ common_elements.click();}
				
				
				//  Below function deals with (Primary Applicant) Indian,SSN,citizen,naturalized, immigration etc.
				
				midWait(5);  // till next page is displayed.
				

				if (NData[Nrw+1][11].equalsIgnoreCase("Yes")){  //   if second member is applying for Assistance ?

					moreinfo_abtu.AddionalInfo(Ind,HaveSSN,ssn1,ApldSSN,Reason,Ctzn,Nat,DocType,NatInUS,ImgStatus,SupDoc,LivedInUS,Military,Vet,DepVet,MEC);
					
				}else {					

					nomedicaidmoreinfo_abtu.fillin(ssn1,Ind,MEC);						
				} 
				
				midWait(3);  
				
				String FFS = "No"; // If Female/Foster/Student
				
				if(sex.equalsIgnoreCase("female")){ //if Female?
					FFS="Yes";
					if(NData[Nrw+1][20].equals("Yes")) //if pregnant ?
					{ pregnant.Primary(sex,NData[Nrw+1][20],NData[Nrw+1][21],NData[Nrw+1][22],NData[Nrw+1][23],EnrolledMC);}
				}	
				
				Age = Integer.parseInt(NData[Nrw+1][4]);
				
			if(Age >=18 && Age <26 ) //if Age is for Foster Care or Student ?
				
				{	FFS="Yes";
				
					if(NData[Nrw+1][24].equals("Yes")) //if Foster Care ?				
					{ foster_care.Primary();}
				
					if(NData[Nrw+1][25].equals("Yes")) //if Student ?
					{Student.Primary();}
				
				}					
				
				if(FFS.equalsIgnoreCase("Yes")){ common_elements.click();}
				
				
				
				if(ImgStatus.equals("Yes")) //if Eligible Immigration Status is Yes
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
				
				 
				if (NData[Nrw+1][26].equalsIgnoreCase("Yes")){  //MEC?
					 
					 midWait(3);							
					 
					 String PPlan, PBenefits, PDate; 
					 PPlan=Constants.PlnName;PDate=Constants.PlnStDt;PBenefits=Constants.No;  
					 additional_info.fillin(PPlan,PDate,PBenefits);  // No click for next in this function
				}
 				


	 }
	 
	 	
	 public void ThirdMemberDetails() throws Exception{
		 
			// 2nd Group Member
			//===============================================================================================
						 
	 				String  ssn2 = null,f2name = null,Lname2 = null,db2 = null;
		
	 				if(NData[Nrw+2][1].equalsIgnoreCase("Yes")) {  // if Random #s to be created
	 					 
	 					f2name=BusinessMethods.getDynamicStr();		
	 					Lname2=BusinessMethods.getDynamicLname();
	 					ssn2 = BusinessMethods.GetSSN();
	 					db2 = BusinessMethods.getDOB(Integer.parseInt(NData[Nrw+2][4]));
	 					
	 				} else {
	 					
	 					 f2name= NData[Nrw+2][2];
	 					 Lname2 = NData[Nrw+2][3];
	 					 db2 = NData[Nrw+2][4];
	 					 ssn2 = NData[Nrw+2][13];
	 					 
	 					 
	 				} // end if 
	 				
	 				String Ind=NData[Nrw+2][12], HaveSSN=NData[Nrw+2][13],
							ApldSSN=NData[Nrw+2][15],Reason=NData[Nrw+2][16],Ctzn=NData[Nrw+2][17],
							Nat=NData[Nrw+2][18],DocType=Constants.DocType,NatInUS="No",
							ImgStatus=NData[Nrw+2][19],SupDoc=Constants.SuppDoc,LivedInUS="No",
							MEC=NData[Nrw+2][26],sex=NData[Nrw+2][10],
							Military="No",Vet="No",DepVet="No",
							EnrolledMC = "No";  // Pregnant women is enrolled in MC during pregnancy?
						 	
						 	
	 				
	 				
	 				
	 				if (NData[Nrw+2][5].equalsIgnoreCase("Yes")){  //Homeless?
						
						info_abtu.Homeless( Fname,Lname,dob,sex,NData[Nrw+2][11]);	//-->  Homeless
						
					} else if (NData[Nrw+2][6].equalsIgnoreCase("Yes")){   // Lives in DC?
					
							groupmembers_app.fillin1(f2name,Lname2,db2,sex); 
						
						}else if (NData[Nrw+2][7].equalsIgnoreCase("Yes")){  // Lives Out of DC?  
						
							if (NData[Nrw+2][8].equalsIgnoreCase("Yes")){  // Temporarily and returns in < 90 Days?
												
								info_abtu.OutOfDCTemp(f2name,Lname2,db2,sex,Constants.NonDCStreet,
									 Constants.NonDCCity,Constants.NonDCState,Constants.NonDcZip,NData[Nrw+2][11]);  //-->Lives out of DC temporarily
							
							}else
							
							info_abtu.OutOfDCPerm(f2name,Lname2,db2,sex,Constants.NonDCStreet,Constants.NonDCCity,
								      Constants.NonDCState,Constants.NonDcZip,NData[Nrw+2][11]);  //-->Lives out of DC and NOT returning in <90Days..
					}
				
					
					// following is verify if address failed screen is displayed
					 boolean TextPresent = Butility.isTextPresent(driver,"Address Validation Failed");
				     if (TextPresent){ common_elements.click();}
	 				
					
					//  Below function deals with (Primary Applicant) Indian,SSN,citizen,naturalized, immigration etc.										
										
					midWait(5);  // till next page is displayed.
					
					
					if (NData[Nrw+2][11].equalsIgnoreCase("Yes")){  //   if third member is applying for Assistance ?

						moreinfo_abtu.AddionalInfo(Ind,HaveSSN,ssn2,ApldSSN,Reason,Ctzn,Nat,DocType,NatInUS,ImgStatus,SupDoc,LivedInUS,Military,Vet,DepVet,MEC);
						
					}else {					

						nomedicaidmoreinfo_abtu.fillin(ssn2,Ind,MEC);						
					} 	
					
					midWait(3);  // till next page is displayed.
					
					
					
					String FFS = "No"; // If Female/Foster/Student
					
					if(sex.equalsIgnoreCase("female")){ //if Female?
						FFS="Yes";
						if(NData[Nrw+2][20].equals("Yes")) //if pregnant ?
						{ pregnant.Primary(sex,NData[Nrw+2][20],NData[Nrw+2][21],NData[Nrw+2][22],NData[Nrw+2][23],EnrolledMC);}
					}	
					
					Age = Integer.parseInt(NData[Nrw+2][4]);
					
					if(Age >=18 && Age <26 ) {//if Age is for Foster Care or Student ?
					
						FFS="Yes"; 
					
						if(NData[Nrw+2][24].equals("Yes")) //if Foster Care ?
					
						{ foster_care.Primary();}
					
						if(NData[Nrw+2][25].equals("Yes")) //if Student ?
	
						{Student.Primary();}
					
					}					
					
					if(FFS.equalsIgnoreCase("Yes")){ midWait(3); common_elements.click();}
					
					
					
					if(ImgStatus.equals("Yes")) //if Eligible Immigration Status is Yes
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
					
					 
					if (NData[Nrw+2][26].equalsIgnoreCase("Yes")){  //MEC?
						 
						 midWait(3);							
						 
						 String PPlan, PBenefits, PDate; 
						 PPlan=Constants.PlnName;PDate=Constants.PlnStDt;PBenefits=Constants.No;  
						 additional_info.fillin(PPlan,PDate,PBenefits);  // No click for next in this function
					}
	 				


		 }
	 /////////////////////////***********************************************************************
 
	public void Relationships() throws Exception {
				
		relation_ship.fillin1(NData[Nrw][37],NData[Nrw][38]);
		midWait(3);
		relation_ship.fillin(NData[Nrw+1][37]);

	} // End of Relationships
	 
	
/////////////////////////***********************************************************************
	
	public void FilingTaxes() throws Exception {
		
		// Filing Taxes
		
		if(NData[Nrw][33].equals("Yes") && NData[Nrw+1][33].equals("Yes") && NData[Nrw+2][33].equals("Yes")) // all 3 are Filing Taxes ?
		{
			if(NData[Nrw][37].equals("Is the Spouse Of"))
			{
				if(NData[Nrw][34].equals("Yes")) // Filing Jointly				
				{
					midWait(5);
					tax_filer.click3();				
					midWait(2);
					taxfiler_status.yes_filetaxes();
					midWait(3);
					dependency_taxreturn.select2NOs();
					}	
			 } else { // NOT couple but all of them are filing
					 	midWait(5);
						tax_filer.click3();				
						midWait(2);
						dependency_taxreturn.select2NOs();
						midWait(3);
						dependency_taxreturn.select2NOs();
						midWait(3);
						dependency_taxreturn.select2NOs();
				 } // end of filing jointly
			
		}else if(NData[Nrw][33].equals("Yes") && NData[Nrw+1][33].equals("Yes")) // if only first 2 applicants filing taxes?
		
		{  
				if(NData[Nrw][37].equals("Is the Spouse Of"))
				{
					if(NData[Nrw][34].equals("Yes")) // Filing Jointly				
					{
						midWait(5);
						tax_filer.click1();				
						midWait(2);
						taxfiler_status.yes_filetaxes();
						midWait(3);
						dependency_taxreturn.select1();
					 } 			
				} else // not filing jointly 
						{

							midWait(5);
							tax_filer.click1();				
							midWait(2);
							taxfiler_status.no_filetaxes();
							midWait(3);
							dependency_taxreturn.select2();
							midWait(3);
							dependency_taxreturn.select2();
							
						}
				
				
		}else if(NData[Nrw][33].equals("Yes")) // if only first person filing taxes
		
		{  
			
			if(NData[Nrw][37].equals("Is the Spouse Of"))
			{
				if(NData[Nrw][34].equals("Yes")) // Filing Jointly				
				{
					midWait(7);
					tax_filer.click1();				
					midWait(2);
					taxfiler_status.yes_filetaxes();
					midWait(3);
					dependency_taxreturn.select1();
					
			 	} else { // not filing jointly
			 		
			 		midWait(7);
					tax_filer.click1();				
					midWait(2);
					dependency_taxreturn.select1();
					midWait(3);
					dependency_taxreturn.select1();
			 		
			 		}
				
			} else {  // Not spouse 
				
				midWait(7);
				tax_filer.click();				
				midWait(3);
				dependency_taxreturn.select1();
				midWait(3);
				dependency_taxreturn.select1();

		 	}  // Not Spouse
		} // only one person filing taxes
	} // main filing taxes
			
			
			
			
			
	
	
	
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
	
	public void SecondIncomeDetails() throws Exception {
			
			if((NData[Nrw+1][27].equals("Yes"))) // Have Income ?
			
			{   midWait(2); income_info.yes_income(); 	midWait(2);
				
				if((NData[Nrw+1][28].equals("Yes"))) // Is it W2 ?
				
				{
									
					String  incmtyp, amt, freq,stdate,empname,strt,citi,ste,zpcd;	
					incmtyp=NData[Nrw+1][29];amt=NData[Nrw+1][30];freq=NData[Nrw+1][31];stdate=NData[Nrw+1][32];
					empname=Constants.EmpName;strt=Constants.Street;citi=Constants.City;ste=Constants.State;zpcd=Constants.DcZip;	
					
					income_details.fillin1(incmtyp,empname,strt,citi,ste,zpcd,amt,freq,stdate);  // W2 Income Details 				
					
				}else {  // Not W2
				
					String incmtyp, amt, freq,stdate;		
					incmtyp=NData[Nrw+1][29];amt=NData[Nrw+1][30];freq=NData[Nrw+1][31];stdate=NData[Nrw+1][32];
					
					income_details.fillin1(incmtyp,amt,freq,stdate);
					
				} // end W2
				
				common_elements.click();  // Income Adjustments?
				
				midWait(3);  income_info.yes_income();  // Income Calculations Correct? 
				
				
			} else { midWait(2); income_info.no_income();}// end of Yes Income
				
				
		}  // end of Second Income Details
		
	public void ThirdIncomeDetails() throws Exception {
		
		if((NData[Nrw+2][27].equals("Yes"))) // Have Income ?
		
		{   midWait(2); income_info.yes_income(); 	midWait(2);
			
			if((NData[Nrw+2][28].equals("Yes"))) // Is it W2 ?
			
			{
								
				String  incmtyp, amt, freq,stdate,empname,strt,citi,ste,zpcd;	
				incmtyp=NData[Nrw+2][29];amt=NData[Nrw+2][30];freq=NData[Nrw+2][31];stdate=NData[Nrw+2][32];
				empname=Constants.EmpName;strt=Constants.Street;citi=Constants.City;ste=Constants.State;zpcd=Constants.DcZip;	
				
				income_details.fillin1(incmtyp,empname,strt,citi,ste,zpcd,amt,freq,stdate);  // W2 Income Details 				
				
			}else {  // Not W2
			
				String incmtyp, amt, freq,stdate;		
				incmtyp=NData[Nrw+2][29];amt=NData[Nrw+2][30];freq=NData[Nrw+2][31];stdate=NData[Nrw+2][32];
				
				income_details.fillin1(incmtyp,amt,freq,stdate);
				
			} // end W2
			
			common_elements.click();  // Income Adjustments?
			
			midWait(3);  income_info.yes_income();  // Income Calculations Correct? 
			
			
		} else { midWait(2); income_info.no_income();}// end of Yes Income
			
			
	}  // end of Third Income Details
	
	public void SecondMemberWhenPrimary()throws Exception {  // when Primary is not applying for Assistance
		
			String f1name=BusinessMethods.getDynamicStr();		
			String Lname1=BusinessMethods.getDynamicLname();
			String ssn1 = BusinessMethods.GetSSN();
			String db1 = BusinessMethods.getDOB(Integer.parseInt(NData[Nrw+1][4]));
			String sex = NData[Nrw+1][10];
		
			groupmembers_app.fillinx(f1name,Lname1,db1,sex);
			midWait(3);
			common_elements.click();
			groupxtradetails_app.fillinx(ssn1);
			
			String FFS = "No"; // If Female/Foster/Student
			
			if(sex.equalsIgnoreCase("female")){ //if Female?
				FFS="Yes";
				if(NData[Nrw+2][20].equals("Yes")) //if pregnant ?
				{ pregnant.Primary(sex,NData[Nrw+2][20],NData[Nrw+2][21],NData[Nrw+2][22],NData[Nrw+2][23],"No");}
			}	
			
			Age = Integer.parseInt(NData[Nrw+2][4]);
			
			if(Age >=18 && Age <26 ) {//if Age is for Foster Care or Student ?
			
				FFS="Yes"; 
			
				if(NData[Nrw+2][24].equals("Yes")) //if Foster Care ?
			
				{ foster_care.Primary();}
			
				if(NData[Nrw+2][25].equals("Yes")) //if Student ?

				{Student.Primary();}
			
			}					
			
			if(FFS.equalsIgnoreCase("Yes")){ midWait(3); common_elements.click();}
		
	}
	
/////////////////////////***********************************************************************
	
	
	
	
	
	@AfterMethod
	
		public void afterMethod() {
			//   d.close();
		}
	}







