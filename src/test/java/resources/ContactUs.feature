Feature: Contact Us
  Background:

  Scenario: creating account

    Given Go to the yourlogo website
    And Go to Sign in button
    And type your "email" and "password"
    Then Click on the Sign in Button

  Scenario: Contact us
    And Click on Contact Us Tab
    And Select Subject Heading
    And Select Order Reference
    And Select Product
    And Type the "Message"
    And Click on Send Button
    Then Verify message has been successfully sent is displayed