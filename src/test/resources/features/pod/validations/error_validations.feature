@Regression
Feature: POD - Error validations

  Background: Access to INSS Service
    Given I have access to INSS service
    And I am on POD landing page
    And I want to complete a POD


  @e2e
  Scenario: I have been asked to complete POD so that I can get a dividend payment
    When I click continue button on why are you completing POD page
    Then I should see "Select why you are completing a proof of debt."

  @InProgress
  Scenario: I have been asked to complete POD so that I can get a dividend payment
    When I have received a letter telling me to complete one so that I can get a dividend payment
