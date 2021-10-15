Feature:  amazon cart select option
  
  Scenario Outline: Amazon Cart validation
 
  Given  user visit Amazon page
  When user type desirable "<product name>" 
  And user click to the search button
  Then  user able to choose the product
  Then User select the Add to Cart option
  

  
  Examples:

  |product name |  
  | Toy | 