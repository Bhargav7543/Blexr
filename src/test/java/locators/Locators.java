package locators;

public interface Locators {

	// Bookie Selector Locators
	public interface bookieSelectorLocators {
		String BOOKIE_SELECTOR_PICKER = "//a[@class='kgw-link wizard-toggle']";
		String PREFERRED_DEVICE_DESKTOP = "//div[@class='wizard-body']//div[1]//div[2]//div[1]//div[1]";
		String HOW_MUCH_YOU_WILLING_TO_DEPOSITE = "//div[@class='wizard-content']//div[2]//div[2]//div[2]//div[1]";
		String WOULD_YOU_LIKE_RECEIVE_WELCOME_BONUS = "//div[@class='wizard-step step-3']//div[@class='choice-row']//div[2]//div[1]";
		String CLAIM_BUTTON = "//div[@id='interactive-wizard']//div[3]//div[2]//div[1]//div[3]//a[1]";
	}
}
