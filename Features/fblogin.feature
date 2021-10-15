Feature: Facebook login option

  Scenario Outline: 
    Given user lands Facebook url
    When user inputs "<email>" and "<password>"
    Then user is able to visit Facebook login option

    Examples: 
      | email                | password |
      | shadaka013@gmail.com | abc123   |
