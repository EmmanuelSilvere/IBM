package com.pageObjects;

import org.openqa.selenium.By;

public interface Student {

	
	// Following are student questions

		public static By student = By.id("__o3id10");
		
		public static By studenttype = By.id("__o3id11");
		
		public static By schooltype = By.id("__o3id12");
		
		public static By EndDate = By.id("__o3id13");
		
		public static By nextbtn = By.xpath("//span[contains(text(),'Next')]");
}
