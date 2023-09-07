package comfig.tha.login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import comfig.tha.utility.Config;

public class Login extends Config {
	
	@BeforeClass
	public void Initalization() {
		browserSetting();
	}
	
	@Test(priority = 1)
	public void username() {
		WebElement emailElement=elementAccessById("email");
		emailElement.sendKeys("sumit@gmail.com");
	}
	@Test(priority = 2)
	public void password() {
		WebElement passwordElement=elementAccessById("password");
		passwordElement.sendKeys("1245378");
	}
	
	@Test(priority = 3)
	public void clickBtn() {
		WebElement btnElement=elementAccessByXpath("//button[starts-with(text(),'Sign In')]");
		btnElement.click();
		
		// Step1 make a variable for expected result 
		String emailExpectedMsg=" Please enter email as kiran@gmail.com";
		String passwordExpectedMsg=" Please enter password 123456";
		
		//step2 to Access WebElement 
		WebElement emailErrorElement=elementAccessById("email_error");
		WebElement passwordErrorElement=elementAccessById("password_error");
		
		//Step 3 Fetch a actual result from webElement
		String emialActualResult= emailErrorElement.getText();
		System.out.println("==> "+emialActualResult);
		String passwordActualResult= passwordErrorElement.getText();
		
		SoftAssert softAssert=new SoftAssert();
		System.out.println("===> Softassert Object====");
		softAssert.assertEquals(emialActualResult, emailExpectedMsg);
		softAssert.assertEquals(passwordActualResult,passwordExpectedMsg);
		System.out.println("===> Softassert Object after assert method ====");
		
//		System.out.println("---- Before assertEquals method------ ");
//		Assert.assertEquals(emialActualResult, emailExpectedMsg);
//		System.out.println("---- After assertEquals method------ ");
//		
//		Assert.assertEquals(passwordActualResult, passwordExpectedMsg, "Password Test case execute");
//		
		
		
		softAssert.assertAll();
		
				
	}

}
