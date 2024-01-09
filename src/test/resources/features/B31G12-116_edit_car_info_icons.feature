@B31G12-129
Feature: As a user, I want to see edit car info icons from the Vehicles page.

	Background:
		#@B31G12-127
		Given User hover over Fleet dropdown and selects Vehicles page option


	@B31G12-128
	Scenario: US116_TC01_Edit car info icons
		#As a user, I want to see edit car info icons from the Vehicles page.
		Given As a user, I want to see edit car info icons from the Vehicles page
		When user hover the mouse over the 3 dots ...
			#Verify that users see “view, edit, delete” options when they hover the mouse over the 3 dots “{*}…{*}”
		Then users sees view, edit, delete options