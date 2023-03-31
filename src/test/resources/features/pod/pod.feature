@Regression
Feature: Proof of Debt tests

  @Regression
  Scenario: Just checking things are mapped together
    Given I have access to INSS service
    When I want to create a one login account
    Then one login account is successful
