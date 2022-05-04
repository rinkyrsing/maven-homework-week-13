package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By username = By.id("txtUsername");
    By password =  By.id("txtPassword");
    By loginButton = By.id("btnLogin");
    By forgotPassword = By.linkText("Forgot your password?");

    public void enterUserName(String name){
        sendTextToElement(username, name);
    }

    public void userPassword(String text){

        sendTextToElement(password, text);
    }
    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }
    public void forgotPasswordLink(){

        clickOnElement(forgotPassword);
    }


}
