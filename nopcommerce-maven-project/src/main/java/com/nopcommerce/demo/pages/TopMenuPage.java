package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {

    By computerText = By.linkText("Computers");
    By electronicsText = By.linkText("Electronics");
    By apparelText = By.linkText("Apparel");
    By digitalText = By.linkText("Digital downloads");
    By bookText = By.linkText("Books");
    By jewelryText = By.linkText("Jewelry");
    By giftcardsText = By.linkText("Gift Cards");




    public void computerTextMenu()
    {
        clickOnElement(computerText);
    }
    public void electronicsTextMenu(){
        clickOnElement(electronicsText);
    }
    public void apparelTextMenu(){
        clickOnElement(apparelText);
    }
    public void digitalTextMenu(){
        clickOnElement(digitalText);
    }
    public void bookTextMenu(){
        clickOnElement(bookText);
    }
    public void jewelryTextMenu(){
        clickOnElement(jewelryText);
    }
    public void giftcardsTextMenu(){
        clickOnElement(giftcardsText);
    }


}
