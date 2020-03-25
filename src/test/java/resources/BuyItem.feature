Feature: Buy Item
  Background:
    Given Go to the yourlogo
    And Click on Sign  in button
    And type to "email" and "password"
    And Click on Sign in Button

  Scenario: Buying an item
    And Click on  the "T-SHIRTS "
    And Click on more button
    And choose the size
    And choose the color
   And  click on Add to cart button
    Then verify the text
