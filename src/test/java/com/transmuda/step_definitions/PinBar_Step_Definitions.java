package com.transmuda.step_definitions;

import com.transmuda.pages.PinBarPages_SW;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PinBar_Step_Definitions {

    private PinBarPages_SW pinbar = new PinBarPages_SW();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));


    @When("the user clicks the {string} link")
    public void the_user_clicks_the_link(String linkText) {

        BrowserUtils.sleep(2);
        pinbar.learnLink.click();
    }

    @Then("the user should see {string}")
    public void the_user_should_see(String expectedLearningLink) {

        WebElement learningLinkElement = wait.until(ExpectedConditions.visibilityOf(pinbar.howToUsePinBar));
        String actualLearningLink = learningLinkElement.getText().trim();
        Assert.assertEquals(expectedLearningLink, actualLearningLink);
    }

    @And("{string}Use the pin\" icon on the right top corner of page to create fast access link in the pinbar.")
    public void useThePinIconOnTheRightTopCornerOfPageToCreateFastAccessLinkInThePinbar(String arg0) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}

        assertTrue("The gold pin button icon is not displayed on the page",
                pinbar.goldPinButtonIcon.isDisplayed());


    }
    //this.driver = Driver.getDriver();
    // WebElement howToUsePinBar = driver.findElement(By.cssSelector(("a[href=\"/pinbar/help\"]")));
    //System.out.println("How to Use PinBar " + pinbar.howToUsePinBar.isDisplayed());


    @And("verify that users see an image on the page.")
    public void verify_that_users_see_an_image_on_the_page() {

        Assert.assertTrue("Its not displayed", pinbar.imageWebElement.isDisplayed());
/*                try {
                        String expectedImage = pinbar.usePinIcon.getAttribute("p");
                        WebElement actualImageElement = Driver.getDriver().findElement(By.xpath("//div[@class='clearfix']//p[1]"));
                        String actualImage = actualImageElement.getAttribute("p");

                        Assert.assertEquals(actualImage, expectedImage);
                } catch (Exception e) {
                        // Handle the exception or log it
                        e.printStackTrace();
                }*/
    }


}