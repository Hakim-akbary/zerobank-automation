package com.bitrix.step_definitions;

import com.bitrix.pages.Login;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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

        login.userNameInput.sendKeys(ConfigurationReader.get("username"));
        login.passwordInput.sendKeys(ConfigurationReader.get("password"));
    }

    @Then("the users logs in with {string} {string}")
    public void the_users_logs_in_with(String wrongUserName, String wrongPassword) {

        Login login = new Login();

        login.userNameInput.sendKeys(ConfigurationReader.get("username"));
        login.passwordInput.sendKeys(ConfigurationReader.get("password"));

    }


}
