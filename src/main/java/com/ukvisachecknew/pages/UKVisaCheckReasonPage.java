package com.ukvisachecknew.pages;

public class UKVisaCheckReasonPage extends UKVisaCheckQuestionPage {

	// Webpage Elements
	private static final String RADIO_BUTTON = "response";

	private static final String NEXT_STEP_BUTTON = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']";

	/**
	 * Method used to select a radio button
	 * 
	 * @return
	 */
	public void selectRadioButton(String radiobtn) {

		inRadioButtonGroup(RADIO_BUTTON).selectByValue(radiobtn);	

	}

	/**
	 * Method used to click on Next Step Button
	 * 
	 * @return
	 */
	public UKVisaCheckStayDurationPage clickOnNextStepButtonInReasonPage() {

		$(NEXT_STEP_BUTTON).click();
		return this.switchToPage(UKVisaCheckStayDurationPage.class);
	}

}
