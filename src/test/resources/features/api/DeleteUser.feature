@DeleteUser
Feature: Delete User

  @ScenarioPositive
  Scenario: As an admin I can delete user with a valid path
    Given I set API endpoint valid for delete user by ID
    When I send request to delete user by ID
    Then I received status code 204 No Content in request to delete user by ID

