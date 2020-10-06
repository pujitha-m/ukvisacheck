package com.ukvisachecknew.cucumber.stepdefinitions;

import static org.junit.Assert.assertTrue;

import com.ukvisachecknew.cucumber.steps.serenity.UKVisaCheckSerenitySteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UKVisaCheckStepDefinition {

	@Steps
	UKVisaCheckSerenitySteps ukvisaobj;

	@Given("^I Check UK Visa Required Check$")
	public void navigateToCheckIfYouNeedAUKVisa() {
		ukvisaobj.navigateToCheckIfYouNeedAUKVisa();
	}

	@When("^I Select \"([^\"]*)\" as Nationality$")
	public void i_Select_as_Nationality(String nationality) {
		// Write code here that turns the phrase above into concrete actions
		ukvisaobj.selectNationality(nationality);
	}

	@And("^Click On Next Step Button In Questions Page$")
	public void clickOnNextStepButton() {
		ukvisaobj.clickOnNextStepButton();
	}

	@And("^I select the radio button with option \"([^\"]*)\"$")
	public void i_select_the_reason(String radiobtn) {
		// Write code here that turns the phrase above into concrete actions
		ukvisaobj.selectRadioButton(radiobtn);
	}

	@And("^Click On Next Step Button In Reasons Page$")
	public void clickOnNextStepButtonInReasonPage() {
		ukvisaobj.clickOnNextStepButtonInReasonPage();
	}

	@And("^Click On Next Step Button In Stay Duration Page$")
	public void clickOnNextStepButtonInDurationPage() {
		ukvisaobj.clickOnNextStepButtonInDurationPage();
	}

	@Then("^I will be informed \"([^\"]*)\"$")
	public void i_will_be_informed(String textValue) {
		assertTrue("Expected & Actual Text Don't Match", ukvisaobj.verifyVisaRequirementCheckText(textValue));
		
	}

	




}
