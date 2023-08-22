package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public void browsrSetting(String url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	public void AccessiFrame() {
		
//		driver.switchTo().frame(1);
		driver.switchTo().frame("webform");
		
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
			driver.switchTo().defaultContent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	

}
