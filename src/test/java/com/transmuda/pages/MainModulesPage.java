package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage {

    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(css = ".nav-multilevel.main-menu>li")
    public List<WebElement> mainModulesName;

}
