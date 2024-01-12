@B31G12-143
Feature: As a user, I want to view columns on the Vehicles Model page.


  @B31G12-141
  Scenario: US115_TC001_View_Vehicle_Columns
    Given  the user logged in with username as "storemanager51" and password as "UserUser123"
    When : Click on the fleet tab when on home page
    And : Click on the vehicle model
    Then : 	Verify that the column names

  |MODEL NAME |
  |MAKE       |
  |CAN BE REQUESTED|
  |CVVI|
  |CO2 FEE (/MONTH)|
  |COST (DEPRECIATED)|
  |TOTAL COST (DEPRECIATED)|
  |CO2 EMISSIONS|
  |FUEL TYPE|
  |VENDORS|


  @B31G12-142
  Scenario: US115_TC002_View_Vehicle_Columns
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    When : Click on the fleet tab when on home page
    And : Click on the vehicle model
    Then : 	Verify that the column names

      |MODEL NAME |
      |MAKE       |
      |CAN BE REQUESTED|
      |CVVI|
      |CO2 FEE (/MONTH)|
      |COST (DEPRECIATED)|
      |TOTAL COST (DEPRECIATED)|
      |CO2 EMISSIONS|
      |FUEL TYPE|
      |VENDORS|

  @B31G12-154
  Scenario: US115_AC003 Drivers Cannot Access Vehicles Models Page
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    When : Click on the fleet tab when on home page
    And : Click on the vehicle model
    Then : User should see the following error message “You do not have permission to perform this action.”


