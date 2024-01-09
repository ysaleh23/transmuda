package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user_count")
    public WebElement userAmount;


    @FindBy(id="prependedInput")
    public WebElement userNames;



    @FindBy(id="prependedInput2")
    public WebElement passwords;

    @FindBy(name = "_submit")
    public WebElement submits;
}
