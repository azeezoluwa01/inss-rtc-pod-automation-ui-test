package gov.uk.inss.pages.pod.invite_pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InvitePODAndGetPayment extends BasePage {

    public InvitePODAndGetPayment(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "WhyCompleting")
    public WebElement invitePOD;


    public void clickInvitePOD(){
        invitePOD.click();
    }


}
