 Feature: price verification
@Smoketest
  Scenario: spanish Omelet price check  
    Given user has logged in as a user in the home page
    When user click search icon
    And find out the Spanish Omelet and Click the icon
    And Select the option by probability
    Then check the dollar probability
