package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class AddRequirement extends BaseTest
{
	
	//WebDriver ldriver;

	public AddRequirement(WebDriver rdriver) {
		//ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// Add Requirement
		@FindBy(xpath = "//*[@class='addButton']")
		public static WebElement addRequirement;
		@FindBy(xpath = "//*[@formcontrolname='categoryId']")
		public static WebElement category;
		@FindBy(xpath = "//*[text()='Others']")
		public static WebElement categorySelection;
		@FindBy(xpath = "//*[text()='Single part & Dispatch']")
		public static WebElement reqTypeSelection;
		@FindBy(xpath = "//*[@class='uploadImage']")
		public static WebElement clickUpload;
		@FindBy(xpath = "//input[@type='number']")
		public static WebElement enterQuantity;
		@FindBy(xpath = "//input[@formcontrolname='quality']")
		public static WebElement qualityStandard;
		@FindBy(xpath = "//input[@formcontrolname='rawMaterials']")
		public static WebElement enterRawMaterial;
		@FindBy(xpath = "//*[text()=' +']")
		public static WebElement addRawMaterial;
		@FindBy(xpath = "//input[@formcontrolname='referenceNo']")
		public static WebElement referencenumber;
		@FindBy(xpath = "//input[@formcontrolname='specialRequirement']")
		public static WebElement specialRequirement;
		@FindBy(xpath = "//*[text()='Custom']")
		public static WebElement customTimeLine;
		@FindBy(xpath = "//*[@formcontrolname='timeNo']")
		public static WebElement enterTimeNumber;
		@FindBy(xpath = "//*[text()='Yes ']")
		public static WebElement selectTargetPrice;
		@FindBy(xpath = "//*[@formcontrolname='paymentTermsId']")
		public static WebElement clickPaymentTerm;
		@FindBy(xpath = "//*[text()='100% Advance']")
		public static WebElement selectPaymentTerm;
		@FindBy(xpath = "//*[@formcontrolname='incoTermsId']")
		public static WebElement clickIncoTerms;
		@FindBy(xpath = "//*[text()='CPT: Carriage Paid to']")
		public static WebElement selectIncoTerm;
		@FindBy(xpath = "//*[@formcontrolname='deliveryLocation']")
		public static WebElement clickDeliveryLocation;
		@FindBy(xpath = "//*[text()='111 Test Address']")
		public static WebElement selectlocation;
		@FindBy(xpath = "//*[text()='+ Add New Location ']")
		public static WebElement selectNewLocation;
		@FindBy(xpath = "//*[@formcontrolname='location']")
		public static WebElement enterLocation;
		@FindBy(xpath = "//*[@class='addlocationBtn']")
		public static WebElement addAddress;
		@FindBy(xpath = "//*[text()='Save']")
		public static WebElement save;
		@FindBy(xpath = "//*[text()='Cancel']")
		public static WebElement cancel;

	
	public void addRequirement() throws InterruptedException, AWTException {
		addRequirement.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		cancel.click();
		Thread.sleep(3000);
		addRequirement.click();
		Thread.sleep(2000);
		category.click();
		categorySelection.click();
		reqTypeSelection.click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		Thread.sleep(2000);
		clickUpload.click();
		Thread.sleep(3000);

		// File = C:\Users\Conneqt\Desktop\Jan Upload - 2904.xlsx

		StringSelection path = new StringSelection("C:\\Users\\Conneqt\\Desktop\\OSC_upload_template-UAT.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		enterQuantity.sendKeys("10");
		qualityStandard.sendKeys("Test Quality Standard");
		enterRawMaterial.sendKeys("Raw1");
		addRawMaterial.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		referencenumber.sendKeys("Ref1234");
		specialRequirement.sendKeys("Test Special Requirement");
		js.executeScript("window.scrollBy(0,300)");
		customTimeLine.click();
		enterTimeNumber.sendKeys("10");
		selectTargetPrice.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		clickPaymentTerm.click();
		selectPaymentTerm.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		clickIncoTerms.click();
		selectIncoTerm.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		clickDeliveryLocation.click();
		Thread.sleep(2000);
		selectlocation.click();
		Thread.sleep(2000);
		//selectNewLocation.click();
		//enterLocation.sendKeys("45/29,KK nagar,Coimbatore-876776");
		//addAddress.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(3000);


	}

}
