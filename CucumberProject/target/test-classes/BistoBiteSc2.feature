
Feature: As a User, I want to Order the food

@Regression
  Scenario: add_dosa
    #The user successfully add the Dosa
    Given i am logged in as a user and on the home page
    When i see the home button on the page and click it
    And i see a dropdown labeled dosa
    And click the dosa button
    And select the masala dosa option
    Then enter the page and check the Available Time