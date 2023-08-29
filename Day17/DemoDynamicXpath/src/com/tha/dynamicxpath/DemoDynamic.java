package com.tha.dynamicxpath;

import com.tha.config.Config;

public class DemoDynamic extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoDynamic obj=new DemoDynamic();
	//	obj.browserSetting("https://www.w3schools.com/");
		obj.browserSetting("http://register.rediff.com/register/register.php?FormName=user_details");
		//obj.elementAccess();
		obj.elementAccess1();		
	}	

}
