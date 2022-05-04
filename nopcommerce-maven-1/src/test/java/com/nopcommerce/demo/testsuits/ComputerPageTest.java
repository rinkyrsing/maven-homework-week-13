package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {

    ComputerPage computerPage = new ComputerPage();

    @Test
    public void testName() {

        computerPage.computerTextMenu();
        computerPage.clickOnDesktop();

    }


}
