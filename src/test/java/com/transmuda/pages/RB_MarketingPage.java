package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RB_MarketingPage {

    public RB_MarketingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[6]")
    public WebElement MarketingDropDown;


    @FindBy(xpath = "(//span[text()='Campaigns'])[1]")
    public WebElement CampaignsButton;


    @FindBy(xpath = "//div[@class='filter-container']/select")
    public WebElement ManageFiltersDropDown;

    @FindBy(xpath = "//div[@class='filter-container']/button")
    public WebElement ManageFiltersDropDownButton;


    @FindBy(xpath = "//*[@title='Filters']")
    public WebElement FilterButton;


    //label[@title='Name']
    @FindBy(xpath = "//label[@title='Name']")
    public WebElement manageFilterNameWebElement;


}
