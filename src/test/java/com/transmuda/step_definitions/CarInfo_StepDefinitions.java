package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CarInfo_StepDefinitions {


    VehiclesPage vehiclesPage = new VehiclesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    Actions actions = new Actions(Driver.getDriver());
    List<WebElement> actual_three_dots_webElements = new ArrayList<>();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("User hover over Fleet dropdown and selects Vehicles page option")
    public void user_hover_over_fleet_dropdown_and_selects_vehicles_page_option() {
//        BrowserUtils.sleep(3);
//        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.fleet_dropdown));
//        vehiclesPage.fleet_dropdown.click();
//        BrowserUtils.sleep(1);
//        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.vehicles_page));
//        vehiclesPage.vehicles_page.click();
//        BrowserUtils.sleep(2);
    }

    @When("user hover the mouse over the three dots ...")
    public void user_hover_the_mouse_over_the_three_dots() {

        for (WebElement each_three_dots_WebElement : vehiclesPage.listOf_three_dots_webElements) {
            actual_three_dots_webElements.add(each_three_dots_WebElement);
        }


        actions.moveToElement(actual_three_dots_webElements.get(0)).clickAndHold().perform();
        BrowserUtils.sleep(1);
    }


    @Then("users sees view, edit, delete options")
    public void users_sees_view_edit_delete_options() {

        BrowserUtils.waitForClickablility(vehiclesPage.view_icons,10);
        BrowserUtils.waitForClickablility(vehiclesPage.edit_icons,10);
        BrowserUtils.waitForClickablility(vehiclesPage.delete_icons,10);
        Assert.assertTrue(vehiclesPage.view_icons.isDisplayed());
        Assert.assertTrue(vehiclesPage.edit_icons.isDisplayed());
        Assert.assertTrue(vehiclesPage.delete_icons.isDisplayed());
        actions.release();

        }

    }

