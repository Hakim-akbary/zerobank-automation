package com.bitrix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivity extends Login {


    @FindBy(css = "#aa_accountId")
    public WebElement accountDropdown;


    @FindBy(xpath = "//a[text()='Checking']")
    public WebElement checkingLink;

    @FindBy(xpath = "//a[text()='Credit Card']")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[text()='Find Transactions']")
    public WebElement FindTransactionsTab;

    @FindBy(css = "#aa_fromDate")
    public WebElement fromDateBox;

    @FindBy(css = "#aa_toDate")
    public WebElement toDateBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findButton;


    @FindBy(xpath = "(//table[@class='table table-condensed table-hover'])[2]/tbody/tr/td[1]") //needs to be controlled
    public List<WebElement> searchResultTable;


}