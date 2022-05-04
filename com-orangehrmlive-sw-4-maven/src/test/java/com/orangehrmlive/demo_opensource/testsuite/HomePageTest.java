package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();


    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        homePage.enterUserName("Admin");
        homePage.userPassword("admin123");
        homePage.clickOnLoginButton();
        String expectedResult = "Welcome";
        String actualResult = getTextFromElement(By.xpath("//a[contains(text(),'Welcome')]"));
        String mainResult = actualResult.substring(0, 7);
        Assert.assertEquals("invalid", expectedResult, mainResult);
    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        homePage.forgotPasswordLink();
        String expectedResult = "Forgot Your Password?";
        String actualResult = getTextFromElement(By.xpath("//div/div[2]/h1"));
        Assert.assertEquals("Error occured", expectedResult, actualResult);

    }


}
