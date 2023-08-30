@LoginWithParameter
Feature: Log in as different user
  #Agile: As a user I should be able to log in as different user

  Scenario: Log in as teacher with parameters
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher2"

  Scenario: Log in as student with parameters
    Given The user is on the login page
    When The user logs in using "sdetb2@bootflow.com" and "Test1234"
    Then The user should be able to login
    And The welcome message contains "SDETB22"

       # HOMEWORK
  #Create a new feature file named navigateMenuWithParameters.feature

  # login as a teacher
  # verify welcome message
  # go to developers page
  # verify "Filter Profiles by Skill or by Location"

  # login as a student
  # verify welcome message
  # go to Post page
  # verify "Post"

   # login as a developer
  # verify welcome message
  # go to Dashboard page
  # verify "Dashboard"