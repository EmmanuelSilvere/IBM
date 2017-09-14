
package com.TestSuite;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

import com.businessutilities.ExcelUtilities;
import com.dataprovider.ConfigManager;
import com.pageFunctions.CheckFosterOrPregOrStudent;
import com.pageFunctions.DcGovLoginPage;
import com.pageFunctions.Securityqsnspage;
//import com.pageFunctions.Studentfunc;
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
//import com.pageFunctions.fostercarefunc;
import com.pageFunctions.gettingstartedfunc;
import com.pageFunctions.incomeadjustmentsfunc;
import com.pageFunctions.incomedetailsfunc;
import com.pageFunctions.incomeinfofunc;
import com.pageFunctions.infoabtufunc;
import com.pageFunctions.moreabtudetailsfunc;
import com.pageFunctions.moreabtufunc;
import com.pageFunctions.othermembersinappfunc;
//import com.pageFunctions.pregnancyfunc;
import com.pageFunctions.relationshipfunc;
import com.pageFunctions.startappfunc;
import com.pageFunctions.streetresifunc;
import com.pageFunctions.submitappfunc;
import com.pageFunctions.taxfilerfunc;
import com.pageFunctions.taxfilestatusfunc;
import com.pageFunctions.termsandconditionsfunc;
import com.pageFunctions.yearhomebuiltfunc;
//import com.pageObjects.fostercare;
import com.utilities.BusinessMethods;
import com.utilities.LoggerClass;
import com.utilities.Constants;
import org.apache.log4j.Level;



public class OneScript extends BaseClass{

	int ARows,ACols,IRows,ICols,GRows,GCols;
	int ApplRows,ApplCols,IncomeRows,IncomeCols,GRow=0;
	String ApplData[][],IncomeData[][],temp,temp1,uname1,Fname,ssn2,ssn3,temp4,f2name,f3name,Lname2,Lname3;
	String adr1,cti1,st1,zip1,plan,date,benefits,plan1,date1,benefits1;
	public static String AData[][],IData[][],GData[][],MemSSN[],MemDob[],MemFName[],MemLName[],EmailId,ssn,f1name,Lname1,db1,ssn1;
	public static int Arw=-999,Grw=999,Irw=999,Membercnt=0;
	
	String pswd, Lname, dob, sex, addrl1, ct, st, zip, elig, enrlmnt, newmem, db2,  gndr2, enrlt1, gndr1, adr2,cti2,st2,zip2, enrlt2;
	String db3, gndr3, enrlt3,rltn28, rltn26, rltn27, incmtyp1, amt1, freq1, stdate1, incmtyp2, amt2, freq2, stdate2,incmtyp3,amt3,freq3,stdate3;
    String incmtyp,empname,empct,empst,empzip,amt,freq,stdate,empname1,empct1,empst1,empzip1,empstrt,empstrt1;
	
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
	moreabtudetailsfunc more_details;
	CheckFosterOrPregOrStudent fostercare,pregnancy,Student;
	//fostercarefunc fostercare;
	//pregnancyfunc pregnancy;
	//Studentfunc Student;
	streetresifunc street_residence;
	yearhomebuiltfunc year_built;
	educationdetailsfunc education_details;
	bedroomsfunc bed_rooms;
	othermembersinappfunc othermembers_app;
	appgrpmemdetailsfunc groupmembers_app;
	appgrpmemxtradetailsfunc groupxtradetails_app;
	additionalinfofunc additional_info;
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
 	
