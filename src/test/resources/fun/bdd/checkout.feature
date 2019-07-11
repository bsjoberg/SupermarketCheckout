Feature: Display total of items that have been checked out
  Scenario: Add one piece of fruit and display the total
    Given I am using the checkout app
    When I scan a "banana"
    Then I see my display total as .49

  Scenario: Add another type of fruit and display the total
    Given I am using the checkout app
    When I scan an "apple"
    Then I see my display total as .59

  Scenario: Add two different types of fruit and display the total
    Given I am using the checkout app
    When I scan an "apple"
    And I scan a "banana"
    Then I see my display total as 1.08

  Scenario: Add multiple of the same type of fruit and display the total
    Given I am using the checkout app
    When I scan a "banana"
    And I scan a "banana"
    Then I see my display total as .97