
package com.TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

import com.businessutilities.ExcelUtilities;
import com.dataprovider.ConfigManager;
import com.pageFunctions.DcGovLoginPage;
import com.pageFunctions.Securityqsnspage;
import com.pageFunctions.UAT_CreateAccountFunc;
import com.pageFunctions.additionaldetailsfunc;
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


public class CoupleVtChildren_HubbysSiblings extends BaseClass {

	int ARows,ACols,IRows,ICols,GRows,GCols,Arw,Grw,Irw;
	int ApplRows,ApplCols,IncomeRows,IncomeCols;
	String ApplData[][],IncomeData[][],temp,temp1,uname,uname1,Fname,ssn,ssn1,ssn2,ssn3,ssn4,ssn5,ssn6,temp4,f1name,f2name,f3name,f4name,f5name,f6name,Lname1,Lname2,Lname3,Lname4,Lname5,Lname6;
	public String AData[][],IData[][],GData[][],empstrt,empct,empst,empzip,zip;
	
	String pswd, Lname, dob, sex, addrl1, ct, st, zip1, elig, enrlmnt, newmem, db1, gndr1, enrlt1, db2;
	String gndr2, enrlt2, db3, gndr3, enrlt3, db4,db5, gndr4,gndr5, enrlt4,enrlt5, rltn19,rltn20, rltn21, rltn22,rltn23,rltn24;
	String incmtyp, empname, strt, citi, ste, zpcd, amt, freq, stdate, incmtyp1, amt1, freq1, stdate1;
	
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
	streetresifunc street_residence;
	yearhomebuiltfunc year_built;
	educationdetailsfunc education_details;
	bedroomsfunc bed_rooms;
	othermembersinappfunc othermembers_app;
	appgrpmemdetailsfunc groupmembers_app;
	appgrpmemxtradetailsfunc groupxtradetails_app;
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
 				
// 		if(d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).isDisplayed())
// 			d.findElement(By.xpath("//button[contains(@title,'Close subscription dialog')]")).click();
		
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
		street_residence = new streetresifunc(d);
		year_built = new yearhomebuiltfunc(d);
		education_details = new educationdetailsfunc(d);
		bed_rooms = new bedroomsfunc(d);
		othermembers_app = new othermembersinappfunc(d);
		groupmembers_app = new appgrpmemdetailsfunc(d);
		groupxtradetails_app = new appgrpmemxtradetailsfunc(d);
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
	
