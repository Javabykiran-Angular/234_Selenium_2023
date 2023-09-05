package com.tha.basic;

import org.testng.annotations.Test;

public class DemoTestNG {
	
	@Test(priority = 1,description = "That signupTestCase")
	public void aTest() {
		System.out.println("U r in aTest() method");
	}
	
	@Test(priority = 2)
	public void lTest() {
		System.out.println("U r in lTest() method");
	}
	
	@Test(priority = 3)
	public void bTest() {
		System.out.println("U r in bTest() method");
	}	
	

}
