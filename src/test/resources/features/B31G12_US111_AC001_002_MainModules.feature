@B31G12-146
Feature: Main modules names verification

	
	@B31G12-144
	Scenario Outline: US111-TC0001 Verify Store and Sales managers see  modules names
		Given the user logs in with valid credentials "<username>", "<password>"
		When the user navigates to the main page
		Then the user should see the following modules:
			|Dashboards         |
			|Fleet             |
			|Customers         |
			|Sales             |
			|Activities        |
			|Marketing         |
			|Reports & Segments|
			|System            |
		
		 Examples:
		      | username        | password      |
		      |storemanager85   |UserUser123    |
		      |salesmanager101  |UserUser123    |	

	
	@B31G12-145
	Scenario: US111-TC0002 Verify Drivers see module names
		Given the user can log in with valid credentials "user1","UserUser123"
		When the user navigates to the main page
		Then the user should see the following modules:
			|Fleet     |
			|Customers |
			|Activities|
			|System    |