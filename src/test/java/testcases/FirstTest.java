package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CampaignsPage;
import pages.LoginPage;
import pages.RaiseRequest;

public class FirstTest {

	@BeforeTest
	public void setUp() {
		System.out.println("Launch the browser");
		BaseClass.initialization();

	}

	@Test(priority = 1)
	public void loginToWeb() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginToImpactGuru();

	}

	@Test(priority = 2)
	public void selectCampaignForWithdrwal() throws InterruptedException {
		CampaignsPage campaignsPage = new CampaignsPage();
		campaignsPage.selectCampaign();
	}

	@Test(priority = 3)
	public void raiseRequestForWithdrwal() throws InterruptedException {
		RaiseRequest raiserequest = new RaiseRequest();
		raiserequest.postAnUpdate();
		raiserequest.selectbankAccount();
		raiserequest.addAmt("25");
	}

}
