

Feature: Login Functionality

  Scenario: Login with valid username and password
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfully