Feature: Successfully login user
  Me as course automation tester
  I need to login user
  To validate that users log in successfully

  Scenario Outline: Login an existing user successfully
    Given I am on the login page
    When I enter valid credentials
      | username   | password   |
      | <username> | <password> |

    Then I should be logged in successfully

    Examples:
      | username | password         |
      | juanpa   | juan12@gmail.com |
