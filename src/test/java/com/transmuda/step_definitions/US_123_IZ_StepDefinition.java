package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;


public class US_123_IZ_StepDefinition {

    DashboardPage dashboard = new DashboardPage();
    VehicleCostsPage costsPage = new VehicleCostsPage();
    Actions action = new Actions(Driver.getDriver());


    @When("User is on the home page user click on the main menu FLEET menu and VEHICLES COSTS on the submenu")
    public void user_is_on_the_home_page_user_click_on_the_main_menu_fleet_menu_and_vehicles_costs_on_the_submenu() {

        dashboard.fleetMenu.click();
        BrowserUtils.sleep(2);
        costsPage.vehicleCosts.click();
        BrowserUtils.sleep(2);

    }


    @Then("User should be able to see three columns TYPE, TOTAL PRICE, DATE")
    public void user_should_be_able_to_see_three_columns_type_total_price_date() {

        Assert.assertEquals(costsPage.type.getText(), "TYPE");
        Assert.assertEquals(costsPage.totalPrice.getText(), "TOTAL PRICE");
        Assert.assertEquals(costsPage.date.getText(), "DATE");

    }

    @When("User checks first checkbox User should see all checkboxes are checked")
    public void user_checks_first_checkbox_user_should_see_all_checkboxes_are_checked() {
        action.click(costsPage.selectAllCheckbox).perform();
        boolean isChecked = true;
        for (WebElement eachCheckBox : costsPage.checkboxes) { //iterating through each checkbox on the vehicle table for each car
            if (!eachCheckBox.isSelected()) {
                isChecked = false; //if any of the cars are not selected, isChecked boolean's value will be assigned it to false
                break;//it will terminate the for lop
            }
        }
        Assert.assertTrue(isChecked);//expected isChecked value is true. This line will verify if all of the checkboxes are selected or not

    }

    /*

     */

}
