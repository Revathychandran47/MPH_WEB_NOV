Feature: Validation on Home Page

  #User must click on the login and navigated to home page
  Scenario: Validate that user is able to view Welcome grid and carousel when login for the first time
    Given signup with new user and login from the same
    When Click on Show Me button
    And Click on right arrow and left to view all grids
    And Click on Get Started
    Then Logout

  Scenario: Validate user is able to click on skip button in the carousel
    Given signup with new user and login
    When Click on Skip at the top right corner of the panel
    And Verify Firstname and Lastname
    Then Click logout

  Scenario: Validate that the user is navigated to Welcome page and Login with valid data
    When Enter valid phonenumber and password and login
    Then Verify user is on homepage

  Scenario: Validate that the user is in Home page
    When clicks on all the grid tiles

  Scenario: Validate that the user can able to view and click left nav panel tabs
    When Click on left nav panel tabs
    Then Verify navigation to respective pages

  Scenario: Validate that the user is navigated to the Second Opinion page on clicking 'Get second opinion' button
    Given 'Get second opinion' is visible in the home
    When clicks on the 'Get second opinion' button
    Then navigated to the Second opinion page

  Scenario: Validate that the user is navigated to the  Refer a friend page on clicking 'Refer a friend' button
    Given 'Refer a friend' is visible on the home
    When clicks on 'Refer a friend' button
    Then navigated to the Refer a friend page

  Scenario: Validate that the user is navigated to the Coverage page on clicking 'Buy Coverage' button
    Given 'Shop for Coverage' is visible on the home
    When Click on 'Shop for Coverage' button
    Then navigated to the Coverage page
