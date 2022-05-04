package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    GoToCartPage goToCartPage = new GoToCartPage();
    WelcomeToHomePage welcomeToHomePage = new WelcomeToHomePage();
    CheckOutPage checkOutPage = new CheckOutPage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationPage registrationPage = new RegistrationPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    SelectPaymentTypePage selectPaymentTypePage = new SelectPaymentTypePage();
    CreditCardDetails creditCardDetails = new CreditCardDetails();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    OrderCompletedPage completedPage = new OrderCompletedPage();

    @Test
    public void textVerify() {
        homePage.mouseHoverONElectronics();
        homePage.mouseHoverAndClickONCellPhone();
        String expectedCellPhoneText = "Cell phones";
        String actualCellPHoneText = homePage.getCellPhoneText();
        Assert.assertEquals(actualCellPHoneText, expectedCellPhoneText, "error page not found");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        homePage.mouseHoverONElectronics();
        homePage.mouseHoverAndClickONCellPhone();
        String expectedCellPhoneText = "Cell phones";
        String actualCellPHoneText = homePage.getCellPhoneText();
        Assert.assertEquals(actualCellPHoneText, expectedCellPhoneText, "error page not found");
        cellPhonePage.clickOnListView();
        cellPhonePage.clickOnNokiaLumiaLink();
        String expectedPhoneText = "Nokia Lumia 1020";
        String actualPHoneText = nokiaLumia1020Page.getNokiaLumiaText();
        Assert.assertEquals(expectedPhoneText, actualPHoneText, "error page not found");

        String expectedPrice = "$349.00";
        String actualPrice = nokiaLumia1020Page.getPriceText();
        Assert.assertEquals(actualPrice, expectedPrice, "error");

        nokiaLumia1020Page.changeQuantity("2");
        nokiaLumia1020Page.clickOnAddToCartButton();

        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = nokiaLumia1020Page.getAddtoCartMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "error");

        nokiaLumia1020Page.clickOncrossButtonOfAddToCartMessage();
        nokiaLumia1020Page.mouseHoveronShoppingCart();
        nokiaLumia1020Page.clickOnGoToCart();

        String expectedText = "Shopping cart";
        Assert.assertEquals(goToCartPage.getShoppingCartText(), expectedText, "error");
        Assert.assertEquals(goToCartPage.getNokiaLumiaPriceText(), "$698.00", "error");
        goToCartPage.clickOnTermsandConditionsCheckBox();
        goToCartPage.clickOnCheckOutButton();
        Assert.assertEquals(welcomeToHomePage.getWelcomeStore(), "Welcome, Please Sign In!", "error");
        checkOutPage.clickOnContinueButton();

        registerPage.selectFemaleRadioButton();
        registerPage.enterFisrtName("prime11");
        registerPage.enterLastName("testing");
        registerPage.selectDateOfBirth("10");
        registerPage.selectMonthOfBirth("September");
        registerPage.selectYearOfBirth("1995");
        registerPage.enterEmail("kishan11@gmail.com");
        registerPage.enterPassword("123456789");
        registerPage.enterConfirmPassword("123456789");
        registerPage.clickonRegisterButton();
        Assert.assertEquals(registrationPage.getRegistrationCompleteText(), "Your registration completed", "error");
        registrationPage.clickOnContinueButton();

        Assert.assertEquals(goToCartPage.getShoppingCartText(), "Shopping cart", "error");
        goToCartPage.clickOnTermsandConditionsCheckBox();
        goToCartPage.clickOnCheckOutButton();

        billingAddressPage.selectCounty("Romania");
        billingAddressPage.city("kingstaon");
        billingAddressPage.address("abc street ");
        billingAddressPage.zipCode("123450");
        billingAddressPage.phoneNumber("0178542141");
        billingAddressPage.clickOnContinueButton();
        checkOutPage.clickOn2ndDayAir();

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

        String expectedShipingMethod = "2nd Day Air";
        String actualShipingMethod = confirmOrderPage.getShippingText();
        Assert.assertEquals(actualShipingMethod, expectedShipingMethod, "error");

        String expectedPriceText = "$698.00";
        String actualPriceText = confirmOrderPage.getVerifyTheTotal();
        Assert.assertEquals(actualPriceText, expectedPriceText, "error");

        confirmOrderPage.clickOnConfirmButton();
        Thread.sleep(2000);

        String expectedtext = "Your order has been successfully processed!";
        String actualtext = completedPage.getyourOrderHasBeenSuceffullyProcessedText();
        Assert.assertEquals(actualtext, expectedtext, "error");

        completedPage.clickOnContinue();
        Assert.assertEquals(homePage.getWelcomeToOurStoreText(), "Welcome to our store", "error");
        homePage.clickOnLogOutLink();

        Assert.assertEquals(homePage.getCurrentUrl(), "https://demo.nopcommerce.com/", "error");

    }

}