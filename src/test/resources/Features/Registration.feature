Feature: Registration
  As a user
  I want to register on the website
  So that I can access the services

  Scenario: Register on the website
    Given I am on the registration page
    When I fill in the registration page
    And I submit the form
    Then I should see a success message
