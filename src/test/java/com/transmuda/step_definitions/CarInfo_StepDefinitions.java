package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehiclesPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections.list.TreeList;
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
    List<WebElement> actual_three_dots_icons_webElements = new TreeList();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @When("user hover the mouse over the three dots ...")
    public void user_hover_the_mouse_over_the_three_dots() {

        for (WebElement each_three_dots_WebElement : vehiclesPage.listOf_three_dots_webElements) {
            for (WebElement each_listOfThreeIcon : vehiclesPage.list_of_three_icons) {
                actual_three_dots_webElements.add(each_three_dots_WebElement);
                actual_three_dots_icons_webElements.add((each_listOfThreeIcon));
            }
        }
        for (int i = 0; i < actual_three_dots_webElements.size(); i++) {
            for (int j = 0; j < actual_three_dots_icons_webElements.size(); j++) {
                actions.moveToElement(actual_three_dots_webElements.get(i)).click().perform();
                wait.until(ExpectedConditions.visibilityOf(actual_three_dots_icons_webElements.get(i)));
                Assert.assertTrue(actual_three_dots_icons_webElements.get(i).isDisplayed());
            }
        }

    }
}



