package com.tha.table;

import com.tha.config.Config;

public class DemoTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Config obj=new Config();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.loginAccess();
		obj.tableDataAccess();
		

	}

}
