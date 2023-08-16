package com.tha.modify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tha.config.ModifyConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOnModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");		
		ModifyConfig obj=new ModifyConfig();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		

	}

}
