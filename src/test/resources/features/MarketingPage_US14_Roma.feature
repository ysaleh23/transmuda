@B31G12-153
Feature: Default


  @B31G12-150
		 # I have to login as a "storemanager"
  Scenario Outline: Manage filters on the Marketing page.
    Given the user logs in with valid credentials "<username>", "<password>"
    Then user select Marketing dropDown and select Campaigns
    When user click Filters Button
#    Verify that boxes can be clicked and unchecked.
    Then user pres manage filters dropdown menu
#     user select options : Name, Code, Start Date,  from the dropdown


    Examples:
      | username       | password    |
      | storemanager56 | UserUser123 |
 #    | salesmanager101 | UserUser123 |


  @B31G12-152
 # I have to login as a  salemanger;
  Scenario Outline: Store and Sales managers see all 5 filter options as checked by default from the  Marketing page.
    Given the user logs in with valid credentials "<username>", "<password>"
    Then user select Marketing dropDown and select Campaigns
    When user click Filters Button
    Then user pres manage filters dropdown menu

    Examples:
      | username        | password    |
#     | storemanager56  | UserUser123 |
      | salesmanager101 | UserUser123 |