 	public void bsateup()//(ITestContext context) throws InterruptedException
 	{
  		System.out.println("inside bsateup");
  		this.d=getdriver(Constants.Browser);	
 		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 		switch (OneScriptDriver.env){	
		
		case "PreProd" :
			System.out.println("inside Preprod case");
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
		
 		if(d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).isDisplayed())
 			d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).click();
	
		
 		lgnpage= new UAT_CreateAccountFunc(d);
		lpage=new DcGovLoginPage(d);
		secpage = new Securityqsnspage(d);
		spage=new startappfunc(d);
		getting_started = new gettingstartedfunc(d);
		common_elements = new commonelelmentsfunc(d);
		terms_conditions = new termsandconditionsfunc(d);
		info_abtu = new infoabtufunc(d);
		moreinfo_abtu= new moreabtufunc(d);
		more_details = new moreabtudetailsfunc(d);
		fostercare = new CheckFosterOrPregOrStudent(d);
		pregnancy = new CheckFosterOrPregOrStudent(d);
		Student = new CheckFosterOrPregOrStudent(d);
		street_residence = new streetresifunc(d);
		year_built = new yearhomebuiltfunc(d);
		education_details = new educationdetailsfunc(d);
		bed_rooms = new bedroomsfunc(d);
		othermembers_app = new othermembersinappfunc(d);
		groupmembers_app = new appgrpmemdetailsfunc(d);
		groupxtradetails_app = new appgrpmemxtradetailsfunc(d);
		additional_info = new additionalinfofunc(d);
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
	public void TC1026() throws Exception { 

		LoadVariables();
		
		logger.info("EMAIL: "+ EmailId );
		logger.info("PassWord: "+ pswd);
		logger.info("Social: "+ssn);
		logger.info("First Name: "+Fname);
		logger.info("Last Name: "+ Lname);
		logger.info("DOB : "+ dob);
		
		lgnpage.CreateAccount(EmailId,pswd,Fname,Lname,dob,ssn,sex);
				
		lpage.login(EmailId,pswd);
		
		secpage.filing_ans1();
	
		spage.click();
		
		getting_started.click();
		
		common_elements.click();
		
		terms_conditions.click();
		
		common_elements.click();
		
		info_abtu.ApplicantOS(Fname,Lname,dob);
		
		info_abtu.HomeAddress();
		
		Thread.sleep(3000);
		
		info_abtu.OtherContactInfo();
		
	//	moreinfo_abtu.AddionalInfo();
		
		Thread.sleep(3000);	
		
		CheckFosterOrPregOrStudent.Primary();
		
		Thread.sleep(5000);
		
	    street_residence.opt();
	    
	    Thread.sleep(1000);

		year_built.opt();
	
		Thread.sleep(1000);
		
		education_details.opt();
		
		Thread.sleep(1000);
		
		bed_rooms.opt();
	
		common_elements.click();
		
		othermembers_app.fillin(AData[Arw][71]); // If any more members are present in the application
	
		while(Membercnt>0)
			
		{	
			Thread.sleep(3000);
			System.out.println("Grw : " + Grw);
			
			groupmembers_app.NewMember(GRow);
			
			Thread.sleep(3000);
			
			moreinfo_abtu.MemberAddlInfo(GRow);
			
			Thread.sleep(3000);
			
			CheckFosterOrPregOrStudent.Member();
			
			Thread.sleep(3000);
			
			if(Membercnt>1) {   // If any more members are present in the application
				
				othermembers_app.Yes();
			}else {
				othermembers_app.No();
			}
					
			GRow = GRow+1;
			Membercnt = Membercnt-1;  
		} // end of while loop
	
		
		groupmembers_app.fillin1(f1name,Lname1,db1,gndr1);
		
		groupxtradetails_app.fillin1(ssn1,enrlt1);
	
		common_elements.click();
	
		additional_info.fillin(plan,date,benefits);
	
		add_people.yes_morepeople();
	
		groupmembers_app.fillin2(f2name,Lname2,db2,gndr2);
	
		groupxtradetails_app.fillin2(ssn2,enrlt2);
	
		additional_info.fillin1(plan1,date1,benefits1);
	
		add_people.yes_morepeople();
		
		Thread.sleep(4000);
	
		groupmembers_app.fillin3(f3name,Lname3,db3,gndr3);
	
		groupxtradetails_app.fillin3(ssn3,enrlt3);
		
		common_elements.click(); // Pregnant question for female member
		
		add_people.no_morepeople();
	
		relation_ship.fillin6(rltn26,rltn27,rltn28);

		relation_ship.fillin1(rltn28,rltn27);
	 
		relation_ship.fillin(rltn27);
		
		Thread.sleep(6000);
	
		tax_filer.click1();
		
		dependency_taxreturn.select2();
	
		dependency_taxreturn.select1();
		
		common_elements.click();
		
		common_elements.click();
	
		income_info.yes_income();
		
		income_details.fillin(incmtyp,empname,empstrt,empct,empst,empzip,amt,freq,stdate);
		
		common_elements.click();
		
		//common_elements.click();
		income_info.yes_income();
	
		Thread.sleep(3000);
		
		income_info.yes_income();
	
		income_details.fillin1(incmtyp1,empname1,empstrt1,empct1,empst1,empzip1,amt1,freq1,stdate1);
	
		common_elements.click();
		
		//common_elements.click();
		income_info.yes_income();

		Thread.sleep(5000);
		
		income_info.no_income();
		
		Thread.sleep(5000);
	
		income_info.no_income();
		
		Thread.sleep(3000);
	
		common_elements.click();
		
		common_elements.click();
		
		add_details.fillin5();
	
	    common_elements.click();

		common_elements.click();
		
	    common_elements.click();
	    
		 common_elements.click();
		
		submit_app.fillin_app(Fname,Lname);
		
		eligibilty_results.click();
		
		logger.info("Test Case Passed" );

	
	midWait(3);
		}
	
	public String[][] fetchdata(String Sheet, int ApplRows, int ApplCols) throws Exception
	  {
		 String[][] testObjArray = ExcelUtilities.getTableArray(Constants.Data1,Sheet, ApplRows,ApplCols);
		return (testObjArray);
	  }
	 
