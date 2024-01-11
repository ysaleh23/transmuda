package com.transmuda.step_definitions;

import com.transmuda.pages.CalenderEventPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalendarEvent_StepDefinitions_yousef {
    CalenderEventPage eventPage = new CalenderEventPage();
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
        wait.until(ExpectedConditions.elementToBeClickable(eventPage.createCalendarEventButton)).click();

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

}
