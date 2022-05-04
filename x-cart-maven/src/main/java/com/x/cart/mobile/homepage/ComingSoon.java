package com.x.cart.mobile.homepage;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoon extends Utility {


    By comingSoonLink = By.linkText("Coming soon");
    By verifyText = By.xpath("//h1[@id='page-title']");



    public void comingSoonLinkText(){
        clickOnElement(comingSoonLink);
    }

    public String getComingSoonLink() {

        return getTextFromElement(verifyText);
    }
    public String getComingSoonText(){

        return getTextFromElement(verifyText);
    }

}
