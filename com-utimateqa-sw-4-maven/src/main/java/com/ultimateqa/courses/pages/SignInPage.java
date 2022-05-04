package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By welcomeText = By.xpath("//h1[@class='page__heading']");
    By signInButton = By.cssSelector("input.button.button-primary.g-recaptcha");
    By invalidLoginError = By.xpath("//li[text() ='Invalid email or password.' ]");
   

    public void enterEmailId(String email){

        sendTextToElement(emailField, email);
    }

    public void enterPasswordField(String password) {

        sendTextToElement(passwordField,password);
    }

    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }

    public String  getErrorMessageText(){

        return getTextFromElement(invalidLoginError);
    }
    public void clickOnSingInButton(){

        clickOnElement(signInButton);
    }

}
