package com.ukvisachecknew.pages;

public class UKVisaCheckStayDurationPage extends UKVisaCheckQuestionPage{

	/**
	 * Method used to click on Next Step Button
	 * 
	 * @return
	 */
	public UKVisaCheckAnswerPage clickOnNextStepButtonInDurationPage() {

		$(UKVisaCheckQuestionPage.NEXT_STEP_BUTTON).click();
		return this.switchToPage(UKVisaCheckAnswerPage.class);
		
	}

	
}
