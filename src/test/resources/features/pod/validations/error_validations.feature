@Regression
Feature: POD - Error validations

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

  @e2e @InProgress
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

  @e2e @InProgress
  Scenario: Error validation on Does Debtor owe any interest page
    When I have received a letter telling me to complete one so that I can get a dividend payment
    And I enter amount owed in pounds
    And I click continue button
    And I am on "Does debtor owe any interest?" screen
    And I click continue button on screen
    Then I should see "Select if you are owed any interest"

  @e2e @InProgress
  Scenario: Error validation on How much interest does debtor owe page
    When I have received a letter telling me to complete one so that I can get a dividend payment
    And I enter amount owed in pounds
    And I click continue button
    And I am on "Does debtor owe any interest?" screen
    And I click "yes" on interest owed
    And I click continue button on screen
#    And I am on "Does debtor owe any interest?"
#    And I click continue button on screen
#    Then I should see "Select if you are owed any interest"

  @e2e @InProgress
  Scenario: Error validation on How much interest does debtor owe page
    When I have received a letter telling me to complete one so that I can get a dividend payment
    And I enter amount owed in pounds
    And I click continue button
    And I am on "Does debtor owe any interest?" screen
    And I click "no" on interest owed
    And I click continue button on screen
#    And I am on "Does debtor owe any interest?" screen
#    And I click "no" on interest owed