package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage {
    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//a[@class='unclickable' and span[contains(text(),'Fleet')]]")
    WebElement fleet_dropdown;

    @FindBy (xpath = "//a[@href= 'entity/Extend_Entity_Carreservation' and span[contains(text(),'Vehicles' )]]")
    WebElement vehicles_page;



}
