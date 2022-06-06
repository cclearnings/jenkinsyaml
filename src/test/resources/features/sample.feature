Feature: Test Reporting

  @1
  Scenario: numbers
    Given I started testing
    When assert numbers
    Then should pass intes


  @2
  Scenario: numbers
    Given I started testing
    When assert string
    Then should pass strings


  @3
  Scenario: numbers
    Given I started testing
    When assert booleans
    Then should pass boolean

