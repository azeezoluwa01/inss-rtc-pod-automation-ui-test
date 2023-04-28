package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationCodes extends BasePage {

    public RegistrationCodes(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "invitation-code")
    private WebElement invitationCode;

    @CacheLookup
    @FindBy(how = How.ID, using = "insolvency-name")
    private WebElement insolvencyNumber;

    public void enterRegistrationCodes(){
        invitationCode.sendKeys("1234");
        insolvencyNumber.sendKeys("1234");
    }
}
