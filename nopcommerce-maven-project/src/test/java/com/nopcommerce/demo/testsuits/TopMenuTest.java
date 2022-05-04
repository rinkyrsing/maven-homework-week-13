package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalPage digitalDownloadsPage = new DigitalPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardPage giftCardsPage = new GiftCardPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.computerTextMenu();
        String expectedResult = "Computers";
        String actualResult  = computerPage.getComputerText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        homePage.electronicsTextMenu();
        String expectedResult = "Electronics";
        String actualResult  = electronicsPage.getElectronicsText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        homePage.apparelTextMenu();
        String expectedResult = "Apparel";
        String actualResult  = apparelPage.getApparelText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        homePage.digitalTextMenu();
        String expectedResult = "Digital downloads";
        String actualResult  = digitalDownloadsPage.getDigitalDownloadText();
        Assert.assertEquals(expectedResult,actualResult,"Digital downloads page not found");
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        homePage.bookTextMenu();
        String expectedResult = "Books";
        String actualResult  = booksPage.getBooksText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        homePage.jewelryTextMenu();
        String expectedResult = "Jewelry";
        String actualResult  = jewelryPage.getjewelryText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        homePage.giftcardsTextMenu();
        String expectedResult = "Gift Cards";
        String actualResult  = giftCardsPage.getGiftCardsText();
        Assert.assertEquals(expectedResult,actualResult);
    }

}





