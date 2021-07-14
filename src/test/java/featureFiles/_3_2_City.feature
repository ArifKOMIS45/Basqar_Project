Feature: Create and Delete a City
  Background:
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete a City
    Given Navigate to City Page
    And Create a city which name as "SOMECITY"
    And Click on save button
    Then Success message should display
    And  Delete the city "SOMECITY"
    Then Success message should display