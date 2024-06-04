package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.MacreqTeamActions;

public class TestMacreqAction extends BaseTest {
	
	@Test(priority=4)
	public void macreqLogin() throws InterruptedException {
		 MacreqTeamActions macaction = new MacreqTeamActions(driver);
		 macaction.username();
		 macaction.password();
		 macaction.submit();
		
	}

}
