Feature: Login Functionality Test
@smoketest
  Scenario: Verify login is successful with valid credentials

    Given user is on the login page
    When user enters username and password
    And user clicks login button
    Then user should be logged in successfully