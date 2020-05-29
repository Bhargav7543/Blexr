package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTest;
import locators.Locators.bookieSelectorLocators;

public class Bookie_Selector_Page extends BaseTest implements bookieSelectorLocators {

	// Bookie Selector Locators
	@FindBy(xpath = BOOKIE_SELECTOR_PICKER) WebElement bookieSelectorPicker_field;
	@FindBy(xpath = PREFERRED_DEVICE_DESKTOP) WebElement preferredDeviceDesktop_field;
	@FindBy(xpath = HOW_MUCH_YOU_WILLING_TO_DEPOSITE) WebElement howMuchYouWillingToDeposite_field;
	@FindBy(xpath = WOULD_YOU_LIKE_RECEIVE_WELCOME_BONUS) WebElement wouldYouLikeToReceiveWelcomeBonus_field;
	@FindBy(xpath = CLAIM_BUTTON) WebElement claimButton_field;
	
	public Bookie_Selector_Page() {
		PageFactory.initElements(driver, this);
	}
	
	// Bookie Selector Operation
	public void bookieSelectorOperation() throws Exception{
		bookieSelectorPicker_field.click();
		preferredDeviceDesktop_field.click();
		howMuchYouWillingToDeposite_field.click();
		wouldYouLikeToReceiveWelcomeBonus_field.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}
}
