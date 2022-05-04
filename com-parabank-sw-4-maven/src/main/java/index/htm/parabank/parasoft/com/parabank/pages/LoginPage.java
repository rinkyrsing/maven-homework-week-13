package index.htm.parabank.parasoft.com.parabank.pages;


import index.htm.parabank.parasoft.com.parabank.utility.Utility;
import org.openqa.selenium.By;


public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@class = 'button']");
    By accountOverview = By.xpath("//h1[@class = 'title']");
    By invalidUserName = By.name("username");
    By invalidPassword = By.name("password");
    By logoutButton  = By.linkText("Log Out");
    By customerLogin = By.xpath("//div[@id = 'leftPanel']/h2");



    public void userNameText(String text){

        sendTextToElement(userNameField,text);
    }

    public void passwordText(String text)
    {
        sendTextToElement(passwordField,text);
    }

    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }

    public String getAccountsOverviewText(){

        return getTextFromElement(accountOverview);
    }

    public void invalidUserNameField(String text){

        sendTextToElement(invalidUserName, text);
    }

    public void invalidPasswordField(String text){

        sendTextToElement(invalidPassword, text);
    }

    public void logoutButtonField(){

        clickOnElement(logoutButton);
    }

    public String getCusterLoginText(){

        return getTextFromElement(customerLogin);
    }


}
