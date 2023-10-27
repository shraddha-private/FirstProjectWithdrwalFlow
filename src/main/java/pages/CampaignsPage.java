package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CampaignsPage extends BaseClass {

	String CampName = "Help dashboard testing raise funds to fight heart transplant";

	@FindBy(xpath = "//p[@class='frV2__card-details-campaign-title']")
	List<WebElement> campaignTitles;

	@FindBy(xpath = "//a[contains(@href,'02517aa6-f4ac-49b5-9002-10d387ff7923/dashboard/withdrawal')]")
	WebElement withdrwalBtn;

	public CampaignsPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectCampaign() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", withdrwalBtn);
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", withdrwalBtn);
		Thread.sleep(2000);
		withdrwalBtn.click();

		/*
		 * for (WebElement title : campaignTitles) { String name = title.getText(); if
		 * (name.equalsIgnoreCase(CampName)) { // ((JavascriptExecutor) //
		 * driver).executeScript("arguments[0].scrollIntoView(true);", CampName);
		 * withdrwalBtn.click(); Thread.sleep(3000); break; }
		 * 
		 * }
		 */

	}

}
