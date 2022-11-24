Feature: Successfully login user
  Me as course automation tester
  I need to login user
  To validate that users log in successfully

  Scenario: Login an existing user successfully
    Given I am on the login page
    When I enter valid credentials
    Then I should be logged in successfully
