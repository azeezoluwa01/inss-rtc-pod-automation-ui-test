@Regression
Feature: POD - Error validations on Invite & Vote Route

  Background: Access to INSS Service
    Given I have access to INSS service
    And I am on POD landing page
    And I am on "Get information about an insolvent person or company" page
    And I click start now button
    And I want to complete a POD

  @e2e
  Scenario: Error validation on Why are you completing a POD page
    When I click continue button
    Then I should see "Select why you are completing a proof of debt."