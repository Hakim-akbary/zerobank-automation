package com.bitrix.pages;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;
   // String errormessage = errorMessage.getText();

    @FindBy (xpath = "//input[@name='submit']")
    public WebElement toSignin;

    @FindBy (xpath = "//button[@id='signin_button']")
    public WebElement signInButton;

    @FindBy (css = "input[id= user_login]")
    public WebElement userNameInput;

    @FindBy(css = "#user_password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@id='details-button']")
    public WebElement AdvancedButton;

    @FindBy (xpath = "(//*[. = 'Proceed to zero.webappsecurity.com (unsafe)'])[2]")
    public WebElement proceedLink;








    public void login(){

            Login login = new Login();

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitForVisibility(login.signInButton, 5);
        login.signInButton.click();


        login.userNameInput.sendKeys(ConfigurationReader.get("username"));
        login.passwordInput.sendKeys(ConfigurationReader.get("password"));
        login.toSignin.click();

        BrowserUtils.waitForVisibility(login.AdvancedButton, 5);
        login.AdvancedButton.click();


        BrowserUtils.waitForVisibility(login.proceedLink, 5);
        login.proceedLink.click();




    }
}
