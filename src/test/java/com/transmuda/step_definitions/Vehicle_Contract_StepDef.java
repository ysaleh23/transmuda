package com.transmuda.step_definitions;

import com.transmuda.pages.Vehicle_Contract_Page;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Vehicle_Contract_StepDef {

    Vehicle_Contract_Page contract_page = new Vehicle_Contract_Page();
    @And("the user navigates to the Vehicle Contracts page")
    public void theUserNavigatesToTheVehicleContractsPage() {
        contract_page.Fleet.click();
        BrowserUtils.sleep(3);
        contract_page.VehiclePage.click();
        BrowserUtils.sleep(3);
    }

    @Then("the Vehicle Contracts page is displayed successfully")
    public void theVehicleContractsPageIsDisplayedSuccessfully() {
        boolean actualPage = Driver.getDriver().getCurrentUrl().contains("Extend_Entity_VehicleContract");
        String expectedPage = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedPage, actualPage);
    }

    @Then("an access denied message is displayed")
    public void anAccessDeniedMessageIsDisplayed() {
        contract_page.not_permission.isDisplayed();
    }
}
