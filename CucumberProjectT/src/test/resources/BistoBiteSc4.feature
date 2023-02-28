 Feature: price verification
@Function
  Scenario: coke check price
    Given i am logged in as a user in the home page
    When i click search icon
    And give the coke in search field and enter into it
    And select the cokecan option
    Then check the can dollar is $'1.50'
    
