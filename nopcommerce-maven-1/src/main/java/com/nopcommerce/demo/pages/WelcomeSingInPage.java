package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeSingInPage extends Utility {


    By welcomeText = By.xpath("//div[@class='center-1']/descendant::h1");
    By guestCheck = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public String getVerifyWelcomeText() {

        return getTextFromElement(welcomeText);
    }
    public void checkoutAsGuest (){

        clickOnElement(guestCheck);
    }


}
