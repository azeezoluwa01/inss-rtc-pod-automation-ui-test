package gov.uk.inss.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class TestConfig {

    protected static final Logger LOGGER = LoggerFactory.getLogger("TestConfig.class");
    private Properties config;
    private static String browser;
    private Properties testDataConfig;
    private static TestConfig testConfigInstance;


    public static TestConfig getTestDataConfig() {
        if (testConfigInstance == null) {
            testConfigInstance = new TestConfig();
        }
        return testConfigInstance;
    }

    public String getTestProperty(String propertyName) {
        String propertValue;
        try {
            propertValue = System.getenv(propertyName);
            if (propertValue == null) {
                propertValue = ConfigReader.read(config, propertyName);
            }
            if (propertValue == null) {
                LOGGER.error(String.format("Property %s not set. Please check systems env variable or config file", propertyName));
            }
        } catch (Exception e) {
            LOGGER.error(String.format("Unable to obtain test config relating to: %s", propertyName));
            return null;
        }
        LOGGER.info(String.format("%s flag set to: %s", propertyName, propertValue));
        return propertValue;
    }

    public String getBrowser() {
        browser = this.getTestProperty("BROWSER_NAME");
        LOGGER.info(String.format("Opening %s for test execution ", browser));
        return browser;
    }
}
