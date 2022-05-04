package com.x.cart.mobile.homepage;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {

     By shippingPage = By.linkText("Shipping");
     By shippingVerify = By.xpath("//h1[@id='page-title']");


     public void navigateToShippingPage(){

         clickOnElement(shippingPage);

     }
     public String getShippingText(){

         return getTextFromElement(shippingVerify);
     }


}
