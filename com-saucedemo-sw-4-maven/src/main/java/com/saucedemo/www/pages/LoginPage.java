package com.saucedemo.www.pages;


import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");


    public void enterUserName(String name) {

        sendTextToElement(userNameField, name);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {

        clickOnElement(loginButton);
    }


}
