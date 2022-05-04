package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ShoppingCartPage extends Utility {

    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQuantity = By.xpath("//tbody/tr/td[5]/input");
    By sendChangeQuantity = By.xpath("//tbody/tr/td[5]/input");
    By verifyTotal = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By agreeCheckbox = By.id("termsofservice");
    By clickCheckbox = By.xpath("//button[@id='checkout']");
    By welcomeText = By.xpath("//div[@class='center-1']/descendant::h1");
    By guestCheck = By.xpath("//button[contains(text(),'Checkout as Guest')]");




    public String getVerifyShoppingCartText(){
        return getTextFromElement(verifyShoppingCart);
    }
    public void changeQuantity(){

        Actions actions =new Actions(driver);
        driver.findElement(changeQuantity).sendKeys(Keys.CONTROL+"a");
    }
    public void sendChangeQuantityText(String text){
        sendTextToElement(sendChangeQuantity,text);
    }
    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }
    public void clickOnAgreeBox (){
        clickOnElement(agreeCheckbox);
    }
    public void clickOnCheckout(){
        clickOnElement(clickCheckbox);
    }
    public String getverifyPriceAfterUpdate()
    {
        return getTextFromElement(By.xpath("//tr/td[6]/span"));
    }







}
