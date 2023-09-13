package com.tha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public void browserSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(readPropertyFile());
		
	}
	
	public String readPropertyFile() {
		String url="";
		Properties props=null;
		FileInputStream fis=null;
		
		try {
			 fis=new FileInputStream("D:\\Selenium234_Workspace\\configData\\myfile.properties");
			
			props=new Properties();
			props.load(fis);
			
			url=props.getProperty("url");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return url;	
		
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
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

	
	 public void browserClose() {
			driver.close();
		}
		
		public WebElement elementAccessById(String id) {
			return driver.findElement(By.id(id));
		}
		
		public WebElement elementAccessByXpath(String xpath) {
			return driver.findElement(By.xpath(xpath));
		}
		
	

}
