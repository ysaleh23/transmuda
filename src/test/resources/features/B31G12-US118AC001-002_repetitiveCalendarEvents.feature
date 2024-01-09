@B31G12-132
Feature: User wants to be able to check Calender Event repeat button.

	Background:
		#@B31G12-130
		Given User hovers over  the Activities tab.
		

	@B31G12-131
	Scenario: US118-TC001 As a user, I want to create a recurring (repetitive) calendar event.
		When  User will click on the Calendar Events option from dropdown.
		  And User will click on the Create Calendar Event button
		  And User will click on the repeat button
		  Then Verify that users see the number 1 by default in the Repeat Every input option.	

	@B31G12-133
	Scenario: US118-TC002 As a user, I want to create a recurring (repetitive) calendar event
		When User will clear the number 1 from the Repeat Every input option
		  Then Verify that users see the error message "This value should not be blank." when the Calendar event Repeat Every field is cleared (delete the number 1).