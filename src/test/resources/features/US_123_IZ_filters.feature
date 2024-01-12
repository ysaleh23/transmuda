Feature: User should be able to manage filters on the Vehicle
  Costs page. (Web table and checkbox)


  Background:
    Given the user logged in with username as "salesmanager101 " and password as "UserUser123"
  @wip_filters
  Scenario: User should see 3 columns on the Vehicle Model page.
    Expected columns names: TYPE, TOTAL PRICE, DATE

    When User is on the home page user click on the main menu FLEET menu and VEHICLES COSTS on the submenu
    Then User should be able to see three columns TYPE, TOTAL PRICE, DATE
