package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By radioButton = By.id("shippingoption_1");
    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");




    public void clickOnRadioButton(){

        clickOnElement(radioButton);
    }
    public void clickOnContinueButton(){

        clickOnElement(continueButton);
    }
    public void clickOnNextDayAirRadioButton()
    {
        clickOnElement(By.id("shippingoption_1"));
    }

    public void clickOn2ndDayAir()
    {
        clickOnElement(By.id("shippingoption_2"));
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
    }
}
