package com.tha.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tha.utility.Config;

public class Login extends Config {
	WebDriver loginDriver;
	@BeforeClass
	public void openBrowser() {
		
		browserSetting();	
		loginDriver=getDriver();
	}
	
	@Test(priority = 1,dataProvider ="logintestdata" )
	public void LoginTest(String username,String password) {
		System.out.println("U r in Login test ");
		System.out.println(username+"  "+password);
		
		WebElement email_Element=elementAccessById("email");
		   email_Element.sendKeys(username);
		   
		   WebElement pwd_element=elementAccessById("password");
			
			pwd_element.sendKeys(password);
			
			WebElement login_element=elementAccessByXpath("//form[@id='form']//button");
			
			login_element.click();
			
//			email_Element.clear();
//			pwd_element.clear();
			
			try {
				
				File source=((TakesScreenshot)loginDriver).getScreenshotAs(OutputType.FILE);
				File target=new File("D:\\Selenium234_Workspace\\ScreenShotImages\\login_"+username+".png");
				
				Thread.sleep(2000);

				FileHandler.copy(source, target);
				
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
	 
	 public Object [][] ReadExcelSheet(String path) {
			String[][] tabArray = null;
			int ci,cj;
			
			try {
				FileInputStream fis=new FileInputStream(path);
				
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				XSSFSheet objSheet=workbook.getSheet("Sheet1");
				
				int rowcount=objSheet.getLastRowNum();
				System.out.println(rowcount);
				
				   tabArray=new String[rowcount+1][2];
				ci=0;
				for(int i=0;i<=rowcount;i++,ci++) {
					cj=0;
					XSSFRow row=objSheet.getRow(i);
					
					for(int j=0;j<2;j++,cj++) {
						//System.out.println("---> "+row.getCell(j));
						tabArray[ci][cj]=row.getCell(j).getStringCellValue();
						//System.out.println("Table data --->"+tabArray[ci][cj]);
					}
					//System.out.println("=============");
				}
				workbook.close();
				fis.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return tabArray;
			
		}
	
	

}
