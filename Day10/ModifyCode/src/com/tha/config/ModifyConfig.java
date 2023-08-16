package com.tha.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModifyConfig {
	
	private WebDriver driver;
	
	public void browserSetting(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		driver.get(url);
	}
	

}
