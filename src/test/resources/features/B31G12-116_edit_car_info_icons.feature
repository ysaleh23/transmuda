@US116_wip
  B31G12-116:
  Feature: As a user, I want to see edit car info icons from the Vehicle page.

Background:
  Given User hover over Fleet and selects Vehicles page option


    @US116_TC1
      #User Story : As a user, I want to see edit car info icons from the Vehicles page.
    Scenario As a user, I want to see edit car info icons from the Vehicles page
      #AC #1
    #Verify that users see “view, edit, delete” options when they hover the mouse over the 3 dots "..."
      When user hover the mouse over the 3 dots "..."
      Then users sees view, edit, delete options

