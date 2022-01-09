@rerun@smoke@regression
Feature: Running failed scenarios

  Scenario: one
    Given User added two numbers
    Then Result should be as expected
  Scenario: two
    Given User added three numbers
    Then Result should be sum of three numbers
  Scenario: three
    Given User divides two numbers
    Then Result should be division result
  Scenario: four
    Given User multiplies two numbers
    Then Result should be multiplication result