package com.kolosg.testautomation.site.features;

import com.kolosg.testautomation.utility.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class FeatureBuild{

    protected WebDriver driver;
    protected WebDriverWait wait;

    private static final int TIMEOUT_FOR_LOADING = Integer.parseInt(Util.getEnvironmentVariable("timeout_limit"));

    protected FeatureBuild(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT_FOR_LOADING);
    }

    protected void waitUntilElementClickable(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void waitUntilElementLoaded(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }
}
