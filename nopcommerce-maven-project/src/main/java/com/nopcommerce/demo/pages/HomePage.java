package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By computerLink = By.linkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By apparelLink = By.linkText("Apparel");
    By digitalLink = By.linkText("Digital downloads");
    By booksLink = By.linkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By giftCardsLink = By.linkText("Gift Cards");
    By registerLink = By.linkText("//a[contains(text(),'Register");


    public void clickOnLoginLink() {

        clickOnElement(loginLink);
    }

    public void computerTextMenu() {

        clickOnElement(computerLink);
    }

    public void electronicsTextMenu() {

        clickOnElement(electronicsLink);
    }

    public void apparelTextMenu() {

        clickOnElement(apparelLink);
    }

    public void digitalTextMenu() {

        clickOnElement(digitalLink);
    }

    public void bookTextMenu() {

        clickOnElement(booksLink);
    }

    public void jewelryTextMenu() {

        clickOnElement(jewelryLink);
    }

    public void giftcardsTextMenu() {

        clickOnElement(giftCardsLink);
    }

    public void clickOnRegisterLink() {

        clickOnElement(registerLink);
    }
}
