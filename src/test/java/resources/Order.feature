Feature: Buy Item
  Background:
  Scenario: creating account

    Given Go to the yourlogo website
    And Go to Sign in button
    And type your "email" and "password"
    Then Click on the Sign in Button

  Scenario: Order  an item
    And Click on   T-SHIRTS
    And Click on list view
    And Click on Add to cart button
    And Click on proceed to checkout button
    And Click on proceed to checout button for sigin
    And Click on proceed to checout button for adress
    And Click on terms of service
    And Click on proceed to checout button for shipping
    And Click on bank wire payment
    Then Click on I confirm my order button