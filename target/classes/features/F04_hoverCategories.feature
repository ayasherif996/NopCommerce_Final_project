@smoke
Feature:Test demonopcommerce smoke Senario
  Scenario: Test user could hover to any Category
    When Move to any category randomly
    And  Click on a subcategory randomly
   Then Verify that the sub-category title is the one you get it while selecting random sub-category