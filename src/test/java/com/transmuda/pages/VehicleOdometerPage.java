package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import io.cucumber.java.tr.Ve;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//span[.='Vehicle Odometer']")
    public WebElement vehicleOdometer;

    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
      public WebElement errorMessage;

    @FindBy (xpath = "//input[@value='1']")
    public WebElement pageNumber;

    @FindBy (xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageNumber;

}
