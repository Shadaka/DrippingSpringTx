Feature: Facebook signup option

  @select3
  Scenario Outline: 
    Given user visit Facebook page
    When user goes to "<firstname>", "<lastname>", "<email>" , "<email>" , "<password>" 
    Then user click dropdown month and dropdown day and dropdown year
    Then user click genderoption and click signup
    Then user access to visit Facebook signup option

    Examples: 
      | firstname | lastname | email                   | password |
      | Shadaka   | Islam    | shadaka.islam@gmail.com | abc123   |
