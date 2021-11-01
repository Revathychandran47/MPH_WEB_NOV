Feature: Verify Circle positive functionality

  Scenario: Validate that a user is taken to the Circles page when they click on the Circles tab
    Given launch the browser
    When Click on the Circles tab
    Then Validate Circles page

  Scenario: Validate that when a user able to view message when not part if any circles.Verify partner logo
    Given Validate not part of any circles message and verify partner logo

  # CMS page automation
  Scenario: Validate Forgot username link
    When click on the Forgot username link
    Then Validate forgot username page

  Scenario: Validate Forgot password link
    When Click on the Forgot password link
    Then Validate the forgot password page

  Scenario: User can able to enter Username and Password
    Given Enter Username and Password

  Scenario: Password is displayed on clicking the eye icon
    When Click on eye icon
    Then Password text is visible

  Scenario: Validate valid Login data
    When Enter valid username and password

  Scenario: Verify My Medicare icon in the Circles page.
    Given Navigate to Circles page
    When My Medicare logo will be displayed
    Then Click on My Medicare icon
