package gov.uk.inss.pages.common.base;

import gov.uk.inss.base.BasePage;
import org.junit.Assert;

public class CommonBasePage extends BasePage {

    public static void verifyHeader(String expectedHeader, String ActualHeader){
        Assert.assertEquals(expectedHeader, ActualHeader);
    }

    public static void verifyTitle(String expectedTitle, String ActualTitle){
        Assert.assertEquals(expectedTitle, ActualTitle);
    }
}
