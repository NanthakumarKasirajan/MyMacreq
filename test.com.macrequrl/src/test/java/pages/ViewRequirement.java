package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class ViewRequirement extends BaseTest {

	WebDriver driver ;
	
	public ViewRequirement(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//*[@src='../../../assets/images/menuDots.svg'])[1]")
	public static WebElement clickAction;
	@FindBy(xpath = "//*[text()='View']")
	public static WebElement clickView;
	@FindBy(xpath = "//*[text()='Cancel']")
	public static WebElement cancel;
	
	//Logout
	@FindBy(xpath = "//*[text()='C']")
	public static WebElement profile;
	@FindBy(xpath = "//*[text()='Log out']")
	public static WebElement logout;

	public void verifyRequirementView() throws InterruptedException {

		clickAction.click();
		Thread.sleep(2000);
		clickView.click();
		Thread.sleep(3000);
		cancel.click();
		Thread.sleep(3000);
	}
	
	public void logout() throws InterruptedException {
		profile.click();
		logout.click();
		Thread.sleep(2000);
	}
}
