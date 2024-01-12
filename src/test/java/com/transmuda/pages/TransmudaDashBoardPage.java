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

    //@FindBy(xpath = "//span[@class='title title-level-1']")
   // public WebElement fleetDropDownOptions;

    @FindBy(xpath ="//thead[@class='grid-header']//th" )
    public static List<WebElement> vehicleModelColumns;






    @FindBy(id="prependedInput")
    public WebElement userNames;



    @FindBy(id="prependedInput2")
    public WebElement passwords;

    @FindBy(name = "_submit")
    public WebElement submits;

}
