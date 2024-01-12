Feature: User should be able to manage filters on the Vehicle
  Costs page. (Web table and checkbox)


  Background:
    Given the user logged in with username as "salesmanager101 " and password as "UserUser123"

  Scenario: User should see 3 columns on the Vehicle Model page.
    Expected columns names: TYPE, TOTAL PRICE, DATE

    When User is on the home page user click on the main menu FLEET menu and VEHICLES COSTS on the submenu
    Then User should be able to see three columns TYPE, TOTAL PRICE, DATE

  @wip_filters
    Scenario: Users check the first checkbox to check all the Vehicle Costs
      When User checks first checkbox User should see all checkboxes are checked
