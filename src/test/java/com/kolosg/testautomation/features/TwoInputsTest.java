package com.kolosg.testautomation.features;

import com.kolosg.testautomation.site.features.SingleInput;
import com.kolosg.testautomation.site.features.TwoInputs;
import com.kolosg.testautomation.utility.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoInputsTest {

    private TwoInputs twoInputs;
    private static final String TEST_DATA_SOURCE = "/two_inputs.csv";

    @BeforeAll
    static void init() {
        Util.setDriverPath();
    }

    @BeforeEach
    void setUp() {
        twoInputs = new TwoInputs(Util.createDriver("Chrome"));
        twoInputs.getDriver().get(Util.getEnvironmentVariable("base_url"));
    }

    @AfterEach
    void tearDown() {
        twoInputs.quitDriver();
    }

    @ParameterizedTest
    @CsvFileSource(resources = TEST_DATA_SOURCE, numLinesToSkip = 1)
    void validateSingleInputTest(String valueA, String valueB, String expected_message) {
        assertEquals(expected_message, twoInputs.twoInputsTest(valueA, valueB).getText());
    }

}
