package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TransmudaDashBoardPage {

    public TransmudaDashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[.='Vehicles Model']")
    public  WebElement vehicleModelLink;



    @FindBy(xpath = "//a[@class='unclickable' and span[contains(text(),'Fleet')]]")
    public WebElement fleetDropDownOptions;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement driversErrorMessage;


}
