package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {

    By computerLink = By.linkText("Computers");
    By desktopClick = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    By sortPriceLowToHigh = By.id("products-orderby");
    By sortByAtoZ = By.id("products-orderby");
    By buildComputer = By.xpath("//h2[@class='product-title']/a[contains(text(),'Build your own computer')]");
   // By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By buildVerifyText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectIntelProduct = By.id("product_attribute_1");
    By hddRadio = By.id("product_attribute_2");
    By osRadio = By.id("product_attribute_3_7");
    By tickBoxes = By.id("product_attribute_5_12");
    By verifyPrice =  By.xpath("//h1[contains(text(),'Build your own computer')]");
    By addToCart = By.id("add-to-cart-button-1");
    By verifyTopBar = By.xpath("//p[@class='content']");
    By crossButton = By.xpath("//span[@class='close']");
    By mouseHover = By.xpath("//a[@class='ico-cart']");
    By clickOnCart = By.xpath("//button[@class='button-1 cart-button']");
    By priceList = By.xpath("//span[contains(@class, 'actual-price')]");


    public void computerTextMenu() {

        clickOnElement(computerLink);
    }

    public void clickOnDesktop(){

        clickOnElement(desktopClick);
    }

    public List<Double> getOriginalPriceList(){

        List<WebElement> beforeFilter = driver.findElements(priceList);
        List<Double> beforeSortPriceList = new ArrayList<>();

        for(WebElement p : beforeFilter){

            beforeSortPriceList.add(Double.parseDouble(p.getText().trim().replace("$", "").replace(",", "")));
        }

        return beforeSortPriceList;
    }
    public List<Double> getSortPriceList() throws InterruptedException {

        //  selectByVisibleTextFromDropDown(selectPriceLowtoHigh,"Price: Low to High");

        Thread.sleep(1500);
        List<WebElement> afterFilter  = driver.findElements(priceList);
        List<Double> sortPriceList = new ArrayList<>();

        for(WebElement p : afterFilter){

            getSortPriceList().add(Double.parseDouble(p.getText().trim().replace("$", "").replace(",", "")));
        }
        return sortPriceList;
    }

    public void selectFromSortByDropDown(String text){

        selectByVisibleTextFromDropDown(sortPriceLowToHigh, text);
    }

    public void clickOnBuildYourComputer(){

        clickOnElement(buildComputer);
    }

    public String  getBuildComputer(){

        return getTextFromElement(buildVerifyText);
    }
    public void selectIntalProductByDropDown( String text){

        selectByVisibleTextFromDropDown(selectIntelProduct, text);
    }
    public void selectHddlProductByDropDown( String text){

        selectByVisibleTextFromDropDown(hddRadio, text);
    }
    public void clickOnOsRadio(){

        clickOnElement(osRadio);
    }
    public void clickOnCheckBox(){

        clickOnElement(tickBoxes);
    }
    public String getVerifyPrice() {

        return getTextFromElement(verifyPrice);
    }
    public void addToCartButton(){

        clickOnElement(addToCart);
    }
    public String getTopBarText(){

        return getTextFromElement(verifyTopBar);
    }
    public void clickOnCrossButton (){

        clickOnElement(crossButton);
    }
    public void mouseHoverOnCart (){

       mouseHoverToElement(mouseHover);
    }
    public void clickOnCartButton(){

        clickOnElement(clickOnCart);
    }





}
