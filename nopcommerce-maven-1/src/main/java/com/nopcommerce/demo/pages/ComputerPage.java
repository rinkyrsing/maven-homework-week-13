package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerLink = By.linkText("Computers");
    By desktopClick = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    By shortByPrice = By.id("products-orderby");


    public void computerTextMenu() {

        clickOnElement(computerLink);
    }

    public void clickOnDesktop(){

        clickOnElement(desktopClick);
    }
    public void clickSortByPrice(){

        clickOnElement(shortByPrice);
    }


}
