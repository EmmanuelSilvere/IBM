
package com.pageFunctions;


	import org.openqa.selenium.WebDriver;

import com.pageObjects.DCgovLoginObjects;


	


	public class DcGovLoginPage extends com.selenium.SafeActions implements DCgovLoginObjects{
	
		
		
		public DcGovLoginPage(WebDriver d) {
			super(d);
			
		}

		public void login(String uname, String pwd){
			

			midWait(5);
			
			waitUntilPresent(username,10);
					
			safeClearAndType(username, uname, 30);

			safeClearAndType(password, pwd, 30);
			
			safeMouseClick(lbutton, 30);

		}
		
		public void Templogin(String uname, String pwd){
			
			waitUntilPresent(username,10);
					
			safeClearAndType(username, uname, 30);
			
			safeMouseClick(TempCnt, 30);  // click continue btn

			safeClearAndType(TempPWD, pwd, 30);

			safeMouseClick(TempEnterkey, 30);  // click continue btn		

			safeMouseClick(TempSkipKey, 30);

		}
		
	}








