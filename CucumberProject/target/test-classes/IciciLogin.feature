@Feature4
Feature: To Validate the functionality of login in icici application
@Regression1
  Scenario: To validate login with valid userId and valid password
    Given To launch the chrome browser and maximize window
    When To launch the url of the icici login application
    And To pass valid username in userId field
    And To check valid userId or not
    And To pass valid password in password field
    And To check whether navigate to the validate page or not
    Then To close the browser
#@Sanity
  #Scenario Outline: To validate positive and negative combination of login functionality
    #Given User has to launch the browser and maximize window
    #When User has to hit the icici url
    #And User has to pass the data "<userId>" in username field
    #And User has to pass the data "<passworddatas>" in password field
    #And User has to click login button
    #Then User has To close the browser
#
    #Examples: 
      #| userId         |passworddatas|
      #| nithivbs@gmail.com |nithya10|
      #| inmakes@gmail.com  |123456|
      #| hanshi@gmail.com   |hemanika|
      #| abc@gmail.com      |yutuwfg|


