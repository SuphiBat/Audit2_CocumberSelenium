@smoke
Feature: Account Type

  Background:
    Given The user is on the login page

  @rerun
  Scenario: Teacher user
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teacherqa"

  @rerun
  Scenario: Student user
    When The user logs in using "sdetb2@bootflow.com" and "Test1234"
    Then The welcome message contains "SDETB2"

  @rerun
  Scenario: Developer user
    When The user logs in using "bootdev@bootflow.academy" and "Dev123"
    Then The welcome message contains "BootDeveloper1"


  Scenario Outline: Different User Type
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    Examples:
      | userType                 | password   | name          |
      | teacher@bootflow.academy | Test12345! | Teacher       |
      | sdetb2@bootflow.com      | Test1234   | SDETB2        |
      | bootdev@bootflow.academy | Dev123     | BootDeveloper |
      | ayse2013x@gmail.com      | 12345qwert | Ayse          |


