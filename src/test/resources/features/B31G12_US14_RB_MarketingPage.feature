Feature: filters on the Marketing page.

  @roma
  Scenario Outline:  I want to manage filters on the Marketing page.

    # I have to login as a "storemanager" and salemanger;
    Given the user logs in with valid credentials "<username>", "<password>"
    Then user select Marketing dropDown and select Campaigns
    When user click Filters Button
    Then user pres manage filters dropdown menu
#     user select options : Name, Code, Start Date,  from the dropdown
#    Verify that boxes can be clicked and unchecked.


    Examples:
      | username        | password    |
      | storemanager56  | UserUser123 |
      | salesmanager101 | UserUser123 |













