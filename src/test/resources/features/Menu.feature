Feature: Menu functionality test

  Scenario:
    Given user is on the Products page
    When user clicks the Menu button
    Then menu frame should be opened

  Scenario:
    Given menu frame is opened
    When verifying the list of menu
    Then menu should contain the options