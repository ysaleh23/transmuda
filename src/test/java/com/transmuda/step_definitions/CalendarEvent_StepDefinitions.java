package com.transmuda.step_definitions;

import com.transmuda.pages.CalenderEventPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));
        BrowserUtils.sleep(2);
        actions.moveToElement(eventPage.activitiesTab).perform();
    }
    @When("User will click on the Calendar Events option from dropdown.")
    public void user_will_click_on_the_calendar_events_option_from_dropdown() {
        BrowserUtils.sleep(2);
        eventPage.calendarEventOption.click();
    }
    @When("User will click on the Create Calendar Event button")
    public void user_will_click_on_the_create_calendar_event_button() {
        eventPage.createCalendarEventButton.click();
    }
    @When("User will click on the repeat button")
    public void user_will_click_on_the_repeat_button() {
        eventPage.repeatButton.click();
    }

    @Then("Verify that users see the number {int} by default in the Repeat Every input option.")
    public void verify_that_users_see_the_number_by_default_in_the_repeat_every_input_option(int expectedDisplayedNumber) {

        int actualDisplayedNumber = Integer.parseInt(eventPage.repeatEveryInputBoxWithNumber1.getText());
        Assert.assertEquals(expectedDisplayedNumber, actualDisplayedNumber);
    }

    @When("User will clear the number {int} from the Repeat Every input option")
    public void user_will_clear_the_number_from_the_repeat_every_input_option(Integer int1) {
        eventPage.repeatEveryInputBoxWithNumber1.clear();
    }

    @Then("Verify that users see the error message {string} when the Calendar event Repeat Every field is cleared \\(delete the number {int}).")
    public void verifyThatUsersSeeTheErrorMessageWhenTheCalendarEventRepeatEveryFieldIsClearedDeleteTheNumber(String expectedErrorMessage, int expectedInputNumber) {

        String actualErrorMessage = eventPage.thisValueShouldNotBeBlankErrorMessage.getText();
        int actualInputNumber = Integer.parseInt(eventPage.repeatEveryInputBoxWithNumber1.getText());


        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        if (expectedInputNumber != 1) {
            Assert.assertEquals(expectedInputNumber, actualInputNumber);
        }


    }
}
