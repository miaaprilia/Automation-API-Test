@CreateUser
Feature: Create User

  Background:
    Given I set API endpoint valid for create user

  @ScenarioPositive
  Scenario: As a user I can create user data with a valid path
    When I enter email
    And I enter password
    And I send request to create user
    Then I received status code 201 Created in request create user
    And I received credentials data response create user

  @ScenarioNegative
  Scenario: As a new user I can't create user without path
    Given I set API endpoint invalid for create user without the path
    When I send request to create user no path
    Then I received status code 404 Not Found in request to create user
    And I received error message "general error" response in request create user
