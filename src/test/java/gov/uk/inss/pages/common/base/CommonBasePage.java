package gov.uk.inss.pages.common.base;

import gov.uk.inss.base.BasePage;
import org.junit.Assert;

public class CommonBasePage extends BasePage {


    public static void verifyHeader(String expectedHeader, String actualHeader){
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    public static void verifyTitle(String expectedTitle, String actualTitle){
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public static void verifyPage(String expectedPage, String actualPage){

    }
}
