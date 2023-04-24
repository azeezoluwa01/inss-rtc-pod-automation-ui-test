package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DoesThisPersonOweAnyInterest extends BasePage {

    public DoesThisPersonOweAnyInterest(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(how = How.TAG_NAME, using = "li")
    public WebElement header;


}
