package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	public WebElement accessByDXapth(String xpath) {
		
		return driver.findElement(By.xpath(xpath));
		
	}
	
	public void elementAccess() {
		//absolute xpath
//		WebElement element= accessByDXapth("/html/body/div[1]/a[3]");
		//relative xpath
		WebElement element= accessByDXapth("//a[@id='navbtn_exercises']");
		element.click();
		
	}
	
	

}
