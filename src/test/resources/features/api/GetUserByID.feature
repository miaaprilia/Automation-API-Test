@GetUserByID
Feature: Get User By ID

  @ScenarioPositive
  Scenario: As a user I can get user by ID with a valid path
    Given I set API endpoint valid for get user by ID
    When I send request to get user by ID
    Then I received status code 200 OK in request get user by ID
    And I received user data by id response in request get user by ID

  @ScenarioNegative
  Scenario: As a user I can't get user data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get user data invalid ID
    When I send request to get user data invalid ID
    Then I received status code 404 Not Found in request to get user by ID
    And I received error message "failed find user" response in request get user by ID

  @ScenarioNegative
  Scenario: As a user I can't get user data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get user data ID not exist in database
    When I send request to get user data ID not exist in database
    Then I received status code 404 Not Found in request to get user by ID
    And I received error message "failed find user" response in request get user by ID

