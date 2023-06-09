Feature: Gmail Compose Functionality 

  
  Scenario: Compose the mail and send
    Given User logging in to Gamil page
    And User click on Compose button
    When User enter the recipient email address
    And User enter the subject line
    And User enter the email body
    Then User click on send button
    
    