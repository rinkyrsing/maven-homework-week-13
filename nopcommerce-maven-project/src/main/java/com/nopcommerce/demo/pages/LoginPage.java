package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.linkText("Log in");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By logout = By.className("ico-logout");


    public void enterEmailId(String email)
    {
        sendTextToElement(emailField, email);

    }
    public void enterPassword(String password){

        sendTextToElement(passwordField, password);
    }
    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }
    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }
    public String getErrorMessage(){

        return getTextFromElement(errorMessage);
    }
    public String  logoutOutText(){

        return getTextFromElement(logout);

    }
}
