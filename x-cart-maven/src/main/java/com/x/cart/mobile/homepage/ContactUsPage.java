package com.x.cart.mobile.homepage;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {

    By contactUsLink = By.linkText("Contact us");
    By verifyText = By.xpath("//h1[@id='page-title']");



    public void contactUsText(){
        clickOnElement(contactUsLink);
    }

    public String  getContactUsLink() {

        return getTextFromElement(verifyText);
    }
    public String getContactUsText(){
        return getTextFromElement(verifyText);
    }
}
