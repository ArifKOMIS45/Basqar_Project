Feature: Subject Categories Functionality

  Background:
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create and delete a subject category
      Given navigate to subject category page
      When create a subject name "alp" code "45" category
      And success message should be displayed
      And search created subject name "alp" category
      When delete the subject category
      Then success message should be displayed

