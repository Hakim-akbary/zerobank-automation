package com.bitrix.pages;

import org.openqa.selenium.support.FindBy;

public class AccountActivity<Webelement> extends Login{


    @FindBy(css = "#aa_accountId")
    public Webelement accountDropdown;



    @FindBy(xpath = "//a[text()='Checking']")
    public Webelement checkingLink;

    @FindBy(xpath = "//a[text()='Credit Card']")
    public Webelement creditCardLink;
}
