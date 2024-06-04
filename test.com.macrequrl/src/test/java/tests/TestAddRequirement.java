package tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddRequirement;

public class TestAddRequirement extends BaseTest {

	@Test(priority = 1)
	public void testAddRequirmentVerification() throws InterruptedException, AWTException {

		AddRequirement addr = new AddRequirement(driver);
		addr.addRequirement();

	}
}
