package gov.uk.inss.config;

<<<<<<< HEAD
=======
import gov.uk.inss.base.BasePage;
>>>>>>> cf6425264699513621c73f4a89a16d2eb52837ac
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
<<<<<<< HEAD
=======
import java.io.FileNotFoundException;
>>>>>>> cf6425264699513621c73f4a89a16d2eb52837ac
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    protected static final Logger LOGGER = LoggerFactory.getLogger("ConfigFileReader.class");
    public static final String propertyPath = "src/test/resources/config/TestConfig.properties";
    public static Properties properties;

    public ConfigFileReader() {
        try {
            properties = new Properties();
            BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.trace("Not found in property file " + propertyPath);
        }
    }

}
