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


    @FindBy (xpath = "//button[@id='signin_button']")
    public WebElement signInButton;

    @FindBy (css = "input[id= user_login]")
    public WebElement userNameInput;

    @FindBy(css = "#user_password")
    public WebElement passwordInput;

    @FindBy (xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    public void login (){

    signInButton.click();



}

    public void loginWithWrongCredentials(){

        Faker faker = new Faker();

        userNameInput.sendKeys(faker.name().fullName());
        passwordInput.sendKeys(faker.finance().creditCard());

    }
}
