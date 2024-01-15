package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.TransmudaDashBoardPage;
import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import javax.swing.*;
import javax.swing.plaf.ActionMapUIResource;
import java.time.Duration;

public class VehicleOdometer_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    Actions actions = new Actions(Driver.getDriver());
    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    TransmudaDashBoardPage transmudaDashBoardPage = new TransmudaDashBoardPage();



    @Given("user is logged in with username {string} and password {string}")
    public void user_is_logged_in_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @When("user hovers over Fleet module")
    public void user_hovers_over_fleet_module() {
        BrowserUtils.waitForVisibility(dashboardPage.fleetMenu, 10);
        actions.moveToElement(dashboardPage.fleetMenu).perform();
    }

    @When("user clicks Vehicle Odometer")
    public void user_clicks_vehicle_odometer() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleOdometerPage.vehicleOdometer).click().perform();
    }

    @Then("user should see message: “You do not have permission to perform this action.”")
    public void userShouldSeeMessageYouDoNotHavePermissionToPerformThisAction() {
        String expectedErrorMessage = "You do not have permission to perform this action.";
        String actualErrorMessage = vehicleOdometerPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
     //   System.out.println("actualErrorMessage = " + actualErrorMessage);
    }

    @Then("user should see the default page as 1")
    public void user_should_see_the_default_page_as() {
        String expectedPageNumber = "1";
        BrowserUtils.waitForVisibility(vehicleOdometerPage.pageNumber, 10);
        String actualPageNumber = vehicleOdometerPage.pageNumber.getAttribute("value");
        Assert.assertEquals(expectedPageNumber, actualPageNumber);
      //  System.out.println("actualPageNumber = " + actualPageNumber);
    }

    @Then("user should see the View Per Page is 25 by default")
    public void user_should_see_the_view_per_page_is_by_default() {
        String expectedViewPerPageNumber = "25";
        BrowserUtils.waitForVisibility(vehicleOdometerPage.viewPerPageNumber, 10);
        String actualViewPerPageNumber = vehicleOdometerPage.viewPerPageNumber.getText();
        Assert.assertEquals(expectedViewPerPageNumber, actualViewPerPageNumber);
      //  System.out.println("actualViewPerPageNumber = " + actualViewPerPageNumber);

    }


}
