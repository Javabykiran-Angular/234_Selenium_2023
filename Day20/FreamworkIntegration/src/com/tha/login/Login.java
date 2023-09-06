package com.tha.login;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tha.config.Config;

public class Login extends Config {
	
	@BeforeClass
	public void beforeClass() {
		browserSetting();
	}
	
	@Test(priority = 1)
	public void usernameTest() {
		System.out.println("----U r in UsernameTest");
		
		WebElement emailElement=elementAccessById("email");
		emailElement.sendKeys("kiran@gmail.com");
		WebElement passwordelement=elementAccessById("password");
		passwordelement.sendKeys("123456");
		
	}
	
	@Test(priority = 2)
	public void LoginClick() {
		WebElement btnElement=elementAccessByXpath("//button[starts-with(text(),'Sign In')]");
		btnElement.click();
	}
	
	@AfterClass
	public void afterClass() {
	//	browserClose();
	}

}
