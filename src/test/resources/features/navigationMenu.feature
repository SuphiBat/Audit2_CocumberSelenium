@navigation @regression
Feature:Navigation Menu

 @developer
  Scenario: Navigation to Developers Menu
    Given The user is on the login page
    When  The user enters developer credentials
    Then The  user should be to see welcome message
    When The user navigates to Developers menu
    Then The  user should be to see Developers text

  Scenario: Navigation to Developers Menu
    Given The user is on the login page
    When  The user enters student credentials
    Then The  user should be to see welcome message
    When The user navigates to All Posts menu
    Then The  user should be to see Posts text

  Scenario: Navigation to My account Menu
    Given The user is on the login page
    When  The user enters teacher credentials
    Then The  user should be to see welcome message
    When The user navigates to My Account menu
    Then The  user should be to see Dashboard text