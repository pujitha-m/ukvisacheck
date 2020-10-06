package com.ukvisachecknew.pages;

import org.openqa.selenium.By;

public class UKVisaCheckAnswerPage extends UKVisaCheckQuestionPage {

	// Webpage Elements
	private static final String VISA_STATUS_LABEL = "//div[@id='result-info']/descendant::div/h2";

	/*
	 * Method to Check The Visa Outcome
	 */

	public boolean verifyVisaRequirementCheckText(String textValue) {

		waitFor(VISA_STATUS_LABEL);
		String actText = $(VISA_STATUS_LABEL).getTextValue();
		String actualText = actText.toString().replaceAll("u’", "u'");
		String expectedText = textValue;
		if (textValue.contains("You'")) {
			expectedText = textValue.replace("You'", "");
		} else if (textValue.contains("You won'")) {
			expectedText = textValue.replace("You won'", "");
		}
		
		return actualText.contains(expectedText);

	}
}
