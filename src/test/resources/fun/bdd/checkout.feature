Feature: Display total of items that have been checked out
  Scenario: Add one piece of fruit and display the total
    Given I am using the checkout app
    When I scan a "banana"
    Then I see my display total as .49