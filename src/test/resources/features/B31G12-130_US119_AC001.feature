@B31G12-148
Feature: Default

	Background:
		#@B31G12-130
		Given the user logged in with username as "User1" and password as "UserUser123"
		Given User hovers over  the Activities tab.



	@B31G12-147
	Scenario: US119-TC001 error messages when I enter an invalid integer number into the calendar Repeat Every input box.
		When  User will click on the Calendar Events option from dropdown.
		And User will click on the Create Calendar Event button
		And User will click on the repeat button
		When User enter less than 1
		And users should see "The value have not to be less than 1."
		And user will clear the previous inputted value
		And if User enter more than 99 
		Then users should see "The value have not to be more than 99."