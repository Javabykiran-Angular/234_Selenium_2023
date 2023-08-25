package com.tha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public void browserSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(readUrl());
		
	}	
	
	
	public String readUrl(){
		String strUrl="";
		try {
		FileInputStream fis=new FileInputStream("D:\\Selenium234_Workspace\\configData\\myfile.properties");
		
		Properties props=new Properties();
		props.load(fis);
		
		 strUrl = props.getProperty("url");
		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return strUrl;
	}
	
	public void readFile() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\Selenium234_Workspace\\configData\\myfile.properties");
		
			Properties props=new Properties();
			props.load(fis);
			
			String strUsername=props.getProperty("username");
			System.out.println(strUsername);
			String strPassword=props.getProperty("password");
			System.out.println(strPassword);
			System.out.println(props.getProperty("url"));
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
