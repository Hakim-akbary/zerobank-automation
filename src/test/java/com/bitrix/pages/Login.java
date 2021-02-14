package com.bitrix.pages;

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


    public void login (){

    signInButton.click();



}

    public void loginWithWrongCredentials(){

        Faker faker = new Faker();

        userNameInput.sendKeys(faker.name().fullName());
        passwordInput.sendKeys(faker.finance().creditCard());

    }
}
