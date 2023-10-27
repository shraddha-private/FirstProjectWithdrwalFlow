package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class RaiseRequest extends BaseClass {

	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement postUpdate;

	@FindBy(xpath = "//button[@id='withdrawalPostUpdate']")
	WebElement postAnUpdateBtn;

	@FindBy(xpath = "//select[@id='account_id']")
	WebElement bankAccdd;

	@FindBy(xpath = "//button[@id='withdrawalPostUpdate']")
	WebElement addAccBtn;

	@FindBy(xpath = "//*[text()='+ Add documents']")
	WebElement addDocLink;

	@FindBy(xpath = "//button[@id='withdrawalPostUpdate']")
	WebElement nextBtn;

	@FindBy(id = "dw-main-withdrawFunds-button")
	WebElement requestWithdrwalBtn;

	@FindBy(xpath = "//input[@id='inr_amount']")
	WebElement inrAmt;

	@FindBy(xpath = "//button[@id='dw-modal-submitrequest-button']")
	WebElement subtAmtBtn;

	public RaiseRequest() {
		PageFactory.initElements(driver, this);
	}

	BaseClass baseclass = new BaseClass();

	public void postAnUpdate() throws InterruptedException {
		requestWithdrwalBtn.click();
		postUpdate.click();
		postUpdate.sendKeys(BaseClass.getAlphaNumericString(100));
		postAnUpdateBtn.click();
		Thread.sleep(1000);
	}

	public void selectbankAccount() {
		bankAccdd.click();
		Select se = new Select(bankAccdd);
		se.selectByVisibleText("settlement test, ,axis bank");
		addAccBtn.click();
		nextBtn.click();
	}

	public void addAmt(String amt) {
		inrAmt.sendKeys(amt);
		subtAmtBtn.click();
	}

	/*
	 * public void uploadDoc() throws InterruptedException, AWTException {
	 * 
	 * addDocLink.click();
	 * 
	 * Thread.sleep(2000); Robot rb = new Robot(); String path =
	 * System.getProperty("user.dir"); StringSelection str = new
	 * StringSelection(path + "\\src\\main\\java\\testdata\\logo.png");
	 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 * 
	 * // press Control+V for pasting rb.keyPress(KeyEvent.VK_CONTROL);
	 * rb.keyPress(KeyEvent.VK_V);
	 * 
	 * // release Control+V for pasting rb.keyRelease(KeyEvent.VK_CONTROL);
	 * rb.keyRelease(KeyEvent.VK_V);
	 * 
	 * // for pressing and releasing Enter rb.keyPress(KeyEvent.VK_ENTER);
	 * rb.keyRelease(KeyEvent.VK_ENTER);
	 * 
	 * Thread.sleep(2000); WebElement nextBtn =
	 * driver.findElement(By.cssSelector(".btn__icon.fas.fa-check"));
	 * JavascriptExecutor executors = (JavascriptExecutor) driver;
	 * executors.executeScript("arguments[0].click();", nextBtn);
	 * 
	 * }
	 */
}
