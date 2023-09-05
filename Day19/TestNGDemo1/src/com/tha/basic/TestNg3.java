package com.tha.basic;

import org.testng.annotations.Test;

public class TestNg3 {
	
	@Test(priority = 1)
	public void usernameTest() {
		System.out.println("U r in usernameTest() ");
	}
	@Test(priority = 2)
	public void passwordTest() {
		System.out.println("U r in passwordTest() ");
	}

}
