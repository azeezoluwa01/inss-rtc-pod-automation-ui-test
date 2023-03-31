package gov.uk.inss.pageEvents;

import gov.uk.inss.helper.UtilsHelper;
import gov.uk.inss.pageObjects.HomePageObjects;
import org.junit.Assert;

public class HomePageEvents {
    UtilsHelper utilsHelper = new UtilsHelper();
    public void clickButton(){
        utilsHelper.getWebElement("XPATH", HomePageObjects.button);
    }
}
