package gov.uk.inss.config;

import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.Callable;

public class ConfigReader {

    private static final String PREFIX = "TEST.";

    public static String read(Properties configFileProperties, String key){
        return readJavaProperty(PREFIX + key)
                .orElse(readEnvVariable(PREFIX + key)
                        .orElse(readConfigFile(configFileProperties, key)
                                .orElse(null)));
    }

    private static Optional<String> readJavaProperty(String key){
        return optionalValue(() -> System.getProperty(key));
    }

    private static Optional<String> readEnvVariable(String key){
        return optionalValue(() -> System.getenv(key));
    }

    private static Optional<String> readConfigFile(Properties configFileProperties, String key){
        return optionalValue(() -> configFileProperties.getProperty(key));
    }

    private static Optional<String> optionalValue(Callable<String> func) {
        try{
            String value = func.call();
            return Optional.ofNullable(value);
        }
        catch (Exception e){
            return Optional.empty();
        }
    }
}
