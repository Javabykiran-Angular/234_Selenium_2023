package comfig.tha.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	
	public WebElement elementAccessById(String id) {
		return driver.findElement(By.id(id));
	}
	
	public WebElement elementAccessByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	

}
