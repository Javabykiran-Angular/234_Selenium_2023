package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigDemo {
	WebDriver driver;
	
	public void browserSetting(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);		
	}
	
	public WebElement elementAccessById(String id){
		return driver.findElement(By.id(id));
	}
	
	public WebElement elementAccessByXpath(String xpath){
		
		return driver.findElement(By.xpath(xpath));
	}
	
	
	public void loginAccess() {
//		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		
			WebElement emailElement= elementAccessById("email");
			emailElement.sendKeys("kiran@gmail.com");
		
	//	driver.findElement(By.id("password")).sendKeys("123456");
			
			WebElement passwordElement= elementAccessById("password");
			passwordElement.sendKeys("123456");
			
			
//		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
//			
//			WebElement buttonElement= elementAccessByXpath("//*[@id='form']/div[3]/div/button");
//			buttonElement.click();
			

			 elementAccessByXpath("//*[@id='form']/div[3]/div/button").click();
		
			
//			
		
	}

}
