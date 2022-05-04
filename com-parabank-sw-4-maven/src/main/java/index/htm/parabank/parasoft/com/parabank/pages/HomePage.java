package index.htm.parabank.parasoft.com.parabank.pages;

import index.htm.parabank.parasoft.com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By registerLink = By.linkText("Register");

    public void clickOnLogineLink() {

        clickOnElement(registerLink);
    }


}
