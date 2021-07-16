Feature: EducationPage Creating Subject Categories
  and Creating Subjects for catogegories then
  proving categories can't be deleted

  Background:
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Creating Subject Categories
    Given Navigate to  Subject Categories in EducationPage
    And Creating a Subject Categories as "leyn" with code as "9092"
    Then Successfully mesaj Should Be Seen

  Scenario: Creating a Subject For Created Subject Categories
    Given Navigate to Subjects in EducationPage
    And Creating a Subject as "Chemist45" with code as "458788"  For "leyn"
    Then Successfully mesaj Should Be Seen

  Scenario:  Testing Craeted a Subject Categories
    Given Navigate to  Subject Categories in EducationPage
    And Find "leyn" to delete
    And Delete The Subject Category
    Then Can't Be Deleted Mesaj Should Be Seen
