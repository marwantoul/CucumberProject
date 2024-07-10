@tag
Feature: Todo Feature
  @tag1
  Scenario: User should be able to go add todo
    Given User is at the todos page
    When User add a new todo
    Then Todo should be added correctly
