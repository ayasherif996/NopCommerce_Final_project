@smoke
Feature:Test demonopcommerce smoke Senario
  Scenario: Test Registeration with valid credentials
    Given Go to the Register page
    When Enter Valid Data
    And  Click on Register button
    Then success message is displayed


  Scenario: Test login with invalid credentials
    Given Go to the Register page
    When Enter InValidData
    And  Click on Register button
    Then Verify that user couldn't Register as Email Already Exists


  Scenario: Test login with Empty Fields credentials

    Given  Go to the Register page
    When Leave Email and Password fields empty
    And  Click on Register button
    Then Register Failed as data required
    And Quit From Browser
