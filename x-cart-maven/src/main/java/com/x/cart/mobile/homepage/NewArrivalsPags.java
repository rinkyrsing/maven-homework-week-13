package com.x.cart.mobile.homepage;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivalsPags extends Utility {

    By newLink = By.linkText("New!");
    By verifyText = By.xpath("//h1[@id='page-title']");



    public void newLinkText(){

        clickOnElement(newLink);
    }

    public String  getNewLink() {

        return getTextFromElement(verifyText);
    }
    public String getNewText(){

        return getTextFromElement(verifyText);
    }


}
