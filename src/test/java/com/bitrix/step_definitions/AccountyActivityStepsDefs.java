package com.bitrix.step_definitions;

import com.bitrix.pages.AccountSummary;
import com.bitrix.pages.Login;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountyActivityStepsDefs {


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        Login login = new Login();
        BrowserUtils.waitForVisibility(login.signInButton, 5);
        login.signInButton.click();


      login.login();


    }


    @When("the user clicks on {string} on the Account Summary page Then the {string} page should be displayed")
    public void the_user_clicks_on_on_the_Account_Summary_page_Then_the_page_should_be_displayed(String link, String pageTitle) {

        AccountSummary accountSummary = new AccountSummary();


        Driver.get().findElement(By.xpath("//a[text()='"+link+"']")).click();

        Assert.assertTrue(Driver.get().getTitle().contains("Account Activity"));

    }


    @When("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String firstSelectedOption) {
        AccountSummary accountSummary = new AccountSummary();
        Select accountDropdown = new Select(accountSummary.accountDropDown);


        Assert.assertTrue(accountDropdown.getFirstSelectedOption().getText().equals(firstSelectedOption));
    }





}
