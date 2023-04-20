package gov.uk.inss.pages.pod.no_invite_pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NoInvitePOD extends BasePage {

    public NoInvitePOD(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "WhyCompleting-3")
    public WebElement noInvitePOD;

    public void clickNoInvitePOD(){
        noInvitePOD.click();
    }

}
