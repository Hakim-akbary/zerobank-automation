@wip
Feature: Find Transactions in Account Activity


  Background: Preparing the Stage
    Given The user acccesses the find transaction tab

    Scenario: Search Date Range
      When the user enters data range from "2012-09-01" to "2012-09-06"
      Then results should be only show transactions dates between "2012-09-01" to "2012-09-06"
      #And the results should be sorted by most recent date