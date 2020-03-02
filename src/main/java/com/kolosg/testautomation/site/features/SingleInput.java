package com.kolosg.testautomation.site.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleInput extends Navigation {

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input")
    WebElement singleInputMessageField;

    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")
    WebElement simpleFromDemoButton;

    @FindBy(xpath = "//*[@id='get-input']/button")
    WebElement showMessageButton;

    @FindBy(id = "display")
    WebElement displayedMessage;


    public SingleInput(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


     public WebElement singleInputTest(String message) {
        navigate(inputFormsButton);
        navigate(simpleFromDemoButton);
        singleInputMessageField.sendKeys(message);
        showMessageButton.click();
        waitUntilElementLoaded(displayedMessage);
        return displayedMessage;

     }

}
