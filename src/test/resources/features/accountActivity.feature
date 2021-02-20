Feature: Navigating to specific accounts in Accounts Activity

  @wip
  Scenario Outline: Savings/Brokerage Account Redirect
    Given the user is logged in
    When the user clicks on "<Link>" on the Account Summary page Then the "<PageTitle>" page should be displayed
    And Account drop down should have "<FirstSelectedOption>" selected


    Examples:

      | Link        | PageTitle        | FirstSelectedOption |
      | Savings     | Account Activity | Savings             |
      | Brokerage   | Account Activity | Brokerage           |
      | Checking    | Account Activity | Checking            |
      | Credit Card | Account Activity | Credit Card         |
      | Loan        | Account Activity | Loan                |

