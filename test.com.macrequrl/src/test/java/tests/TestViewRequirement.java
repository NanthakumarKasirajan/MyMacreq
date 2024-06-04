package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ViewRequirement;

public class TestViewRequirement extends BaseTest {
	
	@Test(priority = 2)

	public void testViewRequirment() throws InterruptedException {
		
		ViewRequirement vreq = new ViewRequirement(driver);
		vreq.verifyRequirementView();
		
	}
	
	@Test(priority = 3)
	public void testlogout() throws InterruptedException {
		
		ViewRequirement vreq = new ViewRequirement(driver);
		vreq.logout();
	}

}
