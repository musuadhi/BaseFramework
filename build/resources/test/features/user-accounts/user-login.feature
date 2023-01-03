Feature: User Login
  Scenario: Logging using valid credentials
    Given user sees login screen
    When user enters valid user id
    And user enters valid password
    Then user sees app discovery screen
  # Repeat for other possible valid scenarios

  Scenario: Logging using invalid password
    Given user sees login screen
    When user enters valid user id
    And user enters invalid password
    Then user sees error message

  # Repeat for other possible invalid scenarios