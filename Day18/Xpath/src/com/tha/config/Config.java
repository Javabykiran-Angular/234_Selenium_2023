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
	
	public void elementAccess1() {
		WebElement element=accessByDXapth("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input");
		element.sendKeys("Sumit");
		
		WebElement element1=accessByDXapth("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]");
		element1.sendKeys("sumit");
		
		WebElement element3=accessByDXapth("(//input[contains(@name,'passwd')])[1]");
		element3.sendKeys("123456");
		WebElement element4=accessByDXapth("//input[starts-with(@name,'confirm')]");
		element4.sendKeys("123456");
	}
	
	public void elementAccess3() {
		//Used for Following
//		WebElement element=accessByDXapth("(//div[@id='__next']/div[2]//following::li)[2]/a");
//		element.click();
		
		//Used for Child
				WebElement element=accessByDXapth("(//div[@id='__next']/div[2]//child::li)[3]/a");
				element.click();		
		
	}
	
	
	

}
