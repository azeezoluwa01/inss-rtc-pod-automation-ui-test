package gov.uk.inss.environments;

import gov.uk.inss.base.BasePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnvironmentManager extends BasePage {
    protected static final Logger LOGGER = LoggerFactory.getLogger("EnvironmentManager");
    public void getEnvironment() {

        String env = properties.getProperty("ENVIRONMENT_NAME");
        EnvironmentEnum environmentEnum = EnvironmentEnum.valueOf(env.toUpperCase());

        switch (environmentEnum) {
            case QA:
                driver.get(qa_env);
                break;
            case DEV:
                driver.get(dev_env);
                break;
            case PREPROD:
                driver.get(preprod_env);
                break;
            default:
                LOGGER.error("no environment found!");
                break;
        }
    }


}
