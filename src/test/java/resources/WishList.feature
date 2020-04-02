Feature: Buy Item
  Background:
  Scenario: creating account

    Given Go to the yourlogo website
    And Go to Sign in button
    And type your "email" and "password"
    Then Click on the Sign in Button

  Scenario: Buying an item
    And Click on  the T-SHIRTS
    And Click on list
    And click in wishlist
    And click on pop up
    And  click on Add to cart button
    And click on proceed to check out button
    Then remove item