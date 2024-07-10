@tag
Feature: User Feature
  @tag1
  Scenario: User should be able to login
    Given User is at the login page
    When User fill the email and password and login
    Then Welcome message should be display
