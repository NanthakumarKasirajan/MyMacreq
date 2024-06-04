package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;


public class MacreqLogin extends BaseTest {
	
	
		//Login
		@FindBy(xpath = "//input[@placeholder='Enter your email address']")
		public static WebElement userName;
		@FindBy(xpath = "//*[@type='password']")
		public static WebElement password;
		@FindBy(xpath = "//*[@type='submit']")
		public static WebElement submit;

		
		public void username() {

			userName.sendKeys("customer@yopmail.com");
		}
		
		public void password() {
			
			password.sendKeys("test@123");
		}

		public void submit() throws InterruptedException {
			
			submit.click();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}

}
