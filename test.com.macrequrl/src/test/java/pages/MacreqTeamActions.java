package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class MacreqTeamActions extends BaseTest {
	
	WebDriver driver;
	
	public MacreqTeamActions (WebDriver rdriver) {
		
		PageFactory.initElements(rdriver, this);
	}

	//Login
			@FindBy(xpath = "//input[@placeholder='Enter your email address']")
			public static WebElement userName;
			@FindBy(xpath = "//*[@type='password']")
			public static WebElement password;
			@FindBy(xpath = "//*[@type='submit']")
			public static WebElement submit;
			
	
	//Requirement Freeze
			@FindBy(xpath = "")
			public static WebDriver freezButton;

			
			public void username() {

				userName.sendKeys("macreq@yopmail.com");
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
