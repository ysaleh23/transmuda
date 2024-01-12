package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage {

public VehicleCostsPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(linkText = "Vehicle Costs")
    public WebElement vehicleCosts;

    @FindBy (xpath = "(//table[@class='grid table-hover table table-bordered table-condensed']/thead/tr)[2]")
    public List<WebElement> vehicleCostFilterHeadlines;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[3]/a")
    public WebElement totalPrice;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[4]/a")
    public WebElement date;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[2]/a")
    public WebElement type;

}
