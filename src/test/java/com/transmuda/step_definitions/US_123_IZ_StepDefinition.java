package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US_123_IZ_StepDefinition {

    DashboardPage dashboard = new DashboardPage();
    VehicleCostsPage costsPage = new VehicleCostsPage();



    @When("User is on the home page user click on the main menu FLEET menu and VEHICLES COSTS on the submenu")
    public void user_is_on_the_home_page_user_click_on_the_main_menu_fleet_menu_and_vehicles_costs_on_the_submenu() {

        dashboard.fleetMenu.click();
        BrowserUtils.sleep(1);
        costsPage.vehicleCosts.click();

    }


    SubMenuOfFleetMenu subMenu = new SubMenuOfFleetMenu();
    @Then("User should be able to see three columns TYPE, TOTAL PRICE, DATE")
    public void user_should_be_able_to_see_three_columns_type_total_price_date() {

        Assert.assertEquals(costsPage.type.getText(), "TYPE");
        Assert.assertEquals(costsPage.totalPrice.getText(), "TOTAL PRICE");
        Assert.assertEquals(costsPage.date.getText(), "DATE");

    }

}
