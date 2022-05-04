package com.saucedemo.www.testsuits;


import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.pages.ProductPage;
import com.saucedemo.www.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Properties;

/**
 * Created by Rinky Singh
 */
public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        String expectedResult = "PRODUCTS";
        String actualResult = productPage.getProductText();
        Assert.assertEquals("error occurs", expectedResult, actualResult);
    }
    @Test
    public void  verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

         int expectedResult = 6;
         int actualText = productPage.assertVerifyText();
         Assert.assertEquals(expectedResult ,actualText);

    }


}
