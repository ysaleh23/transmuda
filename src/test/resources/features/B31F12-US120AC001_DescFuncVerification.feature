@wip
Feature: Default
	#As a user, I want to type into the Description field when I create a calendar event. (Iframe)
	#Verify that users can type messages in to the Description field on the Calendar Events page


  @B31G12-125
  Scenario: Verification if Description field when create a calendar event. (Iframe)
    Feature: Calendar Events - Description Field

  Scenario: User leaves Description field blank for a calendar event (Iframe)
    #Maksym reusing Yousefs scenario steps and methods in the page definitions
    Given the user logged in with username as "User1" and password as "UserUser123"
    When  User will click on the Calendar Events option from dropdown.
    And User will click on the Create Calendar Event button
    #Start Maksym specific steps definitions
    And the user navigates to the Description field within the Iframe
    And user types test data text in the Description field.
    Then the text in the interface should be the same as test data.
