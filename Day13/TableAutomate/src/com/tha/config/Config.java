package com.tha.config;

import java.util.List;

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
	
	public void loginAccess() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
	}
	
	public void tableDataAccess() {
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		
		List<WebElement>list_row= driver.findElements(By.tagName("tr"));
		System.out.println("Row count => "+list_row.size());
		for(int i=1;i<list_row.size();i++) {
//			List<WebElement> list_col= driver.findElements(By.tagName("td"));
			List<WebElement> list_col=list_row.get(i).findElements(By.tagName("td"));
			System.out.println("Col list =>"+list_col.size());
			
			for(int j=0;j<8;j++) {
				String strname=list_col.get(j).getText();
				System.out.print(strname+"\t");
			}
			
			System.out.println("---------------------");
			
		}
		
		
	}
	

}
