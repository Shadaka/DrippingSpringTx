Feature: Orangehrm get a free demo validation

  @orangehrmdemo
  Scenario Outline: 
    Given user lands to Orangehrm page
    When user go to click get a free demo option
    When user goes to "<firstname>" and "<lastname>" and "<email>" and "<phonenumber>"
    Then user click to dropdown country option
    When user click i not a robot option
    Then user click to get a free demo option
    Then user can go to visit Orangehrm get a free demo option

    Examples: 
      | firstname | lastname | email                   | phonenumber  |
      | Shadaka   | Islam    | shadaka.islam@gmail.com | 408-594-9879 |
