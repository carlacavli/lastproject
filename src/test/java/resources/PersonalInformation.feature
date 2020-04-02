Feature: Editing personal information
  Background:

  Scenario: creating account

    Given Go to the yourlogo website
    And Go to Sign in button
    And type your "email" and "password"
    Then Click on the Sign in Button

  Scenario: personal information

    And Click on My Personal Information
    And Click on social title
    And type to"newfirstname"and "newlasttname" and "Email1"
    And type " Password "and "NewPassword"
    And Click on Save button

