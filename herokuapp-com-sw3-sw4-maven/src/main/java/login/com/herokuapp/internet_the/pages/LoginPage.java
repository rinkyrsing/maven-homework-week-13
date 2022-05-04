package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {

    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By userNameError =By.xpath("//div[contains(text(),'Your username is invalid!')]");
    By passwordError = By.xpath("//div[contains(text(),'Your password is invalid!')]");

    By homePageText = By.xpath("//h2[text()=' Secure Area']");



    public void enterUserName(String name){

        sendTextToElement(userNameField, name);
    }

    public void enterPassword(String password){

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }
    public String getHomePageText(){

        return getTextFromElement(homePageText);
    }
    public String getInvalidUserNameMessage()
    {
        String expectedResult = "Your username is invalid!";
        WebElement element = driver.findElement(userNameError);
        String actualResult = element.getText();
        String mainResult = actualResult.substring(0,25);
        return  mainResult;
    }
    public String getInvalidPasswordMessage()
    {
        String expectedResult = "Your password is invalid!";
        WebElement element = driver.findElement(passwordError);
        String actualResult = element.getText();
        String mainResult = actualResult.substring(0,25);
        return mainResult;

    }

}
