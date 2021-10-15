Feature: Validation of Orangehrm Careers

  @OrangehrmCareers
  Scenario: 
    Given user goes to  Orangehrm homepage
    When user goes to company dropdown menu and see Careers option and click Careers option
    Then user able to redirect to Careers page
