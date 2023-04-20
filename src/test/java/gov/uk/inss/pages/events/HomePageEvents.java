package gov.uk.inss.pages.events;

import gov.uk.inss.helper.UtilsHelper;
import gov.uk.inss.pages.objects.HomePageObjects;

public class HomePageEvents {
    UtilsHelper utilsHelper = new UtilsHelper();
    public void clickButton(){
        utilsHelper.getWebElement("ID", HomePageObjects.button);
    }

    public void clickElement(){
        utilsHelper.getWebElement("ID", HomePageObjects.element);
    }
}
