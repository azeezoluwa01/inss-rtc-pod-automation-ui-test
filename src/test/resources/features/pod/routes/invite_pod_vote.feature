@Regression
Feature: Complete POD - Letter of invitation received and vote

  Background: Access to INSS Service
    Given I have access to INSS service
    And I am on POD landing page
    And I am on "Get information about an insolvent person or company" page
    And I click start now button
    And I want to complete a POD

  @InProgress
  Scenario: I have been asked to complete POD so that I can get a dividend payment
    When I have received a letter telling me to complete one so I can vote on removing the official receiver as the trustee or liquidator
    Then proof of debt is successfully submitted
