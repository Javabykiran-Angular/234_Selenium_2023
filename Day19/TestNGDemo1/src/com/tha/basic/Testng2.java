package com.tha.basic;

import org.testng.annotations.Test;

public class Testng2 {

	@Test(priority = 1)
	public void test1() {
		System.out.println("U r in test1() method");
	}
	
	@Test(priority = 2,enabled = false)
	public void test2() {
		System.out.println("U r in test2() method");
	}
	
}
