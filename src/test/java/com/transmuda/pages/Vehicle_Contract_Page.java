package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vehicle_Contract_Page {
    public  Vehicle_Contract_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']")
    public WebElement Fleet;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement VehiclePage;


    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement not_permission;








}
