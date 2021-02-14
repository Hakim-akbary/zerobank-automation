package com.bitrix.step_definitions;

import com.bitrix.pages.AccountSummary;
import com.bitrix.pages.Login;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepsDefs {

    @Given("the user navigates to the webpage")
    public void the_navigates_to_the_webpage() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }



    @Then("the user clicks on the signinButton")
    public void the_user_clicks_on_the_signinButton() {
        Login login = new Login();
        BrowserUtils.waitForVisibility(login.signInButton, 5);
        login.signInButton.click();




    }

    @Then("the user logs in with {string} {string}")
    public void the_user_logs_in_with(String userName, String password) {

        Login login = new Login();


        login.userNameInput.sendKeys(userName);
        login.passwordInput.sendKeys(password);
        login.toSignin.click();


    }

    @Then("the user should see {string} page")
    public void the_user_should_see_page(String pageTitle) {
        String actualPageTitle = Driver.get().getTitle();

        Assert.assertEquals(pageTitle, actualPageTitle);
    }


    @Then("the user clicks on the {string}")
    public void the_user_clicks_on_the(String string) {
        Login login = new Login();

        login.AdvancedButton.getText();

        BrowserUtils.waitForVisibility(login.AdvancedButton, 5);

        login.AdvancedButton.click();


        BrowserUtils.waitForVisibility(login.proceedLink, 5);
        login.proceedLink.click();





    }






    @Then("the user should see {string}")
    public void the_user_should_see(String expected) {
        Login login = new Login();
        String errorMessage = login.errorMessage.getText();
        BrowserUtils.waitForVisibility(login.errorMessage, 5);
        Assert.assertEquals(expected, errorMessage);
    }


}
