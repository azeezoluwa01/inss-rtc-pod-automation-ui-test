Feature: One login tests

#  Background:
#    Given I am on one login home page

  @Regression
  Scenario:Create a one login account
    Given I have access to INSS service
    When I want to create a one login account
    Then one login account is successful
