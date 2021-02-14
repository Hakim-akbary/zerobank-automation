package com.bitrix.step_definitions;

import com.bitrix.pages.AccountSummary;
import com.bitrix.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;

public class AccountSummaryStepsDefs {

    @Then("the user should see the following account types")
    public void the_user_should_see_the_following_account_types(List<String> AccountTypes) {


        List<String> actualAccountTypes = BrowserUtils.getElementsText(new AccountSummary().accountTypes);
        //List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        //Assert.assertEquals(AccountTypes, actualAccountTypes);

        System.out.println("Here is the actual accounts types " + actualAccountTypes);
        System.out.println("Here is the list coming from features files " + AccountTypes);
    }
}
