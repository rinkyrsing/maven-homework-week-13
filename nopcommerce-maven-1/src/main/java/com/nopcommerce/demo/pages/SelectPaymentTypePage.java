package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class SelectPaymentTypePage extends Utility {


    By radioCardButton = By.id("paymentmethod_1");
    By continuePayment = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");



    public void clickOnRadioButton(){

        clickOnElement(radioCardButton);
    }
    public void clickOnContinueButton(){

        clickOnElement(continuePayment);
    }
}
