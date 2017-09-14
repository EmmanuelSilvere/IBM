package com.utilities;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusinessMethods {
	
	public static String getRandomNumber(int x){
		
		Random rand = new Random(); 
		String val="";
		for(int i=1;i<=x;i++){
			val=String.valueOf(val+rand.nextInt(9));
		}	
		return val;
	}
	
	public static String randomString(int len){
		final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 Random rnd = new Random();
		   StringBuilder sb = new StringBuilder( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		  return sb.toString();
		}
	
	public static String getDynamicStr(){
		
		return randomString(6);
		//return randomString(8);
	}
	public static String getDynamicLname(){
		
		return randomString(6);
	}

	public static String getDOB(int Age){
		
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	      //getTime() returns the current date in default time zone
	      Date date = calendar.getTime();
	      int day = calendar.get(Calendar.DATE);
	      int month = calendar.get(Calendar.MONTH) + 1;
	      int year = calendar.get(Calendar.YEAR);
	      
	      int DobYr = year - Age;
	      String DOB = month + "/"+ day+ "/" + DobYr;
	      return DOB;
		}
	
	public static boolean verifyssn(String number){
		String regex = "^(?!000|666)[0-8][0-9]{2}(?!00)[0-9]{2}(?!0000)[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		return(matcher.matches());
	 }	

	public static String GetSSN()
	{
	    boolean goodssn = false;
	    String ssn="";
	    while (!(goodssn)){
		 ssn= BusinessMethods.getRandomNumber(9);
		 goodssn = BusinessMethods.verifyssn(ssn);
		 if(goodssn){
			 System.out.println("SSN is valid :" +" -> #" + ssn);}
		 else {
			 System.out.println("Not a Good SSN :" +" -> #" + ssn);}
		} // end of while loop
		return ssn;
	}
	
	
}
