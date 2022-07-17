package com.cydeo.pages;

import com.cydeo.utiltiies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //create constructor, initialize the driver instance and this class intance using pagefactory.initelements

   public GoogleSearchPage (){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   //we can start locating web elements using @FindBy annotation
    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement searchBox;
}
