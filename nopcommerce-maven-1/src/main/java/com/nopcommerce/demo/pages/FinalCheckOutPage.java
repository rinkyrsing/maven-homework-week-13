package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class FinalCheckOutPage extends Utility {

    By paymentMethodVerify = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethodVerify = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By totalVerify = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By confirmButton = By.xpath("//div[@class='buttons']/button");

    public String getPaymentMethodVerify(){

        return getTextFromElement(paymentMethodVerify);
    }
    public String getShippingVerifyText(){

        return getTextFromElement(shippingMethodVerify);
    }
    public String getTotalVerifyText(){

        return getTextFromElement(totalVerify);
    }
    public void confirmPaymentButton(){
        clickOnElement(confirmButton);
    }

}
