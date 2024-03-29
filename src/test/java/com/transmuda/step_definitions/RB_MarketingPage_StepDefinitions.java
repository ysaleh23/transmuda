package com.transmuda.step_definitions;

import com.transmuda.pages.RB_MarketingPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RB_MarketingPage_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    RB_MarketingPage rbMarketingPage = new RB_MarketingPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("user select Marketing dropDown and select Campaigns")
    public void userSelectMarketingDropDownAndSelectCampaigns() {
        BrowserUtils.sleep(2);
        actions.moveToElement(rbMarketingPage.MarketingDropDown).perform();
        wait.until(ExpectedConditions.visibilityOf(rbMarketingPage.CampaignsButton)).click();


    }

    @When("user click Filters Button")
    public void userClickFiltersButton() {
        rbMarketingPage.FilterButton.click();
        BrowserUtils.sleep(3);
    }




    @Then("user pres manage filters dropdown menu")
    public void userPresManageFiltersDropdownMenu() {
        rbMarketingPage.ManageFiltersDropDownButton.click();
        BrowserUtils.sleep(2);

       rbMarketingPage.manageFilterNameWebElement.click();
        BrowserUtils.sleep(2);

rbMarketingPage.manageFilterCode.click();
        BrowserUtils.sleep(2);

rbMarketingPage.manageFilterStartDate.click();



        BrowserUtils.sleep(2);
    }


}