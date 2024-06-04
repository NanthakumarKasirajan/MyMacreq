package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.MacreqLogin;

public class LoginVerification extends BaseTest {
	
	@Test(priority = 0)
	public void testloginVerification() throws InterruptedException {
		 MacreqLogin ml = new MacreqLogin(driver);
		 ml.username();
		 ml.password();
		 ml.submit();
		
		
	}
	
	

}
