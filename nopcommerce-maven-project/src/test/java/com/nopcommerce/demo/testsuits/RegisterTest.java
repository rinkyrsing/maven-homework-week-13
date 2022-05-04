package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // registerPage // By registerLink = By.linkText("//a[contains(text(),'Register");============
        clickOnElement(By.className("ico-register"));
        String expectedResult = "Register";
        String actualResult = registerPage.getRegisterText();
        Assert.assertEquals("Invalid result", expectedResult, actualResult);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() throws InterruptedException {
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        //registerPage.clickOnRe
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("Amy");
        registerPage.enterLastName("Smith");
        registerPage.clickOnDate();
        registerPage.clickOnMonth();
        registerPage.clickOnYear();
        registerPage.enterEmailId("amysmith@gmail.com");
        registerPage.enterPassword("amy123");
        registerPage.enterConfirmPassword("amy123");
        registerPage.registerButton();


        String expectedText = "Your registration completed";
        String actualText = registerPage.getRegisterText();
        Assert.assertEquals( "Error",expectedText, actualText);

    }


}
