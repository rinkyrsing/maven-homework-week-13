package com.x.cart.mobile.testsuite;

import com.x.cart.mobile.homepage.BestsellersPage;
import com.x.cart.mobile.homepage.HomePage;
import com.x.cart.mobile.hotdeals.HotDealsPage;
import com.x.cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;


public class HotDealsTest extends TestBase {

    HotDealsPage hotDealsPage = new HotDealsPage();
    BestsellersPage bestsellersPage = new BestsellersPage();
    HomePage homePage = new HomePage();

@Test
   public void verifySaleProductsArrangeAlphabetically(){
       hotDealsPage.mouseHoverOnHotDeals();
       hotDealsPage.clickOnSale();
       String expectedSaleText = "Sale";
       String actualSaleText = hotDealsPage.getSaleText();
       Assert.assertEquals(expectedSaleText, actualSaleText, "Error not found");
       hotDealsPage.mouseHoverOnSortBy();
       hotDealsPage.selectNameAtoZ();
       String expectedText = "Name A - Z";
       String actualText = hotDealsPage.verifyProductArrangeAlphabetically();
       Assert.assertEquals(expectedText, actualText, "Error not found");
}

@Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        hotDealsPage.mouseHoverOnHotDeals();
        hotDealsPage.clickOnSale();
        String expectedSaleText = "Sale";
        String actualSaleText = hotDealsPage.getSaleText();
        Assert.assertEquals(expectedSaleText, actualSaleText, "Error not found");
        hotDealsPage.mouseHoverOnSortBy();
        hotDealsPage.selectByPriceLowToHigh();
        String expectedText = "Price Low - High";
        String actualText = hotDealsPage.verifyPriceArrangeLowToHigh();
        Assert.assertEquals(expectedText, actualText, "Error not found");

    }

    @Test
    public void verifySaleProductsArrangeByRates(){
        hotDealsPage.mouseHoverOnHotDeals();
        hotDealsPage.clickOnSale();
        String expectedSaleText = "Sale";
        String actualSaleText = hotDealsPage.getSaleText();
        Assert.assertEquals(expectedSaleText, actualSaleText, "Error not found");
        hotDealsPage.mouseHoverOnSortBy();
        hotDealsPage.selectByRates();
        String expectedText = "Rates";
        String actualText = hotDealsPage.getVerifyRates();
        Assert.assertEquals(expectedText, actualText, "Error not found");


    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDeals();
        hotDealsPage.clickOnSale();
        String expectedSaleText = "Sale";
        String actualSaleText = hotDealsPage.getSaleText();
        Assert.assertEquals(expectedSaleText, actualSaleText, "Error not found");
        List<String> originalList= bestsellersPage.originalProductList();
        Collections.sort(originalList, Collections.reverseOrder());
        bestsellersPage.setSortZtoA();
        List<String> sortedList= bestsellersPage.sortedProductList();
        org.junit.Assert.assertEquals(originalList,sortedList);

}

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        homePage.mouseHoverOnHotDeal();
        homePage.clickOnBestSellers();
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualText,expectedText,"Not navigated to Bestsellers Page");
        List<Double> originalList= bestsellersPage.originalProductList1();
        Collections.sort(originalList, Collections.reverseOrder());
        bestsellersPage.setSortLowToHigh();
        List<Double> sortedList= bestsellersPage.sortLowToHighProductList();
        org.junit.Assert.assertEquals(originalList,sortedList);

    }
    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        homePage.mouseHoverOnHotDeal();
        homePage.clickOnBestSellers();
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualText, expectedText, "Not navigated to Bestsellers Page");
        List<Object> originalList = bestsellersPage.originalProductRatesList();
        Collections.sort(originalList, Collections.reverseOrder());
        List<Object> sortedList = bestsellersPage.sortedProductsRatesList();
        org.junit.Assert.assertEquals(originalList, sortedList);
    }

}
