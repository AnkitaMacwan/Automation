Feature: Login file

  @Regression
  Scenario: Login scenario
    Given Open Browser
    And User enters username 'rebeca@atsspec.co' and password 'Zaq12wsX'
    When click login
    Then Open Projecttracker