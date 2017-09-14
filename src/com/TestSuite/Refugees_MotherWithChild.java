


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
import com.pageFunctions.othermembersinappfunc;
import com.pageFunctions.refugeemoreabtufunc;
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


public class Refugees_MotherWithChild extends BaseClass {
	
	int ARows,ACols,IRows,ICols,GRows,GCols,Arw,Grw,Irw;;
	public String AData[][],IData[][],GData[][];
	public String temp,temp1,uname,uname1,Fname,ssn,ssn1,temp4,f1name,pswd,Lname,dob,sex,addrl1,ct,st,zip1,elig,db1,gndr1,rltn;
	public String incmtyp,amt1,freq1,stdate1,newmem,MoreMembers,enrlmnt,enrlt1,empname,ctzn,Lname1;
	int ApplRows,ApplCols,IncomeRows,IncomeCols;
	String ApplData[][],IncomeData[][];
	
	WebDriver d; 
	
	ConfigManager confMngr=new ConfigManager("App");
	
	UAT_CreateAccountFunc lgnpage;
	;
	DcGovLoginPage lpage;
	Securityqsnspage secpage;
	startappfunc spage;
	gettingstartedfunc getting_started;
	commonelelmentsfunc common_elements;
	termsandconditionsfunc terms_conditions;
	infoabtufunc info_abtu;
	refugeemoreabtufunc refugee_moreabtu;
	supportdocdetailsfunc supportdoc_details  ;

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
		refugee_moreabtu = new refugeemoreabtufunc(d);
		supportdoc_details = new supportdocdetailsfunc(d);

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
	public void TC1023() throws Exception {
		
		LoadVariables();
		
		logger.info("                  ");
		logger.info("First Name: "+Fname);
		logger.info("Last Name: "+ Lname);
		logger.info("Social: "+ssn);
		logger.info("DOB : "+ dob);
		logger.info("EMAIL: "+ uname );
		logger.info("PassWord: "+ pswd);	
		
		String alienno="6"+BusinessMethods.getRandomNumber(8);
		//String CardNo = "AAA" + BusinessMethods.getRandomNumber(10);  -> for fillPRCard
		//String alienno1="7"+BusinessMethods.getRandomNumber(8);
		
		lgnpage.CreateAccount(uname,pswd,Fname,Lname,dob,ssn,sex);
		
		 lpage.login(uname,pswd);
	
		 secpage.filing_ans1();
	
		 spage.click();
	
		getting_started.click();
			
		common_elements.click();
		
		terms_conditions.click();
			
		common_elements.click();
	
		info_abtu.fillin(Fname,Lname,dob,sex,addrl1,ct,st,zip1,elig);
		
		refugee_moreabtu.fillin( ssn, enrlmnt,ctzn);
			
		supportdoc_details.fillin(alienno);  //This is for I-571 (Refugee Travel Document)
		
		//supportdoc_details.fillPRCard(alienno,CardNo);
		
		Thread.sleep(4000);
		
		street_residence.opt();
			
		year_built.opt();
		
		education_details.opt();
		
		bed_rooms.opt();
	
		common_elements.click();
		
		othermembers_app.fillin(newmem);
				
		groupmembers_app.fillin1(f1name,Lname1,db1,gndr1);
			
		refugee_moreabtu.fillin1( ssn1, enrlmnt,ctzn);
	
		supportdoc_details.fillin1(alienno);
			
		othermembers_app.fillin1(MoreMembers);
		
		relation_ship.fillin(rltn);
		
		tax_filer.click();
			
		dependency_taxreturn.select1();
				
	    common_elements.click();
	
		common_elements.click();
		
        income_info.yes_income();
		
		income_details.fillin1(incmtyp,empname,addrl1,ct,st,zip1,amt1,freq1,stdate1);
		
		common_elements.click();
	
		//common_elements.click();
		income_info.yes_income();
		
		income_info.no_income();
		
		common_elements.click();
		
		common_elements.click();
		
		add_details.fillin1();
			
        common_elements.click();
		
		common_elements.click();
	
		common_elements.click();
	
		common_elements.click();
		
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
		
		for(int A=1; (A<=ARows-1); A++){
			if(AData[A][0].equals(CuramDriver.TCID)){
				Arw=A;
				System.out.println("TCIdA" + A);
				break;
			}
		}
		
		for(int G=1; (G<=GRows-1); G++){
			if(GData[G][0].equals(CuramDriver.TCID)){
				Grw=G;
				System.out.println("TCIdG" + G);
				break;
			}
		}
		
		for(int I=1; (I<=IRows-1); I++){
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
		} else {
			uname = AData[Arw][4]+"@gmail.com";
			 Fname= AData[Arw][4];
		} // end if 
		
		if(GData[Grw][2].equalsIgnoreCase("Random")) {
			 temp1=BusinessMethods.getDynamicStr();
			 f1name=temp1;
		} else {
			f1name= GData[Grw][2];
		} // end if 
		
		
		// If No value in the SSN then
		if(AData[Arw][4].equalsIgnoreCase("Random")) {
           ssn = BusinessMethods.GetSSN();
		} else {
			ssn = AData[Arw][6];
		} // end if
		
		if(GData[Grw][6].equalsIgnoreCase("Random")) {
           ssn1 = BusinessMethods.GetSSN();
		} else {
			ssn1 = GData[Grw][6];
		} // end if
		
		pswd=AData[Arw][3];Lname=AData[Arw][6];dob =AData[Arw][7];sex=AData[Arw][9];addrl1=AData[Arw][11];st=AData[Arw][14];ct=AData[Arw][13];
		zip1=AData[Arw][15];ctzn=AData[Arw][41];elig=AData[Arw][45];enrlmnt=AData[Arw][50];newmem=AData[Arw][56];
		
		db1=GData[Grw][5];gndr1=GData[Grw][7];rltn=GData[Grw][58];enrlt1=GData[Grw][44];MoreMembers=GData[Grw][62];Lname1=GData[Grw][4];
		
		incmtyp=IData[Irw][4];amt1=IData[Irw][12];freq1=IData[Irw][13];stdate1=IData[Irw][14];empname=IData[Irw][6];
		
	  } // end load variables method

	@AfterMethod
		  public void afterMethod() {

			 //  d.close();
			   
		}
	}



