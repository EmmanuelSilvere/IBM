package com.pageObjects;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
public interface DCgovLoginObjects 
{
	
	public static By username=By.id("userid");
	public static By password=By.id("pass");
	public static By lbutton=By.xpath("//*[@value='Login']"); 
	public static By TempCnt=By.xpath("//*[@id='signon']/input[2]"); 
	public static By TempEnterkey=By.xpath("//*[@id='Bharosa_Password_PadMap']/area[1]"); 
	public static By TempSkipKey=By.xpath("//*[@id='registerInfo-skipDiv']/input"); 
	public static By TempPWD=By.id("Bharosa_Password_PadDataField");
	
	
	//public static By loginbutton1=By.class("padding-left:0;");

}
