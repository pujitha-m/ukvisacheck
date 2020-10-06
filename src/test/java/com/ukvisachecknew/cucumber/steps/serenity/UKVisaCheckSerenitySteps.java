package com.ukvisachecknew.cucumber.steps.serenity;

import com.ukvisachecknew.pages.UKVisaCheckAnswerPage;
import com.ukvisachecknew.pages.UKVisaCheckQuestionPage;
import com.ukvisachecknew.pages.UKVisaCheckReasonPage;
import com.ukvisachecknew.pages.UKVisaCheckStayDurationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UKVisaCheckSerenitySteps extends ScenarioSteps {

	UKVisaCheckQuestionPage basepageobj;
	UKVisaCheckReasonPage reasonpageobj;
	UKVisaCheckStayDurationPage durationpageobj;
	UKVisaCheckAnswerPage answerpageobj;

	@Step("Navigate to page Check if you need a UK visa")
	public UKVisaCheckQuestionPage navigateToCheckIfYouNeedAUKVisa() {

		return basepageobj.navigateToCheckIfYouNeedAUKVisa();
	}

	@Step("Select Nationalilty From Dropdown")
	public UKVisaCheckQuestionPage selectNationality(String nationality) {
		return basepageobj.selectNationality(nationality);
	}

	@Step("Click On Next Step Button")
	public UKVisaCheckQuestionPage clickOnNextStepButton() {
		return basepageobj.clickOnNextStepButton();
	}

	@Step("Select Radio Button with option: {0}")
	public void selectRadioButton(String radiobtn) {

		reasonpageobj.selectRadioButton(radiobtn);
	}

	@Step("Click On Next Step Button In Reasons Page")
	public UKVisaCheckStayDurationPage clickOnNextStepButtonInReasonPage() {

		return reasonpageobj.clickOnNextStepButtonInReasonPage();
	}

	@Step("Click On Next Step Button In Durations Page")
	public UKVisaCheckAnswerPage clickOnNextStepButtonInDurationPage() {
		return durationpageobj.clickOnNextStepButtonInDurationPage();
	}

	@Step("Verify Visa Outcome Text: {0}")
	public boolean verifyVisaRequirementCheckText(String textValue) {
		return answerpageobj.verifyVisaRequirementCheckText(textValue);
	}

}
