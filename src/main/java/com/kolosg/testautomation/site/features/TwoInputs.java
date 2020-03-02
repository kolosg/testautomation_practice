package com.kolosg.testautomation.site.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwoInputs extends Navigation{
    @FindBy(id = "sum1")
    WebElement twoInputsAField;

    @FindBy(id = "sum2")
    WebElement twoInputsBField;

    @FindBy(xpath = "//*[@id='treemenu']/li/ul/li[1]/ul/li[1]/a")
    WebElement simpleFromDemoButton;

    @FindBy(xpath = "//*[@id='gettotal']/button")
    WebElement getTotalButton;

    @FindBy(id = "displayvalue")
    WebElement displayedValue;

    public TwoInputs(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement twoInputsTest(String valueA, String valueB) {
        navigate(inputFormsButton);
        navigate(simpleFromDemoButton);
        twoInputsAField.sendKeys(valueA);
        twoInputsBField.sendKeys(valueB);
        getTotalButton.click();
        waitUntilElementLoaded(displayedValue);
        return displayedValue;

    }
}
