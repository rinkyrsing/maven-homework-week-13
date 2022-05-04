package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By radiobutton = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By date = By.name("DateOfBirthDay");
    By month = By.name("DateOfBirthMonth");
    By year = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationText = By.xpath("//div[@class='page-title']");




    public void clickOnRadioButton() {

        clickOnElement(radiobutton);
    }

    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    public void enterFirstName(String text) {

         sendTextToElement(firstName, text);
    }

    public void enterLastName(String text) {

        sendTextToElement(lastName, text);
    }
    public void clickOnDate() {

        selectByValueFromDropDown( date,"24");
    }
    public void clickOnMonth() {

        selectByVisibleTextFromDropDown(month,"May");
    }
    public void clickOnYear() {

        selectByValueFromDropDown(year,"1982");
    }
    public void enterEmailId(String email)
    {
        sendTextToElement(emailField, email);
    }
    public void enterPassword(String password){

        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String text) {

        sendTextToElement(confirmPassword, text);
    }

    public void registerButton() {

        clickOnElement(registerButton);
    }

    public String getRegisterText(){

        return getTextFromElement(registrationText);
    }

}



