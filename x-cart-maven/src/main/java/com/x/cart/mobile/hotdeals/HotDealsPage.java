package com.x.cart.mobile.hotdeals;

import com.x.cart.mobile.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotDealsPage extends Utility {

   By mouseHover = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::span");
   By clickOnSale = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='sale_products/']");
   By verifySale = By.tagName("h1");
   By mouseHoverOnSortBy = By.className("sort-by-label");
   By sortByAtoZ  = By.partialLinkText("Name A -");
   By verifyByAlphabeticlly = By.xpath("//span[contains(text(),'Name A - Z')]");
   By sortByPrice  = By.partialLinkText("Price Low");
   By verifyLowToHigh = By.xpath("//span[contains(text(),'Price Low - High')]");
   By sortByRates = By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/child::a");
   By verifyRates = By.xpath("//span[contains(text(),'Rates')]");
   By sortByZtoA =  By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::span");
   //By sortByZtoA =  By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul[1]/li[2]/child::a");
   By verifyZtoA = By.tagName("h1");




   public void mouseHoverOnHotDeals(){

      mouseHoverToElement(mouseHover);

   }
   public void clickOnSale(){

       clickOnElement(clickOnSale);

   }
   public String  getSaleText(){

       return getTextFromElement(verifySale);
   }
   public void mouseHoverOnSortBy(){

       mouseHoverToElement(mouseHoverOnSortBy);

   }
   public void selectNameAtoZ() {

       clickOnElement(sortByAtoZ);

   }
   public String verifyProductArrangeAlphabetically(){

       return getTextFromElement(verifyByAlphabeticlly);
   }
    public void selectByPriceLowToHigh() {

        clickOnElement(sortByPrice);

    }
    public String verifyPriceArrangeLowToHigh(){

        return getTextFromElement(verifyLowToHigh);
    }
    public void selectByRates() {

        clickOnElement(sortByRates);

    }
    public String getVerifyRates(){

        return getTextFromElement(verifyRates);
    }
    public void selectByZToA() {

        clickOnElement(sortByZtoA);

    }
    public String getVerifyZtoA() throws InterruptedException {

        //actual product list
        List<WebElement> originalProductList = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/child::li/child::div/h5/a"));
        //create the list object
        List<String> sortPriceList = new ArrayList();
        //add all web element value to list object
        for (WebElement element : originalProductList) {
            sortPriceList.add(element.getText());
        }
        Collections.sort(sortPriceList, Collections.reverseOrder());
        //sort by Z to A
       // mouseHoverOnElement(By.className("sort-by-label"));
        clickOnElement(By.partialLinkText("Name Z -"));
        Thread.sleep(1000);
        List<WebElement> actualProductListElements = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/child::li/child::div/h5/a"));
        //create the list object
        List<String> actualPriceList = new ArrayList();
        //add all web element value to list object
        for (WebElement element : actualProductListElements) {
            actualPriceList.add(element.getText());
        }
        //Assert.assertEquals(sortPriceList, actualPriceList);
        return getTextFromElement(verifyZtoA);
    }



}
