Feature: Excel Template Functionality

  Background:
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Creat Excel Template
    And Click on Reports
    And Click on Setup
    And Click on Excel Template
    And Click on Add Button
    And Fill in the Fields with "test template" and "20"
    When Click on Save Button
    Then User should see success message and Click on the close button

  Scenario: Delete Excel Template
    And Click on Reports
    And Click on Setup
    And Click on Excel Template
    When Try to delete "test template"
    Then User should see success message

