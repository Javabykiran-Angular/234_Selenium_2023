package com.tka.locators;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
//		driver.findElement(By.linkText("Register a new membership")).click();
		
//		driver.findElement(By.partialLinkText("Register a")).click();
		driver.findElement(By.partialLinkText("membership")).click();
		
		driver.findElement(By.id("name")).sendKeys("Sumit Raokhande");
		driver.findElement(By.name("mobile")).sendKeys("9960556397");
//		driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
		
	 	 List<WebElement> listElement= driver.findElements(By.tagName("input"));
	 	 System.out.println(listElement.size());
	 	 
	 	 for(int i=0;i<listElement.size();i++) {
	 		 
	 		 WebElement element= listElement.get(i);
	 		// element.sendKeys("Sumit");
	 		 
	 		 
	 		 if(element.getAttribute("placeholder").compareTo("Email")==0) {
	 			 element.sendKeys("abc@gmail.com");
	 		 }else if(element.getAttribute("placeholder").compareTo("Password")==0) {
	 			 element.sendKeys("123456");
	 		 }
	 		 
	 		 
	 	 }
	 	 
	 	 
	 	 driver.findElement(By.className("btn")).click();
	 	 Alert alert= driver.switchTo().alert();
	 	 alert.accept();
	 	 driver.switchTo().defaultContent();
	 	 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
