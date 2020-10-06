Feature: Confirm Whether A Visa Is Required To Visit The UK

	Scenario: Verify UK Visa Requirement For A Japan National To Study And Stay For More Than 6 Months
	
		Given I Check UK Visa Required Check
		When I Select "Japan" as Nationality
		And Click On Next Step Button In Questions Page
		And I select the radio button with option "study"
		And Click On Next Step Button In Reasons Page
		And I select the radio button with option "longer_than_six_months"
		And Click On Next Step Button In Stay Duration Page
		Then I will be informed "You'll need a visa to study in the UK"

	Scenario: Verify UK Visa Requirement For A Japan National As A Tourist 
	
		Given I Check UK Visa Required Check
		When I Select "Japan" as Nationality
		And Click On Next Step Button In Questions Page
		And I select the radio button with option "tourism"
		And Click On Next Step Button In Reasons Page
		Then I will be informed "You won't need a visa to come to the UK"
	
	Scenario: Verify UK Visa Requirement For A Russia National As A Tourist And Not Travelling/Visiting Family
	
		Given I Check UK Visa Required Check
		When I Select "Russia" as Nationality
		And Click On Next Step Button In Questions Page
		And I select the radio button with option "tourism"
		And Click On Next Step Button In Reasons Page
		And I select the radio button with option "no"
		And Click On Next Step Button In Stay Duration Page
		Then I will be informed "You'll need a visa to come to the UK"
		