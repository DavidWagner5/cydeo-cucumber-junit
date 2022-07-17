package com.cydeo.pages;

import com.cydeo.utiltiies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath=("//input[@id='searchInput']"))
    public WebElement SearchBox;


    @FindBy(xpath = ("//button[@class='pure-button pure-button-primary-progressive']"))
    public WebElement SearchButton;


    @FindBy(xpath="//h1[@id='firstHeading']")
    public WebElement mainHeader;










}
