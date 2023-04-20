package gov.uk.inss.pages.pod.invite_pod_vote;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InvitePODAndVote extends BasePage {

    public InvitePODAndVote(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "WhyCompleting-2")
    public WebElement inviteAndVotePOD;

    public void clickInviteAndVotePOD(){
        inviteAndVotePOD.click();
    }
}
