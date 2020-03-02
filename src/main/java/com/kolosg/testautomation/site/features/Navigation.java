package com.kolosg.testautomation.site.features;

import com.kolosg.testautomation.utility.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Navigation extends FeatureBuild{
    @FindBy(xpath = "//*[@id='treemenu']/li/ul/li[1]/a")
    protected WebElement inputFormsButton;

    @FindBy(xpath = "//*[@id='treemenu'']/li/ul/li[1]/ul/li[1]/a")
    protected WebElement simpleFormDemoButton;

    @FindBy(xpath = "//*[@id='treemenu']/li/ul/li[1]/ul/li[2]/a")
    protected WebElement checkBoxDemoButton;

    @FindBy(xpath = "//*[@id='treemenu']/li/ul/li[1]/ul/li[4]/a")
    protected WebElement selectDropdownListDemoButton;

    @FindBy(xpath = "//*[@id='treemenu']/li/ul/li[1]/ul/li[3]/a")
    protected WebElement radioButtonsDemoButton;

    protected Navigation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigate(WebElement webElement) {
        waitUntilElementClickable(webElement);
        webElement.click();
    }
}
