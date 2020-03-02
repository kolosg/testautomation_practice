package com.kolosg.testautomation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Properties;

public class Util {

    public static WebDriver createDriver(String driverType) {
        WebDriver driver;
        if(driverType.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else if (driverType.equalsIgnoreCase("Opera")) {
            driver = new OperaDriver();
        } else if (driverType.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("No such driver!");
        }
        return driver;
    }

    public static void setDriverPath() {
        String driverProperty = getEnvironmentVariable("DRIVER_PROPERTY");
        String driverPath = getEnvironmentVariable("DRIVER_PATH");
        System.setProperty(driverProperty, driverPath);
    }

    public static String getEnvironmentVariable(String variableName) {
        String variable = System.getenv(variableName.toUpperCase());
        if (variable == null) {
            throw new IllegalArgumentException("Environment variable not found!");
        }
        return variable;
    }

}
