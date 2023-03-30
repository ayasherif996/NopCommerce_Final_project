@smoke
Feature:Test demonopcommerce smoke Senario
  Scenario: Test user could search using product name
    When Enter Data in the search Field
    And  Click on Search button
    Then Verify that result contains the search word

  Scenario: Test user could search for product using sku
    When Enter the sku in the search Field
    And  Click on Search button
    And  Click on the product
    Then Verify that the product contains the Sku search word
