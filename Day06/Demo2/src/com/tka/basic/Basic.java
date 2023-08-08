package com.tka.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		String titleStr = driver.getTitle();
		System.out.println("Title Is "+titleStr);
		 String pageSourceStr= driver.getPageSource();
		 System.out.println("Page Source is "+pageSourceStr);		 
		 String urlStr= driver.getCurrentUrl();		 
		 System.out.println("Url is => "+urlStr);
		 

	}

}
