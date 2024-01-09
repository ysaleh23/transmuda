@B31G12-143
Feature: As a user, I want to view columns on the Vehicles Model page.


	@B31G12-141
	Scenario: US115_TC001_View_Vehicle_Columns
		Given : I am logged in as Store manager
		    When : Click on the fleet tab when on home page
		    And : Click on the vehicle model
		    Then :Verify MODEL NAME, MAKE, CAN BE REQUESTED, CVVI,CO2 FEE (/MONTH), COST (DEPRECIATED), TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, and VENDORS columns should be displayed	


	@B31G12-142
	Scenario: US115_TC002_View_Vehicle_Columns
		Given : I am logged in as Sales manager
		    When : Click on the "fleet tab" when on home page
		    And : Click on the "vehicle model"
		    Then :Verify "MODEL NAME, MAKE, CAN BE REQUESTED, CVVI,CO2 FEE (/MONTH), COST (DEPRECIATED), TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, and VENDORS" columns should be displayed