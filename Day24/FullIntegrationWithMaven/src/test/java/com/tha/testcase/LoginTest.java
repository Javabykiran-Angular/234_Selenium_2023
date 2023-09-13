package com.tha.testcase;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tha.config.Config;

public class LoginTest extends Config {
	WebDriver loginDriver;
	
	@BeforeClass
	public void Initalization() {
		browserSetting();
		loginDriver=getDriver();
	}
	
	@Test(priority = 1,dataProvider = "logintestdata")
	public void LoginTest(String username,String password) {
//		System.out.println("LoginTest=====");
//		System.out.println("==> "+username+" => "+password);
		
		
		
		  WebElement email_Element=elementAccessById("email");
		   email_Element.sendKeys(username);
		   
		   WebElement pwd_element=elementAccessById("password");
			
			pwd_element.sendKeys(password);
			
			WebElement login_element=elementAccessByXpath("//form[@id='form']//button");
			
			login_element.click();
			

			try {
				
				File source=((TakesScreenshot)loginDriver).getScreenshotAs(OutputType.FILE);
				File target=new File("D:\\Selenium234_Workspace\\ScreenShotImages\\login_"+username+".png");
				
				Thread.sleep(2000);

				FileHandler.copy(source, target);
//				email_Element.clear();
//				pwd_element.clear();
				
				WebElement emailError_element=elementAccessById("email_error");				
				
				String actualResult_emailError= emailError_element.getText();
				System.out.println(actualResult_emailError);
				String expectedResult_emailError="Please enter email as kiran@gmail.com.";
				
				WebElement passwordError_Element=elementAccessById("password_error");
						
				String actualResult_password= passwordError_Element.getText();
				String expectedResult_password="Please enter password 123456";
				
				SoftAssert softassert=new SoftAssert();
				
				softassert.assertEquals(actualResult_emailError, expectedResult_emailError);
				
//				System.out.println("---------After Assert Execution---------");
				
				
				softassert.assertEquals(actualResult_password, expectedResult_password);
				
				email_Element.clear();
				pwd_element.clear();
				softassert.assertAll();
				
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
	}
	
	 @DataProvider(name = "logintestdata")
		public Object[][] LoginDataProvider(){
			
			Object[][] testObjArray=ReadExcelSheet("D:\\Selenium234_Workspace\\testdata\\testdata.xlsx");
			return testObjArray;
			
		}

}
