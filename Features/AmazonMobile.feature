@tag
Feature: Buy Mobile  from amazon
  I want to buy mobile from amazon

  #Scenario: verify the functionality of mobile
  #Given User launch the browser
  #When User enter the url1
  #And User Click on Mobile Modules
  #And User click on Mobile options
  #And choose oppo
  #And User Click on particular mobile
  #Then User See That Mobile in Add to cart
  
  Scenario Outline: Check the Mobile
    Given User launch the browser
    When User enter the url1
    And User Click on Mobile Modules
    And User click on Mobile options
    And choose "<Mobile>"
    And User Click on "<Mobile>" mobile
    Then User See That Mobile in Add to cart

    Examples: 
      | Mobile  |
      | Redmi1 |
      | Samsung  |
     
      
