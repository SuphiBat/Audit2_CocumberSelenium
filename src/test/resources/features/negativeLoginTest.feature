@smoke
Feature: Negative Login Test

  #ClassTask--> Create a Negative Login Test Feature file with Scenario Outline which includes 4 different data as;
  # teacher
  # teacher@
  # teacher@bootflow
  # teache@bootflow.academy
  # Do not forget to take the messages which show the result as negative
  # Create Step Def class and if needed create locators and methods in related page class



  @wip
  Scenario Outline: Negative Test
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The warning message contains '<message>'
    Examples:
      | userType                 | password   | message                                                                            |
      | teacher                  | Test12345! | Lütfen e-posta adresine bir "@" işareti ekleyin. "teacher" adresinde "@" eksik.    |
      | teacher@                 | Test12345! | Lütfen "@" işaretinden sonra gelen kısmı ekleyin. "teacher@", tam bir adres değil. |
      | teacher@bootflow         | Test12345! | Please include a valid email!                                                      |
      | teache@bootflow.academy  | Test12345! | Invalid Credentials!                                                               |
