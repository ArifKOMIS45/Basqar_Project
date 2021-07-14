Feature: Country Create and Delete

  Background:
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Country Create and Delete
    Given Navigate to Country Page
    And Click on add a country button
    And Type a country name as "ANINTERESTINGCOUNTRY" and country code as "AIC"
    And Click on save button
    Then Success message should display
    And Try to delete "ANINTERESTINGCOUNTRY"
    Then Success message should display