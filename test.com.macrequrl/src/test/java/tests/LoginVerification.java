package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class LoginVerification extends BaseTest {
	
	@Test(priority = 0)
	public void testloginVerification() throws InterruptedException {
		
		login.username();
		login.password();
		login.submit();
		
	}
	
	

}
