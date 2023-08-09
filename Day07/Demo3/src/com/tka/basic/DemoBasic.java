package com.tka.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
	
		
		
		WebElement emailElement= driver.findElement(By.xpath("//*[@id=\"email\"]"));
			//emailElement.sendKeys("sumit@gmail.com");
		emailElement.sendKeys("kiran@gmail.com");
		
			//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sumit@123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		WebElement btnElement= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
				btnElement.click();
			
				//	courseElement offered
				WebElement courseElement= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small"));
				String courseStr=courseElement.getText();
				System.out.println("Data => "+courseStr);
		//User click		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		// add User Click
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		//Username 
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sumit");
		//Mobile no
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9960556397");
		
		//HW
		
		// Gender
		
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		WebElement femaleRadio=driver.findElement(By.xpath("//*[@id=\"Female\"]"));
		//driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		femaleRadio.click();
		String radioStr=femaleRadio.getText();
		System.out.println(radioStr);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
