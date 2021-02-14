package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummary {

    //public AccountSummary(){PageFactory.initElements(Driver.get(), this);}

    @FindBy (xpath = "//*[text()= 'Zero Bank']")
    public WebElement trigger;

    @FindBy (xpath = "//h2[@class='board-header']")
    public List<WebElement> accountTypes;

  //  @FindBy (xpath = "(//h2[@class='board-header'])[2]")
  //  public WebElement investmentAccounts;

    // @FindBy (xpath = "(//h2[@class='board-header'])[3]")
    // public WebElement creditAccounts;

    // @FindBy (xpath = "(//h2[@class='board-header'])[4]")
    // public WebElement loanAccounts;





}
