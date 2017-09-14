package com.TestSuite;

import org.testng.annotations.Test;

import com.businessutilities.ExcelUtilities;

import org.testng.annotations.BeforeMethod;
import com.utilities.Constants;

public class CuramDriver {
	public static String env,TCID;
	public static int Iterations;
  @Test
  public void f() {
	  	  
	  try {

		  System.out.println();
			String TCData[][];
			int TCRows = ExcelUtilities.FindNumbeOfRows(Constants.Data2, "TestCases");
			//int TCRows = ExcelUtilities.FindNumbeOfRows(Constants.Data1, "TestCases");// --> OneScript
			int TCCols = ExcelUtilities.FindNumbeOfColumns(Constants.Data2, "TestCases");
			//int TCCols = ExcelUtilities.FindNumbeOfColumns(Constants.Data1, "TestCases"); // --> OneScript
			
			for(int i=0; i<=(TCRows-1); i++) {
				TCData = fetchdata("TestCases",TCRows,TCCols);
				if (TCData[i][2].equals("Yes")){
					env = TCData[i][3];
					
					Iterations = Integer.parseInt(TCData[i][4]);
					System.out.println("Environment : " + env);
					TCID = TCData[i][0];
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
	String[][] testObjArray = ExcelUtilities.getTableArray(Constants.Data2,Sheet, ApplRows,ApplCols);
	//String[][] testObjArray = ExcelUtilities.getTableArray(Constants.Data1,Sheet, ApplRows,ApplCols);// --> OneScript
	return (testObjArray);
  }
  
  
  public void CheckTCID (String ID) throws Exception {
	  //System.out.println("Inside CheckTCID :"+ ID);
		switch (ID){	
		
		
		case "1033" :		
			New1HHApp Core2433 = new New1HHApp();
			Core2433.bsateup();
			Core2433.TC1033();
			break;
			
		case "1034" :		
			New2HHApp Core2434 = new New2HHApp();
			Core2434.bsateup();
			Core2434.TC1034();
			break;
			
		case "1035" :		
			New3HHApp Core2435 = new New3HHApp();
			Core2435.bsateup();
			Core2435.TC1035();
			break;
			
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
			MAGI20CoupleVtDaughter Core2425 = new MAGI20CoupleVtDaughter();
			Core2425.bsateup();
			Core2425.TC1025();
			break; 	
		case "1026" :	
			OneScript Core2426 = new   OneScript();
			Core2426.bsateup();
			Core2426.TC1026();
			break; 	
		case "1027" :		
			ParentChildWithBrother Core2427 = new ParentChildWithBrother();
			Core2427.bsateup();
			Core2427.TC1027();
			break;
			
		case "1028" :		
			OneHouseHold Core2428 = new OneHouseHold();
			Core2428.bsateup();
			Core2428.TC1028();
			break;
			
		case "1029" :		
			TwoHouseHold Core2429 = new TwoHouseHold();
			Core2429.bsateup();
			Core2429.TC1029();
			break;
			
		case "1030" :		
			ThreeHouseHold Core2430 = new ThreeHouseHold();
			Core2430.bsateup();
			Core2430.TC1030();
			break;
			
		case "1031" :		
			FourHouseHold Core2431 = new FourHouseHold();
			Core2431.bsateup();
			Core2431.TC1031();
			break;
			
		case "1032" :		
			for(int i=1; i<= Iterations; i++){
							
			CreateEnrollAppAccounts Core2432 = new CreateEnrollAppAccounts();
			Core2432.bsateup();
			Core2432.TC1032();
			
			}
			break;
			
	}	// end switch				
	  
  }
   
  @BeforeMethod
  public void beforeMethod() {
  }

}
