package com.kolosg.testautomation.features;

import com.kolosg.testautomation.site.features.CheckBox;
import com.kolosg.testautomation.utility.Util;
import org.junit.jupiter.api.*;

public class CheckBoxTest {
    private CheckBox checkBox;

    @BeforeAll
    static void init() {
        Util.setDriverPath();
    }

    @BeforeEach
    void setUp() {
        checkBox = new CheckBox(Util.createDriver("Chrome"));
        checkBox.getDriver().get(Util.getEnvironmentVariable("base_url"));
    }

    @AfterEach
    void tearDown() {
        checkBox.quitDriver();
    }

    @Test
    void validateSingleInputTest() {
        Assertions.assertNotNull(checkBox.checkBoxText().getText());
    }

}
