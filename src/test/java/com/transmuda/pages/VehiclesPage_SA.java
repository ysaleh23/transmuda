package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage_SA {

    public VehiclesPage_SA(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button.btn.btn-default.btn-small.dropdown-toggle>input")
    public WebElement selectAllCheckbox;

    @FindBy(xpath = "//input[@tabindex='-1'] ")
    public List<WebElement> checkboxes;
}
