Feature: User Login
  Scenario: Logging using valid credentials
    Given the user is on login screen
    When the user enters valid user id as "test+NRD@nrcdigitaal.nl"
    And the user enters valid password as "5CdsVWD0ZZ9Nlxa0RsobN7iZakk="
    And the user taps on the Inloggen button
    Then the user sees app discovery screen
  # Repeat for other possible valid scenarios

#  Scenario: First time user login
#    Given the user is on login screen
#    When the user enters valid user id as "test+NRD@nrcdigitaal.nl"
#    And the user enters valid password as "5CdsVWD0ZZ9Nlxa0RsobN7iZakk="
#    And the user taps on the Inloggen button
    #Then the user sees accept/decline cookie settings
    #And the user sees the apps tips options

#  Scenario: Logging using invalid password
#    Given the user is on login screen
#    When the user enters valid user id as "test+NRD@nrcdigitaal.nl"
#    And the user enters invalid password
#    Then the user sees error message

  # Repeat for other possible invalid scenarios