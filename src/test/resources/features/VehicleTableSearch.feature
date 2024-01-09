@B31G12-137
Feature: Default

	Background:
		Given User hover over Fleet dropdown and selects Vehicles page option

	@B31G12-134
	Scenario: US007 TC001 Verify that the users can see all the checkboxes as unchecked on Vehicles page
		Then user can see all the checkboxes as unchecked	

	@B31G12-135
	Scenario: US007 TC002 Verify that users can check the first checkbox to select all the cars
		When The user checks the first checkbox
		 Then all cars should be selected	

	@B31G12-136
	Scenario: US007 TC003 Verify that users can select any car
		When the user selects a specific car 
		 Then that car should be selected