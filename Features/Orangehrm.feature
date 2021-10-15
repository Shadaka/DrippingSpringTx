Feature: Validation of Orangehrm homepage

@Orangehrm
Scenario:
Given user visit Orangehrm homepage
When user goes to company dropdown menu and see Aboutus option and click over there
Then user can be able to redirect to Aboutus page
