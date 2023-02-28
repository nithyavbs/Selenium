@Feature5
Feature: As a User, I want to search the bus
#Background:
#Given The user enters the testing site
 #Then click the search and check the output 
@SanityTest
  Scenario: 
    Given The user enters the testing redbus site
    When click the from field and give the src city name
    And click the to field and give the dest city name
    And click the date field and calender icon
    And select the journey date
    Then click the search and check the output 
   @SanityTest
    Scenario Outline: 
    Given The user enters the testing redbus sites
    When user click the from field and pass the data "<fromcity>" in from field
    And user click the to field and  pass the data "<tocity>" in to field
    And click the date field and calender icon
    And user select the journey date
    Then click the search and check the outputs 
    
    Examples: 
    |fromcity|tocity|
    |coimbatore|chennai|
    |madurai|salem|
    |salem|chennai|
    