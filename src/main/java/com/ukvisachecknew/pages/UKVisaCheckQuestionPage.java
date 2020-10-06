package com.ukvisachecknew.pages;

import net.serenitybdd.core.pages.PageObject;

public class UKVisaCheckQuestionPage extends PageObject{

	// Webpage Elements
	private static final String NATIONALITY_SELECT_DROPDOWN = "//select[@id='response']";
	
	protected static final String NEXT_STEP_BUTTON = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']";
	
	/**
	 * Method used to navigate to "Check if you need a UK visa" Page
	 * 
	 * @return
	 */
	public UKVisaCheckQuestionPage navigateToCheckIfYouNeedAUKVisa() {
		
		open();
		waitForTextToAppear("Check if you need a UK visa");
		return this;
		
	}
	
	
	/*
	 * Method used to select nationality
	 * 
	 */
	public UKVisaCheckQuestionPage selectNationality(String nationality) {
		
		$(NATIONALITY_SELECT_DROPDOWN).selectByVisibleText(nationality);
		
		return this;
	}
	
	/*
	 * Method To Click on Next Step Button
	 * 
	 */
	public UKVisaCheckReasonPage clickOnNextStepButton() {
		
		$(NEXT_STEP_BUTTON).click();
		return this.switchToPage(UKVisaCheckReasonPage.class);
	}
}
