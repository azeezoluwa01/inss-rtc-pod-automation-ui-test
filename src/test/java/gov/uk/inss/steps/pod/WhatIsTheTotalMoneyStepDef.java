package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.WhatIsTheTotalMoney;
import io.cucumber.java.en.When;

public class WhatIsTheTotalMoneyStepDef {
    WhatIsTheTotalMoney whatIsTheTotalMoney = new WhatIsTheTotalMoney();

    @When("I enter amount owed in pounds")
    public void iEnterAmountOwedInPounds() {
        whatIsTheTotalMoney.enterAmountInPounds();
    }

    @When("I click debt not in pounds")
    public void iClickDebtNotInPounds() {
        whatIsTheTotalMoney.clickDebtNotInPounds();
    }


}