	@Test //(dataProvider = "testcase")
	public void TC1010() throws Exception { //testcase1(String pswd,String Lname,String dob,String sex,String addrl1,String ct,String st,String zip1,String elig,String enrlmnt,String newmem,String db1, String gndr1,String enrlt1,String db2,String gndr2,String enrlt2,String db3,String gndr3,String enrlt3,String db4, String gndr4,String enrlt4,String db5, String gndr5,String enrlt5,String rltn14,String rltn15,String rltn16,String rltn17,String rltn18,String rltn19,String rltn20,String rltn21,String rltn22,String rltn23,String rltn24,String rltn25,String rltn26,String rltn27,String rltn,String incmtyp,String empname,String strt,String citi,String ste,String zpcd,String amt,String freq,String stdate,String incmtyp1,String amt1,String freq1,String stdate1) throws Exception {
		
		LoadVariables();
		
		logger.info("                  ");
		logger.info("First Name: "+Fname);
		logger.info("Last Name: "+ Lname);
		logger.info("Social: "+ssn);
		logger.info("DOB : "+ dob);
		logger.info("EMAIL: "+ uname );
		logger.info("PassWord: "+ pswd);	
		
		lgnpage.CreateAccount(uname,pswd,Fname,Lname,dob,ssn,sex);
		
		lpage.login(uname,pswd);
		 
		secpage.filing_ans1();
	
		spage.click();
		 
		getting_started.click();
	
		common_elements.click();
		
		terms_conditions.click();
	
		common_elements.click();
		midWait(3);
		info_abtu.fillin(Fname,Lname,dob,sex,addrl1,ct,st,zip,elig);
		midWait(3);
		moreinfo_abtu.fillin(ssn,enrlmnt);
		
		midWait(4);
	
		street_residence.opt();
		midWait(3);
		year_built.opt();
		midWait(3);
		education_details.opt();
	
		bed_rooms.opt();
	
		common_elements.click();
		midWait(3);
		othermembers_app.fillin(newmem);
		midWait(3);
		groupmembers_app.fillin(f1name,Lname1,db1,gndr1);
		midWait(3);
		groupxtradetails_app.fillin(ssn1,enrlt1);
		midWait(3);
		common_elements.click();
		midWait(3);
		add_people.yes_morepeople();
		midWait(3);
		groupmembers_app.fillin1(f2name,Lname2,db2,gndr2);
		midWait(3);
		groupxtradetails_app.fillin1(ssn2,enrlt2);
		midWait(3);
		add_people.yes_morepeople();
		midWait(3);
		groupmembers_app.fillin2(f3name,Lname3,db3,gndr3);
		midWait(3);
		groupxtradetails_app.fillin2(ssn3,enrlt3);
	
		//common_elements.click();
		midWait(3);
		add_people.yes_morepeople();
		midWait(3);
		groupmembers_app.fillin3(f4name,Lname4,db4,gndr4);
		midWait(3);
		groupxtradetails_app.fillin3(ssn4,enrlt4);
		midWait(3);
		common_elements.click();
		midWait(3);
		add_people.yes_morepeople();
		midWait(3);
		groupmembers_app.fillin4(f5name,Lname5,db5,gndr5);
		midWait(3);
		groupxtradetails_app.fillin4(ssn5,enrlt5);
		midWait(3);
		common_elements.click();
		midWait(3);
		add_people.no_morepeople();
		midWait(3);
		relation_ship.fillin4(rltn19,rltn20,rltn20,rltn21,rltn21);
		midWait(3);
		relation_ship.fillin5(rltn20,rltn20,rltn22,rltn22);
		midWait(3);
		relation_ship.fillin6(rltn21,rltn23,rltn24);
		midWait(3);
		relation_ship.fillin1(rltn24,rltn23);
		midWait(3);
		relation_ship.fillin(rltn21);
	 
		Thread.sleep(5000);
		
		tax_filer.click1();
		midWait(3);
		taxfiler_status.yes_filetaxes();
		midWait(3);
		dependency_taxreturn.select1();
		midWait(3);
		dependency_taxreturn.select1();
		midWait(3);
		dependency_taxreturn.select1();
		midWait(3);
		dependency_taxreturn.select1();
		midWait(3);
		common_elements.click();
		midWait(3);
	    common_elements.click();
	    
		Thread.sleep(6000);
	    		
		income_info.yes_income();
		midWait(3);
		income_details.fillin(incmtyp,empname,empstrt,empct,empst,empzip,amt,freq,stdate);
		midWait(3);
		common_elements.click();
		Thread.sleep(4000);
		//common_elements.click();
		income_info.yes_income();
		
		Thread.sleep(4000);
		
		income_info.no_income();
		midWait(3);
		income_info.no_income();
		midWait(3);	
		income_info.no_income();
		midWait(3);
		income_info.no_income();
		midWait(3);
		income_info.yes_income();
		midWait(3);
		income_details.fillin1(incmtyp1,amt1,freq1,stdate1);
		midWait(3);
		common_elements.click();
		midWait(3);
		//common_elements.click();
		income_info.yes_income();
		midWait(3);
		common_elements.click();
		
		common_elements.click();
		
		add_details.fillin7();
	
	    common_elements.click();

		common_elements.click();
		
	    common_elements.click();
		midWait(3);
		common_elements.click();
		midWait(3);
		submit_app.fillin_app(Fname,Lname);
	
		eligibilty_results.click();
		
		midWait(3);
	
		}
	
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
		
		for(int G=0; (G<=ARows-1); G++){
			if(GData[G][0].equals(CuramDriver.TCID)){
				Grw=G;
				System.out.println("TCIdG" + G);
				break;
			}
		}
		
		for(int I=0; (I<=ARows-1); I++){
			if(IData[I][0].equals(CuramDriver.TCID)){
				Irw= I;
				System.out.println("TCIdI" + I);
				break;
			}
		}
		
		// If No value in the FirstName of applicant field then

		if(AData[Arw][4].equalsIgnoreCase("Random")) {
			 temp=BusinessMethods.getDynamicStr();
			 uname=temp+"@gmail.com";
			 Fname=temp;				
			 Lname=BusinessMethods.getDynamicLname();
		} else {
			uname = AData[Arw][4]+"@gmail.com";
			 Fname= AData[Arw][4];
		} // end if 
		
		if(GData[Grw][2].equalsIgnoreCase("Random")) {
			 temp1=BusinessMethods.getDynamicStr();
			 f1name=temp1;
			 Lname1=BusinessMethods.getDynamicLname();
		} else {
			f1name= GData[Grw][2];
		} // end if 
		
		if(GData[Grw+1][2].equalsIgnoreCase("Random")) {
			 temp1=BusinessMethods.getDynamicStr();
			 f2name=temp1;
			 Lname2=BusinessMethods.getDynamicLname();
		} else {
			f2name= GData[Grw+1][2];
		} // end if 
		
		if(GData[Grw+2][2].equalsIgnoreCase("Random")) {
			 temp1=BusinessMethods.getDynamicStr();
			 f3name=temp1;
			 Lname3=BusinessMethods.getDynamicLname();
		} else {
			f3name= GData[Grw+2][2];
		} // end if 

