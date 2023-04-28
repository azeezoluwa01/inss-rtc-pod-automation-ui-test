package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dashboard extends BasePage {

    public Dashboard(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Start')]")
    private WebElement start;

    public void clickStart(){
        start.click();
    }
}
