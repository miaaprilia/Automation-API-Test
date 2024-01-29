@UpdateUser
Feature: Update User

  @ScenarioPositive
  Scenario: As a user I can update user with a valid path
    Given I set API endpoint valid for update user by ID
    When I update email
    And I update password
    And I send request to update user by ID
    Then I received status code 200 OK in request update user
    And I received credentials data response update user

  @ScenarioNegative
  Scenario: As a user I can't update user without path
    Given I set API endpoint invalid for can't update user by ID without the path
    When I send request to update user by ID no path
    Then I received status code 404 Not Found Error in request to update user by ID
    And I received error message "general error" response in request update user by ID