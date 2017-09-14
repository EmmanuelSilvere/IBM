package com.TestSuite;

import org.testng.annotations.Test;

import com.businessutilities.ExcelUtilities;

import org.testng.annotations.BeforeMethod;
import com.utilities.Constants;

public class OneScriptDriver {
	public static String env,TCID;
	
  @Test
  public void f() {
	  
	  
	  try {


			String TCData[][];
			int TCRows = ExcelUtilities.FindNumbeOfRows(Constants.Data1, "TestCases"); 
			int TCCols = ExcelUtilities.FindNumbeOfColumns(Constants.Data1, "TestCases");  

			for(int i=0; i<=(TCRows-1); i++) {
				TCData = fetchdata("TestCases",TCRows,TCCols);
				if (TCData[i][2].equals("Yes")){
					env = TCData[i][3];
					System.out.println("Environment : " + env);
					TCID = TCData[i][0];
					  System.out.println("TC ID"+TCData[i][0]);
					CheckTCID(TCID);
				} // end if (TCData[i][3].equals("Yes"))
			} // end for (int i=0;i<= TCRows; i++)
			
		} catch (Exception e){
				System.out.println("Inside catch");
				System.out.println(e);
		} // end try catch
  
  }
  
  public String[][] fetchdata(String Sheet, int ApplRows, int ApplCols) throws Exception
  {
	 String[][] testObjArray = ExcelUtilities.getTableArray(Constants.Data1,Sheet, ApplRows,ApplCols);// --> OneScript
	return (testObjArray);
  }
  
  
  public void CheckTCID (String ID) throws Exception {
	  //System.out.println("Inside CheckTCID :"+ ID);
		switch (ID){	
		
		case "1001" :	
			BfGfVtChildren_GfHavingMEC Core241 = new BfGfVtChildren_GfHavingMEC();
			Core241.bsateup();
			Core241.TC1001();
			break;
			
		case "1002" :		
			BfGfVtChildren Core242 = new BfGfVtChildren();
			Core242.bsateup();
			Core242.TC1002();
			break;
			
		case "1003" :		
			ChildlessAdult_IncomeUnderMedicaid_HavingMEC Core243 = new ChildlessAdult_IncomeUnderMedicaid_HavingMEC();
			Core243.bsateup();
			Core243.TC1003();
			break;
			
		case "1004" :		
			Couple_65plusAge_OneEarning Core244 = new Couple_65plusAge_OneEarning();
			Core244.bsateup();
			Core244.TC1004();
			break;
			
		case "1005" :		
			CoupleLivingSeperately_ChildOutOfDC Core245 = new CoupleLivingSeperately_ChildOutOfDC();
			Core245.bsateup();
			Core245.TC1005();
			break;
			
		case "1006" :		
			CoupleVt2Children_1ChildLivingSeperately Core246 = new CoupleVt2Children_1ChildLivingSeperately();
			Core246.bsateup();
			Core246.TC1006();
			break;
			
		case "1007" :		
			CoupleVt2income Core247 = new CoupleVt2income();
			Core247.bsateup();
			Core247.TC1007();
			break;
			
		case "1008" :		
			CoupleVtChild_AllWages Core248 = new CoupleVtChild_AllWages();
			Core248.bsateup();
			Core248.TC1008();
			break;
			
		case "1009" :		
			CoupleVtChild Core249 = new CoupleVtChild();
			Core249.bsateup();
			Core249.TC1009();
			break;
			
		case "1010" :		
			CoupleVtChildren_HubbysSiblings Core2410 = new CoupleVtChildren_HubbysSiblings();
			Core2410.bsateup();
			Core2410.TC1010();
			break;
			
		case "1011" :		
			CoupleVtDaughter Core2411 = new CoupleVtDaughter();
			Core2411.bsateup();
			Core2411.TC1011();
			break;
			
		case "1012" :	
			CoupleWithParents_ChildrenAndSiblings Core2412 = new CoupleWithParents_ChildrenAndSiblings();
			Core2412.bsateup();
			Core2412.TC1012();
			break;
			
		case "1013" :		
			FatherVt2Children Core2413 = new FatherVt2Children();
			Core2413.bsateup();
			Core2413.TC1013();
			break;
			
		case "1014" :		
			FatherVtChild Core2414 = new FatherVtChild();
			Core2414.bsateup();
			Core2414.TC1014();
			break;
			
		case "1015" :		
			GrandChildrenVtGranny Core2415 = new GrandChildrenVtGranny();
			Core2415.bsateup();
			Core2415.TC1015();
			break;
			
		case "1016" :		
			GrannyVtDaughter_GrandDaughter Core2416 = new GrannyVtDaughter_GrandDaughter();
			Core2416.bsateup();
			Core2416.TC1016();
			break;
			
		case "1017" :		
			Medicaid_Refugees_MarriedCoupleVtChild Core2417 = new Medicaid_Refugees_MarriedCoupleVtChild();
			Core2417.bsateup();
			Core2417.TC1017();
			break;
			
		case "1018" :		
			MotherVtChild Core2418 = new MotherVtChild();
			Core2418.bsateup();
			Core2418.TC1018();
			break;
			
		case "1019" :		
			MotherVtDaughter Core2419 = new MotherVtDaughter();
			Core2419.bsateup();
			Core2419.TC1019();
			break;
			
		case "1020" :		
			MotherVtMedicare_Daughter Core2420 = new MotherVtMedicare_Daughter();
			Core2420.bsateup();
			Core2420.TC1020();
			break;
			
		case "1021" :		
			OneAdultWithChild Core2421 = new OneAdultWithChild();
			Core2421.bsateup();
			Core2421.TC1021();
			break; 	
			
		case "1022" :		
			PregnantWomanVtChild Core2422 = new PregnantWomanVtChild();
			Core2422.bsateup();
			Core2422.TC1022();
			break; 	
			
		case "1023" :		
			Refugees_MotherWithChild Core2423 = new Refugees_MotherWithChild();
			Core2423.bsateup();
			Core2423.TC1023();
			break; 	
			
		case "1024" :		
			SingleMemApp Core2424 = new SingleMemApp();
			Core2424.bsateup();
			Core2424.TC1024();
			break; 	
			
		case "1025" :	
			  System.out.println("In case 1025");
			OneScript Core2425 = new OneScript();
			Core2425.bsateup();
			Core2425.TC1026();
			break; 	
			
	}	// end switch				
	  
  }
   
  @BeforeMethod
  public void beforeMethod() {
  }

}
