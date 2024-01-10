package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='unclickable' and span[contains(text(),'Fleet')]]")
    public WebElement fleetMenu;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesLink;


}
