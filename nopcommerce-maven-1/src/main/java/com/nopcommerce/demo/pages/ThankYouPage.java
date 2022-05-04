package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ThankYouPage extends Utility {

    By thankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessful = By.xpath("By.xpath(\"//strong[contains(text(),'Your order has been successfully processed!')]");
   // By continueButton = By.xpath("//button[contains(text(),'Continue')]");
    By continueButton = By.xpath("//div[@class='buttons']/button");


    public String getthankYouVerify(){

        return getTextFromElement(thankYou);
    }
    public String getOrderSuccessfullyVerify(){

        return getTextFromElement(orderSuccessful);
    }
    public String getContinueButton(){

        return getTextFromElement(continueButton);
    }

}
