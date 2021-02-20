package com.bitrix.step_definitions;

import com.bitrix.pages.AccountSummary;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;

public class AccountSummaryStepsDefs {

    @Then("the user should see the following account types")
    public void the_user_should_see_the_following_account_types(List<String> AccountTypes) {


        BrowserUtils.waitForVisibility(new AccountSummary().table, 5);

       List<String> actualAccountTypes = BrowserUtils.getElementsText(new AccountSummary().accountTypes);


        Assert.assertEquals(AccountTypes, actualAccountTypes);

        System.out.println("Here is the actual accounts types " + actualAccountTypes);
        System.out.println("Here is the list coming from features files " + AccountTypes);
    }

    @Then("credit account table must have following columns")
    public void credit_account_table_must_have_following_columns(List<String> expectedHeaders) {

        AccountSummary accountSummary = new AccountSummary();

        BrowserUtils.waitForVisibility(accountSummary.trigger, 4);

        List<String> actualHeaders = BrowserUtils.getElementsText(accountSummary.creditAccountsTable);

        Assert.assertEquals(expectedHeaders, actualHeaders);

        System.out.println("Here are the list of actual headers: " + actualHeaders);





    }

}
