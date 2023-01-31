Feature: successfully create users
  Me as course automation
  I need to create users
  To validate that users are successfully created

  Background: Login in the web page
    Given I am on the login page

  Scenario: create an user successfully
    Given I want to go to the page of Advantage Demo
    When I enter the information to create the user
    Then I validate the correct user creation