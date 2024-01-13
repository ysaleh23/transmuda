package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModelPage {

    public VehicleModelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




        //tr[@class='grid-header-row']//th

    @FindBy(xpath ="//thead[@class='grid-header']//a[@class='grid-header-cell__link']" )
    public  List<WebElement> vehicleModelColumns;



}
