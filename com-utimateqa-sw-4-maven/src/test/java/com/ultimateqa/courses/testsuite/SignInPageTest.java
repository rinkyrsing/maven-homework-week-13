package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {

    HomePage homePage = new HomePage();
    SignInPage signInPageTest = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnSingIn();
        String expectedResult = "Welcome Back!";
        String actualResult = signInPageTest.getWelcomeText();
        Assert.assertEquals("error occured",expectedResult,actualResult);

    }
    @Test
    public void  verifyTheErrorMessage(){
      homePage.clickOnSingIn();
      signInPageTest.enterEmailId("amysmith1@gmail.com");
      signInPageTest.enterPasswordField("Amy1234");
      signInPageTest.clickOnSingInButton();
        String expectedResult = "Invalid email or password.";
        String actualResult =  signInPageTest.getErrorMessageText();
        Assert.assertEquals(expectedResult, actualResult);
        signInPageTest.clickOnSingInButton();



    }

}
