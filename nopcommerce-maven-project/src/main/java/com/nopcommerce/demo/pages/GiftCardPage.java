package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardPage extends Utility {

    By giftCarsdsText = By.linkText("Gift Cards");

    public String getGiftCardsText()
    {

        return getTextFromElement(giftCarsdsText);
    }

}
