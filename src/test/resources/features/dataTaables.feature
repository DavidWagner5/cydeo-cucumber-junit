Feature: Examples of Cucumber data table implementations






  Scenario: List of fruits i like
    Then user should see fruits i like
      | Kiwi        | 2|
      | banana      | 1|
      | cucumber    | 4|
      | orange      | 5|
      | mango       | 3|
      | grape       | 3|
      | pomegranate | 7|

#ctrl wind alt + L for beautify feature in intellij



  @wip
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |