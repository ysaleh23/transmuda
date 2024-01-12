package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinBarPages_SW {
    public PinBarPages_SW(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='pin-bar-empty']>a")
    public WebElement learnLink;


    @FindBy (xpath = "//div[@class='clearfix']//p[1]")
    public WebElement usePinIcon;

    @FindBy (css = "button[title=\"Pin/unpin the page\"]")
    public WebElement goldPinButtonIcon;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinBar;

}
