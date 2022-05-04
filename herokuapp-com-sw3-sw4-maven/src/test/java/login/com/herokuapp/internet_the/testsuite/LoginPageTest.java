package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.pages.SecureAreaPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        loginPage.getHomePageText();
        String expectedResult = "Secure Area";
        String actualResult = secureAreaPage.getSecureAreaText();
        System.out.println(actualResult + expectedResult);


    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUserName("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedResult = "Your username is invalid!";
        String actualResult = loginPage.getInvalidUserNameMessage();
        String mainResult = actualResult.substring(0, 25);

        Assert.assertEquals("error occur", expectedResult, mainResult);

    }

    @Test
    public void verifyThePasswordErrorMessage() {

        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedResult = "Your password is invalid!";
        String actualResult = loginPage.getInvalidPasswordMessage();
        String mainResult = actualResult.substring(0, 25);

        Assert.assertEquals("error occur", expectedResult, mainResult);


    }


}
