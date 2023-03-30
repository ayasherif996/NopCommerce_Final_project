@smoke
  Feature:Test demonopcommerce smoke Senario
    Scenario: Test login with valid credentials
      Given Go to the login page
      When Enter Valid Email and Password
      And  Click on Login button
      Then Verify that user logged in successfully


    Scenario: Test login with invalid credentials
      Given Go to the login page
      When Enter InValid Email and Password
      And  Click on Login button
      Then Verify that user didn't logged in successfully


    Scenario: Test login with Empty Fields credentials
      Given Go to the login page
      When Leave Email and Password fields empty
      And  Click on Login button
      Then Verify Error Message
      And Quit From Browser

