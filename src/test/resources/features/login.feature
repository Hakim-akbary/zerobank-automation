Feature:"TC Login Scenarios"


  Scenario: "Valid Credentials"
    Given the user navigates to the webpage
    When the user clicks on the signinButton
    And the user logs in with "username" "password"
    Then the user clicks on the "Advanced"

    Scenario: "Invalid Credentials"
      Given the user navigates to the webpage
      When  the user clicks on the signinButton
      And the user logs in with "HakimAkbary" "password"
      Then the user should see "Login and/or password are wrong."
      
      Scenario: "Login with Empty Information"
      Given the user navigates to the webpage
      When the user navigates to the webpage
        When the user clicks on the signinButton
        And the user logs in with "" ""
        Then the user should see "Login and/or password are wrong."
        
