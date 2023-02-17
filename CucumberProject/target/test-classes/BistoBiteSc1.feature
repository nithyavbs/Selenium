@Feature6
Feature: As a User, I want to Order the food

  @Sanitytest
  Scenario: login
    #The user gives the invalid username and password
    Given the user enter the testing site
    When click the account button
    And give the wrong username and password
    And click the login button
    Then check the output invalid mobile no

  

 

  
