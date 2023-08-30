@login @smoke @regression
Feature: Devbook Login Test
  # Agile story :  As a user, I should be able to log in so I can see my account

  Background:
    Given The user is on the login page

  @teacher
  Scenario: Login as a Teacher
    #Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  @student
  Scenario: Login as a Student
    #Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

  # Clas task  Login as a Developer

  Scenario: Login as a Developer
    #Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login

  #@sdet @db
  #Scenario: Login as a SDET
    #Given The user is on the login page
    #When The user enters SDET credentials
    #Then The user should be able to login

    # to format the page structure ctrl + alt + L
    # @wip --> work in progress