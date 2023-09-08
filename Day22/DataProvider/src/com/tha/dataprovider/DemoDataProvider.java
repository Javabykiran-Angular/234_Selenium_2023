package com.tha.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@Test(priority = 1,dataProvider = "testdata")
	public void loginTest(int id,String username,String password) {
		System.out.println("U r in Login test ");
		System.out.println("ID => "+id+" Username => "+username+" Password=> "+password);
	}
	
	@DataProvider(name = "testdata")
	public Object[][] testdata(){		
		return new Object[][] {
			{9,"Sumit","123"},
			{3,"Spruha","456"},
			{6,"Kiran","810"},
		};
	}
	

}
