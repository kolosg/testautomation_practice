package com.kolosg.testautomation.site.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox extends Navigation{
    @FindBy(id = "isAgeSelected")
    WebElement simpleCheckbox;

    @FindBy(id = "txtAge")
    WebElement displayedMessage;

    public CheckBox(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement checkBoxText() {
        navigate(inputFormsButton);
        navigate(checkBoxDemoButton);
        simpleCheckbox.click();
        waitUntilElementLoaded(displayedMessage);
        return displayedMessage;

    }
}
