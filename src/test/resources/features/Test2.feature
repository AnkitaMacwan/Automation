Feature: My file

  @Sample:
  Scenario: Login
  Given Open the Browser
  When Enter valid Username and Password
  Then Click on Login Button


  @LaunchingURL
  Scenario: Open URL
    Given Type the URL 'https://atsspec.net/'
    When Enter Credential
    And Open Project Tracker


