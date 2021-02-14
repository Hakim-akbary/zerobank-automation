Feature: Account Summary Page 


  Scenario: Testing Account Summary Page Title 
    Given the user navigates to the webpage
    And  the user clicks on the signinButton
    When the user logs in with "username" "password"
    Then the user clicks on the "Advacned"
    Then the user should see "Zero - Account Summary" page


  Scenario: Testing Account Summary Contents
    Given the user navigates to the webpage
    And  the user clicks on the signinButton
    When the user logs in with "username" "password"
    Then the user clicks on the "Advacned"
    Then the user should see the following account types

    |Cash Accounts |
    |Investment Accounts |
    |Credit Accounts |


