package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehiclesPage {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//tr[@class='grid-row row-click-action']/td[21])")
    public List<WebElement> listOf_three_dots_webElements;

    @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']/li/a")
    public List<WebElement> list_of_three_icons;

    @FindBy(xpath = "(//div[@class='dropdown open'])")
    public WebElement three_dots_dropdown_isOpen;

    @FindBy(xpath = "//a[.//i[@class='fa-trash-o hide-text']]")
    public WebElement view_icons;
    @FindBy(css = "html > body > ul > li > ul > li:nth-of-type(2) > a")
    public WebElement edit_icons;
    @FindBy(xpath = "(//a[@title='Delete'])")
    public WebElement delete_icons;
    @FindBy(xpath = "//label[.='Total of 5 records']")
    public WebElement number_of_rows;

    public int number_of_record() {
        String string_records = number_of_rows.getText().replaceAll("[^0-9]", "");
        return Integer.parseInt(string_records);
    }

//  *************************************************   SIMA  **********************************************************

    @FindBy(css = "button.btn.btn-default.btn-small.dropdown-toggle>input")
    public WebElement selectAllCheckbox;

    @FindBy(xpath = "//input[@tabindex='-1'] ")
    public List<WebElement> checkboxes;


}


