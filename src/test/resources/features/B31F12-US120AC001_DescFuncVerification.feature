@wip
Feature: Calendar Events - Description Field
	#As a user, I want to type into the Description field when I create a calendar event. (Iframe)
	#Verify that users can type messages in to the Description field on the Calendar Events page

  Scenario: User leaves Description field blank for a calendar event (Iframe)
    #Maksym reusing Yousef's scenario steps and methods in the page definitions from B31G12-US118AC001-002_repetitiveCalendarEvents feature file
    Given the user logged in with username as "User1" and password as "UserUser123"
    Given User hovers over  the Activities tab.
    When  User will click on the Calendar Events option from dropdown.
    And User will click on the Create Calendar Event button
    #Start Maksym specific steps definitions
    And the user navigates to the Description field within the Iframe
    And user types "test_data" text in the Description field.
    Then the "text" in the interface should be the same as "test_data".
