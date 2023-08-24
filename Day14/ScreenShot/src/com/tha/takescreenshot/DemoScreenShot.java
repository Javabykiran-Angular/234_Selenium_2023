package com.tha.takescreenshot;

import com.tha.config.Config;

public class DemoScreenShot extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoScreenShot obj=new DemoScreenShot();
		obj.browserSetting("https://www.facebook.com/");
		obj.takeScreenShot();

	}

}
