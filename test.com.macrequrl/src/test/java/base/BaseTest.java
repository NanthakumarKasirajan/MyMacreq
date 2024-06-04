package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import pages.AddRequirement;
import pages.MacreqLogin;

public class BaseTest {
	
	public static WebDriver driver;
	//public MacreqLogin login;
	//public AddRequirement addreq;
	
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.get("https://macreq-test.conneqtcorp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//login = PageFactory.initElements(driver, MacreqLogin.class);
		//addreq=PageFactory.initElements(driver, AddRequirement.class);
	}


}
