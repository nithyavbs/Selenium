 Feature: As a User, I want to Order the food
 @Smoke
  Scenario: registeration
    #The user fills out the registration form and ignores the confirm password
    Given that i am logged in as a user and on the home page
    When click the account button
    And fill out the registration form with dummy data name phone number email
    And skip the confirm password text label
    And click the register button
    Then get the pop-up please fill out the field