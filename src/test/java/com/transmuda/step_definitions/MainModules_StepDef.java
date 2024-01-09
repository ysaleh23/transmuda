package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.MainModulesPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainModules_StepDef{
    LoginPage loginPage = new LoginPage();
    MainModulesPage mainModulesPage = new MainModulesPage();
    @Given("the user logs in with valid credentials {string}, {string}")
    public void the_user_logs_in_with_valid_credentials(String username, String password) {
        loginPage.login(username,password);
    }
    @When("the user navigates to the main page")
    public void the_user_navigates_to_the_main_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        BrowserUtils.verifyTitle("Dashboard");

    }
    @Then("the user should see the following modules:")
    public void the_user_should_see_the_following_modules(List<String> expectedModulesName) {
       List<String> actualModulesName= BrowserUtils.getElementsText(mainModulesPage.mainModulesName);
       Assert.assertEquals(expectedModulesName,actualModulesName);
    }

    @Given("the user can log in with valid credentials {string},{string}")
    public void the_user_can_log_in_with_valid_credentials(String username, String password) {
        loginPage.login(username,password);
    }


}
