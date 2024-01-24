@B31G12-165
Feature: Access Control for Vehicle Contracts Page

User Story: As a user, I want to access to Vehicle Contracts page


  Scenario: Sales managers should access the Vehicle Contracts page
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    And the user navigates to the Vehicle Contracts page
    Then the Vehicle Contracts page is displayed successfully


  Scenario: Store managers should access the Vehicle Contracts page
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    And the user navigates to the Vehicle Contracts page
    Then the Vehicle Contracts page is displayed successfully


  Scenario: Drivers cannot access the Vehicle Contracts page
    Given the user logged in with username as "User1" and password as "UserUser123"
    And the user navigates to the Vehicle Contracts page
    Then an access denied message is displayed




	
