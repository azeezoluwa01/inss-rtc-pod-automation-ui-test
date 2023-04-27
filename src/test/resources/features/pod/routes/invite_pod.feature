@Regression
Feature: Letter of invitation received POD

  Background: Access to INSS Service
    Given I have access to INSS service
    And I am on POD landing page
    And I am on "Get information about an insolvent person or company" page
    And I click start now button
    And I want to complete a POD

  @InProgress
  Scenario: I have been asked to complete POD so that I can get a dividend payment
    When I have received a letter telling me to complete one so that I can get a dividend payment
    Then proof of debt is successfully submitted
