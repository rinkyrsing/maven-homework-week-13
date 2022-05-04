package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


   @Test
   public void userShouldNavigateToLoginPageSuccessfully(){
       homePage.clickOnLoginLink();
       String expectedMessage = "Welcome, Please Sign In!";
       String actualMessage = loginPage.getWelcomeText();
       Assert.assertEquals(expectedMessage,actualMessage,"Login page not display");

   }
   @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
       homePage.clickOnLoginLink();
       loginPage.enterEmailId("amysmith@gmail.com");
       loginPage.enterPassword("amy123");
       loginPage.clickOnLoginButton();


   }
   @Test
   public void verifyTheErrorMessage() throws InterruptedException {
       homePage.clickOnLoginLink();
       loginPage.enterEmailId("prime123@gmail.com");
       loginPage.enterPassword("prime123");
       loginPage.clickOnLoginButton();
       String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
               + "No customer account found";
       String actualErrorMessage = loginPage.getErrorMessage();
       Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
   }


}
