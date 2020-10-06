PROBLEM STATEMENT: 
Application under test: Check UK visa website; URL: https://www.gov.uk/check-uk-visa/y
Feature – Confirm whether a visa is required to visit the UK

Scenarios:
a)  Given I provide a nationality of Japan
    And I select the reason “Study”
    And I state I am intending to stay for more than 6 months
    When I submit the form
    Then I will be informed “I need a visa to study in the UK”
    
b)  Given I provide a nationality of Japan
    And I select the reason “Tourism”
    When I submit the form
    Then I will be informed “I won’t need a visa to study in the UK”
    
c)  Given I provide a nationality of Russia
    And I select the reason “Tourism”
    And I state I am not travelling or visiting a partner or family
    When I submit the form
    Then I will be informed “I need a visa to come to the UK”


Steps To Follow:

1) In Terminal navigate to any folder and clone the repo

git clone git@gitlab.com:candidate-1390291/ukvisacheck.git

2) Through Terminal Navigate to the folder "ukvisacheck" 

3) Input the following command

mvn clean verify serenity:aggregate

4) Wait For Build Success message in the terminal,

5) Navigate to the following location and open index.html to verify the test execution report

/ukvisacheck/target/site/serenity/index.html


