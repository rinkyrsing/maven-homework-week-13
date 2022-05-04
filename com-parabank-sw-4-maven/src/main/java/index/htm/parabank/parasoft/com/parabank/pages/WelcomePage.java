package index.htm.parabank.parasoft.com.parabank.pages;

import index.htm.parabank.parasoft.com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePage extends Utility {

    By welcomeText = By.xpath("//div[@id='rightPanel']/p");


    public String getWelcomeText()

    {
        return getTextFromElement(welcomeText);
    }
}
