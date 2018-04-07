Feature: Login file

  @Regression
  Scenario: Login scenario
    Given Open Browser
    And Enter login credential
    When click login
    Then Open Projecttracker