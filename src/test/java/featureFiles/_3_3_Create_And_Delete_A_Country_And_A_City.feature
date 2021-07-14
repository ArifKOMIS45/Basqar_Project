Feature: Create a Country and a City  and Delete Them
  Background:
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete a Country and a City
    Given Navigate to Country Page
    And Click on add a country button
    And Type a country name as "SOMECOUNTRY" and country code as "SC"
    And Click on save button
    Then Success message should display
    And Click on the City Page
    And Create a city for SOMECOUNTRY which name is "SOMECITY"
    And Click on save button
    Then Success message should display
    And Click on the country page
    When Try to delete "SOMECOUNTRY"
    Then Error message should display
    And Click on the City Page
    And  Delete "SOMECITY"
    Then Success message should display
    And Click on the country page
    And  Try to delete "SOMECOUNTRY"
    Then Success message should display