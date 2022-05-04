package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import javax.rmi.CORBA.Util;

public class ComputerPage extends Utility {

    By computerText = By.className("page-title");

    public String getComputerText()
    {

        return getTextFromElement(computerText);
    }


}
