package com.bitrix.step_definitions;

import com.bitrix.pages.AccountActivity;
import com.bitrix.pages.AccountSummary;
import com.bitrix.pages.Login;
import com.bitrix.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FindTransactionsStepsDefs {

    @Given("The user acccesses the find transaction tab")
    public void the_user_acccesses_the_find_transaction_tab() {
        Login login = new Login();
        login.login();

        AccountSummary accountSummary = new AccountSummary();
        accountSummary.accountActivityTab.click();

        AccountActivity accountActivity = new AccountActivity();
        accountActivity.FindTransactionsTab.click();



    }

    @When("the user enters data range from {string} to {string}")
    public void the_user_enters_data_range_from_to(String fromThisDate, String toThisDate) {

        AccountActivity accountActivity = new AccountActivity();
        BrowserUtils.waitForVisibility(accountActivity.fromDateBox, 3);
        accountActivity.fromDateBox.sendKeys(fromThisDate);
        accountActivity.toDateBox.sendKeys(toThisDate);
        accountActivity.findButton.click();


         }

    @Then("results should be only show transactions dates between {string} to {string}")
    public void results_should_be_only_show_transactions_dates_between_to(String fromThisDate, String toThisDate) throws ParseException {

            AccountActivity accountActivity = new AccountActivity();

            BrowserUtils.waitForPresenceOfElement(By.xpath("(//table[@class='table table-condensed table-hover'])[2]/tbody/tr/td[1]"), 3000);
            List<String> actualDate = BrowserUtils.getElementsText(accountActivity.searchResultTable);

            SimpleDateFormat fromDate = new SimpleDateFormat("yyyy-mm-dd");
            Date Start = fromDate.parse(fromThisDate);

            SimpleDateFormat toDate = new SimpleDateFormat("yyyy-mm-dd");
            Date End = fromDate.parse(toThisDate);




            for (String eachDate : actualDate) {

                SimpleDateFormat dd = new SimpleDateFormat("yyyy-mm-dd");
                Date dated = dd.parse(eachDate);

                Assert.assertTrue("Comparing the expected date vs actual date", Start.compareTo(dated)<=0 && End.compareTo(dated)>=0);

            }





    }


}
