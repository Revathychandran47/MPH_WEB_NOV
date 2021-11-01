Feature: Validation on Utilities page positive test cases

  #User should be able to click on the Utilities tab and able to use all the services under Utilities
  Scenario: Navigate to Utilities screen
    Given user is on home page
    When clicks on Utilities tab
    Then Navigate to Utilities Dashboard

  Scenario: Click options provided in left side navigator
    When Click on left side navigator options

  Scenario: Verify that click on all the Tiles in the Utilities dashboard
    When Click all tiles in utilities dashboard

  Scenario: Add card details  in the Wallet dashboard
    When Enter card details in wallet dashboard
    Then Verify card details is saved

  Scenario: Add bank details  in the Wallet dashboard
    When Enter bank details in wallet dashboard
    Then Verify bank details is saved

  Scenario: Validate user can click on Award points and able to view Balance and Your award point history.
    Given Click Award Points
    When Navigate to Award Points screen
    Then view the Balance, award points history and Welcome bonus text.
