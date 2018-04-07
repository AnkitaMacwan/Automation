Feature: Sample feature file

  @Sample
  Scenario: This is my first scenario
    #Steps
    Given this is my given statement
    When this is my when statement
    Then this is my then statement


  @Regression
  Scenario: This is my regression scenario
    Given this is my given statement
    When this is my when statement
    Then this is my then statement

  @Singledata
  Scenario: this is my single data scenario
    Given I launch url 'https://atsspec.net/'


  @Multipledata
  Scenario Outline: : this is my single data scenario
    Given I launch url 'https://atsspec.net/'
    When Enter valid username '<username>' and password '<password>'


    Examples:
      | username            | password |
      | Rebeca@atsspec.co   | Zaq12wsX |
      | abc@atsspec.co      | hhagsfkg |


