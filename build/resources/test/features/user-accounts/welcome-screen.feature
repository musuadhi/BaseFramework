Feature:  Welcome screen

  Scenario: Verify if create account button works
    Given the user is on the welcome screen
    When the user taps on the create account button
    Then the user is taken to the create account screen

#  Scenario: Verify if login button works
#    Given the user is on the welcome screen
#    When the user taps on the login button
#    Then the user is taken to the login screen

  # To test re-usability of features files
#  Scenario: Verify if create account and login buttons are present in welcome screen
#    Given the user is on the welcome screen
#    Then verify if the create account button is present
#    And verify if the login button is present
