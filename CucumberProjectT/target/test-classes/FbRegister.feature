@Feature1
Feature: To Validate the account creation of facebook application
@Regression2
  Scenario: To create new fb account
    Given To launch the browser and maximize window
    When To launch the fb url of the fb application
    And To click the create new account button
    And To pass firstname in firstname field
      | Nithya | Kavitha | Hanshi | Tara |
    And To pass surname in surname field
    And To pass mobileno or email in email text field
      | nithivbs@gmail.com |        7835182394 | kavi@gmail.com    |       8924367182 |
      | abc@gmail.com      | subbu@gmail.com   |        4690122435 | janani@gmail.com |
      |         1286478913 | lavanya@gmail.com | karthik@gmail.com |      8765435123 |
    And To create new password using new password text box
    Then To close the chrome browser
