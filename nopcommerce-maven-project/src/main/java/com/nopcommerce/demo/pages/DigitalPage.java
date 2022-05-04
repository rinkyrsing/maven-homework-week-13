package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalPage extends Utility {

    By digitalDownloadText = By.linkText("Digital downloads");

    public String getDigitalDownloadText()
    {

        return getTextFromElement(digitalDownloadText);
    }
}
