package com.x.cart.mobile.homepage;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {

      By shippingLink = By.linkText("Shipping");
      By verifyText = By.xpath("//h1[@id='page-title']");



    public void shippingLinkText(){
          clickOnElement(shippingLink);
    }

    public String  getshippingLink() {

        return getTextFromElement(verifyText);
    }
    public String getShippingText(){

        return getTextFromElement(verifyText);
    }
}

