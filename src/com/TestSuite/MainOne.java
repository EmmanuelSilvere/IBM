package com.TestSuite;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;


public class MainOne {

	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { BfGfVtChildren_GfHavingMEC.class });
		testng.addListener(tla);
		testng.run();
		}
}



