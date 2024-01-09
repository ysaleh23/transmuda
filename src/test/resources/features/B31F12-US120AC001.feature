Feature: Default

	#{color:#de350b}{*}User Story{*}: 
	#{color}
	#
	#As a user, I want to type into the Description field when I create a calendar event. (Iframe)
	#
	# 
	#
	#{color:#de350b}*AC1:*{color} 
	#Verify that users can type messages in to the Description field on the Calendar Events page{*}.{*}
	@B31G12-125
	Scenario: Verification if Description field when create a calendar event. (Iframe)
		Feature: Calendar Events - Description Field
		
		  Scenario: User leaves Description field blank for a calendar event (Iframe)
		    Given the user logged in and can see the main page.
		    Then user clicks on Activities dropdown menu.
		    And user selects the Calendar Events option.
		    And user clicks on Create Calendar Event.
		    And the user navigates to the Description field within the Iframe
		    And user types test data text in the Description field.
		    Then the text in the interface should be the same as test data.