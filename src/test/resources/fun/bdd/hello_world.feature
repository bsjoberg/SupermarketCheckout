Feature: Ensure my development environment is configured
  Scenario: Run hello world
    Given I have a hello world app
    When I say hi
    Then I see the words "Hello World"