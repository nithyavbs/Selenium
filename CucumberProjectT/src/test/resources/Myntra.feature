@Feature3
Feature: To Validate the functionality of Myntra application
@Sanity1
  Scenario: Search Item
    Given To launch the chrome browser and maximize window
    When To Type and search the T-Shirt product
    When To Select the first product and select the M size
    And To click the Add To Bag button and close the current tab
    When To click the bag icon
    And Take the screenshot selected bag
    Then Close the browser
