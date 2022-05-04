package com.nopcommerce.demo.testsuits;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class DesktopPageTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    WelcomeSingInPage welcomeSingInPage = new WelcomeSingInPage();
    GuestCheckOutPage guestCheckOutPage = new GuestCheckOutPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    SelectPaymentTypePage selectPaymentTypePage = new SelectPaymentTypePage();
    CreditCardDetails creditCardDetails = new CreditCardDetails();
    FinalCheckOutPage finalCheckOutPage = new FinalCheckOutPage();
    ThankYouPage thankYouPage = new ThankYouPage();
    WelcomeToHomePage welcomeToHomePage = new WelcomeToHomePage();


    @Test
    public void VerifyPriceOrderLowToHigh() throws InterruptedException {
        homePage.clickOnComputerLink();
        homePage.clickOnDesktopLink();
        List<Double> expectedPriceList = desktopsPage.getOriginalPriceList();
        Collections.sort(expectedPriceList);
        //System.out.println(expectedPriceList);
        desktopsPage.selectFromSortByDropDown("Price: Low to High");
        List<Double> actualPriceList = desktopsPage.getSortPriceList();
        // System.out.println(actualPriceList);
        Assert.assertEquals(actualPriceList, expectedPriceList);

    }


    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        computerPage.computerTextMenu();
        desktopsPage.clickOnDesktop();
        desktopsPage.selectFromSortByDropDown("Name: A to Z");
        Thread.sleep(2000);
        desktopsPage.clickOnBuildYourComputer();
        String expectedText = "Build your own computer";
        String actualText = desktopsPage.getBuildComputer();
        Assert.assertEquals(expectedText, actualText, "Invalid Text");
        desktopsPage.selectIntalProductByDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        desktopsPage.selectHddlProductByDropDown("8GB [+$60.00]");
        desktopsPage.clickOnOsRadio();
        desktopsPage.clickOnCheckBox();
        String expectedResult = "$1,475.00";
        String actualResult = desktopsPage.getVerifyPrice();
        Assert.assertEquals(actualResult, expectedResult, "Error Message");
        desktopsPage.addToCartButton();
        desktopsPage.addToCartButton();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = desktopsPage.getTopBarText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Message");
        desktopsPage.clickOnCrossButton();
        desktopsPage.mouseHoverOnCart();
        desktopsPage.clickOnCartButton();
        String expectedResultElement = "Shopping cart";
        String actualResultElement = shoppingCartPage.getVerifyShoppingCartText();
        Assert.assertEquals( actualResultElement, expectedResultElement, "error");
        shoppingCartPage.getVerifyShoppingCartText();
        shoppingCartPage.changeQuantity();
        shoppingCartPage.sendChangeQuantityText("2");
        String expectedTotal = "$2,950.00";
        String actualTotal = shoppingCartPage.getverifyPriceAfterUpdate();
        Assert.assertEquals(actualTotal, expectedTotal);
        shoppingCartPage.clickOnAgreeBox();
        shoppingCartPage.clickOnCheckout();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomeText = welcomeSingInPage.getVerifyWelcomeText();
        Assert.assertEquals(expectedWelcomeText, actualWelcomeText, "Error occured");
        welcomeSingInPage.checkoutAsGuest();
        guestCheckOutPage.firstNameField("Amy");
        guestCheckOutPage.lastNameField("Smith");
        guestCheckOutPage.sendEmailField("amysmith@gmail.com");
        guestCheckOutPage.countryField("India");
        guestCheckOutPage.cityField("Mathura");
        guestCheckOutPage.addressField("2,station Road");
        guestCheckOutPage.zipField("0000001");
        guestCheckOutPage.phoneNumberField("000000000007");
        Thread.sleep(2000);
        guestCheckOutPage.clickOnContinueButton();
        Thread.sleep(2000);
        checkOutPage.clickOnRadioButton();
        checkOutPage.clickOnContinueButton();
        selectPaymentTypePage.clickOnRadioButton();
        selectPaymentTypePage.clickOnContinueButton();
        creditCardDetails.selectCardOption("Master card");
        creditCardDetails.cardHolderName("Rinkal");
        creditCardDetails.cardNumberField("4263982640269299");
        Thread.sleep(2000);
        creditCardDetails.cardExpiryDateField("4");
        creditCardDetails.cardExpiryYearField("2023");
        creditCardDetails.cardCodeField("738");
        creditCardDetails.paymentContinueButtonField();
        String expectedCaditCardText = "Credit Card";
        String actualCaditCardText = finalCheckOutPage.getPaymentMethodVerify();
        Assert.assertEquals(expectedCaditCardText, actualCaditCardText, "Error not found");
        String expectedShippingText = "Next Day Air";
        String actualShippingText = finalCheckOutPage.getShippingVerifyText();
        Assert.assertEquals(expectedShippingText, actualShippingText, "Text not found");
        String expectedTotalText = "$2,950.00";
        String actualTotalText = finalCheckOutPage.getTotalVerifyText();
        Assert.assertEquals( actualTotalText, expectedTotalText);
        finalCheckOutPage.confirmPaymentButton();
        String expectedThankResult = "Thank you";
        String actualThankResult = thankYouPage.getthankYouVerify();
        Assert.assertEquals(expectedThankResult, actualThankResult, "Text not found");
        String expectedorderResult = "Your order has been successfully processed!";
        Thread.sleep(2000);
        String actualorderResult = thankYouPage.getOrderSuccessfullyVerify();
        Assert.assertEquals( actualorderResult, expectedResult,"Error occured");
        thankYouPage.getContinueButton();
        String expectedWelcomResult = "Welcome to our store";
        String actualWelcomeResult = welcomeToHomePage.getWelcomeStore();
        Assert.assertEquals(expectedWelcomResult, actualWelcomeResult, "Text not found");

    }
}
