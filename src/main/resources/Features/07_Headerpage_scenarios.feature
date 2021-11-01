Feature: Verify headers in home page positive functionality

  #User must click on the help and nagivated to Frequently asked questions page
  Scenario: Validate that the Frequently asked questions title  should be present in  Help page
    Given site is available
    When clicks on Help tab
    Then verify the Frequently asked questions title

  Scenario: Validate that the Second Opinions title  should be present  and able to see description
    When clicks on Second Opinions title
    Then verify the Second Opinions description is displayed

  Scenario: Validate that the Award Points title  should be present  and able to see description
    When clicks on Award Points title
    Then verify the Award Points description is displayed

  Scenario: Validate that the Referral title  should be present  and able to see description
    When clicks on Referral title
    Then verify the Referral description is displayed

  Scenario: Validate that the Profile title  should be present  and able to see description
    When clicks on Profile title
    Then verify the Profile description is displayed

  Scenario: Validate that the Payments  title  should be present  and able to see description
    When clicks on Payments  title
    Then verify the Payments description is displayed

  Scenario: Validate that the  Add coverage  title  should be present  and able to see description
    When clicks on Add coverage  title
    Then verify the Add coverage description is displayed

  
  Scenario: Validate the navigation to the alerts page on clicking Your alerts icon
    When Click on Your alerts icon
    Then Verify navigation to the alerts page

  Scenario: Validate the Drop down tab
    When Click on Drop down tab
    Then Verify options are visible

  Scenario: Validate the navigation to the  profile page on clicking  Your profile tab
    When Click on Your profile
    Then Verify navigation to the profile page.

  Scenario: Validate  the  navigation to the ratings dashboard page on clicking Your ratings tab
    Given Click on Your ratings
    When Verify navigation to the ratings dashboard page
    And Click on Past tabs
    And Click on Rate a service
    Then Click on Explore service

  Scenario: Validate the navigation to the Feedback Port   page  on clicking Feedback
    When  Click on Feedback
    Then Verify the navigation to the Feedback Port.

  Scenario: Validate  the navigation to the Contact Us page  on clicking  Contact us
    When Click on  Contact Us
    Then Verify the navigation to the Contact Us.

  Scenario: Validate the  Privacy Policy dialogue box on clicking on the Privacy Policy
    When Click on  Privacy Policy
    Then Verify the dialogue box on privacy page

  Scenario: Validate  the  Terms & Conditions dialogue box on clicking on the Terms & Conditions
    When click on  Terms & Conditions
    Then Verify the dialogue box on Terms and condition page

  Scenario: Validate the navigation to the Landing page on clicking Log out icon
    When Click on Log out icon
    Then Verify navigation to the Landing  page