		if(GData[Grw+3][2].equalsIgnoreCase("Random")) {
			 temp1=BusinessMethods.getDynamicStr();
			 f4name=temp1;
			 Lname4=BusinessMethods.getDynamicLname();
		} else {
			f4name= GData[Grw+3][2];
		} // end if 
		if(GData[Grw+4][2].equalsIgnoreCase("Random")) {
			 temp1=BusinessMethods.getDynamicStr();
			 f5name=temp1;
			 Lname5=BusinessMethods.getDynamicLname();
		} else {
			f5name= GData[Grw+3][2];
		} // end if 
		
		
		// Creating/Loading SSN
		if(AData[Arw][4].equalsIgnoreCase("Random")) {
			ssn = BusinessMethods.GetSSN();
			dob = BusinessMethods.getDOB(Integer.parseInt(AData[Arw][7]));
			System.out.println(dob);
		} else {
			ssn = AData[Arw][6];
		} // end if
		
		if(GData[Grw][6].equalsIgnoreCase("Random")) {
			ssn1 = BusinessMethods.GetSSN();
			db1 = BusinessMethods.getDOB(Integer.parseInt(GData[Grw][5]));
			System.out.println(db1);
		} else {
			ssn1 = GData[Grw][6];
		} // end if
		if(GData[Grw+1][6].equalsIgnoreCase("Random")) {
	          ssn2 = BusinessMethods.GetSSN();
	          db2 = BusinessMethods.getDOB(Integer.parseInt(GData[Grw+1][5]));
	          System.out.println(db2);
			} else {
				ssn2 = GData[Grw+1][6];
			} // end if
		if(GData[Grw+2][6].equalsIgnoreCase("Random")) {
	          ssn3 = BusinessMethods.GetSSN();
	          db3 = BusinessMethods.getDOB(Integer.parseInt(GData[Grw+2][5]));
	          System.out.println(db3);
			} else {
			  ssn3 = GData[Grw+2][6];
			} // end if
		if(GData[Grw+3][6].equalsIgnoreCase("Random")) {
	          ssn4 = BusinessMethods.GetSSN();
	          db4 = BusinessMethods.getDOB(Integer.parseInt(GData[Grw+3][5]));
	          System.out.println(db4);
			} else {
			  ssn4 = GData[Grw+3][6];
			} // end if
		if(GData[Grw+4][6].equalsIgnoreCase("Random")) {
	          ssn5 = BusinessMethods.GetSSN();
	          db5 = BusinessMethods.getDOB(Integer.parseInt(GData[Grw+4][5]));
	          System.out.println(db5);
			} else {
			  ssn5 = GData[Grw+4][6];
			} // end if
	

		pswd=AData[Arw][3];sex=AData[Arw][9];addrl1=AData[Arw][11];st=AData[Arw][14];ct=AData[Arw][13];
		zip=AData[Arw][15];elig=AData[Arw][45];newmem=AData[Arw][56];enrlmnt=AData[Arw][50];//dob =AData[Arw][7];Lname=AData[Arw][6];
		
		rltn19=GData[Grw][58];rltn20=GData[Grw+1][58];rltn21=GData[Grw+2][58];rltn22=GData[Grw+3][58];rltn23=GData[Grw+4][58];rltn24="Is the Nephew of";
		//db1=GData[Grw][5];db2=GData[Grw+1][5];db3=GData[Grw+2][5];db4=GData[Grw+3][5];db5=GData[Grw+4][5];
		gndr1=GData[Grw][7];gndr2=GData[Grw+1][7];gndr3=GData[Grw+2][7];gndr4=GData[Grw+3][7];gndr5=GData[Grw+4][7];
		enrlt1=GData[Grw][44];enrlt2=GData[Grw+1][44];enrlt3=GData[Grw+2][44];enrlt4=GData[Grw+3][44];enrlt5=GData[Grw+4][44];
		//Lname1=GData[Grw][4];Lname2=GData[Grw+1][4];Lname3=GData[Grw+2][4];Lname4=GData[Grw+3][4];Lname5=GData[Grw+4][4];
		
		incmtyp=IData[Irw][4];amt=IData[Irw][12];freq=IData[Irw][13];stdate=IData[Irw][14];
		incmtyp1=IData[Irw+1][4];amt1=IData[Irw+1][12];freq1=IData[Irw+1][13];stdate1=IData[Irw+1][14];
		empname=IData[Irw][6];empstrt=IData[Irw][7];empct=IData[Irw][9];empst=IData[Irw][10];empzip=IData[Irw][11];
	  
	  } // end load variables method
	
	@AfterMethod
		  public void afterMethod() {

		//	   d.close();
			   
		}
	}

