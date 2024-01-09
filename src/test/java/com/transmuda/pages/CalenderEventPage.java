package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderEventPage {

    public CalenderEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@class='title title-level-1']/i[@class='fa-puzzle-piece menu-icon']")
    public WebElement activitiesTab;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventOption;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;

    @FindBy(id = "recurrence-repeat-view264")
    public WebElement repeatButton;

    @FindBy(xpath = "//input[@fdprocessedid='nr9wie']")
    public WebElement repeatEveryInputBoxWithNumber1;

    @FindBy(xpath = "//span[@class='validation-failed']/span[.='This value should not be blank.']")
    public WebElement thisValueShouldNotBeBlankErrorMessage;

//    @FindBy()
//    public WebElement
//
//    @FindBy()
//    public WebElement

}
