@B31G12-171
Feature: Vehicles Odometer feature
  User Story: As a user, I want to view car odometer info on the Vehicle's Odometers page

  @B31G12-168
  Scenario: Store Manager should see error message
    Given user is logged in with username "storemanager51" and password "UserUser123"
    When user hovers over Fleet module
    And user clicks Vehicle Odometer
    Then user should see message: “You do not have permission to perform this action.”

  @B31G12-169
  Scenario: Sales Manager should see error message
    Given user is logged in with username "salesmanager101" and password "UserUser123"
    When user hovers over Fleet module
    And user clicks Vehicle Odometer
    Then user should see message: “You do not have permission to perform this action.”

  @B31G12-170
  Scenario: Default values logged in as a Truck Driver
    Given user is logged in with username "user1" and password "UserUser123"
    When user hovers over Fleet module
    And user clicks Vehicle Odometer
    Then user should see the default page as 1
    Then user should see the View Per Page is 25 by default