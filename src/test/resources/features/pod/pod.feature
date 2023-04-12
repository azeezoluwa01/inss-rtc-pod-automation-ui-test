@Regression @pod
Feature: Proof of Debt tests

  Background: Access to INSS Service
    Given I have access to INSS service

  @Regression
  Scenario: I have been asked to complete POD so that I can get a dividend payment
    When I have received a letter telling me to complete one so that I can get a dividend payment
    Then proof of debt is successfully submitted

  @Regression
  Scenario: I have been asked to complete POD so that I can vote
    When I have received a letter telling me to complete one so I can vote on removing the official receiver as the trustee or liquidator
    Then proof of debt is successfully submitted

  @Regression
  Scenario: I have not been asked to complete POD
    When I have not been asked to complete one, but I want to tell you how much I'm owed
    Then proof of debt is successfully submitted
