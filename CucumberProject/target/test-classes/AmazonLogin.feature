@Feature2
Feature: To Validate the functionality of amazon application
@SmokeTest
  Scenario: To validate login with valid mobileno or email and password
    Given To launch the chrome browser and maximize window
    When To launch the url of the amazon application
    #One Dimensional Map Data
    And To pass valid email or mobileno in email field
    #Key        Value
      |email1| nithivbs@gmail.com    |
      |email2| janani@gmail.com  |
      |email3| lavanya@gmail.com |
    And To click the continue button
     #Two Dimensional Map Data
    #And To check whether navigate to the validate page or not
    # Key      Value
    #|password1|password2|password3
    #|770823561|87264519|15263891
    Then To close the browser
