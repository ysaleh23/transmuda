package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VehiclesTableStepDefs {

    LoginPage login = new LoginPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    DashboardPage dashboardPage = new DashboardPage();
    Actions actions;

    @Given("User hover over Fleet dropdown and selects Vehicles page option")
    public void user_hover_over_fleet_dropdown_and_selects_vehicles_page_option() {

       BrowserUtils.waitForVisibility(dashboardPage.fleetMenu,10);
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboardPage.fleetMenu).perform(); //hover overs the fleet menu
        BrowserUtils.sleep(3);
        actions.moveToElement(dashboardPage.vehiclesLink).click().perform();//clicks on vehicles page
    }
    @Then("user can see all the checkboxes as unchecked")
    public void user_can_see_all_the_checkboxes_as_unchecked() {
        BrowserUtils.waitForVisibility(vehiclesPage.selectAllCheckbox, 10); //wait until the select all checkbox gets visible

        boolean isChecked = false;
        if(vehiclesPage.selectAllCheckbox.isSelected()){//checks If the select all check boc is checked or not
            isChecked = true; //If the select all checkbox is selected, isChecked boolean's value will be assigned it to true
        }
        for(WebElement eachCheckBox: vehiclesPage.checkboxes){//iterating through each checkbox on the vehicle table for each car
           if( eachCheckBox.isSelected() ) { //If any checkbox is selected
               isChecked = true; //If any checkbox is selected, isChecked boolean's value will be assigned it to true
               break; //it will terminate the for loop
           }
        }
        Assert.assertFalse(isChecked); //expected isChecked value is false, assertFalse will verify the isChecked value

    }

    @When("The user checks the first checkbox")
    public void the_user_checks_the_first_checkbox() {
       vehiclesPage.selectAllCheckbox.click(); //selects the select all checkbox
    }
    @Then("all cars should be selected")
    public void all_cars_should_be_selected() {
        boolean isChecked = true;
        for(WebElement eachCheckBox: vehiclesPage.checkboxes){ //iterating through each checkbox on the vehicle table for each car
            if( !eachCheckBox.isSelected() ) {
                isChecked = false; //if any of the cars are not selected, isChecked boolean's value will be assigned it to false
                break;//it will terminate the for lop
            }
        }
        Assert.assertTrue(isChecked);//expected isChecked value is true. This line will verify if all of the checkboxes are selected or not
    }

    @When("the user selects {int}th specific car")
    public void theUserSelectsSpecificCar(int numberOfCar) {
        for(int i = 1; i < vehiclesPage.checkboxes.size(); i++){//this will iterate through all the checkboxes for the cars
            if(i == numberOfCar) { //when the iteration meets with the specific car
                vehiclesPage.checkboxes.get(i).click(); //it will select to specific car's checkbox
            }
        }
    }


    @Then("{int}th car should be selected")
    public void thCarShouldBeSelected(int numberOfCar) {
        Assert.assertTrue(vehiclesPage.checkboxes.get(numberOfCar).isSelected());//verifies that if the specific car is selected or not
    }
}
