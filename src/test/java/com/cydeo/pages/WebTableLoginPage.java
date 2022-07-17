package com.cydeo.pages;

import com.cydeo.utiltiies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginBtn;


    //this is just a full login method you can put in config prop
    public void login(){

        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginBtn.click();
    }







}
