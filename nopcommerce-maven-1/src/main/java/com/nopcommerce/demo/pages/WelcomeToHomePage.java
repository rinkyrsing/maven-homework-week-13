package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeToHomePage extends Utility {

    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String  getWelcomeStore(){

        return getTextFromElement(welcomeText);

    }

}