	 public void LoadVariables() throws Exception
	  {	 
	 
		System.out.println("Inside Load Var");
		ARows = ExcelUtilities.FindNumbeOfRows(Constants.Data1, "Applicant");
		ACols = ExcelUtilities.FindNumbeOfColumns(Constants.Data1, "Applicant");
		GRows = ExcelUtilities.FindNumbeOfRows(Constants.Data1, "Group");
		GCols = ExcelUtilities.FindNumbeOfColumns(Constants.Data1, "Group");
		IRows = ExcelUtilities.FindNumbeOfRows(Constants.Data1, "Income");
		ICols = ExcelUtilities.FindNumbeOfColumns(Constants.Data1, "Income");
		
		AData = fetchdata("Applicant", ARows,ACols);
		GData = fetchdata("Group", GRows,GCols);
		IData = fetchdata("Income", IRows,ICols);
		
		for(int A=0; (A<=ARows-1); A++){
			if(AData[A][0].equals(OneScriptDriver.TCID)){
				Arw=A;
				System.out.println("App :" + A);
				break;
			} //else {System.out.println("TCIdA" + A + "value :"+ AData[A][0]);}
		}
		
		for(int G=0; (G<=GRows-1); G++){ 			
			if(GData[G][0].equals(OneScriptDriver.TCID)){
				if (Grw==999) {Grw=G;}
				Membercnt = Membercnt+1;
				//break;
			}
		}
		System.out.println("Member Count :" + Membercnt);
		
		for(int I=0; (I<=IRows-1); I++){
			if(IData[I][0].equals(OneScriptDriver.TCID)){
				Irw= I;
				System.out.println("Income :" + Irw);
				break;
			}
		}
		
		// If No value in the FirstName of applicant field then

		if(AData[Arw][4].equalsIgnoreCase("Random")) {
			 temp=BusinessMethods.getDynamicStr();
			 EmailId=temp+"@gmail.com";
			 Fname=temp;		
			 Lname=BusinessMethods.getDynamicLname();
		} else {
			EmailId = AData[Arw][4]+"@gmail.com";
			 Fname= AData[Arw][4];
		} // end if 
		

		if(AData[Arw][4].equalsIgnoreCase("Random")) {  		// If SSN is Random 
			ssn = BusinessMethods.GetSSN();
			dob = BusinessMethods.getDOB(Integer.parseInt(AData[Arw][7]));
		} else {
			ssn = AData[Arw][6];
		} // end if
		
		
		MemFName = new String[Membercnt];
		MemLName = new String[Membercnt];
		MemDob = new String[Membercnt];
		MemSSN = new String[Membercnt];
		
		for(int i=Membercnt;i>0;i--)    // Generate FName,LName,Dob& SSN if Random else load them from excel
		
		{
			
			if(GData[i][2].equalsIgnoreCase("Random")) {   //FName			
				
				MemFName[Membercnt-i]=BusinessMethods.getDynamicStr();
				MemLName[Membercnt-i]=BusinessMethods.getDynamicLname();
				
			} else {
				MemFName[Membercnt-i]= GData[Grw+(Membercnt-i)][2];
				MemLName[Membercnt-i]= GData[Grw+(Membercnt-i)][4];
			} // end if 
			
			
			if(GData[Grw][5].equalsIgnoreCase("Random")) {  // Group DOB
				MemDob[Membercnt-i] = BusinessMethods.GetSSN();
			} else {
				MemDob[Membercnt-i] = BusinessMethods.getDOB(Integer.parseInt(GData[Grw+(Membercnt-i)][5]));
			} // end if dob
			
			
			if(GData[Grw][6].equalsIgnoreCase("Random")) {  // SSN
				MemSSN[Membercnt-i] = BusinessMethods.GetSSN();
			} else {
				MemSSN[Membercnt-i] = GData[Grw+(Membercnt-i)][6];
			} // end if ssn 
									
		} // end of while loop
 

		pswd=AData[Arw][3];sex=AData[Arw][9];/*addrl1=AData[Arw][11];st=AData[Arw][14];ct=AData[Arw][13];
		zip=AData[Arw][15];elig=AData[Arw][45];newmem=AData[Arw][71];enrlmnt=AData[Arw][50];//dob=AData[Arw][7];Lname=AData[Arw][6];
		
		rltn26=GData[Grw][58];rltn27=GData[Grw+1][58];rltn28=GData[Grw+2][58]; 
		enrlt1=GData[Grw][44];enrlt2=GData[Grw+1][44];enrlt3=GData[Grw+2][44];
		gndr1=GData[Grw][7];gndr2=GData[Grw+1][7];gndr3=GData[Grw+2][7];

		plan=GData[Grw][45];date=GData[Grw][46];benefits=GData[Grw][49];
		plan1=GData[Grw+1][45];date1=GData[Grw+1][46];benefits1=GData[Grw+1][49];
		
		incmtyp=IData[Irw][4];amt=IData[Irw][12];freq=IData[Irw][13];stdate=IData[Irw][14];
		incmtyp1=IData[Irw+1][4];amt1=IData[Irw+1][12];freq1=IData[Irw+1][13];stdate1=IData[Irw+1][14];
		empname=IData[Irw][6];empst=IData[Irw][7];empct=IData[Irw][9];empst=IData[Irw][10];empzip=IData[Irw][11];
		empname1=IData[Irw+1][6];empst1=IData[Irw+1][7];empct1=IData[Irw+1][9];empst1=IData[Irw+1][10];empzip1=IData[Irw+1][11];
		empstrt1=IData[Irw+1][7];empstrt=IData[Irw][7];*/
	  } // end load variables method

	
	@AfterMethod
		  public void afterMethod() {

			//   d.close();
			   
		}
	}
