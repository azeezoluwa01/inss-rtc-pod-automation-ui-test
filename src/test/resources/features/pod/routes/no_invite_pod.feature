@Regression
Feature: No invitation received POD

  Background: Access to INSS Service
    Given I have access to INSS service
    Given I am on POD landing page

  @InProgress
  Scenario: I have been asked to complete POD so that I can get a dividend payment
    When I have received a letter telling me to complete one so I can vote on removing the official receiver as the trustee or liquidator
    Then proof of debt is successfully submitted
