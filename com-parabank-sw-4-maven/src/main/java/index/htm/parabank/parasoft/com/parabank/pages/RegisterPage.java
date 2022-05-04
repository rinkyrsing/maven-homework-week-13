package index.htm.parabank.parasoft.com.parabank.pages;

import index.htm.parabank.parasoft.com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

  By firstNameField = By.id("customer.firstName");
  By lastNameField = By.id("customer.lastName");
  By addressField = By.id("customer.address.street");
  By cityNameField = By.id("customer.address.city");
  By stateNameField =By.id("customer.address.state");
  By zipCoadField = By.id("customer.address.zipCode");
  By phoneField = By.id("customer.phoneNumber");
  By ssnField = By.id("customer.ssn");
  By userNameField = By.id("customer.username");
  By passwordField = By.id("customer.password");
  By confirmPasswordField = By.id("repeatedPassword");
  By registerButton = By.xpath("//input[@value='Register']");
  By signUpText = By.xpath("//div[@id='rightPanel']/h1");
  By accountCreatedMessage = By.xpath("//div[@id='rightPanel']/p");


  public void firstNameText(String text){
    sendTextToElement(firstNameField, text);
  }
  public void lastNameText(String text){
    sendTextToElement(lastNameField, text);
    }
    public void addressText(String text){
    sendTextToElement(addressField,text);
    }
    public void cityNameText(String text){
    sendTextToElement(cityNameField, text);
    }
    public void stateNameText(String text){

     sendTextToElement(stateNameField, text);
    }

    public void zipCoadText(String text){
    sendTextToElement(zipCoadField,text);
    }
    public void phoneText(String text){
     sendTextToElement(phoneField,text);
    }
    public void ssnText(String text){
    sendTextToElement(ssnField,text);
    }
    public void userNameText(String text){
    sendTextToElement(userNameField,text);
    }
    public void passwordText(String text)
    {
        sendTextToElement(passwordField,text);
    }
    public void confirmPasswordText(String text){
     sendTextToElement(confirmPasswordField,text);
    }

    public void clickOnRegisterButton(){

     clickOnElement(registerButton);
    }
    public String getSignUpText(){

        return getTextFromElement(signUpText);
    }

    public String  getAccountCreatedText(){

      return getTextFromElement(accountCreatedMessage);
    }

}
