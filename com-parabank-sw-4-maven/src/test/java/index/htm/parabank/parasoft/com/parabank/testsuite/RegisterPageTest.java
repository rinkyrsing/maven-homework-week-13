package index.htm.parabank.parasoft.com.parabank.testsuite;

import index.htm.parabank.parasoft.com.parabank.pages.HomePage;
import index.htm.parabank.parasoft.com.parabank.pages.RegisterPage;
import index.htm.parabank.parasoft.com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){

        homePage.clickOnLogineLink();

        String actualResult = registerPage.getSignUpText();
        String expectedResult = "Signing up is easy!";
        Assert.assertEquals(actualResult, expectedResult, "Login page not displayed");
    }

    @Test
    public void  userSholdRegisterAccountSuccessfully(){
        homePage.clickOnLogineLink();
        registerPage.firstNameText("Amy");
        registerPage.lastNameText("Smith");
        registerPage.addressText("2, Station Road");
        registerPage.cityNameText("London");
        registerPage.stateNameText("England");
        registerPage.zipCoadText("34356563");
        registerPage.phoneText("126546788654");
        registerPage.ssnText("000001");
        registerPage.userNameText("AnySmith");
        registerPage.passwordText("amy123");
        registerPage.confirmPasswordText("amy123");
        registerPage.clickOnRegisterButton();

        String actualResult = registerPage.getAccountCreatedText();
        String expectedResult = "Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualResult, expectedResult, "Login page not displayed");
    }


}
