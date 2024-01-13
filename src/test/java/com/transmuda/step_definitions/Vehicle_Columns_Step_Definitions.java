package com.transmuda.step_definitions;

import com.transmuda.pages.TransmudaDashBoardPage;
import com.transmuda.pages.VehicleModelPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Vehicle_Columns_Step_Definitions {

    TransmudaDashBoardPage transmudaDashBoardPage = new TransmudaDashBoardPage();
    VehicleModelPage modelPage = new VehicleModelPage();

    Actions actions;
    WebDriverWait wait;


    @When(": Click on the fleet tab when on home page")
    public void click_on_the_fleet_tab_when_on_home_page() {
        actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        actions.moveToElement(transmudaDashBoardPage.fleetDropDownOptions).perform();
        BrowserUtils.sleep(3);
    }

    @When(": Click on the vehicle model")
    public void click_on_the_vehicle_model() {
        actions = new Actions(Driver.getDriver());
        wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(transmudaDashBoardPage.vehicleModelLink));
        transmudaDashBoardPage.vehicleModelLink.click();

    }

    @Then(": 	Verify that the column names")
    public void verify_that_the_column_names(List<String> expectedColumnHeaderNames) {
        BrowserUtils.sleep(3);
        List<String> actualColumnHeaderNames = BrowserUtils.getElementsText(modelPage.vehicleModelColumns);
       // BrowserUtils.sleep(3);
        Assert.assertEquals(expectedColumnHeaderNames,actualColumnHeaderNames);

    }

    @Then(": User should see the following error message “You do not have permission to perform this action.”")
    public void user_should_see_the_following_error_message_you_do_not_have_permission_to_perform_this_action() {

        String expectedErrorMessage = "You do not have permission to perform this action.";
        String actualErrorMessage = transmudaDashBoardPage.driversErrorMessage.getText();

        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }


}
