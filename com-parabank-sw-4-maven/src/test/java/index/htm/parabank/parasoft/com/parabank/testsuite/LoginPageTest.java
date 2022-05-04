package index.htm.parabank.parasoft.com.parabank.testsuite;


import index.htm.parabank.parasoft.com.parabank.pages.LoginPage;
import index.htm.parabank.parasoft.com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {

        loginPage.userNameText("AmySmith");
        loginPage.passwordText("Amy123");
        loginPage.clickOnLoginButton();

        String actualResult = loginPage.getAccountsOverviewText();
        String expectedResult = "Accounts Overview";
        Assert.assertEquals(actualResult, expectedResult, "The username and password could not be verified.");
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.invalidUserNameField("AmySmith12");
        loginPage.invalidPasswordField("amy222");
        loginPage.clickOnLoginButton();

        String actualResult = loginPage.getAccountsOverviewText();
        String expectedResult = "Accounts Overview";
        Assert.assertEquals(actualResult, expectedResult, "The username and password could not be verified.");
    }

    @Test
    public void userShouldLogOutSuccessfully() {
        loginPage.userNameText("AnySmith");
        loginPage.passwordText("amy123");
        loginPage.clickOnLoginButton();
        loginPage.logoutButtonField();

        String actualResult = loginPage.getCusterLoginText();
        String expectedResult = "Customer Login";
        Assert.assertEquals(actualResult, expectedResult, "The username and password could not be verified.");
    }


}







