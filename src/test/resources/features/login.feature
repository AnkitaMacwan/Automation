Feature: Login file

  @Regression
  Scenario: Login scenario
    Given Open Browser
    And User enters username 'abc' and password 'def'
    When click login
    Then Open Projecttracker
