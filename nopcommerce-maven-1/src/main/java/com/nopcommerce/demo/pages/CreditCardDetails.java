package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CreditCardDetails extends Utility {


    By selectCard = By.id("CreditCardType");
    By holderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expirationDate = By.xpath("//select[@id='ExpireMonth']");
    By expirationYear = By.id("ExpireYear");
    By cardCode = By.xpath("//input[@name='CardCode']");
    By paymentContinueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");


    public void selectCardOption(String name){

        selectByVisibleTextFromDropDown(selectCard, name);
    }
    public void cardHolderName(String name){

        sendTextToElement(holderName, name);
    }
    public void cardNumberField(String number){

        sendTextToElement(cardNumber, number);
    }
    public void cardExpiryDateField(String number){

        selectByVisibleTextFromDropDown(expirationDate, number);
    }
    public void cardExpiryYearField(String number){

        selectByVisibleTextFromDropDown(expirationYear, number);
    }
    public void cardCodeField(String number){

        sendTextToElement(cardCode, number);
    }
    public void paymentContinueButtonField(){

        clickOnElement(paymentContinueButton);
    }

}
