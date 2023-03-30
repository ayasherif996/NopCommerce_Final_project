@smoke
Feature:Test demonopcommerce smoke Senario
  Scenario: Test Currencies in HomePage
    When  Select Euro currency from home page
    Then Verify that currency changed on all the products displayed in Home page


