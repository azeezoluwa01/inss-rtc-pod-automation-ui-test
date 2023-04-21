@Regression
Feature: POD - Error validations

  Background: Access to INSS Service
    Given I have access to INSS service
    And I am on POD landing page
    And I want to complete a POD

  @e2e
  Scenario: Error validation on Why are you completing a POD page
    When I click continue button
    Then I should see "Select why you are completing a proof of debt."

  @e2e
  Scenario: Error validation on What is the total amount of money that debtor owes page
    When I have received a letter telling me to complete one so that I can get a dividend payment
    And I click continue button
    Then I should see "Enter how much money you are owed"

  @e2e @InProgress
  Scenario: Error validation on The debt is not in £ sterling screen
    When I have received a letter telling me to complete one so that I can get a dividend payment
    And I enter amount owed in pounds
    And I click debt not in pounds
    And I click continue button
    Then I should see "Enter how much money is owed"

  @InProgress
  Scenario: I have been asked to complete POD so that I can get a dividend payment
    When I have received a letter telling me to complete one so that I can get a dividend payment
