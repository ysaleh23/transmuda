package com.transmuda.step_definitions;

import com.transmuda.pages.CalenderEventPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalendarEvent_StepDefinitions {
    CalenderEventPage eventPage = new CalenderEventPage();
    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Given("User hovers over  the Activities tab.")
    public void user_hovers_over_the_activities_tab() {
        BrowserUtils.sleep(2);
        actions.moveToElement(eventPage.activitiesTab).perform();

    }
    @When("User will click on the Calendar Events option from dropdown.")
    public void user_will_click_on_the_calendar_events_option_from_dropdown() {
        wait.until(ExpectedConditions.visibilityOf(eventPage.calendarEventOption)).click();

    }
    @When("User will click on the Create Calendar Event button")
    public void user_will_click_on_the_create_calendar_event_button() {
        wait.until(ExpectedConditions.elementToBeClickable(eventPage.createCalendarEventButton));
        BrowserUtils.sleep(4);
        eventPage.createCalendarEventButton.click();
    }
    @When("User will click on the repeat button")
    public void user_will_click_on_the_repeat_button() {
        eventPage.repeatButton.click();
    }

    @Then("Verify that users see the number {int} by default in the Repeat Every input option.")
    public void verify_that_users_see_the_number_by_default_in_the_repeat_every_input_option(int expectedDisplayedNumber) {

        String expectedDisplayedNum = expectedDisplayedNumber + "";
        String actualDisplayedNumber = eventPage.repeatEveryInputBoxWithNumber1.getAttribute("value");

        Assert.assertEquals(expectedDisplayedNum,actualDisplayedNumber);

    }

    @When("User will clear the number {int} from the Repeat Every input option")
    public void user_will_clear_the_number_from_the_repeat_every_input_option(Integer int1) {
        eventPage.repeatEveryInputBoxWithNumber1.clear();
    }

    @Then("Verify that users see the error message {string} when the Calendar event Repeat Every field is cleared.")
    public void verify_that_users_see_the_error_message_when_the_calendar_event_repeat_every_field_is_cleared(String expectedDisplayedErrorMessage) {

        String actualDisplayedErrorMessage = eventPage.thisValueShouldNotBeBlankErrorMessage.getText();

        Assert.assertEquals(expectedDisplayedErrorMessage,actualDisplayedErrorMessage);

    }




    //Maksym part START

    @When("the user navigates to the Description field within the Iframe")
    public void the_user_navigates_to_the_description_field_within_the_iframe() {
       BrowserUtils.sleep(2);
       Driver.getDriver().switchTo().frame(eventPage.iFrame);
    }

    @And("user types {string} text in the Description field.")
    public void userTypesTextInTheDescriptionField(String given) {
        eventPage.textField.click();
        eventPage.textField.sendKeys(given);
    }
    @Then("the {string} in the interface should be the same as {string}.")
    public void theInTheInterfaceShouldBeTheSameAs(String result, String given) {

        result = eventPage.textField.getText();
        Assert.assertEquals(result, given);
    }

    // Maksym part finish

    // Basim part start

    @When("User enter less than {int}")
    public void user_enter_less_than(Integer int1) {
        BrowserUtils.sleep(2);
        eventPage.repeatEveryInputBoxWithNumber1.clear();
        eventPage.repeatEveryInputBoxWithNumber1.sendKeys("0" + Keys.ENTER);
    }
    @When("users should see {string}")
    public void users_should_see(String expectedErrorMessage) {
        BrowserUtils.sleep(2);
        String actualErrorMessage = eventPage.errorMessage.getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }
    @When("user will clear the previous inputted value")
    public void user_will_clear_the_previous_inputted_value() {
        BrowserUtils.sleep(2);
        eventPage.repeatEveryInputBoxWithNumber1.clear();
    }
    @When("if User enter more than {int}")
    public void if_user_enter_more_than(Integer int1) {
        BrowserUtils.sleep(2);
        eventPage.repeatEveryInputBoxWithNumber1.clear();
        eventPage.repeatEveryInputBoxWithNumber1.sendKeys("110" + Keys.ENTER);
    }
    //Basim part finish's
}
