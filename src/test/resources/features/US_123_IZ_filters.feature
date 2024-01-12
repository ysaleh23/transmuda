@wip_filters
Feature: User should be able to manage filters on the Vehicle
  Costs page. (Web table and checkbox)


  Background:
    Given the user logged in with username as "salesmanager101 " and password as "UserUser123"
    When User is on the home page user click on the main menu FLEET menu and VEHICLES COSTS on the submenu

  Scenario: User should see 3 columns on the Vehicle Model page.
    Expected columns names: TYPE, TOTAL PRICE, DATE


    Then User should be able to see three columns TYPE, TOTAL PRICE, DATE


    Scenario: Users check the first checkbox to check all the Vehicle Costs
      When User checks first checkbox User should see all checkboxes are checked
