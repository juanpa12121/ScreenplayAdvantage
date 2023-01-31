Feature: Successfully buy a laptop
  Me as course automation tester
  I need to buy a laptop
  To validate the successful purchase of a laptop

  Background: Login in the web page
    Given I am on the login page

  Scenario: Buying a laptop successfully
    When I enter the data for buy laptop
    Then Valid that a successful purchase has been made