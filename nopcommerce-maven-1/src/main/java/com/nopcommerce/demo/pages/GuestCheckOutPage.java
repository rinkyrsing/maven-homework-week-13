package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GuestCheckOutPage extends Utility {


    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName =  By.name("BillingNewAddress.LastName");
    By emailText = By.name("BillingNewAddress.Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.name("BillingNewAddress.Address1");
    By zip = By.id("BillingNewAddress_ZipPostalCode") ;
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By boxContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    public void firstNameField(String name){

       sendTextToElement(firstName, name);
    }
    public void lastNameField(String name){

        sendTextToElement(lastName, name);
    }
    public void sendEmailField(String email){

        sendTextToElement(emailText,email );
    }
    public void countryField(String name){

       selectByVisibleTextFromDropDown(country, name);
    }
    public void cityField(String name){

        sendTextToElement(city, name);
    }
    public void addressField (String add){

        sendTextToElement(address, add );
    }
    public void zipField(String zipnumber){

        sendTextToElement(zip, zipnumber );
    }
    public void phoneNumberField(String num){

        sendTextToElement(phoneNumber, num);
    }
    public void clickOnContinueButton(){

        clickOnElement(boxContinue);
    }


}
