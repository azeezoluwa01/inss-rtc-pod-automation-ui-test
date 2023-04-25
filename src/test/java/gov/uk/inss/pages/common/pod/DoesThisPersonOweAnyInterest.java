package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DoesThisPersonOweAnyInterest extends BasePage {

    public DoesThisPersonOweAnyInterest() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "interest")
    private WebElement yes;

    @CacheLookup
    @FindBy(how = How.ID, using = "interest-2")
    private WebElement no;

//    @CacheLookup
//    @FindBy(how = How.CLASS_NAME, using = "govuk-label govuk-label--l")
//    public WebElement header3;

    public void clickYes() {
        yes.click();
    }

    public void clickNo() {
        no.click();
    }

    public void selectWhetherInterestIsOwed(String interest) {
        if (interest.equalsIgnoreCase("yes")) {
            clickYes();
        } else if (interest.equalsIgnoreCase("no")) {
            clickNo();
        } else throw new RuntimeException("You must answer yes or no to POD interst owed question");
    }

//    public String getPageHeader3(){
//        return header3.getText();
//    }


}
