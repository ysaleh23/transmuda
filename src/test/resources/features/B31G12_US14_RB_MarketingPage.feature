Feature: filters on the Marketing page.

@roma
  Scenario Outline:  I want to manage filters on the Marketing page.
    Given the user logs in with valid credentials "<username>", "<password>"
    Then user select Marketing dropDown and select Campaigns
    When user click Filters Button
   Then user pres manage filters dropdown menu
#   And  user select options Name and Budget  from the dropdown
#    Then  user should see options selected
    Examples:
      | username       | password    |
      | storemanager56 | UserUser123 |
#     | salesmanager101 | UserUser123 |




#  Scenario:  User assert manage filter dropDown menu selections





#  Given user is on Manage filters dropdown page
#   When  user see the following options from the dropdown:
#      | Name       |
#      | Code       |
#      | Start Date |
#      | End Date   |
#      | Budget     |
#    Then user Verify that boxes can be clicked and unchecked.




