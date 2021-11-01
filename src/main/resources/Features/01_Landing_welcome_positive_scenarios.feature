@land
Feature: Validation on Landing page

  #User is navigated to Welcome,Login,Sign Up page
  Scenario: Validate Welcome page
    Given launch the URL
    Then navigated to Welcome page

  Scenario: Validate Login page and is able to click on 'Login' button
    When clicks on the 'Login' button
    Then navigate to Login page

  Scenario: Validate  click on 'Sign Up' button and navigate to Sign Up page
    When clicks on  'Sign Up' button
    Then navigate to Sign up page
