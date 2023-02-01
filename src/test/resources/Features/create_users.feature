Feature: successfully create users
  Me as course automation
  I need to create users
  To validate that users are successfully created

  Background: Login in the web page
    Given I am on the login page

  Scenario Outline: create an user successfully
    Given I want to go to the page of Advantage Demo
    When I enter the information to create the user
      | username   | email   | password   | confirmPassword   | firstName   | lastName   | phoneNumber   | country   | state   | address   | city   | zip   |
      | <username> | <email> | <password> | <confirmPassword> | <firstName> | <lastName> | <phoneNumber> | <country> | <state> | <address> | <city> | <zip> |

    Then I validate the correct user creation
    Examples:
      | username | email            | password     | confirmPassword | firstName | lastName | phoneNumber | country  | state     | address      | city   | zip    |
      | juanpa   | juan12@gmail.com | Aa$123456789 | Aa$123456789    | Juan      | Rivera   | 3147009489  | Colombia | Antioquia | Calle 50 sur | Itaguí | 055413 |

