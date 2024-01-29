@GetAllUser
Feature: Get All User

  @ScenarioPositive
  Scenario: As a user I can get all user data with a valid path
    Given I set API endpoint valid for get all user
    When I send request to get all user
    Then I received status code 200 OK in request get all user
    And I successfully get all user data

