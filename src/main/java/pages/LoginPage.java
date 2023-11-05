package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import dbconnection.DatabaseConnection;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//a[@id='logincta']")
	WebElement loginBtn;

	@FindBy(xpath = "//input[@id='mobile-id-field']")
	WebElement mobileTextBox;

	@FindBy(xpath = "//button[@id='new-login-otp-get']")
	WebElement otpBTn;

	@FindBy(xpath = "//input[@id='login-otp-enter']")
	WebElement addOtp;

	@FindBy(xpath = "//button[@id='new-login-otp-submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//select[@id='email-dropdown-select']")
	WebElement dropDown;

	@FindBy(xpath = "//button[@id='new-login-email-dropdown-submit']")
	WebElement submitBtnLst;
	
	@FindBy(xpath = "//button[@id='new-login-email-dropdown-submit']")
	WebElement test;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginToImpactGuru() throws Exception {

		loginBtn.click();
		mobileTextBox.sendKeys("9320127298");
		otpBTn.click();
		Thread.sleep(1000);
		DatabaseConnection dbcon = new DatabaseConnection();
		addOtp.sendKeys(
				dbcon.databaseConnection("SELECT * FROM `otps` WHERE phone=+919320127298  ORDER BY id desc LIMIT 1"));
		Thread.sleep(3000);
		submitBtn.click();
		Thread.sleep(2000);
		Select drpEmail = new Select(driver.findElement(By.xpath("//select[@id='email-dropdown-select']")));
		drpEmail.selectByVisibleText("shraddha.lokhande@impactguru.com");
		submitBtnLst.click();
	}
	
	

}
