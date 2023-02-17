@Feature3
Feature: To Validate the functionality of Myntra application


  Scenario: To validate login with valid mobileno and otp
    Given To launch the chrome browser and maximize window
    When To launch the url of the myntra application
    And To pass valid mobileno in mobilenumber field
    And To click the continue button to get otp
    Then To close the browser
