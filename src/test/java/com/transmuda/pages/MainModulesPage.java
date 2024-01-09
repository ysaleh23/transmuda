package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage {

    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
