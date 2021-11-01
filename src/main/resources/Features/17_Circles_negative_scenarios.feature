Feature: Verify Circle negative functionality

  Scenario: Validate that a user is taken to the Circles page when they click on the Circles tab
    Given User is on landing page
    When Login
    Then click on circles

  Scenario: verify login when Username and Password fields are blank
    When Enter Username and password field as blank
    Then Validate the error message on text fields

  Scenario: verify login with invalid Username  and Password
    When Enter incorrect Username and Password
    Then verify error message for incorrect username and password

  Scenario: Validate error message when Username field is blank
    When Enter Username field as blank and valid password
    Then Validate the error message when username is blank

  Scenario: Validate message when Password field is blank
    When Enter the password as blank
    Then Validate message when Password field is blank

  Scenario: Validate the login with valid Usename and invalid Password
    When login with valid Username and invalid Password
    Then Validation message invalid password

  Scenario: Validate that the user is not allowed to login with invalid Usename and valid Password
    When login with invalid Username and valid Password
    Then Validation message invalid username
