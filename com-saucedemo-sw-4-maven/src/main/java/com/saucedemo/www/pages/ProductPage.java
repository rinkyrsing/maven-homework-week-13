package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {

    By productText = By.xpath("//span[@class = 'title']");


    public String getProductText(){

        return getTextFromElement(productText);
    }

    public int assertVerifyText() {

        List<WebElement> item = driver.findElements(By.className("inventory_item"));
        int actualResult = item.size();
         return actualResult;

    }

}
