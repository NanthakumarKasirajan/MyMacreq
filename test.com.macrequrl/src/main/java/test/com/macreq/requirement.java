package test.com.macreq;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class requirement {

	// Login
	@FindBy(xpath = "//input[@placeholder='Enter your email address']")
	public static WebElement userName;
	@FindBy(xpath = "//*[@type='password']")
	public static WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	public static WebElement submit;

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

	// View
	@FindBy(xpath = "(//*[@src='../../../assets/images/menuDots.svg'])[1]")
	public static WebElement clickAction;
	@FindBy(xpath = "//*[text()='View']")
	public static WebElement clickView;

	// Edit
	@FindBy(xpath = "//*[text()='Edit']")
	public static WebElement clickEdit;
	@FindBy(xpath = "//*[text()='Update']")
	public static WebElement clickUpdate;

	// Delete
	@FindBy(xpath = "//*[text()='Delete']")
	public static WebElement clickDelete;
	@FindBy(xpath = "//*[text()='Cancel']")
	public static WebElement cancelDelete;
	@FindBy(xpath = "//*[text()='Yes']")
	public static WebElement acceptDelete;

	public static WebDriver driver;

	@BeforeTest
	public void OpenMacreq() throws InterruptedException {

		/*
		 * ChromeOptions option = new ChromeOptions();
		 * option.addArguments("--remote-allow-origins=*"); driver = new
		 * ChromeDriver(option);
		 * driver.get("https://macreq-test.conneqtcorp.com/login");
		 * driver.manage().window().maximize(); Thread.sleep(3000);
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://macreq-test.conneqtcorp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, requirement.class);

	}

	@Test(priority = 0)
	public void Login() {

		userName.sendKeys("customer@yopmail.com");
		password.sendKeys("test@123");
		submit.click();

	}

	@Test(priority = 1)
	public void verifyAddRequirement() throws InterruptedException, AWTException {

		Thread.sleep(2000);
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

		StringSelection path = new StringSelection("C:\\Users\\Conneqt\\Desktop\\Jan Upload - 2904.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
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
		selectNewLocation.click();
		enterLocation.sendKeys("45/2,KK nagar,Coimbatore-876776");
		addAddress.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void verifyRequirementView() throws InterruptedException {

		clickAction.click();
		Thread.sleep(2000);
		clickView.click();
		Thread.sleep(3000);
		cancel.click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void verifyRequirementUpdate() throws InterruptedException {

		clickAction.click();
		Thread.sleep(2000);
		clickEdit.click();
		Thread.sleep(2000);
		clickUpdate.click();
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void VerifyRequirementDelete() throws InterruptedException {
		clickAction.click();
		Thread.sleep(2000);
		clickDelete.click();
		Thread.sleep(2000);
		cancelDelete.click();
		Thread.sleep(2000);
		clickAction.click();
		Thread.sleep(2000);
		clickDelete.click();
		Thread.sleep(2000);
		acceptDelete.click();
		Thread.sleep(2000);

	}

}
